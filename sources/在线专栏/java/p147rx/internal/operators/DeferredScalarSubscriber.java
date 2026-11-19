package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public abstract class DeferredScalarSubscriber<T, R> extends Subscriber<T> {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 1;
    static final int NO_REQUEST_HAS_VALUE = 2;
    static final int NO_REQUEST_NO_VALUE = 0;
    protected final Subscriber<? super R> actual;
    protected boolean hasValue;
    final AtomicInteger state = new AtomicInteger();
    protected R value;

    static final class InnerProducer implements Producer {
        final DeferredScalarSubscriber<?, ?> parent;

        public InnerProducer(DeferredScalarSubscriber<?, ?> deferredScalarSubscriber) {
            this.parent = deferredScalarSubscriber;
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            this.parent.downstreamRequest(j4);
        }
    }

    public DeferredScalarSubscriber(Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    protected final void complete() {
        this.actual.onCompleted();
    }

    final void downstreamRequest(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j4);
        }
        if (j4 != 0) {
            Subscriber<? super R> subscriber = this.actual;
            do {
                int i4 = this.state.get();
                if (i4 == 1 || i4 == 3 || subscriber.isUnsubscribed()) {
                    return;
                }
                if (i4 == 2) {
                    if (this.state.compareAndSet(2, 3)) {
                        subscriber.onNext(this.value);
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!this.state.compareAndSet(0, 1));
        }
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            complete();
        }
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.value = null;
        this.actual.onError(th);
    }

    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
    public final void setProducer(Producer producer) {
        producer.request(Long.MAX_VALUE);
    }

    final void setupDownstream() {
        Subscriber<? super R> subscriber = this.actual;
        subscriber.add(this);
        subscriber.setProducer(new InnerProducer(this));
    }

    public final void subscribeTo(Observable<? extends T> observable) {
        setupDownstream();
        observable.unsafeSubscribe(this);
    }

    protected final void complete(R r3) {
        Subscriber<? super R> subscriber = this.actual;
        do {
            int i4 = this.state.get();
            if (i4 == 2 || i4 == 3 || subscriber.isUnsubscribed()) {
                return;
            }
            if (i4 == 1) {
                subscriber.onNext(r3);
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
                this.state.lazySet(3);
                return;
            }
            this.value = r3;
        } while (!this.state.compareAndSet(0, 2));
    }
}
