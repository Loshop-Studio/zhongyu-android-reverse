"""Identify all packaged assets under assets/ and match them to the build inputs."""
import hashlib
import json
import re
from collections import Counter
from pathlib import Path
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]


def identify(name, data):
    suffix = Path(name).suffix.lower()
    if data.startswith(b'\x89PNG\r\n\x1a\n'):
        return 'PNG'
    if data.startswith(b'\xff\xd8\xff'):
        return 'JPEG'
    if data[4:8] == b'TFL3':
        return 'TensorFlow Lite FlatBuffer'
    if data.startswith(b'\x00\x01\x00\x00') and suffix == '.ttf':
        return 'TrueType font'
    if data.startswith(b'pro\0'):
        return 'ART baseline profile'
    if data.startswith(b'prm\0'):
        return 'ART profile metadata'
    if data.startswith(b'-----BEGIN CERTIFICATE-----'):
        return 'PEM certificate'
    if data.startswith(b'-----BEGIN PUBLIC KEY-----'):
        return 'PEM public key'
    if suffix == '.bks' and int.from_bytes(data[:4], 'big') == 2:
        return 'BKS v2 keystore'
    if name.endswith('/hianalytics_njjn') and re.fullmatch(rb'(?:[0-9A-Fa-f]{2})+', data.strip()):
        # ASN.1 SubjectPublicKeyInfo wrapper and the rsaEncryption algorithm identifier.
        der = bytes.fromhex(data.decode('ascii'))
        if der[0] == 0x30 and bytes.fromhex('06092a864886f70d010101') in der[:28]:
            return 'hex-encoded DER RSA public key'
    if name.endswith('/PublicSuffixDatabase.list'):
        n = int.from_bytes(data[:4], 'big')
        if n + 8 + int.from_bytes(data[4+n:8+n], 'big') == len(data):
            return 'OkHttp length-prefixed public suffix list'
    text = data.decode('utf-8-sig')
    if suffix == '.json':
        return 'JSON array' if isinstance(json.loads(text), list) else 'JSON object'
    if text.lstrip().lower().startswith(('<!doctype html', '<html')):
        return 'HTML'
    if suffix == '.js':
        return 'JavaScript'
    if suffix == '.properties':
        return 'properties text'
    if suffix == '.csv':
        return 'CSV'
    raise ValueError(f'unclassified asset {name}')


def main():
    apps = []
    kinds = Counter()
    names = set()
    variants = set()
    for source in sorted((ROOT/'中育apk').glob('*.apk')):
        files = []
        with ZipFile(source) as apk:
            for member in sorted(apk.namelist()):
                if not member.startswith('assets/') or member.endswith('/'):
                    continue
                data = apk.read(member)
                assert data == (ROOT/'android'/source.stem/member).read_bytes(), (source.stem, member)
                fmt = identify(member, data)
                digest = hashlib.sha256(data).hexdigest()
                kinds[fmt] += 1
                names.add(member)
                variants.add(digest)
                files.append({'path': member, 'format': fmt, 'bytes': len(data), 'sha256': digest})
        apps.append({'app': source.stem, 'apk_sha256': hashlib.sha256(source.read_bytes()).hexdigest(),
                     'files': files})
    report = {'scope': 'Non-directory ZIP members directly or recursively inside assets/ in each original APK',
              'files': sum(kinds.values()), 'unique_paths': len(names), 'unique_digests': len(variants),
              'format_counts': dict(sorted(kinds.items())), 'apps': apps}
    dest = ROOT/'reports/evidence/packaged-assets.json'
    dest.write_text(json.dumps(report, ensure_ascii=False, indent=2) + '\n')
    print(f'{len(apps)} APKs, {report["files"]} packaged files, {len(names)} paths, {len(variants)} unique digests')


if __name__ == '__main__':
    main()
