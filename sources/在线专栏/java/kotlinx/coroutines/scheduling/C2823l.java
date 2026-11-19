package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C2806u;
import kotlinx.coroutines.internal.C2808w;
import org.jetbrains.annotations.NotNull;
import p014b3.C1037f;

/* renamed from: kotlinx.coroutines.scheduling.l */
/* loaded from: classes.dex */
public final class C2823l {

    /* renamed from: a */
    public static final long f10843a = C2808w.m9356e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: b */
    public static final int f10844b = C2808w.m9355d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f10845c;

    /* renamed from: d */
    public static final int f10846d;

    /* renamed from: e */
    public static final long f10847e;

    /* renamed from: f */
    @NotNull
    public static AbstractC2819h f10848f;

    static {
        int iM9355d = C2808w.m9355d("kotlinx.coroutines.scheduler.core.pool.size", C1037f.m4821b(C2806u.m9343a(), 2), 1, 0, 8, null);
        f10845c = iM9355d;
        f10846d = C2808w.m9355d("kotlinx.coroutines.scheduler.max.pool.size", C1037f.m4825f(C2806u.m9343a() * 128, iM9355d, 2097150), 0, 2097150, 4, null);
        f10847e = TimeUnit.SECONDS.toNanos(C2808w.m9356e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f10848f = C2817f.f10837a;
    }
}
