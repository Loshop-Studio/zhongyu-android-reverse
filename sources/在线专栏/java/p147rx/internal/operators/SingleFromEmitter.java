package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Single;
import p147rx.SingleEmitter;
import p147rx.SingleSubscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action1;
import p147rx.functions.Cancellable;
import p147rx.internal.subscriptions.CancellableSubscription;
import p147rx.internal.subscriptions.SequentialSubscription;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class SingleFromEmitter<T> implements Single.OnSubscribe<T> {
    final Action1<SingleEmitter<T>> producer;

    static final class SingleEmitterImpl<T> extends AtomicBoolean implements SingleEmitter<T>, Subscription {
        private static final long serialVersionUID = 8082834163465882809L;
        final SingleSubscriber<? super T> actual;
        final SequentialSubscription resource = new SequentialSubscription();

        SingleEmitterImpl(SingleSubscriber<? super T> singleSubscriber) {
            this.actual = singleSubscriber;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p147rx.SingleEmitter
        public void onError(Throwable th) {
            if (th == null) {
                th = new NullPointerException();
            }
            if (!compareAndSet(false, true)) {
                RxJavaHooks.onError(th);
                return;
            }
            try {
                this.actual.onError(th);
            } finally {
                this.resource.unsubscribe();
            }
        }

        @Override // p147rx.SingleEmitter
        public void onSuccess(T t3) {
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onSuccess(t3);
                } finally {
                    this.resource.unsubscribe();
                }
            }
        }

        @Override // p147rx.SingleEmitter
        public void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        @Override // p147rx.SingleEmitter
        public void setSubscription(Subscription subscription) {
            this.resource.update(subscription);
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.resource.unsubscribe();
            }
        }
    }

    public SingleFromEmitter(Action1<SingleEmitter<T>> action1) {
        this.producer = action1;
    }

    @Override // p147rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        SingleEmitterImpl singleEmitterImpl = new SingleEmitterImpl(singleSubscriber);
        singleSubscriber.add(singleEmitterImpl);
        try {
            this.producer.call(singleEmitterImpl);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            singleEmitterImpl.onError(th);
        }
    }
}
