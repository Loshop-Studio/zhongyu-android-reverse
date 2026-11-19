package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import p135i8.InterfaceC8845j;

/* loaded from: classes2.dex */
final class ToContinuation<T> implements Runnable {
    private final InterfaceC8845j continuation;
    private final ListenableFuture<T> futureToObserve;

    public ToContinuation(ListenableFuture<T> listenableFuture, InterfaceC8845j interfaceC8845j) {
        this.futureToObserve = listenableFuture;
        this.continuation = interfaceC8845j;
    }

    public final InterfaceC8845j getContinuation() {
        return this.continuation;
    }

    public final ListenableFuture<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            InterfaceC8845j.a.m14876a(this.continuation, null, 1, null);
            return;
        }
        try {
            InterfaceC8845j interfaceC8845j = this.continuation;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC8845j.resumeWith(Result.m15909b(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
        } catch (ExecutionException e10) {
            InterfaceC8845j interfaceC8845j2 = this.continuation;
            Result.C9076a c9076a2 = Result.f17350b;
            interfaceC8845j2.resumeWith(Result.m15909b(AbstractC9079b.m15925a(ListenableFutureKt.nonNullCause(e10))));
        }
    }
}
