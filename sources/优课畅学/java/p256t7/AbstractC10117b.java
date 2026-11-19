package p256t7;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p123h7.AbstractC8722b;

/* renamed from: t7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10117b {
    /* renamed from: a */
    public static final void m18861a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC8722b.m14228a(th, th2);
            }
        }
    }
}
