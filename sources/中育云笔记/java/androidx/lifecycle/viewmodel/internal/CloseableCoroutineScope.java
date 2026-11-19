package androidx.lifecycle.viewmodel.internal;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.JobKt__JobKt;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class CloseableCoroutineScope implements AutoCloseable, InterfaceC11122i0 {
    private final InterfaceC9945d coroutineContext;

    public CloseableCoroutineScope(InterfaceC9945d coroutineContext) {
        AbstractC9979u.m20294g(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m20388e(getCoroutineContext(), null, 1, null);
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(InterfaceC11122i0 coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
    }
}
