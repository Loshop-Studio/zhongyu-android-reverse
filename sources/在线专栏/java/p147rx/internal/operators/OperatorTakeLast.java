package p147rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.functions.Func1;

/* loaded from: classes2.dex */
public final class OperatorTakeLast<T> implements Observable.Operator<T, T> {
    final int count;

    static final class TakeLastSubscriber<T> extends Subscriber<T> implements Func1<Object, T> {
        final Subscriber<? super T> actual;
        final int count;
        final AtomicLong requested = new AtomicLong();
        final ArrayDeque<Object> queue = new ArrayDeque<>();

        public TakeLastSubscriber(Subscriber<? super T> subscriber, int i4) {
            this.actual = subscriber;
            this.count = i4;
        }

        @Override // p147rx.functions.Func1
        public T call(Object obj) {
            return (T) NotificationLite.getValue(obj);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            BackpressureUtils.postCompleteDone(this.requested, this.queue, this.actual, this);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.queue.clear();
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.queue.size() == this.count) {
                this.queue.poll();
            }
            this.queue.offer(NotificationLite.next(t3));
        }

        void requestMore(long j4) {
            if (j4 > 0) {
                BackpressureUtils.postCompleteRequest(this.requested, j4, this.queue, this.actual, this);
            }
        }
    }

    public OperatorTakeLast(int i4) {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.count = i4;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final TakeLastSubscriber takeLastSubscriber = new TakeLastSubscriber(subscriber, this.count);
        subscriber.add(takeLastSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeLast.1
            @Override // p147rx.Producer
            public void request(long j4) {
                takeLastSubscriber.requestMore(j4);
            }
        });
        return takeLastSubscriber;
    }
}
