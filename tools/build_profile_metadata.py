"""Make an Android 9–11 .dm for a rebuilt APK whose indexed method and type names still match."""
import argparse
from io import BytesIO
import os
from pathlib import Path
import struct
import tempfile
import zlib
from zipfile import ZipFile, ZipInfo

from art_profile import decode, numbers, take


def indexed_symbols(dex):
    def table(header, layout):
        count, offset = struct.unpack_from('<II', dex, header)
        end = offset + count * struct.calcsize(layout)
        return struct.iter_unpack(layout, memoryview(dex)[offset:end])

    def string(offset):
        # Skip the ULEB128 UTF-16 length, then keep the exact DEX modified-UTF-8 bytes.
        while dex[offset] & 128:
            offset += 1
        start = offset + 1
        return dex[start:dex.index(0, start)]

    strings = [string(at) for at, in table(56, '<I')]
    types = [strings[i] for i, in table(64, '<I')]
    protos = []
    for _, result, params in table(72, '<III'):
        length = struct.unpack_from('<I', dex, params)[0] if params else 0
        args = struct.unpack_from('<' + 'H' * length, dex, params + 4) if length else ()
        protos.append((result, args))
    methods = [(owner, proto, strings[name]) for owner, proto, name in table(88, '<HHI')]
    class_def_types = [row[0] for row in table(96, '<8I')]
    return (types, protos, methods), class_def_types


def make_metadata(original, rebuilt, destination):
    with ZipFile(original) as source, ZipFile(rebuilt) as target:
        raw = source.read('assets/dexopt/baseline.prof')
        profile = decode(raw)
        raw_meta = source.read('assets/dexopt/baseline.profm')
        meta = decode(raw_meta)
        # The output targets P/Q/R, which use type IDs in the profile itself.
        # The bundled companion metadata also lets us verify the original class-def indexes.
        if len(profile['dex']) != len(meta['dex']):
            raise ValueError('profile and metadata DEX counts disagree')
        body = bytearray(zlib.decompress(raw[17:]))
        headers = BytesIO(body)
        meta_body = BytesIO()
        evidence = []
        for i, (row, companion) in enumerate(zip(profile['dex'], meta['dex'])):
            start = headers.tell()
            key_size, = numbers(headers, '<H')
            take(headers, 14)
            key = take(headers, key_size).decode('utf-8')
            if key != row['key'] or companion['key'] != key or companion['profile_index'] != i:
                raise ValueError('profile DEX keys disagree')
            if source.getinfo(key).CRC != row['dex_checksum']:
                raise ValueError(f'{key}: original profile does not belong to the supplied APK')
            old, old_classes = indexed_symbols(source.read(key))
            new, new_classes = indexed_symbols(target.read(key))
            if old != new or any(row['hot_methods'].values()):
                raise ValueError(f'{key}: remapping requires a profile compiled for the edited DEX')
            if len(old[2]) != row['method_count'] or len(old[0]) != companion['type_count']:
                raise ValueError(f'{key}: profile and DEX table sizes disagree')
            classes = set(row['class_ids'])
            if classes != {old_classes[c] for c in companion['class_ids']} or not classes <= set(new_classes):
                raise ValueError(f'{key}: class definitions disagree')
            crc = target.getinfo(key).CRC
            struct.pack_into('<I', body, start + 8, crc)
            indices = [index for index, type_id in enumerate(new_classes) if type_id in classes]
            companion['class_ids'] = indices
            key_bytes = key.encode('utf-8')
            meta_body.write(struct.pack('<HH', i, len(key_bytes)) + key_bytes)
            meta_body.write(struct.pack('<IH', len(new[0]), len(indices)))
            last = 0
            for index in indices:
                meta_body.write(struct.pack('<H', index - last))
                last = index
            evidence.append({'dex': key, 'original_crc32': row['dex_checksum'], 'rebuilt_crc32': crc,
                             'class_ids': len(classes), 'method_ids': row['method_count'],
                             'hot': len(row['hot_methods']), 'startup': len(row['startup']),
                             'post_startup': len(row['post_startup']), 'inline_caches': 0,
                             'class_definition_order_preserved': old_classes == new_classes})
    compressed = zlib.compress(body, 1)
    updated = raw[:9] + struct.pack('<II', len(body), len(compressed)) + compressed
    expected = profile['dex']
    for row, check in zip(expected, evidence):
        row['dex_checksum'] = check['rebuilt_crc32']
    if decode(updated)['dex'] != expected:
        raise ValueError('updated profile flags or index lists differ')
    metadata = meta_body.getvalue()
    packed = zlib.compress(metadata, 1)
    updated_meta = raw_meta[:10] + struct.pack('<II', len(metadata), len(packed)) + packed
    if decode(updated_meta)['dex'] != meta['dex']:
        raise ValueError('updated class definitions differ')
    with tempfile.TemporaryDirectory(dir=destination.parent) as temporary:
        staged = Path(temporary) / 'profile.dm'
        with ZipFile(staged, 'w') as archive:
            archive.writestr(ZipInfo('primary.prof'), updated)
            archive.writestr(ZipInfo('primary.profm'), updated_meta)
        os.replace(staged, destination)
    return evidence


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('original', type=Path)
    parser.add_argument('rebuilt', type=Path)
    parser.add_argument('output', type=Path)
    args = parser.parse_args()
    if args.output.resolve() in (args.original.resolve(), args.rebuilt.resolve()):
        parser.error('select a separate .dm output file')
    records = make_metadata(args.original, args.rebuilt, args.output)
    print(f'{len(records)} DEX entries in {args.output}')


if __name__ == '__main__':
    main()
