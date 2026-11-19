package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import sd.InterfaceC11138m0;
import vc.AbstractC11589d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class SuspendToFutureAdapter {
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new InterfaceC11122i0() { // from class: androidx.concurrent.futures.SuspendToFutureAdapter$GlobalListenableFutureScope$1
        private final InterfaceC9945d coroutineContext = C11157r0.m24800c();

        @Override // sd.InterfaceC11122i0
        public InterfaceC9945d getCoroutineContext() {
            return this.coroutineContext;
        }
    };
    private static final AbstractC11106e0 GlobalListenableFutureAwaitContext = C11157r0.m24801d();

    public static final class DeferredFuture<T> implements ListenableFuture<T>, InterfaceC11588c<T> {
        private final ResolvableFuture<T> delegateFuture = ResolvableFuture.create();
        private final InterfaceC11138m0 resultDeferred;

        public DeferredFuture(InterfaceC11138m0 interfaceC11138m0) {
            this.resultDeferred = interfaceC11138m0;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.delegateFuture.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            boolean zCancel = this.delegateFuture.cancel(z10);
            if (zCancel) {
                InterfaceC10045g.a.m20900a(this.resultDeferred, null, 1, null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }

        @Override // vc.InterfaceC11588c
        public InterfaceC9945d getContext() {
            return SuspendToFutureAdapter.GlobalListenableFutureAwaitContext;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegateFuture.isDone();
        }

        @Override // vc.InterfaceC11588c
        public void resumeWith(Object obj) {
            Throwable thM20056e = Result.m20056e(obj);
            if (thM20056e == null) {
                this.delegateFuture.set(obj);
            } else if (thM20056e instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.setException(thM20056e);
            }
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.delegateFuture.get(j10, timeUnit);
        }
    }

    private SuspendToFutureAdapter() {
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, InterfaceC9945d interfaceC9945d, boolean z10, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return suspendToFutureAdapter.launchFuture(interfaceC9945d, z10, interfaceC9544p);
    }

    public final <T> ListenableFuture<T> launchFuture(InterfaceC9945d interfaceC9945d, boolean z10, InterfaceC9544p interfaceC9544p) {
        InterfaceC11138m0 interfaceC11138m0M24703a = AbstractC11109f.m24703a(GlobalListenableFutureScope, interfaceC9945d, z10 ? CoroutineStart.f23479f : CoroutineStart.f23476c, interfaceC9544p);
        DeferredFuture deferredFuture = new DeferredFuture(interfaceC11138m0M24703a);
        InterfaceC11588c interfaceC11588cM25523a = AbstractC11589d.m25523a(new SuspendToFutureAdapter$launchFuture$1$1(interfaceC11138m0M24703a), deferredFuture);
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11588cM25523a.resumeWith(Result.m20054c(C10786q.f26013a));
        return deferredFuture;
    }
}
