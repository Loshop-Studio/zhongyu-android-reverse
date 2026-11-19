package p016b1;

import android.os.SystemClock;

/* renamed from: b1.f */
/* loaded from: classes3.dex */
public abstract class AbstractC4404f {

    /* renamed from: a */
    public static final double f1257a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m1421a(long j6) {
        return (m1422b() - j6) * f1257a;
    }

    /* renamed from: b */
    public static long m1422b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
