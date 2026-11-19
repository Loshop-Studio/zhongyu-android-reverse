package p147rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.functions.Action0;
import p147rx.internal.schedulers.ImmediateScheduler;
import p147rx.internal.schedulers.TrampolineScheduler;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.atomic.SpscAtomicArrayQueue;
import p147rx.internal.util.unsafe.SpscArrayQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;
import p147rx.plugins.RxJavaHooks;
import p147rx.schedulers.Schedulers;

/* loaded from: classes2.dex */
public final class OperatorObserveOn<T> implements Observable.Operator<T, T> {
    private final int bufferSize;
    private final boolean delayError;
    private final Scheduler scheduler;

    static final class ObserveOnSubscriber<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> child;
        final boolean delayError;
        long emitted;
        Throwable error;
        volatile boolean finished;
        final int limit;
        final Queue<Object> queue;
        final Scheduler.Worker recursiveScheduler;
        final AtomicLong requested = new AtomicLong();
        final AtomicLong counter = new AtomicLong();

        public ObserveOnSubscriber(Scheduler scheduler, Subscriber<? super T> subscriber, boolean z3, int i4) {
            this.child = subscriber;
            this.recursiveScheduler = scheduler.createWorker();
            this.delayError = z3;
            i4 = i4 <= 0 ? RxRingBuffer.SIZE : i4;
            this.limit = i4 - (i4 >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.queue = new SpscArrayQueue(i4);
            } else {
                this.queue = new SpscAtomicArrayQueue(i4);
            }
            request(i4);
        }

        @Override // p147rx.functions.Action0
        public void call() {
            long j4 = this.emitted;
            Queue<Object> queue = this.queue;
            Subscriber<? super T> subscriber = this.child;
            long jAddAndGet = 1;
            do {
                long jProduced = this.requested.get();
                while (jProduced != j4) {
                    boolean z3 = this.finished;
                    Object objPoll = queue.poll();
                    boolean z4 = objPoll == null;
                    if (checkTerminated(z3, z4, subscriber, queue)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                    j4++;
                    if (j4 == this.limit) {
                        jProduced = BackpressureUtils.produced(this.requested, j4);
                        request(j4);
                        j4 = 0;
                    }
                }
                if (jProduced == j4 && checkTerminated(this.finished, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                this.emitted = j4;
                jAddAndGet = this.counter.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<? super T> subscriber, Queue<Object> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z3) {
                return false;
            }
            if (this.delayError) {
                if (!z4) {
                    return false;
                }
                Throwable th = this.error;
                try {
                    if (th != null) {
                        subscriber.onError(th);
                    } else {
                        subscriber.onCompleted();
                    }
                    return false;
                } finally {
                }
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                queue.clear();
                try {
                    subscriber.onError(th2);
                    return true;
                } finally {
                }
            }
            if (!z4) {
                return false;
            }
            try {
                subscriber.onCompleted();
                return true;
            } finally {
            }
        }

        void init() {
            Subscriber<? super T> subscriber = this.child;
            subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber.1
                @Override // p147rx.Producer
                public void request(long j4) {
                    if (j4 > 0) {
                        BackpressureUtils.getAndAddRequest(ObserveOnSubscriber.this.requested, j4);
                        ObserveOnSubscriber.this.schedule();
                    }
                }
            });
            subscriber.add(this.recursiveScheduler);
            subscriber.add(this);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (isUnsubscribed() || this.finished) {
                return;
            }
            this.finished = true;
            schedule();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.finished) {
                RxJavaHooks.onError(th);
                return;
            }
            this.error = th;
            this.finished = true;
            schedule();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (isUnsubscribed() || this.finished) {
                return;
            }
            if (this.queue.offer(NotificationLite.next(t3))) {
                schedule();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        protected void schedule() {
            if (this.counter.getAndIncrement() == 0) {
                this.recursiveScheduler.schedule(this);
            }
        }
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z3) {
        this(scheduler, z3, RxRingBuffer.SIZE);
    }

    public static <T> Observable.Operator<T, T> rebatch(final int i4) {
        return new Observable.Operator<T, T>() { // from class: rx.internal.operators.OperatorObserveOn.1
            @Override // p147rx.functions.Func1
            public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
                ObserveOnSubscriber observeOnSubscriber = new ObserveOnSubscriber(Schedulers.immediate(), subscriber, false, i4);
                observeOnSubscriber.init();
                return observeOnSubscriber;
            }
        };
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z3, int i4) {
        this.scheduler = scheduler;
        this.delayError = z3;
        this.bufferSize = i4 <= 0 ? RxRingBuffer.SIZE : i4;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler scheduler = this.scheduler;
        if ((scheduler instanceof ImmediateScheduler) || (scheduler instanceof TrampolineScheduler)) {
            return subscriber;
        }
        ObserveOnSubscriber observeOnSubscriber = new ObserveOnSubscriber(scheduler, subscriber, this.delayError, this.bufferSize);
        observeOnSubscriber.init();
        return observeOnSubscriber;
    }
}
