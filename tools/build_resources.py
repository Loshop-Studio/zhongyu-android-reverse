"""Compile edited Apktool XML through AAPT2 before the module is aligned and signed."""
import argparse
from copy import copy
from hashlib import sha256
from pathlib import Path
import os
import shutil
import subprocess
import tempfile
from zipfile import ZipFile


def source_digest(source):
    manifest = source / 'AndroidManifest.xml'
    resources = source / 'res'
    if not resources.is_dir():
        raise FileNotFoundError(resources)
    tree = sha256()
    for file in [manifest, *sorted(resources.rglob('*'))]:
        if file.is_dir():
            continue
        tree.update(file.relative_to(source).as_posix().encode() + b'\0')
        tree.update(sha256(file.read_bytes()).digest())
    return sha256(tree.digest() + (source / 'apktool.yml').read_bytes()).hexdigest()


def resource_member(name):
    return name in ('AndroidManifest.xml', 'resources.arsc') or name.startswith('res/')


def copy_member(source, output, info):
    with source.open(info) as reader, output.open(copy(info), 'w') as writer:
        shutil.copyfileobj(reader, writer)


def link_resources(source, jar, work):
    stage = work / 'project'
    stage.mkdir()
    # Keep Apktool's temporary manifest and compiler output outside the editable tree.
    shutil.copyfile(source / 'AndroidManifest.xml', stage / 'AndroidManifest.xml')
    shutil.copyfile(source / 'apktool.yml', stage / 'apktool.yml')
    (stage / 'res').symlink_to((source / 'res').resolve(), target_is_directory=True)
    linked = work / 'resources.apk'
    subprocess.run(['java', '-Xmx600m', '-XX:ActiveProcessorCount=2', '-jar',
                    str(jar.resolve()), 'b', '-j', '1', str(stage), '-o', str(linked)], check=True)
    return linked


def compile_resources(project, source, apk, jar):
    reference = (project / 'resource-source.sha256').read_text().strip()
    if source_digest(source) == reference:
        return
    with tempfile.TemporaryDirectory(dir=apk.parent, prefix='res-build-') as temporary:
        work = Path(temporary)
        linked = link_resources(source, jar, work)
        merged = work / 'rebuilt.apk'
        with ZipFile(apk) as raw, ZipFile(linked) as compiled, ZipFile(merged, 'w') as output:
            if not {'AndroidManifest.xml', 'resources.arsc'} <= set(compiled.namelist()):
                raise ValueError('AAPT2 output has no complete Android resource table and manifest')
            for entry in raw.infolist():
                if not resource_member(entry.filename):
                    copy_member(raw, output, entry)
            for entry in compiled.infolist():
                if resource_member(entry.filename):
                    copy_member(compiled, output, entry)
        os.replace(merged, apk)


def main():
    args = argparse.ArgumentParser(description=__doc__)
    args.add_argument('project', type=Path)
    args.add_argument('source', type=Path)
    args.add_argument('apk', type=Path)
    args.add_argument('jar', type=Path)
    compile_resources(**vars(args.parse_args()))


if __name__ == '__main__':
    main()
