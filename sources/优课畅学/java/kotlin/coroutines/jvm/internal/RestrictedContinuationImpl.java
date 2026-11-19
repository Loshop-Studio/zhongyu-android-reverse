package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import p179m7.InterfaceC9324c;

/* loaded from: classes5.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        if (interfaceC9324c != null && interfaceC9324c.getContext() != EmptyCoroutineContext.f17438a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        return EmptyCoroutineContext.f17438a;
    }
}
