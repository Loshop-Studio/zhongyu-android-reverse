package p087f3;

import kotlin.coroutines.jvm.internal.C2752h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3013e;
import p142q2.InterfaceC3015g;
import p146r2.C3032c;
import p146r2.C3033d;

/* renamed from: f3.r0 */
/* loaded from: classes.dex */
public final class C2593r0 {
    @Nullable
    /* renamed from: a */
    public static final Object m8654a(long j4, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        if (j4 <= 0) {
            return C2925r.f11415a;
        }
        C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
        c2576m.m8623v();
        if (j4 < Long.MAX_VALUE) {
            m8655b(c2576m.getContext()).mo8518y(j4, c2576m);
        }
        Object objM8621s = c2576m.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s == C3033d.m10175c() ? objM8621s : C2925r.f11415a;
    }

    @NotNull
    /* renamed from: b */
    public static final InterfaceC2590q0 m8655b(@NotNull InterfaceC3015g interfaceC3015g) {
        InterfaceC3015g.b bVar = interfaceC3015g.get(InterfaceC3013e.f11675R);
        InterfaceC2590q0 interfaceC2590q0 = bVar instanceof InterfaceC2590q0 ? (InterfaceC2590q0) bVar : null;
        return interfaceC2590q0 == null ? C2581n0.m8640a() : interfaceC2590q0;
    }
}
