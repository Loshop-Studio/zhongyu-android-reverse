package p008a7;

import android.os.SystemClock;

/* renamed from: a7.f */
/* loaded from: classes5.dex */
public abstract class AbstractC0073f {

    /* renamed from: a */
    public static long f61a;

    /* renamed from: a */
    public static boolean m171a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f61a < 600) {
            return true;
        }
        f61a = jElapsedRealtime;
        return false;
    }
}
