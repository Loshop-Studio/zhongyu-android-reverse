package sd;

import kotlin.Pair;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p410xd.AbstractC11853j0;
import p410xd.C11874y;
import vc.InterfaceC11588c;

/* renamed from: sd.l2 */
/* loaded from: classes6.dex */
public final class C11136l2 extends C11874y {

    /* renamed from: g */
    public final ThreadLocal f26803g;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C11136l2(InterfaceC9945d interfaceC9945d, InterfaceC11588c interfaceC11588c) {
        C11140m2 c11140m2 = C11140m2.f26805c;
        super(interfaceC9945d.get(c11140m2) == null ? interfaceC9945d.plus(c11140m2) : interfaceC9945d, interfaceC11588c);
        this.f26803g = new ThreadLocal();
        if (interfaceC11588c.getContext().get(InterfaceC9944c.f23354a0) instanceof AbstractC11106e0) {
            return;
        }
        Object objM26293i = AbstractC11853j0.m26293i(interfaceC9945d, null);
        AbstractC11853j0.m26290f(interfaceC9945d, objM26293i);
        m24755M0(interfaceC9945d, objM26293i);
    }

    @Override // p410xd.C11874y, kotlinx.coroutines.AbstractC9995a
    /* renamed from: F0 */
    public void mo20490F0(Object obj) {
        m24754L0();
        Object objM24828a = AbstractC11177y.m24828a(obj, this.f28133f);
        InterfaceC11588c interfaceC11588c = this.f28133f;
        InterfaceC9945d context = interfaceC11588c.getContext();
        Object objM26293i = AbstractC11853j0.m26293i(context, null);
        C11136l2 c11136l2M24691m = objM26293i != AbstractC11853j0.f28093a ? AbstractC11098c0.m24691m(interfaceC11588c, context, objM26293i) : null;
        try {
            this.f28133f.resumeWith(objM24828a);
            C10786q c10786q = C10786q.f26013a;
            if (c11136l2M24691m == null || c11136l2M24691m.m24753K0()) {
                AbstractC11853j0.m26290f(context, objM26293i);
            }
        } catch (Throwable th) {
            if (c11136l2M24691m == null || c11136l2M24691m.m24753K0()) {
                AbstractC11853j0.m26290f(context, objM26293i);
            }
            throw th;
        }
    }

    @Override // p410xd.C11874y
    /* renamed from: J0 */
    public void mo24752J0() {
        m24754L0();
    }

    /* renamed from: K0 */
    public final boolean m24753K0() {
        boolean z10 = this.threadLocalIsSet && this.f26803g.get() == null;
        this.f26803g.remove();
        return !z10;
    }

    /* renamed from: L0 */
    public final void m24754L0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f26803g.get();
            if (pair != null) {
                AbstractC11853j0.m26290f((InterfaceC9945d) pair.m20048a(), pair.m20049c());
            }
            this.f26803g.remove();
        }
    }

    /* renamed from: M0 */
    public final void m24755M0(InterfaceC9945d interfaceC9945d, Object obj) {
        this.threadLocalIsSet = true;
        this.f26803g.set(AbstractC10776g.m22975a(interfaceC9945d, obj));
    }
}
