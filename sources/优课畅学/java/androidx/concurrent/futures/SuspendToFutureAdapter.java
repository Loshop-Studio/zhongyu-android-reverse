package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8831e0;
import p179m7.AbstractC9325d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SuspendToFutureAdapter {
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new InterfaceC8822b0() { // from class: androidx.concurrent.futures.SuspendToFutureAdapter$GlobalListenableFutureScope$1
        private final InterfaceC9100d coroutineContext = C8843i0.m14868c();

        @Override // p135i8.InterfaceC8822b0
        public InterfaceC9100d getCoroutineContext() {
            return this.coroutineContext;
        }
    };
    private static final CoroutineDispatcher GlobalListenableFutureAwaitContext = C8843i0.m14869d();

    public static final class DeferredFuture<T> implements ListenableFuture<T>, InterfaceC9324c<T> {
        private final ResolvableFuture<T> delegateFuture = ResolvableFuture.create();
        private final InterfaceC8831e0 resultDeferred;

        public DeferredFuture(InterfaceC8831e0 interfaceC8831e0) {
            this.resultDeferred = interfaceC8831e0;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.delegateFuture.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            boolean zCancel = this.delegateFuture.cancel(z10);
            if (zCancel) {
                InterfaceC9212n.a.m16777a(this.resultDeferred, null, 1, null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }

        @Override // p179m7.InterfaceC9324c
        public InterfaceC9100d getContext() {
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

        @Override // p179m7.InterfaceC9324c
        public void resumeWith(Object obj) {
            Throwable thM15911d = Result.m15911d(obj);
            if (thM15911d == null) {
                this.delegateFuture.set(obj);
            } else if (thM15911d instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.setException(thM15911d);
            }
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.delegateFuture.get(j10, timeUnit);
        }
    }

    private SuspendToFutureAdapter() {
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, InterfaceC9100d interfaceC9100d, boolean z10, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return suspendToFutureAdapter.launchFuture(interfaceC9100d, z10, interfaceC10574p);
    }

    public final <T> ListenableFuture<T> launchFuture(InterfaceC9100d interfaceC9100d, boolean z10, InterfaceC10574p interfaceC10574p) {
        InterfaceC8831e0 interfaceC8831e0M14842a = AbstractC8833f.m14842a(GlobalListenableFutureScope, interfaceC9100d, z10 ? CoroutineStart.f17555d : CoroutineStart.f17552a, interfaceC10574p);
        DeferredFuture deferredFuture = new DeferredFuture(interfaceC8831e0M14842a);
        InterfaceC9324c interfaceC9324cM17152a = AbstractC9325d.m17152a(new SuspendToFutureAdapter$launchFuture$1$1(interfaceC8831e0M14842a), deferredFuture);
        Result.C9076a c9076a = Result.f17350b;
        interfaceC9324cM17152a.resumeWith(Result.m15909b(C8736p.f16368a));
        return deferredFuture;
    }
}
