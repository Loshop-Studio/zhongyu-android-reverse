"""Compile the two reconstructed method bodies under their original DEX type and member names."""
from pathlib import Path
import hashlib
import struct
import subprocess
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]


def build_dispatch(directory, sdk, cloud):
    app = '中育云笔记' if cloud else '优课畅学'
    vm = 'com.friday.document.viewmodel.PdfViewerViewModel' if cloud else 'com.zykj.study.viewmodels.PDFViewModel'
    package = vm.rpartition('.')[0]
    action = package+'.a'
    pdf = 'com.friday.common.entity.PdfEntity' if cloud else 'com.zykj.study.data.PdfEntity'
    dao = 'c2.a1' if cloud else 'com.zykj.study.data.PdfDao'
    context = 'kotlin.coroutines.d'
    continuation = 'vc.c' if cloud else 'm7.c'
    intrinsics = 'wc.a' if cloud else 'n7.a'
    debug = 'xc.h' if cloud else 'o7.h'
    flow = 'vd.l' if cloud else 'l8.g'
    unit = 'qc.q' if cloud else 'h7.p'
    state = 'z2.m' if cloud else 'g5.k2'
    write, read = ('a', 'b') if cloud else ('insertPdf', 'queryPdf')
    spill, label, event, owner = ('c','d','e','f') if cloud else ('a','b','c','d')
    unit_field = 'a'
    wrapper = 'RecoveredCloud' if cloud else 'RecoveredStudy'
    work = directory / wrapper
    classes = work/'classes'
    classes.mkdir(parents=True)
    units = []

    def source(name, definition):
        pkg, _, simple = name.rpartition('.')
        dest = work/'src'/Path(*pkg.split('.'))/(simple+'.java')
        dest.parent.mkdir(parents=True, exist_ok=True)
        dest.write_text('package '+pkg+';\n'+definition+'\n')
        units.append(dest)

    # The stubs provide javac descriptors only. d8 receives just the recovered
    # class; when Android loads it, all of its dependencies come from the APK.
    source(context, 'public interface d {}')
    source(continuation, f'public interface c {{ {context} getContext(); void resumeWith(Object v); }}')
    source(intrinsics, 'public class a { public static native Object f(); }')
    source('kotlin.b', 'public class b { public static native void b(Object result); }')
    source('kotlin.NoWhenBranchMatchedException', 'public class NoWhenBranchMatchedException extends RuntimeException {}')
    source(pdf, 'public class PdfEntity {}')
    source(action, 'public abstract class a {}')
    source(action+'$a', 'public class a$a extends a { public native String a(); }')
    source(action+'$b', f'public class a$b extends a {{ public native {pdf} a(); }}')
    source(dao, f'public interface {dao.rpartition(".")[2]} {{ Object {read}(String p, {continuation} c); Object {write}({pdf} e, {continuation} c); }}')
    source(flow, f'public interface {flow.rpartition(".")[2]} {{ Object emit(Object v, {continuation} c); }}')
    source(vm, f'public class {vm.rpartition(".")[2]} {{ public {dao} a; public {flow} b; }}')
    source(unit, f'public class {unit.rpartition(".")[2]} {{ public static {unit} {unit_field}; }}')
    source(state, f'public class {state.rpartition(".")[2]} {{ public {state.rpartition(".")[2]}({pdf} e) {{}} }}')
    source(debug, 'public class h { public static native Object a(Object v); }')

    src = ROOT/'sources'/app/'java'/Path(*vm.split('.')).with_name(vm.rpartition('.')[2]+'$dispatch$1.java')
    content = src.read_text()
    start = content.index('    public final Object invokeSuspend(Object result)')
    end = content.index('\n    }', start)+len('\n    }')
    method = content[start:end]
    method_sha = hashlib.sha256(method.encode()).hexdigest()
    if cloud:
        aliases = {'f8108c':spill, 'f8109d':label, 'f8110e':event, 'f8111f':owner, 'f8105a':'a', 'f8106b':'b',
                   'AbstractC6133a.a':action+'$a','AbstractC6133a.b':action+'$b','m6490a':'a','m6491a':'a',
                   'mo2804b':read,'mo2803a':write,'C10786q.f26013a':unit+'.a',
                   'p430z2.C11991m':state,'p393wc.AbstractC11725a.m25952f':intrinsics+'.f',
                   'kotlin.AbstractC9924b.m20071b':'kotlin.b.b','p409xc.AbstractC11833h.m26224a':debug+'.a'}
    else:
        aliases = {'f14340a':spill,'f14341b':label,'f14342c':event,'f14343d':owner,'f14337a':'a','f14338b':'b',
                   'AbstractC8153a.a':action+'$a','AbstractC8153a.b':action+'$b','m12321a':'a','m12322a':'a',
                   'C8736p.f16368a':unit+'.a','p110g5.C8581k2':state,'p190n7.AbstractC9434a.m17291f':intrinsics+'.f',
                   'kotlin.AbstractC9079b.m15926b':'kotlin.b.b','p201o7.AbstractC9543h.m17814a':debug+'.a'}
    for alias, original in aliases.items():
        method = method.replace(alias, original)
    source('local.zy.compare.'+wrapper, f'''import {pdf};
public final class {wrapper} implements {continuation} {{
    public Object {spill};
    public int {label};
    public final {action} {event};
    public final {vm} {owner};
    public {wrapper}({action} event, {vm} model, {continuation} completion) {{
        this.{event} = event; this.{owner} = model;
    }}
    public {context} getContext() {{ throw new AssertionError("manually resumed"); }}
    public void resumeWith(Object result) {{ throw new AssertionError("manually resumed"); }}
{method}
}}''')
    subprocess.run(['javac', '--release', '8', '-d', classes, *units], check=True)
    output = work/'recovered.jar'
    subprocess.run([sdk/'build-tools/35.0.0/d8','--min-api','26','--lib',sdk/'platforms/android-35/android.jar',
                    '--classpath',classes,'--output',output,classes/'local/zy/compare'/(wrapper+'.class')], check=True)
    with ZipFile(output) as archive:
        dex = archive.read('classes.dex')
        assert dex.startswith(b'dex\n') and struct.unpack_from('<I', dex, 96)[0] == 1
    return output, method_sha
