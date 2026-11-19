package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final InterfaceC11588c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(InterfaceC11588c<? super T> interfaceC11588c) {
        super(false);
        this.continuation = interfaceC11588c;
    }

    @Override // androidx.core.util.Consumer
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m20054c(t10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
