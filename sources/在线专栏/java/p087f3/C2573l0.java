package p087f3;

import kotlinx.coroutines.internal.C2790e;
import org.jetbrains.annotations.NotNull;
import p128o2.C2919l;
import p128o2.C2920m;
import p142q2.InterfaceC3012d;

/* renamed from: f3.l0 */
/* loaded from: classes.dex */
public final class C2573l0 {
    @NotNull
    /* renamed from: a */
    public static final String m8591a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* renamed from: b */
    public static final String m8592b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* renamed from: c */
    public static final String m8593c(@NotNull InterfaceC3012d<?> interfaceC3012d) {
        Object objM9989a;
        if (interfaceC3012d instanceof C2790e) {
            return interfaceC3012d.toString();
        }
        try {
            C2919l.a aVar = C2919l.f11409a;
            objM9989a = C2919l.m9989a(interfaceC3012d + '@' + m8592b(interfaceC3012d));
        } catch (Throwable th) {
            C2919l.a aVar2 = C2919l.f11409a;
            objM9989a = C2919l.m9989a(C2920m.m9993a(th));
        }
        if (C2919l.m9990b(objM9989a) != null) {
            objM9989a = ((Object) interfaceC3012d.getClass().getName()) + '@' + m8592b(interfaceC3012d);
        }
        return (String) objM9989a;
    }
}
