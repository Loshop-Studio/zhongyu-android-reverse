package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        if (interfaceC11588c != null && interfaceC11588c.getContext() != EmptyCoroutineContext.f23351c) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        return EmptyCoroutineContext.f23351c;
    }
}
