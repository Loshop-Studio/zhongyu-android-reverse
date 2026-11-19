package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.C11842e;
import p410xd.C11874y;
import p426yd.AbstractC11945b;
import sd.AbstractC11108e2;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.d */
/* loaded from: classes6.dex */
public abstract class AbstractC10006d {
    /* renamed from: a */
    public static final InterfaceC11122i0 m20744a(InterfaceC9945d interfaceC9945d) {
        if (interfaceC9945d.get(InterfaceC10045g.f23976b0) == null) {
            interfaceC9945d = interfaceC9945d.plus(JobKt__JobKt.m20385b(null, 1, null));
        }
        return new C11842e(interfaceC9945d);
    }

    /* renamed from: b */
    public static final InterfaceC11122i0 m20745b() {
        return new C11842e(AbstractC11108e2.m24701b(null, 1, null).plus(C11157r0.m24800c()));
    }

    /* renamed from: c */
    public static final void m20746c(InterfaceC11122i0 interfaceC11122i0, CancellationException cancellationException) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC11122i0.getCoroutineContext().get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g != null) {
            interfaceC10045g.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC11122i0).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m20747d(InterfaceC11122i0 interfaceC11122i0, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        m20746c(interfaceC11122i0, cancellationException);
    }

    /* renamed from: e */
    public static final Object m20748e(InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        C11874y c11874y = new C11874y(interfaceC11588c.getContext(), interfaceC11588c);
        Object objM26507d = AbstractC11945b.m26507d(c11874y, c11874y, interfaceC9544p);
        if (objM26507d == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM26507d;
    }

    /* renamed from: f */
    public static final boolean m20749f(InterfaceC11122i0 interfaceC11122i0) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC11122i0.getCoroutineContext().get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g != null) {
            return interfaceC10045g.isActive();
        }
        return true;
    }

    /* renamed from: g */
    public static final InterfaceC11122i0 m20750g(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d) {
        return new C11842e(interfaceC11122i0.getCoroutineContext().plus(interfaceC9945d));
    }
}
