package p213p8;

import java.util.concurrent.TimeUnit;
import p077d8.AbstractC8323h;
import p191n8.AbstractC9444e0;
import p191n8.AbstractC9448g0;

/* renamed from: p8.k */
/* loaded from: classes5.dex */
public abstract class AbstractC9771k {

    /* renamed from: a */
    public static final String f19495a = AbstractC9444e0.m17325e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f19496b = AbstractC9448g0.m17338f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f19497c = AbstractC9448g0.m17337e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC8323h.m13510e(AbstractC9444e0.m17321a(), 2), 1, 0, 8, null);

    /* renamed from: d */
    public static final int f19498d = AbstractC9448g0.m17337e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e */
    public static final long f19499e = TimeUnit.SECONDS.toNanos(AbstractC9448g0.m17338f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f */
    public static AbstractC9766f f19500f = C9764d.f19485a;

    /* renamed from: g */
    public static final InterfaceC9768h f19501g = new C9769i(0);

    /* renamed from: h */
    public static final InterfaceC9768h f19502h = new C9769i(1);
}
