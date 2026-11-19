package androidx.lifecycle.viewmodel.internal;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.JobKt__JobKt;
import p135i8.InterfaceC8822b0;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, InterfaceC8822b0 {
    private final InterfaceC9100d coroutineContext;

    public CloseableCoroutineScope(InterfaceC9100d coroutineContext) {
        AbstractC9133u.m16133g(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m16236e(getCoroutineContext(), null, 1, null);
    }

    @Override // p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(InterfaceC8822b0 coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
    }
}
