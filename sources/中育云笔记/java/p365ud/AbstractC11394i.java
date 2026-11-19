package p365ud;

import java.util.concurrent.CancellationException;
import sd.AbstractC11099c1;

/* renamed from: ud.i */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11394i {
    /* renamed from: a */
    public static final void m25356a(InterfaceC11397l interfaceC11397l, Throwable th) {
        if (th != null) {
            cancellationExceptionM24692a = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM24692a == null) {
                cancellationExceptionM24692a = AbstractC11099c1.m24692a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC11397l.cancel(cancellationExceptionM24692a);
    }
}
