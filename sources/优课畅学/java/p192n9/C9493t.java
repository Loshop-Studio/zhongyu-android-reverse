package p192n9;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8907f0;

/* renamed from: n9.t */
/* loaded from: classes5.dex */
public final class C9493t {

    /* renamed from: a */
    public final Set f18832a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m17590a(C8907f0 route) {
        AbstractC9133u.m16133g(route, "route");
        this.f18832a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m17591b(C8907f0 failedRoute) {
        AbstractC9133u.m16133g(failedRoute, "failedRoute");
        this.f18832a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m17592c(C8907f0 route) {
        AbstractC9133u.m16133g(route, "route");
        return this.f18832a.contains(route);
    }
}
