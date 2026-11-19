package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p009a8.RunnableC0023a;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public final class Futures {
    private static final Function<?, ?> IDENTITY_FUNCTION = new Function<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e) {
                e = e;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e4) {
                e = e4;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e8);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        @NonNull
        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(@NonNull InterfaceFutureC5453a interfaceFutureC5453a, @NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        interfaceFutureC5453a.addListener(new CallbackListener(interfaceFutureC5453a, futureCallback), executor);
    }

    @NonNull
    public static <V> InterfaceFutureC5453a allAsList(@NonNull Collection<? extends InterfaceFutureC5453a> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    @Nullable
    public static <V> V getDone(@NonNull Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    @Nullable
    public static <V> V getUninterruptibly(@NonNull Future<V> future) throws ExecutionException {
        V v2;
        boolean z8 = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    @NonNull
    public static <V> InterfaceFutureC5453a immediateFailedFuture(@NonNull Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    @NonNull
    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(@NonNull Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    @NonNull
    public static <V> InterfaceFutureC5453a immediateFuture(@Nullable V v2) {
        return v2 == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$makeTimeoutFuture$1(CallbackToFutureAdapter.Completer completer, InterfaceFutureC5453a interfaceFutureC5453a, long j7) throws Exception {
        return Boolean.valueOf(completer.setException(new TimeoutException("Future[" + interfaceFutureC5453a + "] is not done within " + j7 + " ms.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeTimeoutFuture$3(InterfaceFutureC5453a interfaceFutureC5453a, ScheduledExecutorService scheduledExecutorService, long j7, CallbackToFutureAdapter.Completer completer) throws Exception {
        propagate(interfaceFutureC5453a, completer);
        if (!interfaceFutureC5453a.isDone()) {
            interfaceFutureC5453a.addListener(new RunnableC0399e(scheduledExecutorService.schedule(new CallableC0400f(completer, interfaceFutureC5453a, j7), j7, TimeUnit.MILLISECONDS), 1), CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + interfaceFutureC5453a + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeTimeoutFuture$4(CallbackToFutureAdapter.Completer completer, Object obj, boolean z8, InterfaceFutureC5453a interfaceFutureC5453a) {
        completer.set(obj);
        if (z8) {
            interfaceFutureC5453a.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeTimeoutFuture$6(final InterfaceFutureC5453a interfaceFutureC5453a, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z8, long j7, final CallbackToFutureAdapter.Completer completer) throws Exception {
        propagate(interfaceFutureC5453a, completer);
        if (!interfaceFutureC5453a.isDone()) {
            interfaceFutureC5453a.addListener(new RunnableC0399e(scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.d
                @Override // java.lang.Runnable
                public final void run() {
                    Futures.lambda$makeTimeoutFuture$4(completer, obj, z8, interfaceFutureC5453a);
                }
            }, j7, TimeUnit.MILLISECONDS), 0), CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + interfaceFutureC5453a + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$nonCancellationPropagating$0(InterfaceFutureC5453a interfaceFutureC5453a, CallbackToFutureAdapter.Completer completer) throws Exception {
        propagateTransform(false, interfaceFutureC5453a, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + interfaceFutureC5453a + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$transformAsyncOnCompletion$8(InterfaceFutureC5453a interfaceFutureC5453a, CallbackToFutureAdapter.Completer completer) throws Exception {
        interfaceFutureC5453a.addListener(new RunnableC0023a(completer, 5), CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + interfaceFutureC5453a + "]";
    }

    @NonNull
    public static <V> InterfaceFutureC5453a makeTimeoutFuture(final long j7, @NonNull final ScheduledExecutorService scheduledExecutorService, @NonNull final InterfaceFutureC5453a interfaceFutureC5453a) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$makeTimeoutFuture$3(interfaceFutureC5453a, scheduledExecutorService, j7, completer);
            }
        });
    }

    @NonNull
    public static <V> InterfaceFutureC5453a nonCancellationPropagating(@NonNull InterfaceFutureC5453a interfaceFutureC5453a) {
        Preconditions.checkNotNull(interfaceFutureC5453a);
        return interfaceFutureC5453a.isDone() ? interfaceFutureC5453a : CallbackToFutureAdapter.getFuture(new C0396b(interfaceFutureC5453a, 1));
    }

    public static <V> void propagate(@NonNull InterfaceFutureC5453a interfaceFutureC5453a, @NonNull CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(interfaceFutureC5453a, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(@NonNull InterfaceFutureC5453a interfaceFutureC5453a, @NonNull Function<? super I, ? extends O> function, @NonNull CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        propagateTransform(true, interfaceFutureC5453a, function, completer, executor);
    }

    @NonNull
    public static <V> InterfaceFutureC5453a successfulAsList(@NonNull Collection<? extends InterfaceFutureC5453a> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    @NonNull
    public static <I, O> InterfaceFutureC5453a transform(@NonNull InterfaceFutureC5453a interfaceFutureC5453a, @NonNull final Function<? super I, ? extends O> function, @NonNull Executor executor) {
        Preconditions.checkNotNull(function);
        return transformAsync(interfaceFutureC5453a, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            @NonNull
            public InterfaceFutureC5453a apply(I i) {
                return Futures.immediateFuture(function.apply(i));
            }
        }, executor);
    }

    @NonNull
    public static <I, O> InterfaceFutureC5453a transformAsync(@NonNull InterfaceFutureC5453a interfaceFutureC5453a, @NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, interfaceFutureC5453a);
        interfaceFutureC5453a.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    @NonNull
    public static <V> InterfaceFutureC5453a transformAsyncOnCompletion(@NonNull InterfaceFutureC5453a interfaceFutureC5453a) {
        return CallbackToFutureAdapter.getFuture(new C0396b(interfaceFutureC5453a, 0));
    }

    @NonNull
    public static <V> InterfaceFutureC5453a makeTimeoutFuture(final long j7, @NonNull final ScheduledExecutorService scheduledExecutorService, @Nullable final V v2, final boolean z8, @NonNull final InterfaceFutureC5453a interfaceFutureC5453a) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.c
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$makeTimeoutFuture$6(interfaceFutureC5453a, scheduledExecutorService, v2, z8, j7, completer);
            }
        });
    }

    private static <I, O> void propagateTransform(boolean z8, @NonNull final InterfaceFutureC5453a interfaceFutureC5453a, @NonNull final Function<? super I, ? extends O> function, @NonNull final CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        Preconditions.checkNotNull(interfaceFutureC5453a);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(interfaceFutureC5453a, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                completer.setException(th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable I i) {
                try {
                    completer.set(function.apply(i));
                } catch (Throwable th) {
                    completer.setException(th);
                }
            }
        }, executor);
        if (z8) {
            completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    interfaceFutureC5453a.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }
}
