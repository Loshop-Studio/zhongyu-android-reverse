package p180x;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import p058f5.InterfaceC6363e;

/* renamed from: x.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7820a {
    /* renamed from: a */
    public static final Object m9409a(InterfaceC6363e interfaceC6363e, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C7821b c7821b = new C7821b(interfaceC6363e, cancellableContinuationImpl);
        interfaceC6363e.mo6700c(c7821b);
        cancellableContinuationImpl.invokeOnCancellation(c7821b);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
