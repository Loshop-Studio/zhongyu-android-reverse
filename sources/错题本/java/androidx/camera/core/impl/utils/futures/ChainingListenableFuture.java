package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {

    @Nullable
    private AsyncFunction<? super I, ? extends O> mFunction;

    @Nullable
    private InterfaceFutureC5453a mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);

    @Nullable
    volatile InterfaceFutureC5453a mOutputFuture;

    public ChainingListenableFuture(@NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull InterfaceFutureC5453a interfaceFutureC5453a) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (InterfaceFutureC5453a) Preconditions.checkNotNull(interfaceFutureC5453a);
    }

    private <E> void putUninterruptibly(@NonNull BlockingQueue<E> blockingQueue, @NonNull E e) {
        boolean z8 = false;
        while (true) {
            try {
                blockingQueue.put(e);
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
    }

    private <E> E takeUninterruptibly(@NonNull BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z8 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
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
        return eTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        if (!super.cancel(z8)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z8));
        cancel(this.mInputFuture, z8);
        cancel(this.mOutputFuture, z8);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            InterfaceFutureC5453a interfaceFutureC5453a = this.mInputFuture;
            if (interfaceFutureC5453a != null) {
                interfaceFutureC5453a.get();
            }
            this.mOutputCreated.await();
            InterfaceFutureC5453a interfaceFutureC5453a2 = this.mOutputFuture;
            if (interfaceFutureC5453a2 != null) {
                interfaceFutureC5453a2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, e1.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, e1.a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        AsyncFunction<? super I, ? extends O> asyncFunction;
        ?? r02 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            final InterfaceFutureC5453a interfaceFutureC5453aApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                            this.mOutputFuture = interfaceFutureC5453aApply;
                            if (isCancelled()) {
                                interfaceFutureC5453aApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                                this.mOutputFuture = null;
                            } else {
                                interfaceFutureC5453aApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            try {
                                                try {
                                                    ChainingListenableFuture.this.set(Futures.getUninterruptibly(interfaceFutureC5453aApply));
                                                } catch (CancellationException unused) {
                                                    ChainingListenableFuture.this.cancel(false);
                                                }
                                            } catch (ExecutionException e) {
                                                ChainingListenableFuture.this.setException(e.getCause());
                                            }
                                        } finally {
                                            ChainingListenableFuture.this.mOutputFuture = null;
                                        }
                                    }
                                }, CameraXExecutors.directExecutor());
                            }
                        } catch (Exception e) {
                            setException(e);
                            asyncFunction = r02;
                        }
                    } catch (Error e4) {
                        setException(e4);
                        asyncFunction = r02;
                    }
                } finally {
                    this.mFunction = (AsyncFunction<? super I, ? extends O>) r02;
                    this.mInputFuture = (InterfaceFutureC5453a) r02;
                    this.mOutputCreated.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e8) {
                setException(e8.getCause());
            }
        } catch (UndeclaredThrowableException e9) {
            setException(e9.getCause());
            asyncFunction = r02;
        }
    }

    private void cancel(@Nullable Future<?> future, boolean z8) {
        if (future != null) {
            future.cancel(z8);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get(long j7, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j7 = timeUnit2.convert(j7, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC5453a interfaceFutureC5453a = this.mInputFuture;
            if (interfaceFutureC5453a != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC5453a.get(j7, timeUnit);
                j7 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j7, timeUnit)) {
                j7 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC5453a interfaceFutureC5453a2 = this.mOutputFuture;
                if (interfaceFutureC5453a2 != null) {
                    interfaceFutureC5453a2.get(j7, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j7, timeUnit);
    }
}
