package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import p054e7.AbstractC5469a;
import p054e7.C5473e;
import p068g7.AbstractRunnableC5613i;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.e0 */
/* loaded from: classes4.dex */
public abstract class AbstractC5893e0 extends AbstractRunnableC5613i {

    /* renamed from: c */
    public int f9341c;

    public AbstractC5893e0(int i) {
        super(0L, false);
        this.f9341c = i;
    }

    /* renamed from: e */
    public abstract InterfaceC5631c mo4843e();

    /* renamed from: f */
    public Throwable mo5516f(Object obj) {
        C5989p c5989p = obj instanceof C5989p ? (C5989p) obj : null;
        if (c5989p != null) {
            return c5989p.f9486a;
        }
        return null;
    }

    /* renamed from: g */
    public Object mo5517g(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void m5518h(Throwable th) {
        AbstractC6014x.m5645p(mo4843e().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: j */
    public abstract Object mo4844j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC5631c interfaceC5631cMo4843e = mo4843e();
            AbstractC5830k.m5328e(interfaceC5631cMo4843e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C5473e c5473e = (C5473e) interfaceC5631cMo4843e;
            InterfaceC5631c interfaceC5631c = c5473e.f8451e;
            Object obj = c5473e.f8453g;
            InterfaceC5636h context = interfaceC5631c.getContext();
            Object objM4838n = AbstractC5469a.m4838n(context, obj);
            InterfaceC6013w0 interfaceC6013w0 = null;
            C6000s1 c6000s1M5625E = objM4838n != AbstractC5469a.f8441d ? AbstractC6014x.m5625E(interfaceC5631c, context, objM4838n) : null;
            try {
                InterfaceC5636h context2 = interfaceC5631c.getContext();
                Object objMo4844j = mo4844j();
                Throwable thMo5516f = mo5516f(objMo4844j);
                if (thMo5516f == null) {
                    int i = this.f9341c;
                    boolean z8 = true;
                    if (i != 1 && i != 2) {
                        z8 = false;
                    }
                    if (z8) {
                        interfaceC6013w0 = (InterfaceC6013w0) context2.get(C6010v0.f9513a);
                    }
                }
                if (interfaceC6013w0 != null && !interfaceC6013w0.isActive()) {
                    CancellationException cancellationExceptionMo5457f = interfaceC6013w0.mo5457f();
                    mo5515c(cancellationExceptionMo5457f);
                    interfaceC5631c.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(cancellationExceptionMo5457f)));
                } else if (thMo5516f != null) {
                    interfaceC5631c.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(thMo5516f)));
                } else {
                    interfaceC5631c.resumeWith(Result.m13956constructorimpl(mo5517g(objMo4844j)));
                }
                if (c6000s1M5625E == null || c6000s1M5625E.m5611d0()) {
                    AbstractC5469a.m4831g(context, objM4838n);
                }
            } catch (Throwable th) {
                if (c6000s1M5625E == null || c6000s1M5625E.m5611d0()) {
                    AbstractC5469a.m4831g(context, objM4838n);
                }
                throw th;
            }
        } catch (DispatchException e) {
            AbstractC6014x.m5645p(mo4843e().getContext(), e.getCause());
        } catch (Throwable th2) {
            m5518h(th2);
        }
    }

    /* renamed from: c */
    public void mo5515c(CancellationException cancellationException) {
    }
}
