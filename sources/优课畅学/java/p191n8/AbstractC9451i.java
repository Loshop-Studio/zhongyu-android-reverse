package p191n8;

import java.util.Iterator;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import p123h7.AbstractC8722b;
import p135i8.AbstractC8818a0;
import p135i8.InterfaceC8893z;

/* renamed from: n8.i */
/* loaded from: classes5.dex */
public abstract class AbstractC9451i {
    /* renamed from: a */
    public static final void m17341a(InterfaceC9100d interfaceC9100d, Throwable th) {
        Iterator it = AbstractC9449h.m17339a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC8893z) it.next()).handleException(interfaceC9100d, th);
            } catch (Throwable th2) {
                AbstractC9449h.m17340b(AbstractC8818a0.m14798b(th, th2));
            }
        }
        try {
            AbstractC8722b.m14228a(th, new DiagnosticCoroutineContextException(interfaceC9100d));
        } catch (Throwable unused) {
        }
        AbstractC9449h.m17340b(th);
    }
}
