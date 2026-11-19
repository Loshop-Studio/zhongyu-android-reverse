package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public class FutureChain<V> implements InterfaceFutureC5453a {

    @Nullable
    CallbackToFutureAdapter.Completer<V> mCompleter;

    @NonNull
    private final InterfaceFutureC5453a mDelegate;

    public FutureChain(@NonNull InterfaceFutureC5453a interfaceFutureC5453a) {
        this.mDelegate = (InterfaceFutureC5453a) Preconditions.checkNotNull(interfaceFutureC5453a);
    }

    @NonNull
    public static <V> FutureChain<V> from(@NonNull InterfaceFutureC5453a interfaceFutureC5453a) {
        return interfaceFutureC5453a instanceof FutureChain ? (FutureChain) interfaceFutureC5453a : new FutureChain<>(interfaceFutureC5453a);
    }

    public final void addCallback(@NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    @Override // p049e1.InterfaceFutureC5453a
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.mDelegate.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws ExecutionException, InterruptedException {
        return (V) this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    public boolean set(@Nullable V v2) {
        CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.set(v2);
        }
        return false;
    }

    public boolean setException(@NonNull Throwable th) {
        CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.setException(th);
        }
        return false;
    }

    @NonNull
    public final <T> FutureChain<T> transform(@NonNull Function<? super V, T> function, @NonNull Executor executor) {
        return (FutureChain) Futures.transform(this, function, executor);
    }

    @NonNull
    public final <T> FutureChain<T> transformAsync(@NonNull AsyncFunction<? super V, T> asyncFunction, @NonNull Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j7, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (V) this.mDelegate.get(j7, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<V> completer) {
                Preconditions.checkState(FutureChain.this.mCompleter == null, "The result can only set once!");
                FutureChain.this.mCompleter = completer;
                return "FutureChain[" + FutureChain.this + "]";
            }
        });
    }
}
