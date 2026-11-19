"""Verify the standalone Java export against all 52 JVM classes from the delivered APK."""
import argparse
import hashlib
import io
import json
from pathlib import Path
import re
import subprocess
from tempfile import TemporaryDirectory
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
APP = '优课畅学'
MEMBER = 'lib/armeabi-v7a/libtbs.audio_base.jar.so'
PKG = 'com.tencent.smtt.audio.core.db.ApnHelper'


def check(jadx, work):
    archive = work/'audio.jar'
    with ZipFile(ROOT/'中育apk'/(APP+'.apk')) as original, ZipFile(ROOT/'dist'/(APP+'.apk')) as rebuilt:
        data = original.read(MEMBER)
        assert data == rebuilt.read(MEMBER) == (ROOT/'android'/APP/MEMBER).read_bytes()
    archive.write_bytes(data)
    with ZipFile(io.BytesIO(data)) as jar:
        classes = {n[:-6].replace('/', '.'):jar.read(n) for n in jar.namelist() if n.endswith('.class')}
    tops = sorted({c.split('$')[0] for c in classes})
    disassembly = subprocess.check_output(['javap', '-s', '-p', '-c', '-classpath', str(archive), *sorted(classes)], text=True)
    methods = {}
    for row in disassembly.splitlines():
        typ = re.search(r'\b(?:class|interface) ([\w.$]+)', row) if not row.startswith(' ') else None
        if typ:
            owner = typ[1]
            signatures = methods.setdefault(owner, {})
        if row.startswith('  ') and not row.startswith('   '):
            decl = row.strip()
        if row.startswith('    descriptor: ('):
            name = '<clinit>' if decl == 'static {};' else decl[:decl.index('(')].split()[-1]
            name = '<init>' if name == owner else name
            signatures[name + row.split('descriptor: ')[1]] = True
    assert set(methods) == set(classes)
    for owner, signature in [(PKG, '<init>()V'), (PKG, 'getInstance()Lcom/tencent/smtt/audio/core/db/ApnHelper;'),
                             (PKG+'$3', 'onReceive(Landroid/content/Context;Landroid/content/Intent;)V')]:
        assert signature in methods[owner]
    subprocess.run([str(jadx), '-r', '-j', '2', '-ds', str(work/'src'), str(archive)],
                   check=True, stdout=subprocess.DEVNULL)
    java = ROOT/'sources'/APP/'java'
    sources = []
    for top in tops:
        rel = Path(top.replace('.', '/') + '.java')
        expected = (work/'src'/rel).read_text().replace('audio.jar:', 'libtbs.audio_base.jar.so:')
        shipped = (java/rel).read_text()
        if rel.name == 'DBManager.java':
            assert 'private void createTable(android.database.sqlite.SQLiteDatabase);' in disassembly
            expected = expected.replace('public void createTable(SQLiteDatabase db)', 'private void createTable(SQLiteDatabase db)')
        clean = '\n'.join(row for row in shipped.split('\n') if row.strip() not in {
            '// The nested JVM class calls SQLiteOpenHelper(Context, String, CursorFactory, int).',
            '// DBManager.access$000 in the original class delegates to this private method.',
            '// The original receiver clears the prior mobile-data confirmation.'})
        assert clean == expected, rel
        assert 'Method not decompiled:' not in shipped and 'JADX ERROR:' not in shipped
        members = sorted(name for name in classes if name.split('$')[0] == top)
        sources.append({'java':str((java/rel).relative_to(ROOT)), 'class_files':[
            {'name':name, 'sha256':hashlib.sha256(classes[name]).hexdigest(),
             'methods': sorted(methods[name])} for name in members]})
    return {'apk_member':MEMBER, 'jar_sha256':hashlib.sha256(data).hexdigest(), 'class_files':len(classes),
            'top_level_java_files':len(sources), 'jvm_method_declarations':sum(map(len,methods.values())),
            'sources':sources}


if __name__ == '__main__':
    cli=argparse.ArgumentParser(description=__doc__)
    cli.add_argument('jadx',type=Path,help='JADX 1.5.3 executable')
    args=cli.parse_args()
    with TemporaryDirectory() as tmp:
        print(json.dumps(check(args.jadx.resolve(strict=True),Path(tmp)),ensure_ascii=False,indent=2))
