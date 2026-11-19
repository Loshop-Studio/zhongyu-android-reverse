"""Match the recovered performance profiles to rebuilt APKs, then verify them with profgen and Android."""
import argparse
from hashlib import sha256
import json
import os
from pathlib import Path
import re
import subprocess
import sys
import tempfile
from xml.etree import ElementTree
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
sys.path.insert(0, str(ROOT / 'tools'))
from build_profile_metadata import make_metadata


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('serial', help='Disposable Android 11 emulator')
    serial = parser.parse_args().serial
    if not re.fullmatch(r'emulator-\d+', serial):
        parser.error('select a disposable emulator')
    sdk = Path(os.environ.get('ANDROID_HOME', '/home/jdz/dev/android-sdk'))
    java = os.environ.get('JAVA_HOME', '/home/jdz/dev/jdk-21.0.13+9')
    env = dict(os.environ, JAVA_HOME=java)
    adb = [sdk / 'platform-tools/adb', '-s', serial]
    profgen = sdk / 'cmdline-tools/latest/bin/profgen'

    def run(args):
        return subprocess.run(args, env=env, check=True, capture_output=True, text=True, timeout=300).stdout

    api = run([*adb, 'shell', 'getprop', 'ro.build.version.sdk']).strip()
    if api != '30':
        parser.error('use Android 11 (API 30) for this installation check')
    out = ROOT / 'dist/dex-metadata/android-11'
    out.mkdir(exist_ok=True, parents=True)
    rows, absent = [], []
    with tempfile.TemporaryDirectory() as directory:
        work = Path(directory)
        for apk in sorted((ROOT / '中育apk').glob('*.apk')):
            manifest = ROOT / 'sources' / apk.stem / 'resources/AndroidManifest.xml'
            pkg = ElementTree.parse(manifest).getroot().attrib['package']
            built = ROOT / 'dist' / apk.name
            dm = out / (apk.stem + '.dm')
            with ZipFile(apk) as archive:
                if 'assets/dexopt/baseline.prof' not in archive.namelist():
                    absent.append(apk.stem)
                    continue
                original = archive.read('assets/dexopt/baseline.prof')
            dex = make_metadata(apk, built, dm)
            with ZipFile(dm) as archive:
                updated = archive.read('primary.prof')
            rules = []
            for binary, package in ((original, apk), (updated, built)):
                source = work / 'primary.prof'
                source.write_bytes(binary)
                text_file = work / 'rules.txt'
                run([profgen, 'dumpProfile', '--apk', package, '--profile', source, '--output', text_file])
                rules.append(sorted(text_file.read_bytes().splitlines()))
            if rules[0] != rules[1] or not rules[0]:
                raise ValueError(f'{apk.stem}: SDK symbolic profile dump differs')
            assert 'Success' in run([*adb, 'install-multiple', '--no-incremental', '-r', built, dm])
            state = run([*adb, 'shell', 'dumpsys', 'package', 'dexopt'])
            section = state.split('  [' + pkg + ']\n', 1)[1].split('\n  [', 1)[0]
            status = re.search(r'\[status=speed-profile\] \[reason=install-dm\]', section)
            if not status:
                raise ValueError(f'{apk.stem}: Android did not confirm install-dm: {section.strip()}')
            rows.append(dict(app=apk.stem, package=pkg, sdk_rules=len(rules[0]),
                             sorted_rules_sha256=sha256(b'\n'.join(rules[0])).hexdigest(),
                             rebuilt_apk_sha256=sha256(built.read_bytes()).hexdigest(),
                             dm_sha256=sha256(dm.read_bytes()).hexdigest(), android=status[0], dex=dex))
            print(apk.stem, len(dex), len(rules[0]), status[0], flush=True)
    report = {'android_api': int(api), 'apps': rows, 'apps_without_bundled_profile': absent}
    (ROOT / 'reports/evidence/art-profiles.json').write_text(json.dumps(report, ensure_ascii=False, indent=2)+'\n')


if __name__ == '__main__':
    main()
