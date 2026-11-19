package p281oe;

import java.util.LinkedHashSet;
import java.util.Set;
import je.C9721a0;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: oe.g */
/* loaded from: classes6.dex */
public final class C10489g {

    /* renamed from: a */
    public final Set f24930a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m21924a(C9721a0 route) {
        AbstractC9979u.m20294g(route, "route");
        this.f24930a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m21925b(C9721a0 failedRoute) {
        AbstractC9979u.m20294g(failedRoute, "failedRoute");
        this.f24930a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m21926c(C9721a0 route) {
        AbstractC9979u.m20294g(route, "route");
        return this.f24930a.contains(route);
    }
}
