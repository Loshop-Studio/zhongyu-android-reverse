package p092f9;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p011a9.C0038a0;

/* renamed from: f9.g */
/* loaded from: classes5.dex */
public final class C7503g {

    /* renamed from: a */
    public final Set f12349a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m12198a(C0038a0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f12349a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m12199b(C0038a0 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f12349a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m12200c(C0038a0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f12349a.contains(route);
    }
}
