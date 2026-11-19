"""Check the published transfer stores, automatic detection and read-only SQLite journal handling."""
from contextlib import closing
from hashlib import sha256
import json
from pathlib import Path
import shutil
import sqlite3
import subprocess
import sys
import tempfile

ROOT = Path(__file__).resolve().parents[2]
SAMPLES = ROOT/'reports/evidence/download-stores'


def cli(path, *args):
    return subprocess.check_output([sys.executable, ROOT/'tools/read-data.py', path,*args])


def digest(file):
    return sha256(file.read_bytes()).hexdigest()


def check():
    cases = json.loads((SAMPLES/'verification.json').read_bytes())
    filenames = {'download-room': 'download.db', 'okdownload': 'okdownload-breakpoint.db',
                 'filedownloader': 'filedownloader.db'}
    samples = {}
    for case in cases:
        kind = case.get('family','download-room')
        sample = SAMPLES/case['app']/filenames[kind]
        expected = case['decoded']
        assert digest(sample) == case['database_sha256']
        assert digest(ROOT/'中育apk'/(case['app']+'.apk')) == case['apk_sha256']
        before_files = set(sample.parent.iterdir())
        assert json.loads(cli(sample)) == json.loads(cli(sample,'--type',kind)) == expected
        assert set(sample.parent.iterdir()) == before_files
        assert digest(sample) == case['database_sha256']
        samples[kind] = sample
    assert len(cases) == 8 and len(samples) == 3
    with tempfile.TemporaryDirectory() as temporary:
        root = Path(temporary)
        live = root/'live.db'
        shutil.copyfile(samples['download-room'], live)
        with closing(sqlite3.connect(live)) as db:
            db.execute('PRAGMA journal_mode=WAL')
            db.execute('PRAGMA wal_autocheckpoint=0')
            db.execute('UPDATE download SET downloadSize=321, flag=8 WHERE id=2')
            db.execute('INSERT INTO upload(id) VALUES (37)')
            db.commit()
            snap = root/'download.db'
            wal = root/'download.db-wal'
            shutil.copyfile(live,snap)
            shutil.copyfile(str(live)+'-wal',wal)
            before = digest(snap),digest(wal)
            decoded = json.loads(cli(snap))
            assert decoded['download'][1]['downloadSize'] == 321
            assert decoded['download'][1]['flag'] == 8 and decoded['download'][1]['flagName'] is None
            assert decoded['upload_ids'] == [37]
            assert before == (digest(snap),digest(wal)) and not (root/'download.db-shm').exists()
        # An unrelated SQLite file may have the same filename.
        foreign = root/'renamed'/'download.db'
        foreign.parent.mkdir()
        with closing(sqlite3.connect(foreign)) as db:
            db.execute('CREATE TABLE ordinary(id INTEGER PRIMARY KEY)')
        assert b'CREATE TABLE ordinary' in cli(foreign)
        for kind, missing, fields in [
            ('okdownload', ('taskFileDirty','okdownloadResponseFilename'), ('dirty_ids','response_filenames')),
            ('filedownloader', ('filedownloaderConnection',), ('connections',)),
        ]:
            path=root/filenames[kind]
            shutil.copyfile(samples[kind],path)
            with closing(sqlite3.connect(path)) as db:
                for table in missing:
                    db.execute(f'DROP TABLE "{table}"')
                db.commit()
            decoded=json.loads(cli(path))
            assert all(decoded[key] is None for key in fields)
    print('Verified 8 native stores, automatic and explicit decoding, APK and DB digests, WAL-only state and older layouts.')


if __name__=='__main__':
    check()
