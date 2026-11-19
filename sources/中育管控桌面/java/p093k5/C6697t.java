package p093k5;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6366f0;

/* renamed from: k5.t */
/* loaded from: classes4.dex */
public final class C6697t {

    /* renamed from: a */
    public final Set f8962a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m7857a(C6366f0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f8962a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m7858b(C6366f0 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f8962a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m7859c(C6366f0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f8962a.contains(route);
    }
}
