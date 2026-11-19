package p135i8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9205i;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p191n8.C9453j;

/* renamed from: i8.g0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8837g0 {
    /* renamed from: a */
    public static final void m14853a(AbstractC9205i abstractC9205i, int i10) {
        InterfaceC9324c interfaceC9324cMo16359b = abstractC9205i.mo16359b();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC9324cMo16359b instanceof C9453j) || m14854b(i10) != m14854b(abstractC9205i.f18067c)) {
            m14856d(abstractC9205i, interfaceC9324cMo16359b, z10);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((C9453j) interfaceC9324cMo16359b).f18659d;
        InterfaceC9100d context = interfaceC9324cMo16359b.getContext();
        if (coroutineDispatcher.isDispatchNeeded(context)) {
            coroutineDispatcher.dispatch(context, abstractC9205i);
        } else {
            m14857e(abstractC9205i);
        }
    }

    /* renamed from: b */
    public static final boolean m14854b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public static final boolean m14855c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final void m14856d(AbstractC9205i abstractC9205i, InterfaceC9324c interfaceC9324c, boolean z10) {
        Object objMo16361e;
        Object objMo16362h = abstractC9205i.mo16362h();
        Throwable thMo16360d = abstractC9205i.mo16360d(objMo16362h);
        if (thMo16360d != null) {
            Result.C9076a c9076a = Result.f17350b;
            objMo16361e = AbstractC9079b.m15925a(thMo16360d);
        } else {
            Result.C9076a c9076a2 = Result.f17350b;
            objMo16361e = abstractC9205i.mo16361e(objMo16362h);
        }
        Object objM15909b = Result.m15909b(objMo16361e);
        if (!z10) {
            interfaceC9324c.resumeWith(objM15909b);
            return;
        }
        AbstractC9133u.m16131e(interfaceC9324c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C9453j c9453j = (C9453j) interfaceC9324c;
        InterfaceC9324c interfaceC9324c2 = c9453j.f18660e;
        Object obj = c9453j.f18662g;
        InterfaceC9100d context = interfaceC9324c2.getContext();
        Object objM16749c = ThreadContextKt.m16749c(context, obj);
        C8889x1 c8889x1M16218g = objM16749c != ThreadContextKt.f18077a ? CoroutineContextKt.m16218g(interfaceC9324c2, context, objM16749c) : null;
        try {
            c9453j.f18660e.resumeWith(objM15909b);
            C8736p c8736p = C8736p.f16368a;
            if (c8889x1M16218g == null || c8889x1M16218g.m14932K0()) {
                ThreadContextKt.m16747a(context, objM16749c);
            }
        } catch (Throwable th) {
            if (c8889x1M16218g == null || c8889x1M16218g.m14932K0()) {
                ThreadContextKt.m16747a(context, objM16749c);
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static final void m14857e(AbstractC9205i abstractC9205i) {
        AbstractC8861o0 abstractC8861o0M14923b = C8883v1.f16542a.m14923b();
        if (abstractC8861o0M14923b.m14893w()) {
            abstractC8861o0M14923b.m14890q(abstractC9205i);
            return;
        }
        abstractC8861o0M14923b.m14892t(true);
        try {
            m14856d(abstractC9205i, abstractC9205i.mo16359b(), true);
            do {
            } while (abstractC8861o0M14923b.m14896z());
        } finally {
            try {
            } finally {
            }
        }
    }
}
