package ac;

import android.os.Looper;

/* renamed from: ac.b */
/* loaded from: classes6.dex */
public abstract class AbstractC0103b {

    /* renamed from: a */
    public static Thread f111a;

    /* renamed from: a */
    public static void m275a() {
        if (!m276b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m276b() {
        if (f111a == null) {
            f111a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f111a;
    }
}
