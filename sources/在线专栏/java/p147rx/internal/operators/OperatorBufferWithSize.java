package p147rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.MissingBackpressureException;

/* loaded from: classes2.dex */
public final class OperatorBufferWithSize<T> implements Observable.Operator<List<T>, T> {
    final int count;
    final int skip;

    static final class BufferExact<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> actual;
        List<T> buffer;
        final int count;

        public BufferExact(Subscriber<? super List<T>> subscriber, int i4) {
            this.actual = subscriber;
            this.count = i4;
            request(0L);
        }

        Producer createProducer() {
            return new Producer() { // from class: rx.internal.operators.OperatorBufferWithSize.BufferExact.1
                @Override // p147rx.Producer
                public void request(long j4) {
                    if (j4 < 0) {
                        throw new IllegalArgumentException("n >= required but it was " + j4);
                    }
                    if (j4 != 0) {
                        BufferExact.this.request(BackpressureUtils.multiplyCap(j4, BufferExact.this.count));
                    }
                }
            };
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            List<T> list = this.buffer;
            if (list != null) {
                this.actual.onNext(list);
            }
            this.actual.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.buffer = null;
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            List arrayList = this.buffer;
            if (arrayList == null) {
                arrayList = new ArrayList(this.count);
                this.buffer = arrayList;
            }
            arrayList.add(t3);
            if (arrayList.size() == this.count) {
                this.buffer = null;
                this.actual.onNext(arrayList);
            }
        }
    }

    static final class BufferOverlap<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> actual;
        final int count;
        long index;
        long produced;
        final ArrayDeque<List<T>> queue = new ArrayDeque<>();
        final AtomicLong requested = new AtomicLong();
        final int skip;

        final class BufferOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            BufferOverlapProducer() {
            }

            @Override // p147rx.Producer
            public void request(long j4) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (!BackpressureUtils.postCompleteRequest(bufferOverlap.requested, j4, bufferOverlap.queue, bufferOverlap.actual) || j4 == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bufferOverlap.request(BackpressureUtils.multiplyCap(bufferOverlap.skip, j4));
                } else {
                    bufferOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bufferOverlap.skip, j4 - 1), bufferOverlap.count));
                }
            }
        }

        public BufferOverlap(Subscriber<? super List<T>> subscriber, int i4, int i5) {
            this.actual = subscriber;
            this.count = i4;
            this.skip = i5;
            request(0L);
        }

        Producer createProducer() {
            return new BufferOverlapProducer();
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            long j4 = this.produced;
            if (j4 != 0) {
                if (j4 > this.requested.get()) {
                    this.actual.onError(new MissingBackpressureException("More produced than requested? " + j4));
                    return;
                }
                this.requested.addAndGet(-j4);
            }
            BackpressureUtils.postCompleteDone(this.requested, this.queue, this.actual);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.queue.clear();
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            long j4 = this.index;
            if (j4 == 0) {
                this.queue.offer(new ArrayList(this.count));
            }
            long j5 = j4 + 1;
            if (j5 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j5;
            }
            Iterator<List<T>> it = this.queue.iterator();
            while (it.hasNext()) {
                it.next().add(t3);
            }
            List<T> listPeek = this.queue.peek();
            if (listPeek == null || listPeek.size() != this.count) {
                return;
            }
            this.queue.poll();
            this.produced++;
            this.actual.onNext(listPeek);
        }
    }

    static final class BufferSkip<T> extends Subscriber<T> {
        final Subscriber<? super List<T>> actual;
        List<T> buffer;
        final int count;
        long index;
        final int skip;

        final class BufferSkipProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 3428177408082367154L;

            BufferSkipProducer() {
            }

            @Override // p147rx.Producer
            public void request(long j4) {
                if (j4 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j4);
                }
                if (j4 != 0) {
                    BufferSkip bufferSkip = BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.request(BackpressureUtils.multiplyCap(j4, bufferSkip.skip));
                    } else {
                        bufferSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j4, bufferSkip.count), BackpressureUtils.multiplyCap(bufferSkip.skip - bufferSkip.count, j4 - 1)));
                    }
                }
            }
        }

        public BufferSkip(Subscriber<? super List<T>> subscriber, int i4, int i5) {
            this.actual = subscriber;
            this.count = i4;
            this.skip = i5;
            request(0L);
        }

        Producer createProducer() {
            return new BufferSkipProducer();
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            List<T> list = this.buffer;
            if (list != null) {
                this.buffer = null;
                this.actual.onNext(list);
            }
            this.actual.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.buffer = null;
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            long j4 = this.index;
            List arrayList = this.buffer;
            if (j4 == 0) {
                arrayList = new ArrayList(this.count);
                this.buffer = arrayList;
            }
            long j5 = j4 + 1;
            if (j5 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j5;
            }
            if (arrayList != null) {
                arrayList.add(t3);
                if (arrayList.size() == this.count) {
                    this.buffer = null;
                    this.actual.onNext(arrayList);
                }
            }
        }
    }

    public OperatorBufferWithSize(int i4, int i5) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        this.count = i4;
        this.skip = i5;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        int i4 = this.skip;
        int i5 = this.count;
        if (i4 == i5) {
            BufferExact bufferExact = new BufferExact(subscriber, i5);
            subscriber.add(bufferExact);
            subscriber.setProducer(bufferExact.createProducer());
            return bufferExact;
        }
        if (i4 > i5) {
            BufferSkip bufferSkip = new BufferSkip(subscriber, i5, i4);
            subscriber.add(bufferSkip);
            subscriber.setProducer(bufferSkip.createProducer());
            return bufferSkip;
        }
        BufferOverlap bufferOverlap = new BufferOverlap(subscriber, i5, i4);
        subscriber.add(bufferOverlap);
        subscriber.setProducer(bufferOverlap.createProducer());
        return bufferOverlap;
    }
}
