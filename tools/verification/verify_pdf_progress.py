"""Exercise both original PDF DAOs and compare their saved Room files with the offline reader."""
import argparse
from contextlib import closing
import hashlib
import json
import os
from pathlib import Path
import re
import shutil
import sqlite3
import subprocess
import sys
import tempfile

from build_instrumentation import build_probe
from build_pdf_dispatch import build_dispatch

ROOT = Path(__file__).resolve().parents[2]
PACKAGE = 'local.zy.pdfprogress'
APPS = [('中育云笔记', 'cloud', 'FRIDAY_NOTE_DB', 12), ('优课畅学', 'study', 'study.db', 3)]
A = "/offline/甲组/讲义'一.pdf"
B = "/offline/乙组/讲义'一.pdf"


def read_positions(path):
    output = subprocess.check_output([sys.executable, ROOT/'tools/read-data.py', path, '--type', 'pdf-progress'])
    return json.loads(output)


def check_offline_snapshot(root, tag, source):
    # Include a committed position that exists only in the WAL. Keep an
    # out-of-range value to distinguish reading the record from UI clamping.
    live = root/(tag+' writer.db')
    shutil.copyfile(source, live)
    folder = root/(tag+' copied files')
    folder.mkdir()
    copied = folder/'sample with # and %.db'
    wal = Path(str(copied)+'-wal')
    with closing(sqlite3.connect(live)) as sql:
        assert sql.execute('PRAGMA integrity_check').fetchone() == ('ok',)
        sql.execute('PRAGMA journal_mode=WAL')
        sql.execute('PRAGMA wal_checkpoint(TRUNCATE)')
        sql.execute('UPDATE PdfEntity SET currentPage=-1, pageCount=0 WHERE id=?', (A,))
        sql.commit()
        shutil.copyfile(live, copied)
        shutil.copyfile(Path(str(live)+'-wal'), wal)
    assert wal.stat().st_size > 0
    def hashes():
        return {f.name: hashlib.sha256(f.read_bytes()).hexdigest() for f in folder.iterdir()}
    before = hashes()
    assert dict(path=A, current_page_index=-1, page_count=0) in read_positions(copied)['documents']
    assert hashes() == before
    return {'updated_index': -1, 'updated_count': 0, 'all_input_hashes_preserved': True,
            'source_files': sorted(before)}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('serial')
    parser.add_argument('output', type=Path)
    args = parser.parse_args()
    if not re.fullmatch(r'emulator-\d+', args.serial):
        parser.error('supply a disposable Android emulator')
    sdk = Path(os.environ['ANDROID_HOME'])
    args.output.mkdir(parents=True, exist_ok=True)

    def adb(*parts, data=None):
        return subprocess.run([sdk/'platform-tools/adb', '-s', args.serial, *parts],
                              input=data, stdout=subprocess.PIPE, check=True).stdout

    with tempfile.TemporaryDirectory() as tmp:
        root = Path(tmp)
        binary = build_probe(root, sdk, PACKAGE, Path(__file__).with_name('PdfProgressProbe.java'),
                             Path(__file__).with_name('PdfDispatchCases.java'))
        adb('install', '-r', binary)
        reports = []
        for name, tag, filename, version in APPS:
            target = ROOT/'中育apk'/(name+'.apk')
            adb('shell', 'pm', 'clear', PACKAGE)
            adb('shell', 'run-as', PACKAGE, 'mkdir', '-p', 'files')
            adb('shell', '-T', f"run-as {PACKAGE} sh -c 'cat > files/target.apk'", data=target.read_bytes())
            recovered, method_hash = build_dispatch(root, sdk, tag == 'cloud')
            adb('shell', '-T', f"run-as {PACKAGE} sh -c 'cat > files/recovered.jar'", data=recovered.read_bytes())
            phases = []
            for phase in ('write', 'reopen'):
                log = adb('shell', 'am', 'instrument', '-w', '-r', '-e', 'app', tag, '-e', 'phase', phase,
                          PACKAGE+'/.PdfProgressProbe').decode()
                if 'INSTRUMENTATION_CODE: -1' not in log:
                    raise RuntimeError(name+' '+phase+'\n'+log)
                record = json.loads(adb('exec-out', 'run-as', PACKAGE, 'cat', 'files/result.json'))
                phases.append({'phase': phase, **record})
            write, reopen = phases
            assert write['pid'] != reopen['pid']
            assert write['first_open'] == dict(path=A, current_page_index=0, page_count=12)
            assert write['migration']['previous_row'] == 'kept' and write['fragment_callbacks'] == 2
            assert all(rec['different_spelling_missing'] for rec in phases)
            assert write['positions'] == reopen['positions'] == [
                dict(path=A, current_page_index=7, page_count=12), dict(path=B, current_page_index=0, page_count=3)]
            dest = args.output/name/filename
            dest.parent.mkdir(exist_ok=True)
            dest.write_bytes(adb('exec-out', 'run-as', PACKAGE, 'cat', 'databases/'+filename))
            result = read_positions(dest)
            assert result['user_version'] == version
            assert sorted(result['documents'], key=lambda row: row['path']) == sorted(reopen['positions'], key=lambda row: row['path'])
            assert len(write['dispatch_cases']) == 13
            offline = check_offline_snapshot(root, tag, dest)
            reports.append(dict(app=name, file=filename, apk_sha256=hashlib.sha256(target.read_bytes()).hexdigest(),
                                db_sha256=hashlib.sha256(dest.read_bytes()).hexdigest(), phases=phases, decoded=result, wal_check=offline,
                                recovered_method_sha256=method_hash,
                                differential_cases=len(write['dispatch_cases'])))
            print(name, filename, version, len(result['documents']), flush=True)
        (args.output/'verification.json').write_text(json.dumps(reports, ensure_ascii=False, indent=2)+'\n')


if __name__ == '__main__':
    main()
