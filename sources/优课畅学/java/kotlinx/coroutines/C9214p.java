package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC9100d;

/* renamed from: kotlinx.coroutines.p */
/* loaded from: classes5.dex */
public final class C9214p extends CoroutineDispatcher {

    /* renamed from: a */
    public static final C9214p f18098a = new C9214p();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        C9215q c9215q = (C9215q) interfaceC9100d.get(C9215q.f18099b);
        if (c9215q == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c9215q.f18100a = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(InterfaceC9100d interfaceC9100d) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
