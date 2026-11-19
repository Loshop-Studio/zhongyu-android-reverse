"""Link JADX fallback bodies in the delivered Java source to exact buildable smali methods."""
import argparse
from collections import defaultdict
from functools import lru_cache
import hashlib
from pathlib import Path
import re
import subprocess
from tempfile import TemporaryDirectory
from urllib.parse import quote

ROOT = Path(__file__).resolve().parents[1]
STUB = 'throw new UnsupportedOperationException("Method not decompiled: '
PROJECT_PACKAGES = ('com.zykj.', 'com.friday.', 'com.zhongyukejiao.', 'com.linspirer.',
                    'com.android.launcher3.', 'com.android.hccontrol.')
COMMENT = ' // DEX body: '
PRIMITIVES = dict(zip('void boolean byte char short int long float double'.split(), 'VZBCSIJFD'))


def sha(path):
    with path.open('rb') as stream:
        return hashlib.file_digest(stream, 'sha256').hexdigest()


def descriptor(name):
    if name.endswith('[]'):
        return '[' + descriptor(name[:-2])
    return PRIMITIVES.get(name, 'L' + name.replace('.', '/') + ';')


def prototype(signature):
    args, result = signature[signature.index('(') + 1:].split('):')
    return '(' + ''.join(descriptor(a) for a in args.split(', ') if a) + ')' + descriptor(result)


def raw_method_name(lines, line):
    """Use an explicit rename comment attached to this Java declaration."""
    stub = lines[line - 1]
    indent = len(stub) - len(stub.lstrip()) - 4
    for n in range(line - 2, -1, -1):
        row = lines[n]
        if not re.fullmatch(r' {' + str(max(indent, 0)) + r'}[\w$<][^;]*\([^;]*\)(?: throws [^{]+)? \{', row):
            continue
        before = n - 1
        while before >= 0:
            text = lines[before].strip()
            if text.endswith('*/') and not text.startswith('/*'):
                while before > 0 and not lines[before].lstrip().startswith('/*'):
                    before -= 1
                text = lines[before].strip()
            if not text.startswith(('/', '@')):
                break
            match = re.fullmatch(r'/\* renamed from: ([\w$<>-]+)(?:, [^*]+)? \*/', text)
            if match:
                return match[1]
            before -= 1
        break
    return ''


def source_stubs(app):
    java = ROOT/'sources'/app/'java'
    result = subprocess.run(['rg', '--no-heading', '-n', '-H', '-F', '-g', '*.java', STUB, str(java)],
                            capture_output=True, text=True)
    if result.returncode not in (0, 1):
        raise RuntimeError(result.stderr)
    rows = defaultdict(list)
    for hit in result.stdout.splitlines():
        path, num, content = re.match(r'^(.*?):(\d+):(.*)$', hit).groups()
        sig = content.split(STUB, 1)[1].split('");', 1)[0]
        rows[Path(path)].append((int(num), sig))
    locations = set()
    for file, stubs in rows.items():
        content = file.read_text()
        top = '.'.join(file.relative_to(java).with_suffix('').parts)
        match = re.search(r'^/\* renamed from: ([^ ,*]+)', content, re.M)
        lines = content.splitlines()
        for line, signature in stubs:
            locations.add('\t'.join([signature, top, match[1] if match else '', raw_method_name(lines, line)]))
    return rows, locations


def index_app(app, jar, classes, work):
    apk = ROOT/'中育apk'/(app + '.apk')
    names = ROOT/'sources'/app/'names.jobf'
    rows, locations = source_stubs(app)
    (work/'wanted.tsv').write_text('\n'.join(sorted(locations)) + '\n')
    cmd = ['java', '-Xmx2100m', '-XX:ActiveProcessorCount=3', '-cp', str(jar) + ':' + str(classes),
           'JadxMethodIndex', str(apk), str(names), str(work/'wanted.tsv'), str(work/'methods.tsv')]
    with (work/'jadx.log').open('w') as log:
        result = subprocess.run(cmd, stdout=log, stderr=log)
    if result.returncode:
        raise RuntimeError((work/'jadx.log').read_text()[-3000:])
    return write_report(app, rows, work/'methods.tsv')


def link(label, path, line):
    # Leave Chinese file names readable while escaping Markdown delimiters.
    target = '../../../' + path.relative_to(ROOT).as_posix()
    target = ''.join(quote(c, safe='') if c in ' %#?()' else c for c in target)
    return f'[{label}]({target}#L{line})'


def write_report(app, rows, mappings):
    apk = ROOT/'中育apk'/(app + '.apk')
    names = ROOT/'sources'/app/'names.jobf'
    refs = defaultdict(set)
    for entry in mappings.read_text().splitlines():
        sig, owner, method = entry.split('\t')
        if method[method.index('('):] != prototype(sig):
            raise ValueError(f'Method prototype differs: {sig} / {method}')
        refs[sig].add((owner, method))
    dex_dirs = sorted((ROOT/'android'/app).glob('smali*'))

    @lru_cache(None)
    def instructions(owner):
        rel = Path(owner.replace('.', '/') + '.smali')
        path, = [d/rel for d in dex_dirs if (d/rel).is_file()]
        src = path.read_text()
        decl = re.search(r'^\.class (?:[^\n]* )?(L[^;]+;)$', src, re.M)
        if not decl or decl[1] != 'L' + owner.replace('.', '/') + ';':
            raise ValueError(f'Incorrect class declaration in {path}')
        methods = {}
        for body in re.finditer(r'^\.method ([^\n]*?)(\S+\([^\n]+)\n(.*?)^\.end method', src, re.M | re.S):
            if re.search(r'^\s*\.(registers|locals) \d+', body[3], re.M):
                methods[body[2]] = src.count('\n', 0, body.start()) + 1
        return path, methods

    table, pending, edits = [], [], {}
    unique = set()
    marked = 0
    for file, stubs in sorted(rows.items()):
        new_lines = None
        source_lines = None
        for line, signature in sorted(stubs):
            java_link = link('Java', file, line)
            targets = refs.get(signature, set())
            if len(targets) > 1:
                # Code generation can inline a typed method into a bridge that
                # has the same prototype. The attached rename names the body.
                if source_lines is None:
                    source_lines = file.read_text().splitlines()
                raw = raw_method_name(source_lines, line)
                explicit = {(o, m) for o, m in targets if m.split('(', 1)[0] == raw}
                if len(explicit) == 1:
                    targets = explicit
            if len(targets) != 1:
                pending.append(f'| {java_link} | `{signature}` | {len(targets)} |')
                continue
            owner, method = next(iter(targets))
            path, methods = instructions(owner)
            num = methods[method]
            unique.add((owner, method))
            table.append(f'| {java_link} | {link("smali", path, num)} | `{owner}.{method}` |')
            if owner.startswith(PROJECT_PACKAGES):
                if new_lines is None:
                    new_lines = file.read_text().splitlines(keepends=True)
                old = new_lines[line - 1]
                new_lines[line - 1] = old.rstrip('\n').split(COMMENT)[0] + COMMENT + str(path.relative_to(ROOT)) + ':' + str(num) + '\n'
                marked += 1
        if new_lines is not None:
            text = ''.join(new_lines)
            if file.read_text() != text:
                edits[file] = text
    report = [f'# {app} Java 占位方法与 DEX 指令', '',
              f'阅读源中有 {len(table)+len(pending):,} 处 JADX 未能生成 Java 方法体。{len(table):,} 处已定位到 {len(unique):,} 个编入 APK 的具体方法，{marked:,} 处业务命名空间的 Java 占位行附有指令位置。', '',
              '同一方法可能出现在多个 Java 位置。按原 APK 重算 JADX 1.5.3 名称表，逐字节核对 names.jobf，并以原类、方法、所有参数和返回类型查找实际 smali 方法体。泛型桥接方法与具体实现分别核对。', '',
              f'APK SHA-256 为 `{sha(apk)}`。名称表 SHA-256 为 `{sha(names)}`。', '',
              '| Java 占位行 | 编译指令 | DEX 类、方法及原型 |', '|---|---|---|', *table]
    if pending:
        report.extend(['', '### 待定位的占位行', '', '| Java 占位行 | 阅读源签名 | 匹配数 |', '|---|---|---:|', *pending])
    for file, text in edits.items():
        file.write_text(text)
    (ROOT/'reports/apps'/app/'java-fallbacks.md').write_text('\n'.join(report) + '\n')
    print(f'{app}: {len(table)} mapped, {len(unique)} methods, {marked} business comments, {len(pending)} unresolved', flush=True)
    return len(pending)


if __name__ == '__main__':
    cli = argparse.ArgumentParser(description=__doc__)
    cli.add_argument('jadx_jar', type=Path, help='JADX 1.5.3 all-in-one JAR')
    cli.add_argument('--app', action='append', help='APK base name; defaults to all eleven applications')
    args = cli.parse_args()
    jar = args.jadx_jar.resolve(strict=True)
    with TemporaryDirectory() as directory:
        work = Path(directory)
        subprocess.run(['javac', '-proc:none', '-cp', str(jar), '-d', str(work),
                        str(ROOT/'tools/verification/JadxMethodIndex.java')], check=True)
        for app in args.app or sorted(p.stem for p in (ROOT/'中育apk').glob('*.apk')):
            index_app(app, jar, work, work)
