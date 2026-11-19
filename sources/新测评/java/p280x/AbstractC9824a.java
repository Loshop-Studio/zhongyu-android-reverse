package p280x;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import p011a9.InterfaceC0042e;

/* renamed from: x.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9824a {
    /* renamed from: a */
    public static final Object m16446a(InterfaceC0042e interfaceC0042e, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C9825b c9825b = new C9825b(interfaceC0042e, cancellableContinuationImpl);
        interfaceC0042e.mo108o(c9825b);
        cancellableContinuationImpl.invokeOnCancellation(c9825b);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
