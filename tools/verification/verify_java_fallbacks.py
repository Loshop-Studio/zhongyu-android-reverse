"""Follow every published Java/smali link and check the method's code_item in the original APK."""
import hashlib
import json
import re
import struct
import subprocess
import sys
from collections import Counter, defaultdict
from functools import lru_cache
from pathlib import Path
from urllib.parse import unquote
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
sys.path.insert(0, str(ROOT/'tools'))
from index_java_methods import STUB, COMMENT, prototype


def uleb(data, at):
    value = shift = 0
    while True:
        byte = data[at]
        at += 1
        value |= (byte & 127) << shift
        if byte < 128:
            return value, at
        shift += 7


def dex_bodies(data, targets):
    u32 = lambda off: struct.unpack_from('<I', data, off)[0]
    strings, types, protos, methods = (u32(off) for off in (60, 68, 76, 92))
    @lru_cache(None)
    def string(i):
        _, begin = uleb(data, u32(strings + i * 4))
        return data[begin:data.index(0, begin)].decode('utf8', errors='surrogatepass')
    @lru_cache(None)
    def typename(i):
        return string(u32(types + 4 * i))
    found = set()
    classes, start = struct.unpack_from('<II', data, 96)
    for i in range(classes):
        entry = start + i * 32
        owner = typename(u32(entry))[1:-1].replace('/', '.')
        if owner not in targets:
            continue
        at = u32(entry + 24)
        if not at:
            continue
        counts = []
        for _ in range(4):
            n, at = uleb(data, at)
            counts.append(n)
        for _ in range(2 * (counts[0] + counts[1])):
            _, at = uleb(data, at)
        for count in counts[2:]:
            method_id = 0
            for _ in range(count):
                delta, at = uleb(data, at)
                _, at = uleb(data, at)
                code, at = uleb(data, at)
                method_id += delta
                if not code:
                    continue
                cls, prot, name_idx = struct.unpack_from('<HHI', data, methods + 8 * method_id)
                assert typename(cls)[1:-1].replace('/', '.') == owner
                ret, arglist = struct.unpack_from('<II', data, protos + prot * 12 + 4)
                args = struct.unpack_from('<' + 'H' * u32(arglist), data, arglist + 4) if arglist else ()
                sig = string(name_idx) + '(' + ''.join(map(typename, args)) + ')' + typename(ret)
                if sig in targets[owner]:
                    assert u32(code + 12) > 0 and code + 16 + 2 * u32(code + 12) <= len(data)
                    found.add((owner, sig))
    return found


def check(app):
    folder = ROOT/'reports/apps'/app
    by_dex = defaultdict(lambda: defaultdict(set))
    @lru_cache(64)
    def lines(file):
        return file.read_text().splitlines()
    seen = set()
    annotated = 0
    for line in (folder/'java-fallbacks.md').read_text().splitlines():
        if not line.startswith('| [Java]'):
            continue
        j, jnum, s, snum, ident = re.fullmatch(
            r'\| \[Java\]\((.+?)#L(\d+)\) \| \[smali\]\((.+?)#L(\d+)\) \| `(.+?)` \|', line).groups()
        java = (folder/unquote(j)).resolve()
        smali = (folder/unquote(s)).resolve()
        jline = lines(java)[int(jnum)-1]
        signature = jline.split(STUB, 1)[1].split('");', 1)[0]
        decl = lines(smali)[int(snum)-1]
        method = decl.split()[-1]
        assert decl.startswith('.method ') and method[method.index('('):] == prototype(signature)
        assert (java, jnum) not in seen
        seen.add((java, jnum))
        dexdir, *rest = smali.relative_to(ROOT/'android'/app).with_suffix('').parts
        dex = dexdir.replace('smali_classes', 'classes') if dexdir != 'smali' else 'classes'
        owner = '.'.join(rest)
        assert ident == owner + '.' + method
        if COMMENT in jline:
            assert jline.split(COMMENT)[1] == str(smali.relative_to(ROOT)) + ':' + snum
            annotated += 1
        by_dex[dex+'.dex'][owner].add(method)
    hits = subprocess.check_output(['rg', '-n', '-H', '--no-heading', '-F', '-g', '*.java', STUB,
                                    str(ROOT/'sources'/app/'java')], text=True)
    actual = {(Path(f), n) for f, n in re.findall(r'^(.+?):(\d+):', hits, re.M)}
    assert actual == seen, (actual - seen, seen - actual)
    apk = ROOT/'中育apk'/(app+'.apk')
    digest = hashlib.sha256(apk.read_bytes()).hexdigest()
    evidence = json.loads((ROOT/'reports/evidence/rea'/(app+'.json')).read_bytes())
    assert evidence['subject']['digest']['sha256'] == digest
    counts = Counter()
    with ZipFile(apk) as archive:
        for dex, targets in sorted(by_dex.items()):
            want = {(c, m) for c, ms in targets.items() for m in ms}
            found = dex_bodies(archive.read(dex), targets)
            assert want == found, sorted(want-found)[:3]
            counts[dex] = len(found)
    return {'app': app, 'apk_sha256': digest, 'java_locations': len(seen), 'original_methods_with_code': sum(counts.values()),
            'project_namespace_comments': annotated, 'dex': dict(counts)}


if __name__ == '__main__':
    print(json.dumps([check(p.stem) for p in sorted((ROOT/'中育apk').glob('*.apk'))], ensure_ascii=False, indent=2))
