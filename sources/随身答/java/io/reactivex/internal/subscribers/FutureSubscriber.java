package io.reactivex.internal.subscribers;

import androidx.camera.view.AbstractC0908q;
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
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, InterfaceC0051d {
    Throwable error;
    final AtomicReference<InterfaceC0051d> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // p010a9.InterfaceC0051d
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

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onComplete() {
        InterfaceC0051d interfaceC0051d;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            interfaceC0051d = this.upstream.get();
            if (interfaceC0051d == this || interfaceC0051d == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!AbstractC0908q.m812a(this.upstream, interfaceC0051d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onError(Throwable th) {
        InterfaceC0051d interfaceC0051d;
        do {
            interfaceC0051d = this.upstream.get();
            if (interfaceC0051d == this || interfaceC0051d == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!AbstractC0908q.m812a(this.upstream, interfaceC0051d, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        if (this.value == null) {
            this.value = t9;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        SubscriptionHelper.setOnce(this.upstream, interfaceC0051d, Long.MAX_VALUE);
    }

    @Override // p010a9.InterfaceC0051d
    public void request(long j9) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        InterfaceC0051d interfaceC0051d;
        SubscriptionHelper subscriptionHelper;
        do {
            interfaceC0051d = this.upstream.get();
            if (interfaceC0051d == this || interfaceC0051d == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!AbstractC0908q.m812a(this.upstream, interfaceC0051d, subscriptionHelper));
        if (interfaceC0051d != null) {
            interfaceC0051d.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j9, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j9, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j9, timeUnit));
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
