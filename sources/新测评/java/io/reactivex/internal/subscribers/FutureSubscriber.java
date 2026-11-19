package io.reactivex.internal.subscribers;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, InterfaceC8990d {
    Throwable error;
    final AtomicReference<InterfaceC8990d> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onComplete() {
        InterfaceC8990d interfaceC8990d;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC8990d = this.upstream.get();
            if (interfaceC8990d == this || interfaceC8990d == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!AbstractC0920q.m1034a(this.upstream, interfaceC8990d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        InterfaceC8990d interfaceC8990d;
        do {
            interfaceC8990d = this.upstream.get();
            if (interfaceC8990d == this || interfaceC8990d == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!AbstractC0920q.m1034a(this.upstream, interfaceC8990d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        if (this.value == null) {
            this.value = t10;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        SubscriptionHelper.setOnce(this.upstream, interfaceC8990d, Long.MAX_VALUE);
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        InterfaceC8990d interfaceC8990d;
        SubscriptionHelper subscriptionHelper;
        do {
            interfaceC8990d = this.upstream.get();
            if (interfaceC8990d == this || interfaceC8990d == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!AbstractC0920q.m1034a(this.upstream, interfaceC8990d, subscriptionHelper));
        if (interfaceC8990d != null) {
            interfaceC8990d.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
