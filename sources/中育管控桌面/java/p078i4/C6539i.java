package p078i4;

import android.os.SystemClock;

/* renamed from: i4.i */
/* loaded from: classes4.dex */
public final class C6539i {

    /* renamed from: b */
    public static long f8375b;

    /* renamed from: a */
    public static final C6539i f8374a = new C6539i();

    /* renamed from: c */
    public static final int f8376c = 8;

    /* renamed from: a */
    public final boolean m7328a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f8375b < 500) {
            return true;
        }
        f8375b = jElapsedRealtime;
        return false;
    }
}
