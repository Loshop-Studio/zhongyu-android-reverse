package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p410xd.AbstractC11853j0;
import p410xd.C11848h;
import p440zd.AbstractRunnableC12046g;
import sd.AbstractC11098c0;
import sd.AbstractC11114g0;
import sd.AbstractC11150p0;
import sd.C11136l2;
import sd.C11174x;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.f */
/* loaded from: classes6.dex */
public abstract class AbstractC10008f extends AbstractRunnableC12046g {

    /* renamed from: e */
    public int f23590e;

    public AbstractC10008f(int i10) {
        this.f23590e = i10;
    }

    /* renamed from: a */
    public void mo20518a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract InterfaceC11588c mo20519b();

    /* renamed from: d */
    public Throwable mo20521d(Object obj) {
        C11174x c11174x = obj instanceof C11174x ? (C11174x) obj : null;
        if (c11174x != null) {
            return c11174x.f26837a;
        }
        return null;
    }

    /* renamed from: e */
    public Object mo20522e(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void m20755g(Throwable th) {
        AbstractC11114g0.m24718a(mo20519b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: h */
    public abstract Object mo20524h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC11588c interfaceC11588cMo20519b = mo20519b();
            AbstractC9979u.m20292e(interfaceC11588cMo20519b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C11848h c11848h = (C11848h) interfaceC11588cMo20519b;
            InterfaceC11588c interfaceC11588c = c11848h.f28088g;
            Object obj = c11848h.f28090i;
            InterfaceC9945d context = interfaceC11588c.getContext();
            Object objM26293i = AbstractC11853j0.m26293i(context, obj);
            InterfaceC10045g interfaceC10045g = null;
            C11136l2 c11136l2M24691m = objM26293i != AbstractC11853j0.f28093a ? AbstractC11098c0.m24691m(interfaceC11588c, context, objM26293i) : null;
            try {
                InterfaceC9945d context2 = interfaceC11588c.getContext();
                Object objMo20524h = mo20524h();
                Throwable thMo20521d = mo20521d(objMo20524h);
                if (thMo20521d == null && AbstractC11150p0.m24783b(this.f23590e)) {
                    interfaceC10045g = (InterfaceC10045g) context2.get(InterfaceC10045g.f23976b0);
                }
                if (interfaceC10045g != null && !interfaceC10045g.isActive()) {
                    CancellationException cancellationExceptionMo20438g = interfaceC10045g.mo20438g();
                    mo20518a(objMo20524h, cancellationExceptionMo20438g);
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11588c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(cancellationExceptionMo20438g)));
                } else if (thMo20521d != null) {
                    Result.C9921a c9921a2 = Result.f23263d;
                    interfaceC11588c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(thMo20521d)));
                } else {
                    Result.C9921a c9921a3 = Result.f23263d;
                    interfaceC11588c.resumeWith(Result.m20054c(mo20522e(objMo20524h)));
                }
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
        } catch (DispatchException e10) {
            AbstractC11114g0.m24718a(mo20519b().getContext(), e10.getCause());
        } catch (Throwable th2) {
            m20755g(th2);
        }
    }
}
