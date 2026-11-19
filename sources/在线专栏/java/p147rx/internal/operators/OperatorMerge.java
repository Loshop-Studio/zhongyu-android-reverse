package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.CompositeException;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.exceptions.OnErrorThrowable;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.ScalarSynchronousObservable;
import p147rx.internal.util.atomic.SpscAtomicArrayQueue;
import p147rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import p147rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import p147rx.internal.util.unsafe.Pow2;
import p147rx.internal.util.unsafe.SpscArrayQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;
import p147rx.subscriptions.CompositeSubscription;

/* loaded from: classes2.dex */
public final class OperatorMerge<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean delayErrors;
    final int maxConcurrent;

    static final class HolderDelayErrors {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(true, Integer.MAX_VALUE);

        HolderDelayErrors() {
        }
    }

    static final class HolderNoDelay {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(false, Integer.MAX_VALUE);

        HolderNoDelay() {
        }
    }

    static final class InnerSubscriber<T> extends Subscriber<T> {
        static final int LIMIT = RxRingBuffer.SIZE / 4;
        volatile boolean done;

        /* renamed from: id */
        final long f11783id;
        int outstanding;
        final MergeSubscriber<T> parent;
        volatile RxRingBuffer queue;

        public InnerSubscriber(MergeSubscriber<T> mergeSubscriber, long j4) {
            this.parent = mergeSubscriber;
            this.f11783id = j4;
        }

        @Override // p147rx.Observer
        public void onCompleted() throws Throwable {
            this.done = true;
            this.parent.emit();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) throws Throwable {
            this.parent.getOrCreateErrorQueue().offer(th);
            this.done = true;
            this.parent.emit();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) throws Throwable {
            this.parent.tryEmit(this, t3);
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            int i4 = RxRingBuffer.SIZE;
            this.outstanding = i4;
            request(i4);
        }

        public void requestMore(long j4) {
            int i4 = this.outstanding - ((int) j4);
            if (i4 > LIMIT) {
                this.outstanding = i4;
                return;
            }
            int i5 = RxRingBuffer.SIZE;
            this.outstanding = i5;
            int i6 = i5 - i4;
            if (i6 > 0) {
                request(i6);
            }
        }
    }

    static final class MergeProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final MergeSubscriber<T> subscriber;

        public MergeProducer(MergeSubscriber<T> mergeSubscriber) {
            this.subscriber = mergeSubscriber;
        }

        public long produced(int i4) {
            return addAndGet(-i4);
        }

        @Override // p147rx.Producer
        public void request(long j4) throws Throwable {
            if (j4 <= 0) {
                if (j4 < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                BackpressureUtils.getAndAddRequest(this, j4);
                this.subscriber.emit();
            }
        }
    }

    static final class MergeSubscriber<T> extends Subscriber<Observable<? extends T>> {
        static final InnerSubscriber<?>[] EMPTY = new InnerSubscriber[0];
        final Subscriber<? super T> child;
        final boolean delayErrors;
        volatile boolean done;
        boolean emitting;
        volatile ConcurrentLinkedQueue<Throwable> errors;
        final Object innerGuard = new Object();
        volatile InnerSubscriber<?>[] innerSubscribers = EMPTY;
        long lastId;
        int lastIndex;
        final int maxConcurrent;
        boolean missed;
        MergeProducer<T> producer;
        volatile Queue<Object> queue;
        int scalarEmissionCount;
        final int scalarEmissionLimit;
        volatile CompositeSubscription subscriptions;
        long uniqueId;

        public MergeSubscriber(Subscriber<? super T> subscriber, boolean z3, int i4) {
            this.child = subscriber;
            this.delayErrors = z3;
            this.maxConcurrent = i4;
            if (i4 == Integer.MAX_VALUE) {
                this.scalarEmissionLimit = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.scalarEmissionLimit = Math.max(1, i4 >> 1);
                request(i4);
            }
        }

        private void reportError() {
            ArrayList arrayList = new ArrayList(this.errors);
            if (arrayList.size() == 1) {
                this.child.onError((Throwable) arrayList.get(0));
            } else {
                this.child.onError(new CompositeException(arrayList));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void addInner(InnerSubscriber<T> innerSubscriber) {
            getOrCreateComposite().add(innerSubscriber);
            synchronized (this.innerGuard) {
                InnerSubscriber<?>[] innerSubscriberArr = this.innerSubscribers;
                int length = innerSubscriberArr.length;
                InnerSubscriber<?>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
                this.innerSubscribers = innerSubscriberArr2;
            }
        }

        boolean checkTerminate() {
            if (this.child.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.errors;
            if (this.delayErrors || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                reportError();
                return true;
            } finally {
                unsubscribe();
            }
        }

        void emit() throws Throwable {
            synchronized (this) {
                if (this.emitting) {
                    this.missed = true;
                } else {
                    this.emitting = true;
                    emitLoop();
                }
            }
        }

        void emitEmpty() {
            int i4 = this.scalarEmissionCount + 1;
            if (i4 != this.scalarEmissionLimit) {
                this.scalarEmissionCount = i4;
            } else {
                this.scalarEmissionCount = 0;
                requestMore(i4);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        
            if (r7 <= 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
        
            if (r10 == false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        
            r16 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
        
            r16 = r22.producer.produced(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        
            if (r16 == 0) goto L196;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        
            if (r0 != null) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:159:0x019b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void emitLoop() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.MergeSubscriber.emitLoop():void");
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void emitScalar(rx.internal.operators.OperatorMerge.InnerSubscriber<T> r5, T r6, long r7) throws java.lang.Throwable {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.Subscriber<? super T> r2 = r4.child     // Catch: java.lang.Throwable -> L8
                r2.onNext(r6)     // Catch: java.lang.Throwable -> L8
                goto L20
            L8:
                r6 = move-exception
                boolean r2 = r4.delayErrors     // Catch: java.lang.Throwable -> L46
                if (r2 != 0) goto L19
                p147rx.exceptions.Exceptions.throwIfFatal(r6)     // Catch: java.lang.Throwable -> L46
                r5.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r5.onError(r6)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r5 = move-exception
                goto L48
            L19:
                java.util.Queue r2 = r4.getOrCreateErrorQueue()     // Catch: java.lang.Throwable -> L46
                r2.offer(r6)     // Catch: java.lang.Throwable -> L46
            L20:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L2e
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r4.producer     // Catch: java.lang.Throwable -> L46
                r6.produced(r0)     // Catch: java.lang.Throwable -> L46
            L2e:
                r6 = 1
                r5.requestMore(r6)     // Catch: java.lang.Throwable -> L46
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L46
                boolean r5 = r4.missed     // Catch: java.lang.Throwable -> L43
                if (r5 != 0) goto L3c
                r4.emitting = r1     // Catch: java.lang.Throwable -> L43
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                return
            L3c:
                r4.missed = r1     // Catch: java.lang.Throwable -> L43
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                r4.emitLoop()
                return
            L43:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                throw r5     // Catch: java.lang.Throwable -> L17
            L46:
                r5 = move-exception
                r0 = 0
            L48:
                if (r0 != 0) goto L52
                monitor-enter(r4)
                r4.emitting = r1     // Catch: java.lang.Throwable -> L4f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                goto L52
            L4f:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                throw r5
            L52:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.MergeSubscriber.emitScalar(rx.internal.operators.OperatorMerge$InnerSubscriber, java.lang.Object, long):void");
        }

        CompositeSubscription getOrCreateComposite() {
            CompositeSubscription compositeSubscription;
            CompositeSubscription compositeSubscription2 = this.subscriptions;
            if (compositeSubscription2 != null) {
                return compositeSubscription2;
            }
            boolean z3 = false;
            synchronized (this) {
                compositeSubscription = this.subscriptions;
                if (compositeSubscription == null) {
                    CompositeSubscription compositeSubscription3 = new CompositeSubscription();
                    this.subscriptions = compositeSubscription3;
                    compositeSubscription = compositeSubscription3;
                    z3 = true;
                }
            }
            if (z3) {
                add(compositeSubscription);
            }
            return compositeSubscription;
        }

        Queue<Throwable> getOrCreateErrorQueue() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.errors;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.errors;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.errors = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        @Override // p147rx.Observer
        public void onCompleted() throws Throwable {
            this.done = true;
            emit();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) throws Throwable {
            getOrCreateErrorQueue().offer(th);
            this.done = true;
            emit();
        }

        protected void queueScalar(InnerSubscriber<T> innerSubscriber, T t3) throws Throwable {
            RxRingBuffer spscInstance = innerSubscriber.queue;
            if (spscInstance == null) {
                spscInstance = RxRingBuffer.getSpscInstance();
                innerSubscriber.add(spscInstance);
                innerSubscriber.queue = spscInstance;
            }
            try {
                spscInstance.onNext(NotificationLite.next(t3));
            } catch (IllegalStateException e4) {
                if (innerSubscriber.isUnsubscribed()) {
                    return;
                }
                innerSubscriber.unsubscribe();
                innerSubscriber.onError(e4);
            } catch (MissingBackpressureException e5) {
                innerSubscriber.unsubscribe();
                innerSubscriber.onError(e5);
            }
        }

        void removeInner(InnerSubscriber<T> innerSubscriber) {
            RxRingBuffer rxRingBuffer = innerSubscriber.queue;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.subscriptions.remove(innerSubscriber);
            synchronized (this.innerGuard) {
                InnerSubscriber<?>[] innerSubscriberArr = this.innerSubscribers;
                int length = innerSubscriberArr.length;
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (innerSubscriber.equals(innerSubscriberArr[i5])) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    this.innerSubscribers = EMPTY;
                    return;
                }
                InnerSubscriber<?>[] innerSubscriberArr2 = new InnerSubscriber[length - 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, i4);
                System.arraycopy(innerSubscriberArr, i4 + 1, innerSubscriberArr2, i4, (length - i4) - 1);
                this.innerSubscribers = innerSubscriberArr2;
            }
        }

        public void requestMore(long j4) {
            request(j4);
        }

        void tryEmit(InnerSubscriber<T> innerSubscriber, T t3) throws Throwable {
            long j4 = this.producer.get();
            boolean z3 = false;
            if (j4 != 0) {
                synchronized (this) {
                    j4 = this.producer.get();
                    if (!this.emitting && j4 != 0) {
                        this.emitting = true;
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                queueScalar(innerSubscriber, t3);
                emit();
                return;
            }
            RxRingBuffer rxRingBuffer = innerSubscriber.queue;
            if (rxRingBuffer == null || rxRingBuffer.isEmpty()) {
                emitScalar(innerSubscriber, t3, j4);
            } else {
                queueScalar(innerSubscriber, t3);
                emitLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p147rx.Observer
        public void onNext(Observable<? extends T> observable) throws Throwable {
            if (observable == null) {
                return;
            }
            if (observable == Observable.empty()) {
                emitEmpty();
                return;
            }
            if (observable instanceof ScalarSynchronousObservable) {
                tryEmit(((ScalarSynchronousObservable) observable).get());
                return;
            }
            long j4 = this.uniqueId;
            this.uniqueId = 1 + j4;
            InnerSubscriber innerSubscriber = new InnerSubscriber(this, j4);
            addInner(innerSubscriber);
            observable.unsafeSubscribe(innerSubscriber);
            emit();
        }

        protected void queueScalar(T t3) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> spscUnboundedAtomicArrayQueue = this.queue;
            if (spscUnboundedAtomicArrayQueue == null) {
                int i4 = this.maxConcurrent;
                if (i4 == Integer.MAX_VALUE) {
                    spscUnboundedAtomicArrayQueue = new SpscUnboundedAtomicArrayQueue<>(RxRingBuffer.SIZE);
                } else {
                    if (Pow2.isPowerOfTwo(i4)) {
                        if (UnsafeAccess.isUnsafeAvailable()) {
                            spscExactAtomicArrayQueue = new SpscArrayQueue<>(i4);
                        } else {
                            spscExactAtomicArrayQueue = new SpscAtomicArrayQueue<>(i4);
                        }
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i4);
                    }
                    spscUnboundedAtomicArrayQueue = spscExactAtomicArrayQueue;
                }
                this.queue = spscUnboundedAtomicArrayQueue;
            }
            if (spscUnboundedAtomicArrayQueue.offer(NotificationLite.next(t3))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t3));
        }

        void tryEmit(T t3) throws Throwable {
            long j4 = this.producer.get();
            boolean z3 = false;
            if (j4 != 0) {
                synchronized (this) {
                    j4 = this.producer.get();
                    if (!this.emitting && j4 != 0) {
                        this.emitting = true;
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Queue<Object> queue = this.queue;
                if (queue != null && !queue.isEmpty()) {
                    queueScalar(t3);
                    emitLoop();
                    return;
                } else {
                    emitScalar(t3, j4);
                    return;
                }
            }
            queueScalar(t3);
            emit();
        }

        protected void emitScalar(T t3, long j4) throws Throwable {
            boolean z3 = true;
            try {
                try {
                    try {
                        this.child.onNext(t3);
                    } catch (Throwable th) {
                        th = th;
                        z3 = false;
                        if (!z3) {
                            synchronized (this) {
                                this.emitting = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (!this.delayErrors) {
                        Exceptions.throwIfFatal(th2);
                        unsubscribe();
                        onError(th2);
                        return;
                    }
                    getOrCreateErrorQueue().offer(th2);
                }
                if (j4 != Long.MAX_VALUE) {
                    this.producer.produced(1);
                }
                int i4 = this.scalarEmissionCount + 1;
                if (i4 == this.scalarEmissionLimit) {
                    this.scalarEmissionCount = 0;
                    requestMore(i4);
                } else {
                    this.scalarEmissionCount = i4;
                }
                synchronized (this) {
                    if (!this.missed) {
                        this.emitting = false;
                    } else {
                        this.missed = false;
                        emitLoop();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    OperatorMerge(boolean z3, int i4) {
        this.delayErrors = z3;
        this.maxConcurrent = i4;
    }

    public static <T> OperatorMerge<T> instance(boolean z3) {
        return z3 ? (OperatorMerge<T>) HolderDelayErrors.INSTANCE : (OperatorMerge<T>) HolderNoDelay.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        MergeSubscriber mergeSubscriber = new MergeSubscriber(subscriber, this.delayErrors, this.maxConcurrent);
        MergeProducer<T> mergeProducer = new MergeProducer<>(mergeSubscriber);
        mergeSubscriber.producer = mergeProducer;
        subscriber.add(mergeSubscriber);
        subscriber.setProducer(mergeProducer);
        return mergeSubscriber;
    }

    public static <T> OperatorMerge<T> instance(boolean z3, int i4) {
        if (i4 > 0) {
            if (i4 == Integer.MAX_VALUE) {
                return instance(z3);
            }
            return new OperatorMerge<>(z3, i4);
        }
        throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i4);
    }
}
