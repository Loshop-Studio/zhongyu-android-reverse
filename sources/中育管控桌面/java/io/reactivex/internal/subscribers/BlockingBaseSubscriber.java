package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    volatile boolean cancelled;
    Throwable error;
    InterfaceC7918d upstream;
    T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() throws InterruptedException {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e6) {
                InterfaceC7918d interfaceC7918d = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (interfaceC7918d != null) {
                    interfaceC7918d.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e6);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public final void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
            this.upstream = interfaceC7918d;
            if (this.cancelled) {
                return;
            }
            interfaceC7918d.request(Long.MAX_VALUE);
            if (this.cancelled) {
                this.upstream = SubscriptionHelper.CANCELLED;
                interfaceC7918d.cancel();
            }
        }
    }
}
