package p164u4;

import android.os.Looper;

/* renamed from: u4.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7774b {

    /* renamed from: a */
    public static Thread f10298a;

    /* renamed from: a */
    public static void m9305a() {
        if (!m9306b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m9306b() {
        if (f10298a == null) {
            f10298a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f10298a;
    }
}
