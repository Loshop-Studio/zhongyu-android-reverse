package io.reactivex.internal.subscribers;

import androidx.compose.animation.core.AbstractC0433h;
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
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, InterfaceC7918d {
    Throwable error;
    final AtomicReference<InterfaceC7918d> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // p193y5.InterfaceC7918d
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

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onComplete() {
        InterfaceC7918d interfaceC7918d;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC7918d = this.upstream.get();
            if (interfaceC7918d == this || interfaceC7918d == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!AbstractC0433h.m112a(this.upstream, interfaceC7918d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        InterfaceC7918d interfaceC7918d;
        do {
            interfaceC7918d = this.upstream.get();
            if (interfaceC7918d == this || interfaceC7918d == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!AbstractC0433h.m112a(this.upstream, interfaceC7918d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        if (this.value == null) {
            this.value = t6;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        SubscriptionHelper.setOnce(this.upstream, interfaceC7918d, Long.MAX_VALUE);
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        InterfaceC7918d interfaceC7918d;
        SubscriptionHelper subscriptionHelper;
        do {
            interfaceC7918d = this.upstream.get();
            if (interfaceC7918d == this || interfaceC7918d == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!AbstractC0433h.m112a(this.upstream, interfaceC7918d, subscriptionHelper));
        if (interfaceC7918d != null) {
            interfaceC7918d.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j6, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j6, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j6, timeUnit));
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
