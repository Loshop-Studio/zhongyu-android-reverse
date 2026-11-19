package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2617z0;
import p087f3.C2537c0;
import p087f3.C2541d0;
import p087f3.C2563i2;
import p087f3.C2571k2;
import p087f3.InterfaceC2578m1;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3470l;

/* renamed from: kotlinx.coroutines.internal.f */
/* loaded from: classes.dex */
public final class C2791f {

    /* renamed from: a */
    @NotNull
    private static final C2805t f10758a = new C2805t("UNDEFINED");

    /* renamed from: b */
    @NotNull
    public static final C2805t f10759b = new C2805t("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final <T> void m9289b(@NotNull InterfaceC3012d<? super T> interfaceC3012d, @NotNull Object obj, @Nullable InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        boolean z3;
        if (!(interfaceC3012d instanceof C2790e)) {
            interfaceC3012d.resumeWith(obj);
            return;
        }
        C2790e c2790e = (C2790e) interfaceC3012d;
        Object objM8533c = C2537c0.m8533c(obj, interfaceC3470l);
        if (c2790e.f10754d.mo2906K(c2790e.getContext())) {
            c2790e.f10756f = objM8533c;
            c2790e.f10281c = 1;
            c2790e.f10754d.mo2905J(c2790e.getContext(), c2790e);
            return;
        }
        AbstractC2617z0 abstractC2617z0M8579b = C2563i2.f10245a.m8579b();
        if (abstractC2617z0M8579b.m8767S()) {
            c2790e.f10756f = objM8533c;
            c2790e.f10281c = 1;
            abstractC2617z0M8579b.m8765O(c2790e);
            return;
        }
        abstractC2617z0M8579b.m8766Q(true);
        try {
            InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) c2790e.getContext().get(InterfaceC2578m1.f10268P);
            if (interfaceC2578m1 == null || interfaceC2578m1.isActive()) {
                z3 = false;
            } else {
                CancellationException cancellationExceptionMo8632u = interfaceC2578m1.mo8632u();
                c2790e.mo8612a(objM8533c, cancellationExceptionMo8632u);
                C2919l.a aVar = C2919l.f11409a;
                c2790e.resumeWith(C2919l.m9989a(C2920m.m9993a(cancellationExceptionMo8632u)));
                z3 = true;
            }
            if (!z3) {
                InterfaceC3012d<T> interfaceC3012d2 = c2790e.f10755e;
                Object obj2 = c2790e.f10757g;
                InterfaceC3015g context = interfaceC3012d2.getContext();
                Object objM9359c = C2809x.m9359c(context, obj2);
                C2571k2<?> c2571k2M8540e = objM9359c != C2809x.f10789a ? C2541d0.m8540e(interfaceC3012d2, context, objM9359c) : null;
                try {
                    c2790e.f10755e.resumeWith(obj);
                    C2925r c2925r = C2925r.f11415a;
                    if (c2571k2M8540e == null || c2571k2M8540e.m8586y0()) {
                        C2809x.m9357a(context, objM9359c);
                    }
                } catch (Throwable th) {
                    if (c2571k2M8540e == null || c2571k2M8540e.m8586y0()) {
                        C2809x.m9357a(context, objM9359c);
                    }
                    throw th;
                }
            }
            while (abstractC2617z0M8579b.m8769V()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m9290c(InterfaceC3012d interfaceC3012d, Object obj, InterfaceC3470l interfaceC3470l, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            interfaceC3470l = null;
        }
        m9289b(interfaceC3012d, obj, interfaceC3470l);
    }
}
