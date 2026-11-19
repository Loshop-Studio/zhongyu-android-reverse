package p278v7;

import androidx.documentfile.provider.AbstractC3881a;
import p123h7.AbstractC8722b;

/* renamed from: v7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10251a {
    /* renamed from: a */
    public static final void m19205a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                AbstractC3881a.m1684a(autoCloseable);
                return;
            }
            try {
                AbstractC3881a.m1684a(autoCloseable);
            } catch (Throwable th2) {
                AbstractC8722b.m14228a(th, th2);
            }
        }
    }
}
