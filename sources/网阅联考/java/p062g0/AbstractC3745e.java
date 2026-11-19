package p062g0;

import android.os.SystemClock;

/* renamed from: g0.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3745e {

    /* renamed from: a */
    public static final double f4387a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m4751a(long j4) {
        return (m4752b() - j4) * f4387a;
    }

    /* renamed from: b */
    public static long m4752b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
