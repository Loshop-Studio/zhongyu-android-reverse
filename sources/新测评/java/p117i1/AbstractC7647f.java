package p117i1;

import android.os.SystemClock;

/* renamed from: i1.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7647f {

    /* renamed from: a */
    public static final double f12890a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m12666a(long j10) {
        return (m12667b() - j10) * f12890a;
    }

    /* renamed from: b */
    public static long m12667b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
