"""Compare TBS resources in the APK, build tree and installed copy against Chromium GRIT."""
import argparse
import gzip
import hashlib
import io
import json
from collections import Counter
from pathlib import Path
import struct
import sys
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
sys.path.insert(0, str(ROOT / 'tools'))
from chromium_datapack import DataPack, TBS_PACKS

PREFIX = 'lib/armeabi-v7a/libtbs.'
APP = '优课畅学'
GRIT_REV = 'b6fd3d68433cebc7c10c602932c1736bcde0474a'
GRIT_SHA = '4daf2567f10b8c08b2710d8fd9c58b2b8890d62e5d758602973b02f87f77001a'


def sha(data):
    return hashlib.sha256(data).hexdigest()


def check(grit_dir, installed):
    parser_file = grit_dir / 'grit/format/data_pack.py'
    assert sha(parser_file.read_bytes()) == GRIT_SHA, 'use the GRIT revision identified in the report'
    sys.path.insert(0, str(grit_dir))
    from grit.format import data_pack

    source = ROOT / '中育apk' / f'{APP}.apk'
    rebuilt = ROOT / 'dist' / source.name
    assert sha(installed.read_bytes()) == sha(rebuilt.read_bytes())
    packs = {}
    containers = {}
    kinds = Counter()
    with ZipFile(source) as z, ZipFile(installed) as device:
        names = sorted(n for n in z.namelist() if n.startswith(PREFIX) and n.endswith('.so'))
        manifest = json.loads(z.read(PREFIX + 'MANIFEST.so'))
        listed = dict(line.split('=', 1) for line in z.read(PREFIX + '1.so').decode().splitlines())
        assert {PREFIX + n + '.so' for n in listed} == set(names) - {PREFIX + '1.so'}
        assert all(entry['PATH'] in listed for entry in manifest['FILES'])
        for member in names:
            data = z.read(member)
            name = member[len(PREFIX):-3]
            assert data == device.read(member) == (ROOT / 'android' / APP / member).read_bytes()
            if name != '1':
                assert hashlib.md5(data).hexdigest() == listed[name]
            if Path(member).name in TBS_PACKS:
                pack = DataPack(data)
                inventory = pack.inventory()
                upstream = data_pack.ReadDataPackFromString(data)
                assert set(pack.entries) | set(pack.aliases) == set(upstream.resources)
                assert pack.aliases == upstream.aliases
                assert all(pack.resource(i) == payload for i, payload in upstream.resources.items())
                assert data_pack.WriteDataPackToString(upstream.resources, upstream.encoding) == data
                content = Counter(row['type'] for row in inventory['resources'])
                gzip_bytes = sum(len(gzip.decompress(pack.resource(row['id'])))
                                 for row in inventory['resources'] if row['type'] == 'gzip')
                packs[name] = {'sha256': sha(data), 'physical_resources': len(pack.entries),
                               'aliases': pack.aliases, 'accessible_ids': len(upstream.resources),
                               'payload_types': dict(content), 'gzip_inflated_bytes': gzip_bytes,
                               'grit_read_all_ids': True, 'grit_byte_exact_rebuild': True}
                kinds['DataPack v5'] += 1
            elif data.startswith(b'PK\x03\x04'):
                with ZipFile(io.BytesIO(data)) as inner:
                    assert inner.testzip() is None
                    dex_counts = {}
                    for child in inner.namelist():
                        if child.endswith('.dex'):
                            header = inner.read(child)[:112]
                            assert header[:8] == b'dex\n035\0'
                            dex_counts[child] = struct.unpack_from('<I', header, 96)[0]
                    classes = [n for n in inner.namelist() if n.endswith('.class')]
                    containers[name] = {'members': len(inner.namelist()), 'dex_class_counts': dex_counts,
                                        'jvm_classes': len(classes), 'resource_table': 'resources.arsc' in inner.namelist()}
                kinds['ZIP/JAR/APK'] += 1
            else:
                kinds['ELF' if data.startswith(b'\x7fELF') else
                      'JSON' if data.lstrip().startswith(b'{') else 'properties'] += 1
    return {'original_apk_sha256': sha(source.read_bytes()), 'installed_apk_sha256': sha(installed.read_bytes()),
            'tbs_version': manifest['VERSIONCODE'], 'entry': manifest['ENTRY'], 'manifest_file_count': len(manifest['FILES']),
            'matching_digest_entries': len(listed), 'matching_apk_build_and_device_members': len(names),
            'container_types': dict(kinds), 'grit_revision': GRIT_REV, 'grit_module_sha256': GRIT_SHA,
            'packs': packs, 'nested_archives': containers}


if __name__ == '__main__':
    cli = argparse.ArgumentParser(description=__doc__)
    cli.add_argument('grit_dir', type=Path, help='tools/grit directory of the reference Chromium checkout')
    cli.add_argument('installed_apk', type=Path, help='优课畅学 base.apk copied from the emulator')
    args = cli.parse_args()
    print(json.dumps(check(args.grit_dir, args.installed_apk), ensure_ascii=False, indent=2))
