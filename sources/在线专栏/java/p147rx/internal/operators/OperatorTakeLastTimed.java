package p147rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Func1;

/* loaded from: classes2.dex */
public final class OperatorTakeLastTimed<T> implements Observable.Operator<T, T> {
    final long ageMillis;
    final int count;
    final Scheduler scheduler;

    static final class TakeLastTimedSubscriber<T> extends Subscriber<T> implements Func1<Object, T> {
        final Subscriber<? super T> actual;
        final long ageMillis;
        final int count;
        final Scheduler scheduler;
        final AtomicLong requested = new AtomicLong();
        final ArrayDeque<Object> queue = new ArrayDeque<>();
        final ArrayDeque<Long> queueTimes = new ArrayDeque<>();

        public TakeLastTimedSubscriber(Subscriber<? super T> subscriber, int i4, long j4, Scheduler scheduler) {
            this.actual = subscriber;
            this.count = i4;
            this.ageMillis = j4;
            this.scheduler = scheduler;
        }

        @Override // p147rx.functions.Func1
        public T call(Object obj) {
            return (T) NotificationLite.getValue(obj);
        }

        protected void evictOld(long j4) {
            long j5 = j4 - this.ageMillis;
            while (true) {
                Long lPeek = this.queueTimes.peek();
                if (lPeek == null || lPeek.longValue() >= j5) {
                    return;
                }
                this.queue.poll();
                this.queueTimes.poll();
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            evictOld(this.scheduler.now());
            this.queueTimes.clear();
            BackpressureUtils.postCompleteDone(this.requested, this.queue, this.actual, this);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.queue.clear();
            this.queueTimes.clear();
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.count != 0) {
                long jNow = this.scheduler.now();
                if (this.queue.size() == this.count) {
                    this.queue.poll();
                    this.queueTimes.poll();
                }
                evictOld(jNow);
                this.queue.offer(NotificationLite.next(t3));
                this.queueTimes.offer(Long.valueOf(jNow));
            }
        }

        void requestMore(long j4) {
            BackpressureUtils.postCompleteRequest(this.requested, j4, this.queue, this.actual, this);
        }
    }

    public OperatorTakeLastTimed(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.ageMillis = timeUnit.toMillis(j4);
        this.scheduler = scheduler;
        this.count = -1;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final TakeLastTimedSubscriber takeLastTimedSubscriber = new TakeLastTimedSubscriber(subscriber, this.count, this.ageMillis, this.scheduler);
        subscriber.add(takeLastTimedSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTakeLastTimed.1
            @Override // p147rx.Producer
            public void request(long j4) {
                takeLastTimedSubscriber.requestMore(j4);
            }
        });
        return takeLastTimedSubscriber;
    }

    public OperatorTakeLastTimed(int i4, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        if (i4 >= 0) {
            this.ageMillis = timeUnit.toMillis(j4);
            this.scheduler = scheduler;
            this.count = i4;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
}
