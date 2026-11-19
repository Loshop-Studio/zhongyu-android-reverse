package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC9945d;
import sd.AbstractC11106e0;

/* loaded from: classes6.dex */
public final class DispatchException extends Exception {

    /* renamed from: c */
    public final Throwable f23485c;

    public DispatchException(Throwable th, AbstractC11106e0 abstractC11106e0, InterfaceC9945d interfaceC9945d) {
        super("Coroutine dispatcher " + abstractC11106e0 + " threw an exception, context = " + interfaceC9945d, th);
        this.f23485c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f23485c;
    }
}
