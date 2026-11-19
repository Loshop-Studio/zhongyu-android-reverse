package p147rx.internal.operators;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.BackpressureOverflow;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.functions.Action0;
import p147rx.internal.util.BackpressureDrainManager;

/* loaded from: classes2.dex */
public class OperatorOnBackpressureBuffer<T> implements Observable.Operator<T, T> {
    private final Long capacity;
    private final Action0 onOverflow;
    private final BackpressureOverflow.Strategy overflowStrategy;

    static final class BufferSubscriber<T> extends Subscriber<T> implements BackpressureDrainManager.BackpressureQueueCallback {
        private final AtomicLong capacity;
        private final Subscriber<? super T> child;
        private final BackpressureDrainManager manager;
        private final Action0 onOverflow;
        private final BackpressureOverflow.Strategy overflowStrategy;
        private final ConcurrentLinkedQueue<Object> queue = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean saturated = new AtomicBoolean(false);

        public BufferSubscriber(Subscriber<? super T> subscriber, Long l3, Action0 action0, BackpressureOverflow.Strategy strategy) {
            this.child = subscriber;
            this.capacity = l3 != null ? new AtomicLong(l3.longValue()) : null;
            this.onOverflow = action0;
            this.manager = new BackpressureDrainManager(this);
            this.overflowStrategy = strategy;
        }

        private boolean assertCapacity() throws Throwable {
            long j4;
            if (this.capacity == null) {
                return true;
            }
            do {
                j4 = this.capacity.get();
                if (j4 <= 0) {
                    try {
                    } catch (MissingBackpressureException e4) {
                        if (this.saturated.compareAndSet(false, true)) {
                            unsubscribe();
                            this.child.onError(e4);
                        }
                    }
                    boolean z3 = this.overflowStrategy.mayAttemptDrop() && poll() != null;
                    Action0 action0 = this.onOverflow;
                    if (action0 != null) {
                        try {
                            action0.call();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.manager.terminateAndDrain(th);
                            return false;
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                }
            } while (!this.capacity.compareAndSet(j4, j4 - 1));
            return true;
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public boolean accept(Object obj) {
            return NotificationLite.accept(this.child, obj);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public void complete(Throwable th) {
            if (th != null) {
                this.child.onError(th);
            } else {
                this.child.onCompleted();
            }
        }

        protected Producer manager() {
            return this.manager;
        }

        @Override // p147rx.Observer
        public void onCompleted() throws Throwable {
            if (this.saturated.get()) {
                return;
            }
            this.manager.terminateAndDrain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) throws Throwable {
            if (this.saturated.get()) {
                return;
            }
            this.manager.terminateAndDrain(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) throws Throwable {
            if (assertCapacity()) {
                this.queue.offer(NotificationLite.next(t3));
                this.manager.drain();
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object peek() {
            return this.queue.peek();
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object poll() {
            Object objPoll = this.queue.poll();
            AtomicLong atomicLong = this.capacity;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    static final class Holder {
        static final OperatorOnBackpressureBuffer<?> INSTANCE = new OperatorOnBackpressureBuffer<>();

        Holder() {
        }
    }

    OperatorOnBackpressureBuffer() {
        this.capacity = null;
        this.onOverflow = null;
        this.overflowStrategy = BackpressureOverflow.ON_OVERFLOW_DEFAULT;
    }

    public static <T> OperatorOnBackpressureBuffer<T> instance() {
        return (OperatorOnBackpressureBuffer<T>) Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        BufferSubscriber bufferSubscriber = new BufferSubscriber(subscriber, this.capacity, this.onOverflow, this.overflowStrategy);
        subscriber.add(bufferSubscriber);
        subscriber.setProducer(bufferSubscriber.manager());
        return bufferSubscriber;
    }

    public OperatorOnBackpressureBuffer(long j4) {
        this(j4, null, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j4, Action0 action0) {
        this(j4, action0, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j4, Action0 action0, BackpressureOverflow.Strategy strategy) {
        if (j4 > 0) {
            Objects.requireNonNull(strategy, "The BackpressureOverflow strategy must not be null");
            this.capacity = Long.valueOf(j4);
            this.onOverflow = action0;
            this.overflowStrategy = strategy;
            return;
        }
        throw new IllegalArgumentException("Buffer capacity must be > 0");
    }
}
