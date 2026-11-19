package p255t7;

import android.os.Looper;

/* renamed from: t7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9635b {

    /* renamed from: a */
    public static Thread f16918a;

    /* renamed from: a */
    public static void m15908a() {
        if (!m15909b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m15909b() {
        if (f16918a == null) {
            f16918a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f16918a;
    }
}
