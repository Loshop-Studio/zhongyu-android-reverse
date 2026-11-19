package p116h0;

import android.os.SystemClock;

/* renamed from: h0.f */
/* loaded from: classes3.dex */
public abstract class AbstractC8702f {

    /* renamed from: a */
    public static final double f16314a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m14164a(long j10) {
        return (m14165b() - j10) * f16314a;
    }

    /* renamed from: b */
    public static long m14165b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
