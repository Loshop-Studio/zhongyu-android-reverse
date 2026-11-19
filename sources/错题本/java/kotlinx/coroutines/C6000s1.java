package kotlinx.coroutines;

import kotlin.Pair;
import p054e7.AbstractC5469a;
import p054e7.C5483o;
import p075h6.C5632d;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.s1 */
/* loaded from: classes4.dex */
public final class C6000s1 extends C5483o {

    /* renamed from: e */
    public final ThreadLocal f9497e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6000s1(InterfaceC5631c interfaceC5631c, InterfaceC5636h interfaceC5636h) {
        C6005t1 c6005t1 = C6005t1.f9509a;
        super(interfaceC5631c, interfaceC5636h.get(c6005t1) == null ? interfaceC5636h.plus(c6005t1) : interfaceC5636h);
        this.f9497e = new ThreadLocal();
        if (interfaceC5631c.getContext().get(C5632d.f8764a) instanceof AbstractC5995r) {
            return;
        }
        Object objM4838n = AbstractC5469a.m4838n(interfaceC5636h, null);
        AbstractC5469a.m4831g(interfaceC5636h, objM4838n);
        m5613f0(interfaceC5636h, objM4838n);
    }

    @Override // p054e7.C5483o
    /* renamed from: c0 */
    public final void mo4859c0() {
        m5612e0();
    }

    /* renamed from: d0 */
    public final boolean m5611d0() {
        boolean z8 = this.threadLocalIsSet && this.f9497e.get() == null;
        this.f9497e.remove();
        return !z8;
    }

    /* renamed from: e0 */
    public final void m5612e0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f9497e.get();
            if (pair != null) {
                AbstractC5469a.m4831g((InterfaceC5636h) pair.component1(), pair.component2());
            }
            this.f9497e.remove();
        }
    }

    /* renamed from: f0 */
    public final void m5613f0(InterfaceC5636h interfaceC5636h, Object obj) {
        this.threadLocalIsSet = true;
        this.f9497e.set(new Pair(interfaceC5636h, obj));
    }

    @Override // p054e7.C5483o, kotlinx.coroutines.C5871c1
    /* renamed from: t */
    public final void mo4861t(Object obj) {
        m5612e0();
        Object objM5653x = AbstractC6014x.m5653x(obj);
        InterfaceC5631c interfaceC5631c = this.f8476d;
        InterfaceC5636h context = interfaceC5631c.getContext();
        Object objM4838n = AbstractC5469a.m4838n(context, null);
        C6000s1 c6000s1M5625E = objM4838n != AbstractC5469a.f8441d ? AbstractC6014x.m5625E(interfaceC5631c, context, objM4838n) : null;
        try {
            interfaceC5631c.resumeWith(objM5653x);
            if (c6000s1M5625E == null || c6000s1M5625E.m5611d0()) {
                AbstractC5469a.m4831g(context, objM4838n);
            }
        } catch (Throwable th) {
            if (c6000s1M5625E == null || c6000s1M5625E.m5611d0()) {
                AbstractC5469a.m4831g(context, objM4838n);
            }
            throw th;
        }
    }
}
