package p087f3;

import kotlin.coroutines.jvm.internal.C2752h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p112k3.C2710b;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: f3.g2 */
/* loaded from: classes.dex */
public final class C2555g2 {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC2607w m8564a(@Nullable InterfaceC2578m1 interfaceC2578m1) {
        return new C2551f2(interfaceC2578m1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2607w m8565b(InterfaceC2578m1 interfaceC2578m1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC2578m1 = null;
        }
        return m8564a(interfaceC2578m1);
    }

    @Nullable
    /* renamed from: c */
    public static final <R> Object m8566c(@NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super R>, ? extends Object> interfaceC3474p, @NotNull InterfaceC3012d<? super R> interfaceC3012d) {
        C2547e2 c2547e2 = new C2547e2(interfaceC3012d.getContext(), interfaceC3012d);
        Object objM9041b = C2710b.m9041b(c2547e2, c2547e2, interfaceC3474p);
        if (objM9041b == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM9041b;
    }
}
