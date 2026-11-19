package p157k8;

import java.util.concurrent.CancellationException;
import p135i8.AbstractC8870r0;

/* renamed from: k8.f */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC9070f {
    /* renamed from: a */
    public static final void m15898a(InterfaceC9073i interfaceC9073i, Throwable th) {
        if (th != null) {
            cancellationExceptionM14906a = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM14906a == null) {
                cancellationExceptionM14906a = AbstractC8870r0.m14906a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC9073i.cancel(cancellationExceptionM14906a);
    }
}
