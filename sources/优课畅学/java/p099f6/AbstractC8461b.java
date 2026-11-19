package p099f6;

import android.os.Looper;

/* renamed from: f6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8461b {

    /* renamed from: a */
    public static Thread f16041a;

    /* renamed from: a */
    public static void m13789a() {
        if (!m13790b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m13790b() {
        if (f16041a == null) {
            f16041a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f16041a;
    }
}
