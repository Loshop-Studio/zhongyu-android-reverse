package p112k3;

import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.jvm.internal.C2759b0;
import kotlinx.coroutines.internal.C2804s;
import kotlinx.coroutines.internal.C2809x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2603u1;
import p087f3.C2613y;
import p128o2.C2919l;
import p128o2.C2920m;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: k3.b */
/* loaded from: classes.dex */
public final class C2710b {
    /* renamed from: a */
    public static final <R, T> void m9040a(@NotNull InterfaceC3474p<? super R, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, R r3, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        InterfaceC3012d interfaceC3012dM9215a = C2752h.m9215a(interfaceC3012d);
        try {
            InterfaceC3015g context = interfaceC3012d.getContext();
            Object objM9359c = C2809x.m9359c(context, null);
            try {
                if (interfaceC3474p == null) {
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                }
                Object objMo2812d = ((InterfaceC3474p) C2759b0.m9222b(interfaceC3474p, 2)).mo2812d(r3, interfaceC3012dM9215a);
                if (objMo2812d != C3033d.m10175c()) {
                    C2919l.a aVar = C2919l.f11409a;
                    interfaceC3012dM9215a.resumeWith(C2919l.m9989a(objMo2812d));
                }
            } finally {
                C2809x.m9357a(context, objM9359c);
            }
        } catch (Throwable th) {
            C2919l.a aVar2 = C2919l.f11409a;
            interfaceC3012dM9215a.resumeWith(C2919l.m9989a(C2920m.m9993a(th)));
        }
    }

    @Nullable
    /* renamed from: b */
    public static final <T, R> Object m9041b(@NotNull C2804s<? super T> c2804s, R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p) {
        Object c2613y;
        Object objM8704W;
        try {
        } catch (Throwable th) {
            c2613y = new C2613y(th, false, 2, null);
        }
        if (interfaceC3474p == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        c2613y = ((InterfaceC3474p) C2759b0.m9222b(interfaceC3474p, 2)).mo2812d(r3, c2804s);
        if (c2613y != C3033d.m10175c() && (objM8704W = c2804s.m8704W(c2613y)) != C2603u1.f10294b) {
            if (objM8704W instanceof C2613y) {
                throw ((C2613y) objM8704W).f10316a;
            }
            return C2603u1.m8740h(objM8704W);
        }
        return C3033d.m10175c();
    }
}
