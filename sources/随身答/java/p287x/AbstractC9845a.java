package p287x;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import p172l8.InterfaceC8906e;

/* renamed from: x.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9845a {
    /* renamed from: a */
    public static final Object m16783a(InterfaceC8906e interfaceC8906e, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C9846b c9846b = new C9846b(interfaceC8906e, cancellableContinuationImpl);
        interfaceC8906e.mo13867k(c9846b);
        cancellableContinuationImpl.invokeOnCancellation(c9846b);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
