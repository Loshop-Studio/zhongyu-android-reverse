package p191n8;

import java.util.Collection;
import java.util.ServiceLoader;
import p101f8.AbstractC8476n;
import p101f8.AbstractC8479q;
import p135i8.InterfaceC8893z;

/* renamed from: n8.h */
/* loaded from: classes5.dex */
public abstract class AbstractC9449h {

    /* renamed from: a */
    public static final Collection f18653a = AbstractC8479q.m13843F(AbstractC8476n.m13830e(ServiceLoader.load(InterfaceC8893z.class, InterfaceC8893z.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final Collection m17339a() {
        return f18653a;
    }

    /* renamed from: b */
    public static final void m17340b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
