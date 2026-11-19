package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p147rx.Notification;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OperatorMaterialize<T> implements Observable.Operator<Notification<T>, T> {

    static final class Holder {
        static final OperatorMaterialize<Object> INSTANCE = new OperatorMaterialize<>();

        Holder() {
        }
    }

    static class ParentSubscriber<T> extends Subscriber<T> {
        private boolean busy;
        private final Subscriber<? super Notification<T>> child;
        private boolean missed;
        private final AtomicLong requested = new AtomicLong();
        private volatile Notification<T> terminalNotification;

        ParentSubscriber(Subscriber<? super Notification<T>> subscriber) {
            this.child = subscriber;
        }

        private void decrementRequested() {
            long j4;
            AtomicLong atomicLong = this.requested;
            do {
                j4 = atomicLong.get();
                if (j4 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j4, j4 - 1));
        }

        private void drain() {
            synchronized (this) {
                if (this.busy) {
                    this.missed = true;
                    return;
                }
                this.busy = true;
                AtomicLong atomicLong = this.requested;
                while (!this.child.isUnsubscribed()) {
                    Notification<T> notification = this.terminalNotification;
                    if (notification != null && atomicLong.get() > 0) {
                        this.terminalNotification = null;
                        this.child.onNext(notification);
                        if (this.child.isUnsubscribed()) {
                            return;
                        }
                        this.child.onCompleted();
                        return;
                    }
                    synchronized (this) {
                        if (!this.missed) {
                            this.busy = false;
                            return;
                        }
                    }
                }
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.terminalNotification = Notification.createOnCompleted();
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.terminalNotification = Notification.createOnError(th);
            RxJavaHooks.onError(th);
            drain();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.child.onNext(Notification.createOnNext(t3));
            decrementRequested();
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        void requestMore(long j4) {
            BackpressureUtils.getAndAddRequest(this.requested, j4);
            request(j4);
            drain();
        }
    }

    OperatorMaterialize() {
    }

    public static <T> OperatorMaterialize<T> instance() {
        return (OperatorMaterialize<T>) Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Notification<T>> subscriber) {
        final ParentSubscriber parentSubscriber = new ParentSubscriber(subscriber);
        subscriber.add(parentSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorMaterialize.1
            @Override // p147rx.Producer
            public void request(long j4) {
                if (j4 > 0) {
                    parentSubscriber.requestMore(j4);
                }
            }
        });
        return parentSubscriber;
    }
}
