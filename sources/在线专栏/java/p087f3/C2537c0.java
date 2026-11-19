package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p171x2.InterfaceC3470l;

/* renamed from: f3.c0 */
/* loaded from: classes.dex */
public final class C2537c0 {
    @NotNull
    /* renamed from: a */
    public static final <T> Object m8531a(@Nullable Object obj, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        if (obj instanceof C2613y) {
            C2919l.a aVar = C2919l.f11409a;
            return C2919l.m9989a(C2920m.m9993a(((C2613y) obj).f10316a));
        }
        C2919l.a aVar2 = C2919l.f11409a;
        return C2919l.m9989a(obj);
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m8532b(@NotNull Object obj, @NotNull InterfaceC2572l<?> interfaceC2572l) {
        Throwable thM9990b = C2919l.m9990b(obj);
        return thM9990b == null ? obj : new C2613y(thM9990b, false, 2, null);
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m8533c(@NotNull Object obj, @Nullable InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        Throwable thM9990b = C2919l.m9990b(obj);
        return thM9990b == null ? interfaceC3470l != null ? new C2616z(obj, interfaceC3470l) : obj : new C2613y(thM9990b, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m8534d(Object obj, InterfaceC3470l interfaceC3470l, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            interfaceC3470l = null;
        }
        return m8533c(obj, interfaceC3470l);
    }
}
