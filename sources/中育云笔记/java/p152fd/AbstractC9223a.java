package p152fd;

import androidx.documentfile.provider.AbstractC3754a;
import p309qc.AbstractC10771b;

/* renamed from: fd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9223a {
    /* renamed from: a */
    public static final void m18142a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                AbstractC3754a.m1748a(autoCloseable);
                return;
            }
            try {
                AbstractC3754a.m1748a(autoCloseable);
            } catch (Throwable th2) {
                AbstractC10771b.m22973a(th, th2);
            }
        }
    }
}
