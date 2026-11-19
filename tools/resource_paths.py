"""Match original Android file resources to editable files by resource ID and configuration."""
import argparse
from hashlib import sha256
import json
import os
from pathlib import Path
import re
import subprocess
import tempfile
from zipfile import ZipFile

from build_resources import link_resources, source_digest
from activity_layouts import activity_references

ROOT = Path(__file__).resolve().parents[1]


def files_in_table(aapt, apk):
    dump = subprocess.check_output([str(aapt), 'dump', 'resources', str(apk)], text=True)
    records = {}
    with ZipFile(apk) as archive:
        members = set(archive.namelist())
    for line in dump.splitlines():
        item = re.match(r'^    resource (0x[0-9a-f]+) (\S+)', line)
        if item:
            rid, name = item.groups()
            continue
        file_value = re.match(r'^      \(([^)]*)\) \(file\) (\S+)', line)
        if file_value:
            config, path = file_value.groups()
            if path not in members or (rid, config) in records:
                raise ValueError(f'{apk.name}: invalid resource {rid} ({config})')
            records[rid, config] = (name, path)
    return records


def compare_paths(app, apk, linked, aapt):
    source = ROOT / 'sources' / app / 'resources'
    original = files_in_table(aapt, apk)
    compiled = files_in_table(aapt, linked)
    if original.keys() != compiled.keys():
        raise ValueError(f'{app}: file resource IDs or configurations differ')
    result = []
    for (rid, config), (name, member) in sorted(original.items()):
        compiled_name, path = compiled[rid, config]
        if name != compiled_name or not path.startswith('res/') or not (source / path).is_file():
            raise ValueError(f'{app}: no matching editable file for {rid} ({config})')
        result.append(dict(id=rid, resource=name, config=config, apk_member=member, source=path))
    return dict(app=app, apk_sha256=sha256(apk.read_bytes()).hexdigest(), entries=len(result),
                changed_paths=sum(r['apk_member']!=r['source'] for r in result), files=result)


def generate(app, aapt, jar):
    source = ROOT / 'sources' / app / 'resources'
    digest = (ROOT / 'android' / app / 'resource-source.sha256').read_text().strip()
    if source_digest(source) != digest:
        raise ValueError(f'{app}: the report describes the unmodified XML resources')
    with tempfile.TemporaryDirectory() as temp:
        linked = link_resources(source, jar, Path(temp))
        report = compare_paths(app, ROOT / '中育apk' / (app+'.apk'), linked, aapt)
    report['activity_references'] = activity_references(ROOT/'android'/app, source, report['files'], annotate=True)
    out = ROOT / 'reports/apps' / app / 'resource-files.json'
    out.write_text(json.dumps(report, ensure_ascii=False, indent=1)+'\n')
    print(f"{app}: {report['entries']} file resources, {report['changed_paths']} recovered paths",flush=True)


def main():
    args = argparse.ArgumentParser(description=__doc__)
    args.add_argument('apps', nargs='*')
    args.add_argument('--aapt2', type=Path, default=Path(os.environ.get('ANDROID_HOME', '/home/jdz/dev/android-sdk'))/'build-tools/35.0.0/aapt2')
    args.add_argument('--apktool', type=Path, default=ROOT/'tools/lib/apktool-3.0.2.jar')
    opts = args.parse_args()
    names = opts.apps or sorted(p.stem for p in (ROOT/'中育apk').glob('*.apk'))
    for app in names:
        generate(app,opts.aapt2,opts.apktool)


if __name__=='__main__':
    main()
