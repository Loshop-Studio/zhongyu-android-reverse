"""Compare the original launcher's two city readers to independent host decoders."""
import argparse
from collections import Counter
import hashlib
import json
import os
from pathlib import Path
import subprocess
import sys
import tempfile
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
APP = '中育管控桌面'
CSV_NAME = 'China-City-List-latest.csv'
JSON_NAME = 'china_city_data.json'


def digest(data):
    return hashlib.sha256(data).hexdigest()


def walk(nodes, depth=0):
    for node in nodes:
        yield depth, node
        yield from walk(node.get('cityList', []), depth + 1)


def verify(serial):
    sdk = Path(os.environ.get('ANDROID_HOME', '/home/jdz/dev/android-sdk'))
    java = Path(os.environ.get('JAVA_HOME', '/home/jdz/dev/jdk-21.0.13+9')) / 'bin'
    env = dict(os.environ, PATH=str(java) + os.pathsep + os.environ['PATH'])
    adb = [sdk / 'platform-tools/adb', '-s', serial]
    platform = sdk / 'platforms/android-35/android.jar'
    app_file = ROOT / '中育apk' / (APP + '.apk')

    def run(*args):
        return subprocess.run(args, capture_output=True, check=True, env=env, timeout=90).stdout

    with tempfile.TemporaryDirectory(prefix='zy-cities-') as tmp:
        temp = Path(tmp)
        with ZipFile(app_file) as apk:
            inventory = {}
            for member in (CSV_NAME, JSON_NAME):
                raw = apk.read('assets/' + member)
                assert raw == (ROOT/'android'/APP/'assets'/member).read_bytes()
                (temp/member).write_bytes(raw)
                inventory[member] = {'bytes': len(raw), 'sha256': digest(raw)}
        columns = json.loads(run(sys.executable, ROOT/'tools/read-data.py', temp/CSV_NAME))
        regions = json.loads(run(sys.executable, ROOT/'tools/read-data.py', temp/JSON_NAME))
        expected = {}
        selected = 0
        overwritten = []
        for row in columns:
            if row['location_zh'] in row['city_zh']:
                city, identifier = row['city_zh'], row['location_id']
                if city in expected:
                    overwritten.append([city, expected[city], identifier])
                expected[city] = identifier
                selected += 1
        nodes = list(walk(regions))
        keys = Counter(tuple(sorted(node)) for _,node in nodes)
        depths = Counter(depth for depth,_ in nodes)
        triples = [[depth, node['id'], node['name']] for depth,node in nodes]
        district_keys = {p['name'] + c['name'] + d['name']
                         for p in regions for c in p['cityList'] for d in c['cityList']}
        remote = '/data/local/tmp/' + temp.name
        run(java/'javac', '--release', '8', '-cp', platform, '-d', temp,
            Path(__file__).with_name('CityCatalogProbe.java'))
        run(sdk/'build-tools/35.0.0/d8', '--min-api', '26', '--lib', platform,
            '--output', temp/'probe.jar', *sorted(temp.glob('CityCatalogProbe*.class')))
        run(*adb, 'shell', 'mkdir', remote)
        try:
            run(*adb, 'push', temp/'probe.jar', remote+'/probe.jar')
            run(*adb, 'push', app_file, remote+'/source.apk')
            output = run(*adb, 'shell', 'env', 'CLASSPATH='+remote+'/probe.jar:'+remote+'/source.apk',
                         'app_process', '/system/bin', 'CityCatalogProbe', remote+'/source.apk')
        finally:
            run(*adb, 'shell', 'rm', '-r', remote)
        result = json.loads(output.decode().strip().splitlines()[-1])
        assert expected == result['weather'] and result['missing_city'] == ''
        assert triples == result['picker']
        assert len(district_keys) == result['district_lookup_size']
        runtime = run(*adb, 'shell', 'getprop', 'ro.build.version.release').decode().strip()
        return {
            'app': APP, 'apk_sha256': digest(app_file.read_bytes()), 'android': runtime,
            'assets': inventory,
            'weather': {'rows': len(columns), 'field_order': list(columns[0]),
                        'empty_fields': {k: sum(row[k] == '' for row in columns)
                                         for k in columns[0] if any(row[k] == '' for row in columns)},
                        'selected_rows': selected, 'distinct_native_lookup_names': len(expected),
                        'native_map_matches_all_entries': True, 'replaced_entries_in_read_order': overwritten,
                        'missing_lookup': result['missing_city']},
            'picker': {'nodes_by_depth': [depths[i] for i in range(len(depths))],
                       'native_ids_names_order_match_all_nodes': True,
                       'distinct_district_lookup_names': len(district_keys),
                       'field_sets': [{'keys': list(k), 'nodes': n} for k,n in keys.items()],
                       'id_lengths_by_depth': [dict(sorted(Counter(len(node['id']) for depth,node in nodes
                                                if depth == i).items())) for i in range(len(depths))]}}


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('serial')
    args = parser.parse_args()
    if not args.serial.startswith('emulator-'):
        parser.error('Supply a local emulator serial')
    try:
        report = verify(args.serial)
    except subprocess.CalledProcessError as error:
        sys.stderr.write((error.stdout + error.stderr).decode(errors='replace'))
        raise
    out = ROOT/'reports/evidence/city-catalog/verification.json'
    out.parent.mkdir(exist_ok=True)
    out.write_text(json.dumps(report, ensure_ascii=False, indent=2) + '\n')
    print(out)
