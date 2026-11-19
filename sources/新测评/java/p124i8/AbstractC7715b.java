package p124i8;

import android.os.Looper;

/* renamed from: i8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7715b {

    /* renamed from: a */
    public static Thread f13088a;

    /* renamed from: a */
    public static void m12889a() {
        if (!m12890b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m12890b() {
        if (f13088a == null) {
            f13088a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f13088a;
    }
}
