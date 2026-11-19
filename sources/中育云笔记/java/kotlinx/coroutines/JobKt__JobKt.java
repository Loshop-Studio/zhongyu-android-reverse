package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.InterfaceC10045g;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import sd.AbstractC11099c1;
import sd.AbstractC11147o1;
import sd.AbstractC11151p1;
import sd.C11143n1;
import sd.C11169v0;
import sd.InterfaceC11163t0;
import sd.InterfaceC11168v;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class JobKt__JobKt {
    /* renamed from: a */
    public static final InterfaceC11168v m20384a(InterfaceC10045g interfaceC10045g) {
        return new C11143n1(interfaceC10045g);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11168v m20385b(InterfaceC10045g interfaceC10045g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10045g = null;
        }
        return AbstractC11147o1.m24767a(interfaceC10045g);
    }

    /* renamed from: c */
    public static final void m20386c(InterfaceC9945d interfaceC9945d, CancellationException cancellationException) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g != null) {
            interfaceC10045g.cancel(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m20387d(InterfaceC10045g interfaceC10045g, String str, Throwable th) {
        interfaceC10045g.cancel(AbstractC11099c1.m24692a(str, th));
    }

    /* renamed from: e */
    public static /* synthetic */ void m20388e(InterfaceC9945d interfaceC9945d, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC11147o1.m24769c(interfaceC9945d, cancellationException);
    }

    /* renamed from: f */
    public static /* synthetic */ void m20389f(InterfaceC10045g interfaceC10045g, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        AbstractC11147o1.m24770d(interfaceC10045g, str, th);
    }

    /* renamed from: g */
    public static final Object m20390g(InterfaceC10045g interfaceC10045g, InterfaceC11588c interfaceC11588c) {
        InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        Object objMo20458v = interfaceC10045g.mo20458v(interfaceC11588c);
        return objMo20458v == AbstractC11725a.m25952f() ? objMo20458v : C10786q.f26013a;
    }

    /* renamed from: h */
    public static final InterfaceC11163t0 m20391h(InterfaceC10045g interfaceC10045g, InterfaceC11163t0 interfaceC11163t0) {
        return m20396m(interfaceC10045g, false, new C11169v0(interfaceC11163t0), 1, null);
    }

    /* renamed from: i */
    public static final void m20392i(InterfaceC9945d interfaceC9945d) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g != null) {
            AbstractC11147o1.m24776j(interfaceC10045g);
        }
    }

    /* renamed from: j */
    public static final void m20393j(InterfaceC10045g interfaceC10045g) {
        if (!interfaceC10045g.isActive()) {
            throw interfaceC10045g.mo20438g();
        }
    }

    /* renamed from: k */
    public static final InterfaceC10045g m20394k(InterfaceC9945d interfaceC9945d) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g != null) {
            return interfaceC10045g;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC9945d).toString());
    }

    /* renamed from: l */
    public static final InterfaceC11163t0 m20395l(InterfaceC10045g interfaceC10045g, boolean z10, AbstractC11151p1 abstractC11151p1) {
        return interfaceC10045g instanceof JobSupport ? ((JobSupport) interfaceC10045g).m20434d0(z10, abstractC11151p1) : interfaceC10045g.mo20455t(abstractC11151p1.mo20468u(), z10, new JobKt__JobKt$invokeOnCompletion$1(abstractC11151p1));
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC11163t0 m20396m(InterfaceC10045g interfaceC10045g, boolean z10, AbstractC11151p1 abstractC11151p1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return AbstractC11147o1.m24778l(interfaceC10045g, z10, abstractC11151p1);
    }

    /* renamed from: n */
    public static final boolean m20397n(InterfaceC9945d interfaceC9945d) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g != null) {
            return interfaceC10045g.isActive();
        }
        return true;
    }
}
