package p109d1;

import android.os.SystemClock;

/* renamed from: d1.f */
/* loaded from: classes3.dex */
public abstract class AbstractC8905f {

    /* renamed from: a */
    public static final double f20872a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m17451a(long j10) {
        return (m17452b() - j10) * f20872a;
    }

    /* renamed from: b */
    public static long m17452b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
