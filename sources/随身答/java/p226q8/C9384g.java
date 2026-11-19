package p226q8;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p172l8.C8902a0;

/* renamed from: q8.g */
/* loaded from: classes5.dex */
public final class C9384g {

    /* renamed from: a */
    public final Set f16357a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m15430a(C8902a0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f16357a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m15431b(C8902a0 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f16357a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m15432c(C8902a0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f16357a.contains(route);
    }
}
