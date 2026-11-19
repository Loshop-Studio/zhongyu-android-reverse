package p410xd;

import java.util.Iterator;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import p309qc.AbstractC10771b;
import sd.AbstractC11114g0;
import sd.InterfaceC11110f0;

/* renamed from: xd.g */
/* loaded from: classes6.dex */
public abstract class AbstractC11846g {
    /* renamed from: a */
    public static final void m26267a(InterfaceC9945d interfaceC9945d, Throwable th) {
        Iterator it = AbstractC11844f.m26259a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC11110f0) it.next()).handleException(interfaceC9945d, th);
            } catch (Throwable th2) {
                AbstractC11844f.m26260b(AbstractC11114g0.m24719b(th, th2));
            }
        }
        try {
            AbstractC10771b.m22973a(th, new DiagnosticCoroutineContextException(interfaceC9945d));
        } catch (Throwable unused) {
        }
        AbstractC11844f.m26260b(th);
    }
}
