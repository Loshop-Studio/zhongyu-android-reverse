package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OnSubscribeDetach<T> implements Observable.OnSubscribe<T> {
    final Observable<T> source;

    static final class DetachProducer<T> implements Producer, Subscription {
        final DetachSubscriber<T> parent;

        public DetachProducer(DetachSubscriber<T> detachSubscriber) {
            this.parent = detachSubscriber;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.parent.isUnsubscribed();
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            this.parent.innerRequest(j4);
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.parent.innerUnsubscribe();
        }
    }

    static final class DetachSubscriber<T> extends Subscriber<T> {
        final AtomicReference<Subscriber<? super T>> actual;
        final AtomicReference<Producer> producer = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public DetachSubscriber(Subscriber<? super T> subscriber) {
            this.actual = new AtomicReference<>(subscriber);
        }

        void innerRequest(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j4);
            }
            Producer producer = this.producer.get();
            if (producer != null) {
                producer.request(j4);
                return;
            }
            BackpressureUtils.getAndAddRequest(this.requested, j4);
            Producer producer2 = this.producer.get();
            if (producer2 == null || producer2 == TerminatedProducer.INSTANCE) {
                return;
            }
            producer2.request(this.requested.getAndSet(0L));
        }

        void innerUnsubscribe() {
            this.producer.lazySet(TerminatedProducer.INSTANCE);
            this.actual.lazySet(null);
            unsubscribe();
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.producer.lazySet(TerminatedProducer.INSTANCE);
            Subscriber<? super T> andSet = this.actual.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.producer.lazySet(TerminatedProducer.INSTANCE);
            Subscriber<? super T> andSet = this.actual.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            Subscriber<? super T> subscriber = this.actual.get();
            if (subscriber != null) {
                subscriber.onNext(t3);
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (this.producer.compareAndSet(null, producer)) {
                producer.request(this.requested.getAndSet(0L));
            } else if (this.producer.get() != TerminatedProducer.INSTANCE) {
                throw new IllegalStateException("Producer already set!");
            }
        }
    }

    enum TerminatedProducer implements Producer {
        INSTANCE;

        @Override // p147rx.Producer
        public void request(long j4) {
        }
    }

    public OnSubscribeDetach(Observable<T> observable) {
        this.source = observable;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        DetachSubscriber detachSubscriber = new DetachSubscriber(subscriber);
        DetachProducer detachProducer = new DetachProducer(detachSubscriber);
        subscriber.add(detachProducer);
        subscriber.setProducer(detachProducer);
        this.source.unsafeSubscribe(detachSubscriber);
    }
}
