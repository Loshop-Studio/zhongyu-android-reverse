package p087f3;

import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.C2804s;
import kotlinx.coroutines.internal.C2809x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p112k3.C2709a;
import p112k3.C2710b;
import p128o2.C2925r;
import p142q2.C3016h;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3013e;
import p142q2.InterfaceC3015g;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f3.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C2560i {
    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC2584o0<T> m8571a(@NotNull InterfaceC2557h0 interfaceC2557h0, @NotNull InterfaceC3015g interfaceC3015g, @NotNull EnumC2565j0 enumC2565j0, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p) {
        InterfaceC3015g interfaceC3015gM8538c = C2541d0.m8538c(interfaceC2557h0, interfaceC3015g);
        C2587p0 c2606v1 = enumC2565j0.m8584c() ? new C2606v1(interfaceC3015gM8538c, interfaceC3474p) : new C2587p0(interfaceC3015gM8538c, true);
        ((AbstractC2528a) c2606v1).m8501w0(enumC2565j0, c2606v1, interfaceC3474p);
        return (InterfaceC2584o0<T>) c2606v1;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2584o0 m8572b(InterfaceC2557h0 interfaceC2557h0, InterfaceC3015g interfaceC3015g, EnumC2565j0 enumC2565j0, InterfaceC3474p interfaceC3474p, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC3015g = C3016h.f11678a;
        }
        if ((i4 & 2) != 0) {
            enumC2565j0 = EnumC2565j0.DEFAULT;
        }
        return C2552g.m8554a(interfaceC2557h0, interfaceC3015g, enumC2565j0, interfaceC3474p);
    }

    @NotNull
    /* renamed from: c */
    public static final InterfaceC2578m1 m8573c(@NotNull InterfaceC2557h0 interfaceC2557h0, @NotNull InterfaceC3015g interfaceC3015g, @NotNull EnumC2565j0 enumC2565j0, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super C2925r>, ? extends Object> interfaceC3474p) {
        InterfaceC3015g interfaceC3015gM8538c = C2541d0.m8538c(interfaceC2557h0, interfaceC3015g);
        AbstractC2528a c2609w1 = enumC2565j0.m8584c() ? new C2609w1(interfaceC3015gM8538c, interfaceC3474p) : new C2543d2(interfaceC3015gM8538c, true);
        c2609w1.m8501w0(enumC2565j0, c2609w1, interfaceC3474p);
        return c2609w1;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC2578m1 m8574d(InterfaceC2557h0 interfaceC2557h0, InterfaceC3015g interfaceC3015g, EnumC2565j0 enumC2565j0, InterfaceC3474p interfaceC3474p, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC3015g = C3016h.f11678a;
        }
        if ((i4 & 2) != 0) {
            enumC2565j0 = EnumC2565j0.DEFAULT;
        }
        return C2552g.m8556c(interfaceC2557h0, interfaceC3015g, enumC2565j0, interfaceC3474p);
    }

    @Nullable
    /* renamed from: e */
    public static final <T> Object m8575e(@NotNull InterfaceC3015g interfaceC3015g, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, @NotNull InterfaceC3012d<? super T> interfaceC3012d) throws Throwable {
        Object objM8665y0;
        InterfaceC3015g context = interfaceC3012d.getContext();
        InterfaceC3015g interfaceC3015gPlus = context.plus(interfaceC3015g);
        C2591q1.m8653f(interfaceC3015gPlus);
        if (interfaceC3015gPlus == context) {
            C2804s c2804s = new C2804s(interfaceC3015gPlus, interfaceC3012d);
            objM8665y0 = C2710b.m9041b(c2804s, c2804s, interfaceC3474p);
        } else {
            InterfaceC3013e.b bVar = InterfaceC3013e.f11675R;
            if (C2769l.m9237a(interfaceC3015gPlus.get(bVar), context.get(bVar))) {
                C2571k2 c2571k2 = new C2571k2(interfaceC3015gPlus, interfaceC3012d);
                Object objM9359c = C2809x.m9359c(interfaceC3015gPlus, null);
                try {
                    Object objM9041b = C2710b.m9041b(c2571k2, c2571k2, interfaceC3474p);
                    C2809x.m9357a(interfaceC3015gPlus, objM9359c);
                    objM8665y0 = objM9041b;
                } catch (Throwable th) {
                    C2809x.m9357a(interfaceC3015gPlus, objM9359c);
                    throw th;
                }
            } else {
                C2596s0 c2596s0 = new C2596s0(interfaceC3015gPlus, interfaceC3012d);
                C2709a.m9039e(interfaceC3474p, c2596s0, c2596s0, null, 4, null);
                objM8665y0 = c2596s0.m8665y0();
            }
        }
        if (objM8665y0 == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8665y0;
    }
}
