"""Test XML edits with the real Gradle build and the installed Android resource loader."""
import argparse
import json
from hashlib import sha256
import os
from pathlib import Path
import re
import shutil
import subprocess
import tempfile
import time
from xml.etree import ElementTree
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
ANDROID_NS = '{http://schemas.android.com/apk/res/android}'
SCREEN = 'Local resource build verified'


def command(args, **kwargs):
    return subprocess.run([str(x) for x in args], check=True, capture_output=True,
                          text=True, timeout=120, **kwargs).stdout


def stage_workspace(work, apps):
    (work / 'tools').symlink_to(ROOT / 'tools', target_is_directory=True)
    (work / 'android').mkdir()
    for item in (ROOT / 'android').iterdir():
        if item.is_file() or item.name == 'gradle':
            (work / 'android' / item.name).symlink_to(item, target_is_directory=item.is_dir())
    (work / '.work/build').mkdir(parents=True)
    (work / '.work/build/debug.jks').symlink_to(ROOT / '.work/build/debug.jks')
    for app in apps:
        module = work / 'android' / app
        module.mkdir()
        for item in (ROOT / 'android' / app).iterdir():
            if item.name == 'build':
                # Seed only the assembled, read-only DEX inputs. Apktool builds a fresh APK.
                cache = module / 'build/apk'
                cache.mkdir(parents=True)
                for dex in (item / 'apk').glob('classes*.dex'):
                    shutil.copy2(dex, cache / dex.name)
            else:
                (module / item.name).symlink_to(item, target_is_directory=item.is_dir())
        shutil.copytree(ROOT / 'sources' / app / 'resources', work / 'sources' / app / 'resources')


def edit_ui(work, app, index):
    source = work / 'sources' / app / 'resources'
    manifest = ElementTree.parse(source / 'AndroidManifest.xml').getroot()
    pkg = manifest.attrib['package']
    label = manifest.find('application').attrib[ANDROID_NS + 'label'].split('/')[-1]
    mark = f'Local build {index:02d}'
    count = 0
    for file in (source / 'res').glob('values*/strings.xml'):
        text = file.read_text()
        edited, n = re.subn(r'(<string name="' + re.escape(label) + r'">).*?(</string>)',
                            lambda m: m[1] + mark + m[2], text, flags=re.S)
        if n:
            file.write_text(edited)
            count += n
    assert count, app
    if app == '问卷调查':
        (source / 'res/values/verification.xml').write_text(
            '<resources><string name="verified_screen_label">' + SCREEN + '</string></resources>')
        layout = source / 'res/layout/activity_un_login.xml'
        original = layout.read_text()
        assert original.count('@string/no_login') == 1
        layout.write_text(original.replace('@string/no_login', '@string/verified_screen_label'))
        file = source / 'AndroidManifest.xml'
        text = file.read_text()
        activity = '<activity android:name="com.zykj.satisfaction.MainActivity"'
        assert text.count(activity) == 1
        file.write_text(text.replace(activity, activity + ' android:label="@string/verified_screen_label"'))
    return pkg, label, mark, count


def resource_table(aapt, apk):
    # Keep every configuration and value. Physical filenames can change when AAPT2
    # expands an obfuscated resource path. All referenced files must exist in this APK.
    dump = command([aapt, 'dump', 'resources', apk])
    ids, values = {}, {}
    with ZipFile(apk) as z:
        members = set(z.namelist())
    for line in dump.splitlines():
        match = re.match(r'^    resource (0x[\da-f]+) (\S+)', line)
        if match:
            rid, key = match.groups()
            ids[key] = rid
            values[key] = []
        elif line.startswith('      '):
            path = re.search(r'\(file\) (\S+)', line)
            if path:
                assert path[1] in members, (key, path[1])
                line = line[:path.start(1)] + '<file>' + line[path.end(1):]
            values[key].append(line.strip())
    # Android attr enum/flag maps are keyed by resource ID and order independently.
    for key, lines in values.items():
        if key.startswith('attr/') and sum(l.startswith('(') for l in lines) == 1:
            values[key] = [lines[0], *sorted(lines[1:])]
    return ids, values


def nonresource_payloads(apk):
    with ZipFile(apk) as z:
        return {i.filename: (sha256(z.read(i)).digest(), i.compress_type) for i in z.infolist()
                if not (i.is_dir() or i.filename.startswith('res/') or
                        i.filename in ('AndroidManifest.xml', 'resources.arsc') or
                        re.fullmatch(r'META-INF/(?:[^/]+\.(SF|RSA|DSA|EC)|MANIFEST\.MF)', i.filename, re.I))}


def installed_evidence(report, adb, work):
    # Pull the installed APKs themselves to bind the verification to what Android read.
    for row in report['apps']:
        app = row['app']
        manifest = ROOT / 'sources' / app / 'resources/AndroidManifest.xml'
        pkg = ElementTree.parse(manifest).getroot().attrib['package']
        device_path = command([*adb, 'shell', 'pm', 'path', pkg]).strip().removeprefix('package:')
        if not device_path.startswith('/data/app/'):
            raise ValueError(f'{app}: expected the locally installed test APK')
        local = work / 'installed.apk'
        command([*adb, 'pull', device_path, local])
        digest = sha256(local.read_bytes()).hexdigest()
        assert command([*adb, 'shell', 'sha256sum', device_path]).split()[0] == digest
        baseline = ROOT / 'dist' / (app + '.apk')
        members = nonresource_payloads(baseline)
        assert nonresource_payloads(local) == members
        row.update(installed_sha256=digest, matching_nonresource_members=len(members),
                   matching_dex=sum(bool(re.fullmatch(r'classes\d*\.dex', n)) for n in members))
    pkg='com.zykj.satisfaction'
    command([*adb,'shell','am','start','-W','-n',pkg+'/'+pkg+'.MainActivity'])
    for attempt in range(8):
        command([*adb, 'shell', 'uiautomator', 'dump', '/data/local/tmp/zy-compiled-screen.xml'])
        ui = ElementTree.fromstring(command([*adb,'shell','cat','/data/local/tmp/zy-compiled-screen.xml']))
        node = next((n for n in ui.iter('node') if n.get('text') == SCREEN and n.get('package') == pkg), None)
        if node is not None:
            report['native_screen'] = {k: node.attrib[k] for k in ('package','class','resource-id','bounds','text')}
            with (ROOT/'reports/evidence/resource-edit-screen.png').open('wb') as out:
                subprocess.run([*adb,'exec-out','screencap','-p'],stdout=out,check=True,timeout=15)
            return
        time.sleep(.25)
    raise AssertionError('Edited TextView did not appear in the installed survey app')



def verify_recovery(work, env):
    # A broken resource must fail the Gradle task and leave the last signed APK intact.
    app = '问卷调查'
    target = work / 'dist' / (app + '.apk')
    saved = sha256(target.read_bytes()).hexdigest()
    source = work / 'sources' / app / 'resources'
    invalid = source / 'res/values/invalid-test.xml'
    invalid.write_text('<resources><string name="broken">')
    gradle = ['bash','./gradlew','--offline','--no-daemon',f':{app}:assembleDebug']
    failed = subprocess.run(gradle,cwd=work/'android',env=env,capture_output=True,text=True,timeout=120)
    assert failed.returncode and 'invalid-test.xml' in failed.stdout+failed.stderr
    assert sha256(target.read_bytes()).hexdigest() == saved
    shutil.rmtree(source)  # This directory is a test-owned copy inside TemporaryDirectory.
    shutil.copytree(ROOT/'sources'/app/'resources',source)
    command(gradle,cwd=work/'android',env=env)
    with ZipFile(target) as rebuilt, ZipFile(ROOT/'中育apk'/(app+'.apk')) as original:
        members = {n for n in original.namelist() if n.startswith('res/') or n in ('resources.arsc','AndroidManifest.xml')}
        actual = {n for n in rebuilt.namelist() if n.startswith('res/') or n in ('resources.arsc','AndroidManifest.xml')}
        assert actual == members
        for member in members:
            assert rebuilt.read(member)==original.read(member)
    return dict(app=app,failed_gradle_exit=failed.returncode,previous_signed_apk_preserved=True,
                restored_original_resource_members=len(members))


def main():
    cli = argparse.ArgumentParser(description=__doc__)
    cli.add_argument('serial')
    args = cli.parse_args()
    if not re.fullmatch(r'emulator-\d+', args.serial):
        cli.error('Use a disposable Android emulator')
    sdk = Path(os.environ.get('ANDROID_HOME', '/home/jdz/dev/android-sdk'))
    jdk = os.environ.get('JAVA_HOME', '/home/jdz/dev/jdk-21.0.13+9')
    env = dict(os.environ, JAVA_HOME=jdk, ANDROID_HOME=str(sdk), PATH=jdk+'/bin:'+os.environ['PATH'])
    aapt = sdk / 'build-tools/35.0.0/aapt2'
    adb = [sdk / 'platform-tools/adb', '-s', args.serial]
    apps = sorted(p.parent.name for p in (ROOT / 'android').glob('*/resource-source.sha256'))
    assert len(apps) == 11
    report = {'android': command([*adb, 'shell', 'getprop', 'ro.build.version.release']).strip(), 'apps': []}
    with tempfile.TemporaryDirectory(dir=ROOT / '.work', prefix='verify-resource-') as tmp:
        work = Path(tmp)
        stage_workspace(work, apps)
        labels = {app: edit_ui(work, app, i) for i, app in enumerate(apps, 1)}
        with (ROOT / '.work/resource-build-gradle.log').open('w') as log:
            subprocess.run(['bash', './gradlew', '--offline', '--no-daemon', 'assembleDebug'],
                           cwd=work / 'android', env=env, check=True, stdout=log, stderr=subprocess.STDOUT, timeout=900)
        for app in apps:
            apk = work / 'dist' / (app + '.apk')
            pkg, label, marker, count = labels[app]
            old = ROOT / '中育apk' / apk.name
            old_ids, old_values = resource_table(aapt, old)
            ids, values = resource_table(aapt, apk)
            assert all(ids.get(k) == v for k, v in old_ids.items()), app
            extras = set(ids) - set(old_ids)
            assert extras == ({'string/verified_screen_label'} if app == '问卷调查' else set()), (app, extras)
            differences = [k for k in old_ids if old_values[k] != values[k]]
            assert differences == ['string/'+label], (app, differences[:15])
            assert nonresource_payloads(apk) == nonresource_payloads(ROOT / 'dist' / apk.name), app
            command([sdk / 'build-tools/35.0.0/apksigner', 'verify', apk], env=env)
            assert 'Success' in command([*adb, 'install', '-r', '--no-incremental', apk])
            loaded = command([*adb, 'shell', 'cmd', 'overlay', 'lookup', pkg, f'{pkg}:string/{label}']).strip()
            assert loaded == marker, (app, loaded)
            row = dict(app=app, resource_ids_preserved=len(old_ids), added_resources=sorted(extras),
                       edited_value=label, edited_qualifiers=count, android_label=loaded,
                       equal_other_table_values=True, signature_verified=True)
            if app == '问卷调查':
                tree = command([aapt, 'dump', 'xmltree', apk, '--file', 'AndroidManifest.xml'])
                assert re.search(r'android:label\(0x01010001\)=@'+ids['string/verified_screen_label'], tree), tree[:250]
                row.update(manifest_activity_label_id=ids['string/verified_screen_label'])
            report['apps'].append(row)
            print(app, len(old_ids), loaded, flush=True)
        installed_evidence(report, adb, work)
        report['rebuild_after_error'] = verify_recovery(work, env)
    (ROOT / 'reports/evidence/resource-build.json').write_text(json.dumps(report, ensure_ascii=False, indent=2)+'\n')


if __name__ == '__main__':
    main()
