package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    volatile boolean cancelled;
    Throwable error;
    InterfaceC8990d upstream;
    T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() throws InterruptedException {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                InterfaceC8990d interfaceC8990d = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (interfaceC8990d != null) {
                    interfaceC8990d.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public final void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
            this.upstream = interfaceC8990d;
            if (this.cancelled) {
                return;
            }
            interfaceC8990d.request(Long.MAX_VALUE);
            if (this.cancelled) {
                this.upstream = SubscriptionHelper.CANCELLED;
                interfaceC8990d.cancel();
            }
        }
    }
}
