package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import vc.InterfaceC11588c;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final InterfaceC11588c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(InterfaceC11588c<? super T> interfaceC11588c) {
        super(false);
        this.continuation = interfaceC11588c;
    }

    @Override // java.util.function.Consumer
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
