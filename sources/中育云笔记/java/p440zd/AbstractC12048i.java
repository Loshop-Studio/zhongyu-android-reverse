package p440zd;

import java.util.concurrent.TimeUnit;
import p265nd.AbstractC10410o;
import p410xd.AbstractC11841d0;
import p410xd.AbstractC11845f0;

/* renamed from: zd.i */
/* loaded from: classes6.dex */
public abstract class AbstractC12048i {

    /* renamed from: a */
    public static final String f28425a = AbstractC11841d0.m26253e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f28426b = AbstractC11845f0.m26266f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f28427c = AbstractC11845f0.m26265e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC10410o.m21752e(AbstractC11841d0.m26249a(), 2), 1, 0, 8, null);

    /* renamed from: d */
    public static final int f28428d = AbstractC11845f0.m26265e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e */
    public static final long f28429e = TimeUnit.SECONDS.toNanos(AbstractC11845f0.m26266f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f */
    public static AbstractC12045f f28430f = C12043d.f28416a;

    /* renamed from: b */
    public static final AbstractRunnableC12046g m26673b(Runnable runnable, long j10, boolean z10) {
        return new C12047h(runnable, j10, z10);
    }

    /* renamed from: c */
    public static final String m26674c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
