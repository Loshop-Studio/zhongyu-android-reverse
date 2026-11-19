package p135i8;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.InterfaceC9100d;
import p123h7.AbstractC8722b;
import p191n8.AbstractC9451i;

/* renamed from: i8.a0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8818a0 {
    /* renamed from: a */
    public static final void m14797a(InterfaceC9100d interfaceC9100d, Throwable th) {
        try {
            InterfaceC8893z interfaceC8893z = (InterfaceC8893z) interfaceC9100d.get(InterfaceC8893z.f16555a0);
            if (interfaceC8893z != null) {
                interfaceC8893z.handleException(interfaceC9100d, th);
            } else {
                AbstractC9451i.m17341a(interfaceC9100d, th);
            }
        } catch (Throwable th2) {
            AbstractC9451i.m17341a(interfaceC9100d, m14798b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m14798b(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC8722b.m14228a(runtimeException, th);
        return runtimeException;
    }
}
