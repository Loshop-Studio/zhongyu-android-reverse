package sd;

import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10008f;
import p309qc.C10786q;
import p410xd.AbstractC11850i;
import p410xd.AbstractC11853j0;
import p410xd.C11848h;
import vc.InterfaceC11588c;

/* renamed from: sd.p0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11150p0 {
    /* renamed from: a */
    public static final void m24782a(AbstractC10008f abstractC10008f, int i10) {
        InterfaceC11588c interfaceC11588cMo20519b = abstractC10008f.mo20519b();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC11588cMo20519b instanceof C11848h) || m24783b(i10) != m24783b(abstractC10008f.f23590e)) {
            m24785d(abstractC10008f, interfaceC11588cMo20519b, z10);
            return;
        }
        C11848h c11848h = (C11848h) interfaceC11588cMo20519b;
        AbstractC11106e0 abstractC11106e0 = c11848h.f28087f;
        InterfaceC9945d context = c11848h.getContext();
        if (AbstractC11850i.m26280d(abstractC11106e0, context)) {
            AbstractC11850i.m26279c(abstractC11106e0, context, abstractC10008f);
        } else {
            m24786e(abstractC10008f);
        }
    }

    /* renamed from: b */
    public static final boolean m24783b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public static final boolean m24784c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final void m24785d(AbstractC10008f abstractC10008f, InterfaceC11588c interfaceC11588c, boolean z10) {
        Object objMo20522e;
        Object objMo20524h = abstractC10008f.mo20524h();
        Throwable thMo20521d = abstractC10008f.mo20521d(objMo20524h);
        if (thMo20521d != null) {
            Result.C9921a c9921a = Result.f23263d;
            objMo20522e = AbstractC9924b.m20070a(thMo20521d);
        } else {
            Result.C9921a c9921a2 = Result.f23263d;
            objMo20522e = abstractC10008f.mo20522e(objMo20524h);
        }
        Object objM20054c = Result.m20054c(objMo20522e);
        if (!z10) {
            interfaceC11588c.resumeWith(objM20054c);
            return;
        }
        AbstractC9979u.m20292e(interfaceC11588c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C11848h c11848h = (C11848h) interfaceC11588c;
        InterfaceC11588c interfaceC11588c2 = c11848h.f28088g;
        Object obj = c11848h.f28090i;
        InterfaceC9945d context = interfaceC11588c2.getContext();
        Object objM26293i = AbstractC11853j0.m26293i(context, obj);
        C11136l2 c11136l2M24691m = objM26293i != AbstractC11853j0.f28093a ? AbstractC11098c0.m24691m(interfaceC11588c2, context, objM26293i) : null;
        try {
            c11848h.f28088g.resumeWith(objM20054c);
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

    /* renamed from: e */
    public static final void m24786e(AbstractC10008f abstractC10008f) {
        AbstractC11175x0 abstractC11175x0M24730b = C11120h2.f26785a.m24730b();
        if (abstractC11175x0M24730b.m24826w()) {
            abstractC11175x0M24730b.m24823l(abstractC10008f);
            return;
        }
        abstractC11175x0M24730b.m24825s(true);
        try {
            m24785d(abstractC10008f, abstractC10008f.mo20519b(), true);
            do {
            } while (abstractC11175x0M24730b.m24819C());
        } finally {
            try {
            } finally {
            }
        }
    }
}
