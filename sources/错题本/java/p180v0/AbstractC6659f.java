package p180v0;

import android.os.SystemClock;

/* renamed from: v0.f */
/* loaded from: classes2.dex */
public abstract class AbstractC6659f {

    /* renamed from: a */
    public static final double f11233a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f11234b = 0;

    /* renamed from: a */
    public static double m6315a(long j7) {
        return (SystemClock.elapsedRealtimeNanos() - j7) * f11233a;
    }
}
