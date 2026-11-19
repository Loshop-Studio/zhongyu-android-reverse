"""Annotate DEX layout constants in manifest-declared activities using resource table facts."""
from collections import defaultdict
from pathlib import Path
import re
from xml.etree import ElementTree

NS = '{http://schemas.android.com/apk/res/android}'
FIELD = re.compile(r'^\.field\s+[^\n]*?\b([\w$]+):I\s*=\s*(0x[0-9a-f]+)\s*$', re.M)
DIRECT = re.compile(r'^\s*const(?:/high16)?\s+[vp]\d+, (0x[0-9a-f]+)\s*$')
LOAD = re.compile(r'^\s*sget\s+[vp]\d+, L([\w/$]+/R\$layout);->([\w$]+):I\s*$')
PREFIX = '    # RE layout '


def activity_references(module, source, files, *, annotate):
    manifest = ElementTree.parse(source / 'AndroidManifest.xml').getroot()
    declared = {item.get(NS + 'name') for item in manifest.findall('./application/activity')}
    declared.update(item.get(NS + 'targetActivity') for item in manifest.findall('./application/activity-alias'))
    package = manifest.attrib['package']
    layouts = defaultdict(list)
    for file in files:
        if file['resource'].startswith('layout/'):
            layouts[file['id']].append(file)
    dexdirs = sorted(module.glob('smali*'))
    fields = {}

    def field_id(owner, key):
        if owner not in fields:
            path = next((d / (owner + '.smali') for d in dexdirs if (d / (owner + '.smali')).is_file()), None)
            fields[owner] = dict(FIELD.findall(path.read_text())) if path else {}
        return fields[owner].get(key)

    results = []
    for name in sorted(declared - {None}):
        cls = package+name if name.startswith('.') else name if '.' in name else package+'.'+name
        relative = cls.replace('.', '/') + '.smali'
        file = next((d/relative for d in dexdirs if (d/relative).is_file()), None)
        if file is None:
            continue
        original = file.read_text()
        output, method = [], None
        for line in original.splitlines(keepends=True):
            if line.startswith(PREFIX):
                continue
            if line.startswith('.method '):
                method = line.strip().split()[-1]
            elif line.startswith('.end method'):
                method = None
            if method:
                direct = DIRECT.match(line)
                rid = None
                if direct:
                    rid = direct[1]
                else:
                    field = LOAD.match(line)
                    if field:
                        rid = field_id(field[1], field[2])
                if rid in layouts:
                    variants = layouts[rid]
                    base = next((v for v in variants if not v['config']), variants[0])
                    comment = f"{base['resource']} ({rid}), APK {base['apk_member']}"
                    if base['config']:
                        comment += f" [{base['config']}]"
                    output.append(PREFIX+comment+'\n')
                    results.append(dict(activity=cls, method=method, id=rid, resource=base['resource'],
                                        instruction=line.strip(), smali=file.relative_to(module).as_posix()))
            output.append(line)
        updated = ''.join(output)
        if annotate and updated != original:
            file.write_text(updated)
    return results
