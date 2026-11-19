package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import sd.InterfaceC11125j;

/* loaded from: classes2.dex */
final class ToContinuation<T> implements Runnable {
    private final InterfaceC11125j continuation;
    private final ListenableFuture<T> futureToObserve;

    public ToContinuation(ListenableFuture<T> listenableFuture, InterfaceC11125j interfaceC11125j) {
        this.futureToObserve = listenableFuture;
        this.continuation = interfaceC11125j;
    }

    public final InterfaceC11125j getContinuation() {
        return this.continuation;
    }

    public final ListenableFuture<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            InterfaceC11125j.a.m24737a(this.continuation, null, 1, null);
            return;
        }
        try {
            InterfaceC11125j interfaceC11125j = this.continuation;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125j.resumeWith(Result.m20054c(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
        } catch (ExecutionException e10) {
            InterfaceC11125j interfaceC11125j2 = this.continuation;
            Result.C9921a c9921a2 = Result.f23263d;
            interfaceC11125j2.resumeWith(Result.m20054c(AbstractC9924b.m20070a(ListenableFutureKt.nonNullCause(e10))));
        }
    }
}
