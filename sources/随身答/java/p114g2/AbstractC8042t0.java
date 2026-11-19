package p114g2;

import android.content.Context;
import android.os.Looper;

/* renamed from: g2.t0 */
/* loaded from: classes4.dex */
public abstract class AbstractC8042t0 {

    /* renamed from: a */
    public static InterfaceC8040s0 f13633a = null;

    /* renamed from: b */
    public static boolean f13634b = false;

    /* renamed from: a */
    public static synchronized String m12721a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        m12722b(context);
        InterfaceC8040s0 interfaceC8040s0 = f13633a;
        if (interfaceC8040s0 != null) {
            try {
                return interfaceC8040s0.mo12569a(context);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m12722b(Context context) {
        if (f13633a != null || f13634b) {
            return;
        }
        synchronized (AbstractC8042t0.class) {
            try {
                if (f13633a == null && !f13634b) {
                    f13633a = AbstractC8005b.m12561a(context);
                    f13634b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
