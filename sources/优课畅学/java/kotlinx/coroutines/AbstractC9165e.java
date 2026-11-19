package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9100d;
import p135i8.AbstractC8823b1;
import p135i8.AbstractC8874s1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.C9447g;
import p191n8.C9473z;
import p201o7.AbstractC9541f;
import p202o8.AbstractC9545b;
import p300x7.InterfaceC10574p;

/* renamed from: kotlinx.coroutines.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9165e {
    /* renamed from: a */
    public static final InterfaceC8822b0 m16552a(InterfaceC9100d interfaceC9100d) {
        if (interfaceC9100d.get(InterfaceC9212n.f18095c0) == null) {
            interfaceC9100d = interfaceC9100d.plus(JobKt__JobKt.m16233b(null, 1, null));
        }
        return new C9447g(interfaceC9100d);
    }

    /* renamed from: b */
    public static final InterfaceC8822b0 m16553b() {
        return new C9447g(AbstractC8874s1.m14910b(null, 1, null).plus(C8843i0.m14868c()));
    }

    /* renamed from: c */
    public static final void m16554c(InterfaceC8822b0 interfaceC8822b0, CancellationException cancellationException) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC8822b0.getCoroutineContext().get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC8822b0).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m16555d(InterfaceC8822b0 interfaceC8822b0, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        m16554c(interfaceC8822b0, cancellationException);
    }

    /* renamed from: e */
    public static final Object m16556e(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        C9473z c9473z = new C9473z(interfaceC9324c.getContext(), interfaceC9324c);
        Object objM17820b = AbstractC9545b.m17820b(c9473z, c9473z, interfaceC10574p);
        if (objM17820b == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM17820b;
    }

    /* renamed from: f */
    public static final void m16557f(InterfaceC8822b0 interfaceC8822b0) {
        AbstractC8823b1.m14814j(interfaceC8822b0.getCoroutineContext());
    }

    /* renamed from: g */
    public static final boolean m16558g(InterfaceC8822b0 interfaceC8822b0) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC8822b0.getCoroutineContext().get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            return interfaceC9212n.isActive();
        }
        return true;
    }

    /* renamed from: h */
    public static final InterfaceC8822b0 m16559h(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d) {
        return new C9447g(interfaceC8822b0.getCoroutineContext().plus(interfaceC9100d));
    }
}
