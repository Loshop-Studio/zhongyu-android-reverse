package p059f2;

import android.os.Looper;

/* renamed from: f2.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3735b {

    /* renamed from: a */
    public static Thread f4359a;

    /* renamed from: a */
    public static void m4731a() {
        if (!m4732b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m4732b() {
        if (f4359a == null) {
            f4359a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f4359a;
    }
}
