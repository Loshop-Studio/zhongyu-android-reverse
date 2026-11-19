package p091e1;

import android.os.SystemClock;

/* renamed from: e1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7833e {

    /* renamed from: a */
    public static final double f13152a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m12239a(long j9) {
        return (m12240b() - j9) * f13152a;
    }

    /* renamed from: b */
    public static long m12240b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
