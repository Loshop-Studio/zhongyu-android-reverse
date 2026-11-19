package sd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C10007e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11853j0;
import p410xd.C11874y;
import p426yd.AbstractC11944a;
import p426yd.AbstractC11945b;
import vc.InterfaceC11588c;

/* renamed from: sd.h */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11117h {
    /* renamed from: a */
    public static final InterfaceC11138m0 m24723a(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p) {
        InterfaceC9945d interfaceC9945dM24689k = AbstractC11098c0.m24689k(interfaceC11122i0, interfaceC9945d);
        C11142n0 c11158r1 = coroutineStart.m20374d() ? new C11158r1(interfaceC9945dM24689k, interfaceC9544p) : new C11142n0(interfaceC9945dM24689k, true);
        c11158r1.m20493I0(coroutineStart, c11158r1, interfaceC9544p);
        return c11158r1;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11138m0 m24724b(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f23476c;
        }
        return AbstractC11109f.m24703a(interfaceC11122i0, interfaceC9945d, coroutineStart, interfaceC9544p);
    }

    /* renamed from: c */
    public static final InterfaceC10045g m24725c(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p) {
        InterfaceC9945d interfaceC9945dM24689k = AbstractC11098c0.m24689k(interfaceC11122i0, interfaceC9945d);
        C11096b2 c11161s1 = coroutineStart.m20374d() ? new C11161s1(interfaceC9945dM24689k, interfaceC9544p) : new C11096b2(interfaceC9945dM24689k, true);
        c11161s1.m20493I0(coroutineStart, c11161s1, interfaceC9544p);
        return c11161s1;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10045g m24726d(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f23476c;
        }
        return AbstractC11109f.m24705c(interfaceC11122i0, interfaceC9945d, coroutineStart, interfaceC9544p);
    }

    /* renamed from: e */
    public static final Object m24727e(InterfaceC9945d interfaceC9945d, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        Object objM20754K0;
        InterfaceC9945d context = interfaceC11588c.getContext();
        InterfaceC9945d interfaceC9945dM24688j = AbstractC11098c0.m24688j(context, interfaceC9945d);
        AbstractC11147o1.m24775i(interfaceC9945dM24688j);
        if (interfaceC9945dM24688j == context) {
            C11874y c11874y = new C11874y(interfaceC9945dM24688j, interfaceC11588c);
            objM20754K0 = AbstractC11945b.m26507d(c11874y, c11874y, interfaceC9544p);
        } else {
            InterfaceC9944c.b bVar = InterfaceC9944c.f23354a0;
            if (AbstractC9979u.m20289b(interfaceC9945dM24688j.get(bVar), context.get(bVar))) {
                C11136l2 c11136l2 = new C11136l2(interfaceC9945dM24688j, interfaceC11588c);
                InterfaceC9945d context2 = c11136l2.getContext();
                Object objM26293i = AbstractC11853j0.m26293i(context2, null);
                try {
                    Object objM26507d = AbstractC11945b.m26507d(c11136l2, c11136l2, interfaceC9544p);
                    AbstractC11853j0.m26290f(context2, objM26293i);
                    objM20754K0 = objM26507d;
                } catch (Throwable th) {
                    AbstractC11853j0.m26290f(context2, objM26293i);
                    throw th;
                }
            } else {
                C10007e c10007e = new C10007e(interfaceC9945dM24688j, interfaceC11588c);
                AbstractC11944a.m26502b(interfaceC9544p, c10007e, c10007e);
                objM20754K0 = c10007e.m20754K0();
            }
        }
        if (objM20754K0 == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20754K0;
    }
}
