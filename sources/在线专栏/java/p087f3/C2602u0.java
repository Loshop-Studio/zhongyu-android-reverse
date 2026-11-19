package p087f3;

import kotlinx.coroutines.internal.C2790e;
import kotlinx.coroutines.internal.C2809x;
import org.jetbrains.annotations.NotNull;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;

/* renamed from: f3.u0 */
/* loaded from: classes.dex */
public final class C2602u0 {
    /* renamed from: a */
    public static final <T> void m8728a(@NotNull AbstractC2599t0<? super T> abstractC2599t0, int i4) {
        InterfaceC3012d<? super T> interfaceC3012dMo8613b = abstractC2599t0.mo8613b();
        boolean z3 = i4 == 4;
        if (z3 || !(interfaceC3012dMo8613b instanceof C2790e) || m8729b(i4) != m8729b(abstractC2599t0.f10281c)) {
            m8731d(abstractC2599t0, interfaceC3012dMo8613b, z3);
            return;
        }
        AbstractC2545e0 abstractC2545e0 = ((C2790e) interfaceC3012dMo8613b).f10754d;
        InterfaceC3015g context = interfaceC3012dMo8613b.getContext();
        if (abstractC2545e0.mo2906K(context)) {
            abstractC2545e0.mo2905J(context, abstractC2599t0);
        } else {
            m8732e(abstractC2599t0);
        }
    }

    /* renamed from: b */
    public static final boolean m8729b(int i4) {
        return i4 == 1 || i4 == 2;
    }

    /* renamed from: c */
    public static final boolean m8730c(int i4) {
        return i4 == 2;
    }

    /* renamed from: d */
    public static final <T> void m8731d(@NotNull AbstractC2599t0<? super T> abstractC2599t0, @NotNull InterfaceC3012d<? super T> interfaceC3012d, boolean z3) {
        Object objMo8615d;
        Object objMo8616i = abstractC2599t0.mo8616i();
        Throwable thMo8614c = abstractC2599t0.mo8614c(objMo8616i);
        if (thMo8614c != null) {
            C2919l.a aVar = C2919l.f11409a;
            objMo8615d = C2920m.m9993a(thMo8614c);
        } else {
            C2919l.a aVar2 = C2919l.f11409a;
            objMo8615d = abstractC2599t0.mo8615d(objMo8616i);
        }
        Object objM9989a = C2919l.m9989a(objMo8615d);
        if (!z3) {
            interfaceC3012d.resumeWith(objM9989a);
            return;
        }
        C2790e c2790e = (C2790e) interfaceC3012d;
        InterfaceC3012d<T> interfaceC3012d2 = c2790e.f10755e;
        Object obj = c2790e.f10757g;
        InterfaceC3015g context = interfaceC3012d2.getContext();
        Object objM9359c = C2809x.m9359c(context, obj);
        C2571k2<?> c2571k2M8540e = objM9359c != C2809x.f10789a ? C2541d0.m8540e(interfaceC3012d2, context, objM9359c) : null;
        try {
            c2790e.f10755e.resumeWith(objM9989a);
            C2925r c2925r = C2925r.f11415a;
        } finally {
            if (c2571k2M8540e == null || c2571k2M8540e.m8586y0()) {
                C2809x.m9357a(context, objM9359c);
            }
        }
    }

    /* renamed from: e */
    private static final void m8732e(AbstractC2599t0<?> abstractC2599t0) {
        AbstractC2617z0 abstractC2617z0M8579b = C2563i2.f10245a.m8579b();
        if (abstractC2617z0M8579b.m8767S()) {
            abstractC2617z0M8579b.m8765O(abstractC2599t0);
            return;
        }
        abstractC2617z0M8579b.m8766Q(true);
        try {
            m8731d(abstractC2599t0, abstractC2599t0.mo8613b(), true);
            do {
            } while (abstractC2617z0M8579b.m8769V());
        } finally {
            try {
            } finally {
            }
        }
    }
}
