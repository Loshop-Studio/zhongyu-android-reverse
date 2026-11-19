package cd;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p309qc.AbstractC10771b;

/* renamed from: cd.b */
/* loaded from: classes6.dex */
public abstract class AbstractC5423b {
    /* renamed from: a */
    public static final void m2902a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC10771b.m22973a(th, th2);
            }
        }
    }
}
