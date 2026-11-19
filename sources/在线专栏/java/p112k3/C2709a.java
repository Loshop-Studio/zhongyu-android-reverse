package p112k3;

import kotlinx.coroutines.internal.C2791f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3032c;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3474p;

/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C2709a {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m9036b(InterfaceC3012d<?> interfaceC3012d, Throwable th) throws Throwable {
        C2919l.a aVar = C2919l.f11409a;
        interfaceC3012d.resumeWith(C2919l.m9989a(C2920m.m9993a(th)));
        throw th;
    }

    /* renamed from: c */
    public static final void m9037c(@NotNull InterfaceC3012d<? super C2925r> interfaceC3012d, @NotNull InterfaceC3012d<?> interfaceC3012d2) throws Throwable {
        try {
            InterfaceC3012d interfaceC3012dM10174b = C3032c.m10174b(interfaceC3012d);
            C2919l.a aVar = C2919l.f11409a;
            C2791f.m9290c(interfaceC3012dM10174b, C2919l.m9989a(C2925r.f11415a), null, 2, null);
        } catch (Throwable th) {
            m9036b(interfaceC3012d2, th);
        }
    }

    /* renamed from: d */
    public static final <R, T> void m9038d(@NotNull InterfaceC3474p<? super R, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, R r3, @NotNull InterfaceC3012d<? super T> interfaceC3012d, @Nullable InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) throws Throwable {
        try {
            InterfaceC3012d interfaceC3012dM10174b = C3032c.m10174b(C3032c.m10173a(interfaceC3474p, r3, interfaceC3012d));
            C2919l.a aVar = C2919l.f11409a;
            C2791f.m9289b(interfaceC3012dM10174b, C2919l.m9989a(C2925r.f11415a), interfaceC3470l);
        } catch (Throwable th) {
            m9036b(interfaceC3012d, th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m9039e(InterfaceC3474p interfaceC3474p, Object obj, InterfaceC3012d interfaceC3012d, InterfaceC3470l interfaceC3470l, int i4, Object obj2) throws Throwable {
        if ((i4 & 4) != 0) {
            interfaceC3470l = null;
        }
        m9038d(interfaceC3474p, obj, interfaceC3012d, interfaceC3470l);
    }
}
