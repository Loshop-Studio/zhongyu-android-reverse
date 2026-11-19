package p137w2;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4500c0;

/* renamed from: w2.h */
/* loaded from: classes2.dex */
public final class C4648h {

    /* renamed from: a */
    public final Set f5931a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m6540a(C4500c0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f5931a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m6541b(C4500c0 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f5931a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m6542c(C4500c0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f5931a.contains(route);
    }
}
