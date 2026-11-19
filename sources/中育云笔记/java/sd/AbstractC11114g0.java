package sd;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.DispatchException;
import p309qc.AbstractC10771b;
import p410xd.AbstractC11846g;

/* renamed from: sd.g0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11114g0 {
    /* renamed from: a */
    public static final void m24718a(InterfaceC9945d interfaceC9945d, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            InterfaceC11110f0 interfaceC11110f0 = (InterfaceC11110f0) interfaceC9945d.get(InterfaceC11110f0.f26779d0);
            if (interfaceC11110f0 != null) {
                interfaceC11110f0.handleException(interfaceC9945d, th);
            } else {
                AbstractC11846g.m26267a(interfaceC9945d, th);
            }
        } catch (Throwable th2) {
            AbstractC11846g.m26267a(interfaceC9945d, m24719b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m24719b(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC10771b.m22973a(runtimeException, th);
        return runtimeException;
    }
}
