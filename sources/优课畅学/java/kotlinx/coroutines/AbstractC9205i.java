package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.internal.ThreadContextKt;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p135i8.AbstractC8818a0;
import p135i8.AbstractC8837g0;
import p135i8.C8884w;
import p135i8.C8889x1;
import p179m7.InterfaceC9324c;
import p191n8.C9453j;
import p213p8.AbstractRunnableC9767g;
import p213p8.InterfaceC9768h;

/* renamed from: kotlinx.coroutines.i */
/* loaded from: classes5.dex */
public abstract class AbstractC9205i extends AbstractRunnableC9767g {

    /* renamed from: c */
    public int f18067c;

    public AbstractC9205i(int i10) {
        this.f18067c = i10;
    }

    /* renamed from: a */
    public abstract void mo16358a(Object obj, Throwable th);

    /* renamed from: b */
    public abstract InterfaceC9324c mo16359b();

    /* renamed from: d */
    public Throwable mo16360d(Object obj) {
        C8884w c8884w = obj instanceof C8884w ? (C8884w) obj : null;
        if (c8884w != null) {
            return c8884w.f16545a;
        }
        return null;
    }

    /* renamed from: e */
    public Object mo16361e(Object obj) {
        return obj;
    }

    /* renamed from: f */
    public final void m16723f(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC8722b.m14228a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC9133u.m16130d(th);
        AbstractC8818a0.m14797a(mo16359b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: h */
    public abstract Object mo16362h();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objM15909b;
        Object objM15909b2;
        InterfaceC9768h interfaceC9768h = this.f19492b;
        try {
            InterfaceC9324c interfaceC9324cMo16359b = mo16359b();
            AbstractC9133u.m16131e(interfaceC9324cMo16359b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C9453j c9453j = (C9453j) interfaceC9324cMo16359b;
            InterfaceC9324c interfaceC9324c = c9453j.f18660e;
            Object obj = c9453j.f18662g;
            InterfaceC9100d context = interfaceC9324c.getContext();
            Object objM16749c = ThreadContextKt.m16749c(context, obj);
            C8889x1 c8889x1M16218g = objM16749c != ThreadContextKt.f18077a ? CoroutineContextKt.m16218g(interfaceC9324c, context, objM16749c) : null;
            try {
                InterfaceC9100d context2 = interfaceC9324c.getContext();
                Object objMo16362h = mo16362h();
                Throwable thMo16360d = mo16360d(objMo16362h);
                InterfaceC9212n interfaceC9212n = (thMo16360d == null && AbstractC8837g0.m14854b(this.f18067c)) ? (InterfaceC9212n) context2.get(InterfaceC9212n.f18095c0) : null;
                if (interfaceC9212n != null && !interfaceC9212n.isActive()) {
                    CancellationException cancellationExceptionMo16281e = interfaceC9212n.mo16281e();
                    mo16358a(objMo16362h, cancellationExceptionMo16281e);
                    Result.C9076a c9076a = Result.f17350b;
                    interfaceC9324c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(cancellationExceptionMo16281e)));
                } else if (thMo16360d != null) {
                    Result.C9076a c9076a2 = Result.f17350b;
                    interfaceC9324c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(thMo16360d)));
                } else {
                    Result.C9076a c9076a3 = Result.f17350b;
                    interfaceC9324c.resumeWith(Result.m15909b(mo16361e(objMo16362h)));
                }
                C8736p c8736p = C8736p.f16368a;
                if (c8889x1M16218g == null || c8889x1M16218g.m14932K0()) {
                    ThreadContextKt.m16747a(context, objM16749c);
                }
                try {
                    interfaceC9768h.mo18281a();
                    objM15909b2 = Result.m15909b(C8736p.f16368a);
                } catch (Throwable th) {
                    Result.C9076a c9076a4 = Result.f17350b;
                    objM15909b2 = Result.m15909b(AbstractC9079b.m15925a(th));
                }
                m16723f(null, Result.m15911d(objM15909b2));
            } catch (Throwable th2) {
                if (c8889x1M16218g == null || c8889x1M16218g.m14932K0()) {
                    ThreadContextKt.m16747a(context, objM16749c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.C9076a c9076a5 = Result.f17350b;
                interfaceC9768h.mo18281a();
                objM15909b = Result.m15909b(C8736p.f16368a);
            } catch (Throwable th4) {
                Result.C9076a c9076a6 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th4));
            }
            m16723f(th3, Result.m15911d(objM15909b));
        }
    }
}
