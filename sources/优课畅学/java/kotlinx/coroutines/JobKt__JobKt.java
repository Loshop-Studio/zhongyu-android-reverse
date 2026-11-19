package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p135i8.AbstractC8870r0;
import p135i8.C8819a1;
import p135i8.C8855m0;
import p135i8.InterfaceC8849k0;
import p135i8.InterfaceC8878u;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class JobKt__JobKt {
    /* renamed from: a */
    public static final InterfaceC8878u m16232a(InterfaceC9212n interfaceC9212n) {
        return new C8819a1(interfaceC9212n);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8878u m16233b(InterfaceC9212n interfaceC9212n, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9212n = null;
        }
        return AbstractC8823b1.m14805a(interfaceC9212n);
    }

    /* renamed from: c */
    public static final void m16234c(InterfaceC9100d interfaceC9100d, CancellationException cancellationException) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m16235d(InterfaceC9212n interfaceC9212n, String str, Throwable th) {
        interfaceC9212n.cancel(AbstractC8870r0.m14906a(str, th));
    }

    /* renamed from: e */
    public static /* synthetic */ void m16236e(InterfaceC9100d interfaceC9100d, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC8823b1.m14807c(interfaceC9100d, cancellationException);
    }

    /* renamed from: f */
    public static /* synthetic */ void m16237f(InterfaceC9212n interfaceC9212n, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        AbstractC8823b1.m14808d(interfaceC9212n, str, th);
    }

    /* renamed from: g */
    public static final Object m16238g(InterfaceC9212n interfaceC9212n, InterfaceC9324c interfaceC9324c) {
        InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        Object objMo16291n = interfaceC9212n.mo16291n(interfaceC9324c);
        return objMo16291n == AbstractC9434a.m17291f() ? objMo16291n : C8736p.f16368a;
    }

    /* renamed from: h */
    public static final InterfaceC8849k0 m16239h(InterfaceC9212n interfaceC9212n, InterfaceC8849k0 interfaceC8849k0) {
        return m16244m(interfaceC9212n, false, false, new C8855m0(interfaceC8849k0), 3, null);
    }

    /* renamed from: i */
    public static final void m16240i(InterfaceC9100d interfaceC9100d) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            AbstractC8823b1.m14815k(interfaceC9212n);
        }
    }

    /* renamed from: j */
    public static final void m16241j(InterfaceC9212n interfaceC9212n) {
        if (!interfaceC9212n.isActive()) {
            throw interfaceC9212n.mo16281e();
        }
    }

    /* renamed from: k */
    public static final InterfaceC9212n m16242k(InterfaceC9100d interfaceC9100d) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            return interfaceC9212n;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC9100d).toString());
    }

    /* renamed from: l */
    public static final InterfaceC8849k0 m16243l(InterfaceC9212n interfaceC9212n, boolean z10, boolean z11, InterfaceC9211m interfaceC9211m) {
        return interfaceC9212n instanceof JobSupport ? ((JobSupport) interfaceC9212n).m16280d0(z10, z11, interfaceC9211m) : interfaceC9212n.mo16294p(z10, z11, new JobKt__JobKt$invokeOnCompletion$1(interfaceC9211m));
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC8849k0 m16244m(InterfaceC9212n interfaceC9212n, boolean z10, boolean z11, InterfaceC9211m interfaceC9211m, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return AbstractC8823b1.m14817m(interfaceC9212n, z10, z11, interfaceC9211m);
    }

    /* renamed from: n */
    public static final boolean m16245n(InterfaceC9100d interfaceC9100d) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n != null) {
            return interfaceC9212n.isActive();
        }
        return true;
    }
}
