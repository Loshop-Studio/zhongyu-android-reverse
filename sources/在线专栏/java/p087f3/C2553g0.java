package p087f3;

import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p128o2.C2909b;
import p142q2.InterfaceC3015g;

/* renamed from: f3.g0 */
/* loaded from: classes.dex */
public final class C2553g0 {
    /* renamed from: a */
    public static final void m8561a(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC3015g.get(CoroutineExceptionHandler.f10740Q);
            if (coroutineExceptionHandler == null) {
                C2549f0.m8553a(interfaceC3015g, th);
            } else {
                coroutineExceptionHandler.handleException(interfaceC3015g, th);
            }
        } catch (Throwable th2) {
            C2549f0.m8553a(interfaceC3015g, m8562b(th, th2));
        }
    }

    @NotNull
    /* renamed from: b */
    public static final Throwable m8562b(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C2909b.m9982a(runtimeException, th);
        return runtimeException;
    }
}
