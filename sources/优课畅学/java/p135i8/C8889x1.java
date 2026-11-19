package p135i8;

import kotlin.Pair;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p191n8.C9473z;

/* renamed from: i8.x1 */
/* loaded from: classes5.dex */
public final class C8889x1 extends C9473z {

    /* renamed from: e */
    public final ThreadLocal f16552e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8889x1(InterfaceC9100d interfaceC9100d, InterfaceC9324c interfaceC9324c) {
        C8892y1 c8892y1 = C8892y1.f16554a;
        super(interfaceC9100d.get(c8892y1) == null ? interfaceC9100d.plus(c8892y1) : interfaceC9100d, interfaceC9324c);
        this.f16552e = new ThreadLocal();
        if (interfaceC9324c.getContext().get(InterfaceC9099c.f17441b0) instanceof CoroutineDispatcher) {
            return;
        }
        Object objM16749c = ThreadContextKt.m16749c(interfaceC9100d, null);
        ThreadContextKt.m16747a(interfaceC9100d, objM16749c);
        m14933L0(interfaceC9100d, objM16749c);
    }

    @Override // p191n8.C9473z, kotlinx.coroutines.AbstractC9152a
    /* renamed from: G0 */
    public void mo14931G0(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f16552e.get();
            if (pair != null) {
                ThreadContextKt.m16747a((InterfaceC9100d) pair.m15903a(), pair.m15904b());
            }
            this.f16552e.remove();
        }
        Object objM14934a = AbstractC8890y.m14934a(obj, this.f18693d);
        InterfaceC9324c interfaceC9324c = this.f18693d;
        InterfaceC9100d context = interfaceC9324c.getContext();
        Object objM16749c = ThreadContextKt.m16749c(context, null);
        C8889x1 c8889x1M16218g = objM16749c != ThreadContextKt.f18077a ? CoroutineContextKt.m16218g(interfaceC9324c, context, objM16749c) : null;
        try {
            this.f18693d.resumeWith(objM14934a);
            C8736p c8736p = C8736p.f16368a;
            if (c8889x1M16218g == null || c8889x1M16218g.m14932K0()) {
                ThreadContextKt.m16747a(context, objM16749c);
            }
        } catch (Throwable th) {
            if (c8889x1M16218g == null || c8889x1M16218g.m14932K0()) {
                ThreadContextKt.m16747a(context, objM16749c);
            }
            throw th;
        }
    }

    /* renamed from: K0 */
    public final boolean m14932K0() {
        boolean z10 = this.threadLocalIsSet && this.f16552e.get() == null;
        this.f16552e.remove();
        return !z10;
    }

    /* renamed from: L0 */
    public final void m14933L0(InterfaceC9100d interfaceC9100d, Object obj) {
        this.threadLocalIsSet = true;
        this.f16552e.set(AbstractC8726f.m14230a(interfaceC9100d, obj));
    }
}
