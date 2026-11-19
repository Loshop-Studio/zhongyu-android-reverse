package p147rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.internal.operators.BackpressureUtils;
import p147rx.plugins.RxJavaHooks;
import p147rx.schedulers.Schedulers;

/* loaded from: classes2.dex */
public final class ReplaySubject<T> extends Subject<T, T> {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    final ReplayState<T> state;

    interface ReplayBuffer<T> {
        void complete();

        void drain(ReplayProducer<T> replayProducer);

        Throwable error();

        void error(Throwable th);

        boolean isComplete();

        boolean isEmpty();

        T last();

        void next(T t3);

        int size();

        T[] toArray(T[] tArr);
    }

    static final class ReplayProducer<T> extends AtomicInteger implements Producer, Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        final Subscriber<? super T> actual;
        int index;
        Object node;
        final AtomicLong requested = new AtomicLong();
        final ReplayState<T> state;
        int tailIndex;

        public ReplayProducer(Subscriber<? super T> subscriber, ReplayState<T> replayState) {
            this.actual = subscriber;
            this.state = replayState;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 > 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j4);
                this.state.buffer.drain(this);
            } else {
                if (j4 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= required but it was " + j4);
            }
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final ReplayBuffer<T> buffer;

        public ReplayState(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
            lazySet(EMPTY);
        }

        boolean add(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == TERMINATED) {
                    return false;
                }
                int length = replayProducerArr.length;
                replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
            return true;
        }

        boolean isTerminated() {
            return get() == TERMINATED;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.complete();
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                replayBuffer.drain(replayProducer);
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.error(th);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                try {
                    replayBuffer.drain(replayProducer);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            ReplayBuffer<T> replayBuffer = this.buffer;
            replayBuffer.next(t3);
            for (ReplayProducer<T> replayProducer : get()) {
                replayBuffer.drain(replayProducer);
            }
        }

        void remove(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == TERMINATED || replayProducerArr == EMPTY) {
                    return;
                }
                int length = replayProducerArr.length;
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (replayProducerArr[i5] == replayProducer) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    replayProducerArr2 = EMPTY;
                } else {
                    ReplayProducer[] replayProducerArr3 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr3, 0, i4);
                    System.arraycopy(replayProducerArr, i4 + 1, replayProducerArr3, i4, (length - i4) - 1);
                    replayProducerArr2 = replayProducerArr3;
                }
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(subscriber, this);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (add(replayProducer) && replayProducer.isUnsubscribed()) {
                remove(replayProducer);
            } else {
                this.buffer.drain(replayProducer);
            }
        }
    }

    ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.state = replayState;
    }

    public static <T> ReplaySubject<T> create() {
        return create(16);
    }

    static <T> ReplaySubject<T> createUnbounded() {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(Integer.MAX_VALUE)));
    }

    static <T> ReplaySubject<T> createUnboundedTime() {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(Integer.MAX_VALUE, Long.MAX_VALUE, Schedulers.immediate())));
    }

    public static <T> ReplaySubject<T> createWithSize(int i4) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i4)));
    }

    public static <T> ReplaySubject<T> createWithTime(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        return createWithTimeAndSize(j4, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public static <T> ReplaySubject<T> createWithTimeAndSize(long j4, TimeUnit timeUnit, int i4, Scheduler scheduler) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(i4, timeUnit.toMillis(j4), scheduler)));
    }

    public Throwable getThrowable() {
        if (this.state.isTerminated()) {
            return this.state.buffer.error();
        }
        return null;
    }

    public T getValue() {
        return this.state.buffer.last();
    }

    public T[] getValues(T[] tArr) {
        return this.state.buffer.toArray(tArr);
    }

    public boolean hasAnyValue() {
        return !this.state.buffer.isEmpty();
    }

    public boolean hasCompleted() {
        return this.state.isTerminated() && this.state.buffer.error() == null;
    }

    @Override // p147rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.state.isTerminated() && this.state.buffer.error() != null;
    }

    public boolean hasValue() {
        return hasAnyValue();
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.state.onCompleted();
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.state.onError(th);
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        this.state.onNext(t3);
    }

    public int size() {
        return this.state.buffer.size();
    }

    int subscriberCount() {
        return this.state.get().length;
    }

    static final class ReplaySizeBoundBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile Node<T> head;
        final int limit;
        int size;
        Node<T> tail;

        static final class Node<T> extends AtomicReference<Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T value;

            public Node(T t3) {
                this.value = t3;
            }
        }

        public ReplaySizeBoundBuffer(int i4) {
            this.limit = i4;
            Node<T> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        
            if (r10 != r5) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        
            if (r2.isUnsubscribed() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        
            r18.node = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
        
            r3 = r17.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
        
            if (r7.get() != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
        
            if (r3 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
        
            if (r12 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
        
            r18.node = null;
            r1 = r17.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
        
            if (r1 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
        
            if (r10 == 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
        
            if (r5 == Long.MAX_VALUE) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
        
            p147rx.internal.operators.BackpressureUtils.produced(r18.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
        
            r18.node = r7;
            r4 = r18.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
        
            return;
         */
        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drain(rx.subjects.ReplaySubject.ReplayProducer<T> r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r18.getAndIncrement()
                if (r2 == 0) goto Lb
                return
            Lb:
                rx.Subscriber<? super T> r2 = r1.actual
                r4 = 1
            Le:
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r5 = r5.get()
                java.lang.Object r7 = r1.node
                rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node r7 = (rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node) r7
                r8 = 0
                if (r7 != 0) goto L1e
                rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node<T> r7 = r0.head
            L1e:
                r10 = r8
            L1f:
                r12 = 0
                r13 = 0
                int r14 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r14 == 0) goto L5e
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L2e
                r1.node = r13
                return
            L2e:
                boolean r15 = r0.done
                java.lang.Object r16 = r7.get()
                r3 = r16
                rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node r3 = (rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node) r3
                if (r3 != 0) goto L3d
                r16 = 1
                goto L3f
            L3d:
                r16 = 0
            L3f:
                if (r15 == 0) goto L51
                if (r16 == 0) goto L51
                r1.node = r13
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L4d
                r2.onError(r1)
                goto L50
            L4d:
                r2.onCompleted()
            L50:
                return
            L51:
                if (r16 == 0) goto L54
                goto L5e
            L54:
                T r7 = r3.value
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L1f
            L5e:
                if (r14 != 0) goto L84
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L69
                r1.node = r13
                return
            L69:
                boolean r3 = r0.done
                java.lang.Object r14 = r7.get()
                if (r14 != 0) goto L72
                r12 = 1
            L72:
                if (r3 == 0) goto L84
                if (r12 == 0) goto L84
                r1.node = r13
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L80
                r2.onError(r1)
                goto L83
            L80:
                r2.onCompleted()
            L83:
                return
            L84:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L96
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L96
                java.util.concurrent.atomic.AtomicLong r3 = r1.requested
                p147rx.internal.operators.BackpressureUtils.produced(r3, r10)
            L96:
                r1.node = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Le
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.drain(rx.subjects.ReplaySubject$ReplayProducer):void");
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void error(Throwable th) {
            this.error = th;
            this.done = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isComplete() {
            return this.done;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isEmpty() {
            return this.head.get() == null;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T last() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void next(T t3) {
            Node<T> node = new Node<>(t3);
            this.tail.set(node);
            this.tail = node;
            int i4 = this.size;
            if (i4 == this.limit) {
                this.head = this.head.get();
            } else {
                this.size = i4 + 1;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            Node<T> node = this.head.get();
            int i4 = 0;
            while (node != null && i4 != Integer.MAX_VALUE) {
                node = node.get();
                i4++;
            }
            return i4;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (Node<T> node = this.head.get(); node != null; node = node.get()) {
                arrayList.add(node.value);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public Throwable error() {
            return this.error;
        }
    }

    public static <T> ReplaySubject<T> create(int i4) {
        if (i4 > 0) {
            return new ReplaySubject<>(new ReplayState(new ReplayUnboundedBuffer(i4)));
        }
        throw new IllegalArgumentException("capacity > 0 required but it was " + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    static final class ReplaySizeAndTimeBoundBuffer<T> implements ReplayBuffer<T> {
        volatile boolean done;
        Throwable error;
        volatile TimedNode<T> head;
        final int limit;
        final long maxAgeMillis;
        final Scheduler scheduler;
        int size;
        TimedNode<T> tail;

        static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final long timestamp;
            final T value;

            public TimedNode(T t3, long j4) {
                this.value = t3;
                this.timestamp = j4;
            }
        }

        public ReplaySizeAndTimeBoundBuffer(int i4, long j4, Scheduler scheduler) {
            this.limit = i4;
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
            this.maxAgeMillis = j4;
            this.scheduler = scheduler;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void complete() {
            evictFinal();
            this.done = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            if (r10 != r5) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        
            if (r2.isUnsubscribed() == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            r18.node = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        
            r3 = r17.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
        
            if (r7.get() != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
        
            if (r3 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
        
            if (r12 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
        
            r18.node = null;
            r1 = r17.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
        
            if (r1 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
        
            if (r10 == 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
        
            if (r5 == Long.MAX_VALUE) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
        
            p147rx.internal.operators.BackpressureUtils.produced(r18.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
        
            r18.node = r7;
            r4 = r18.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
        
            return;
         */
        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drain(rx.subjects.ReplaySubject.ReplayProducer<T> r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r18.getAndIncrement()
                if (r2 == 0) goto Lb
                return
            Lb:
                rx.Subscriber<? super T> r2 = r1.actual
                r4 = 1
            Le:
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r5 = r5.get()
                java.lang.Object r7 = r1.node
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r7 = (rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode) r7
                r8 = 0
                if (r7 != 0) goto L20
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r7 = r17.latestHead()
            L20:
                r10 = r8
            L21:
                r12 = 0
                r13 = 0
                int r14 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r14 == 0) goto L60
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L30
                r1.node = r13
                return
            L30:
                boolean r15 = r0.done
                java.lang.Object r16 = r7.get()
                r3 = r16
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r3 = (rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode) r3
                if (r3 != 0) goto L3f
                r16 = 1
                goto L41
            L3f:
                r16 = 0
            L41:
                if (r15 == 0) goto L53
                if (r16 == 0) goto L53
                r1.node = r13
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L4f
                r2.onError(r1)
                goto L52
            L4f:
                r2.onCompleted()
            L52:
                return
            L53:
                if (r16 == 0) goto L56
                goto L60
            L56:
                T r7 = r3.value
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L21
            L60:
                if (r14 != 0) goto L86
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L6b
                r1.node = r13
                return
            L6b:
                boolean r3 = r0.done
                java.lang.Object r14 = r7.get()
                if (r14 != 0) goto L74
                r12 = 1
            L74:
                if (r3 == 0) goto L86
                if (r12 == 0) goto L86
                r1.node = r13
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L82
                r2.onError(r1)
                goto L85
            L82:
                r2.onCompleted()
            L85:
                return
            L86:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L98
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L98
                java.util.concurrent.atomic.AtomicLong r3 = r1.requested
                p147rx.internal.operators.BackpressureUtils.produced(r3, r10)
            L98:
                r1.node = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Le
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.drain(rx.subjects.ReplaySubject$ReplayProducer):void");
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void error(Throwable th) {
            evictFinal();
            this.error = th;
            this.done = true;
        }

        void evictFinal() {
            long jNow = this.scheduler.now() - this.maxAgeMillis;
            TimedNode<T> timedNode = this.head;
            TimedNode<T> timedNode2 = timedNode;
            while (true) {
                TimedNode<T> timedNode3 = timedNode2.get();
                if (timedNode3 == null || timedNode3.timestamp > jNow) {
                    break;
                } else {
                    timedNode2 = timedNode3;
                }
            }
            if (timedNode != timedNode2) {
                this.head = timedNode2;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isComplete() {
            return this.done;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isEmpty() {
            return latestHead().get() == null;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T last() {
            TimedNode<T> timedNodeLatestHead = latestHead();
            while (true) {
                TimedNode<T> timedNode = timedNodeLatestHead.get();
                if (timedNode == null) {
                    return timedNodeLatestHead.value;
                }
                timedNodeLatestHead = timedNode;
            }
        }

        TimedNode<T> latestHead() {
            long jNow = this.scheduler.now() - this.maxAgeMillis;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null || timedNode2.timestamp > jNow) {
                    break;
                }
                timedNode = timedNode2;
            }
            return timedNode;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void next(T t3) {
            TimedNode<T> timedNode;
            long jNow = this.scheduler.now();
            TimedNode<T> timedNode2 = new TimedNode<>(t3, jNow);
            this.tail.set(timedNode2);
            this.tail = timedNode2;
            long j4 = jNow - this.maxAgeMillis;
            int i4 = this.size;
            TimedNode<T> timedNode3 = this.head;
            if (i4 == this.limit) {
                timedNode = timedNode3.get();
            } else {
                i4++;
                timedNode = timedNode3;
            }
            while (true) {
                TimedNode<T> timedNode4 = timedNode.get();
                if (timedNode4 == null || timedNode4.timestamp > j4) {
                    break;
                }
                i4--;
                timedNode = timedNode4;
            }
            this.size = i4;
            if (timedNode != timedNode3) {
                this.head = timedNode;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            TimedNode<T> timedNode = latestHead().get();
            int i4 = 0;
            while (timedNode != null && i4 != Integer.MAX_VALUE) {
                timedNode = timedNode.get();
                i4++;
            }
            return i4;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (TimedNode<T> timedNode = latestHead().get(); timedNode != null; timedNode = timedNode.get()) {
                arrayList.add(timedNode.value);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public Throwable error() {
            return this.error;
        }
    }

    static final class ReplayUnboundedBuffer<T> implements ReplayBuffer<T> {
        final int capacity;
        volatile boolean done;
        Throwable error;
        final Object[] head;
        volatile int size;
        Object[] tail;
        int tailIndex;

        public ReplayUnboundedBuffer(int i4) {
            this.capacity = i4;
            Object[] objArr = new Object[i4 + 1];
            this.head = objArr;
            this.tail = objArr;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void drain(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replayProducer.actual;
            int i4 = this.capacity;
            int iAddAndGet = 1;
            do {
                long j4 = replayProducer.requested.get();
                Object[] objArr = (Object[]) replayProducer.node;
                if (objArr == null) {
                    objArr = this.head;
                }
                int i5 = replayProducer.tailIndex;
                int i6 = replayProducer.index;
                long j5 = 0;
                while (j5 != j4) {
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z3 = this.done;
                    boolean z4 = i6 == this.size;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th = this.error;
                        if (th != null) {
                            subscriber.onError(th);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z4) {
                        break;
                    }
                    if (i5 == i4) {
                        objArr = (Object[]) objArr[i5];
                        i5 = 0;
                    }
                    subscriber.onNext(objArr[i5]);
                    j5++;
                    i5++;
                    i6++;
                }
                if (j5 == j4) {
                    if (subscriber.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z5 = this.done;
                    boolean z6 = i6 == this.size;
                    if (z5 && z6) {
                        replayProducer.node = null;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j5 != 0 && j4 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(replayProducer.requested, j5);
                }
                replayProducer.index = i6;
                replayProducer.tailIndex = i5;
                replayProducer.node = objArr;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void error(Throwable th) {
            if (this.done) {
                RxJavaHooks.onError(th);
            } else {
                this.error = th;
                this.done = true;
            }
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isComplete() {
            return this.done;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public boolean isEmpty() {
            return this.size == 0;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T last() {
            int i4 = this.size;
            if (i4 == 0) {
                return null;
            }
            Object[] objArr = this.head;
            int i5 = this.capacity;
            while (i4 >= i5) {
                objArr = (Object[]) objArr[i5];
                i4 -= i5;
            }
            return (T) objArr[i4 - 1];
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public void next(T t3) {
            if (this.done) {
                return;
            }
            int i4 = this.tailIndex;
            Object[] objArr = this.tail;
            if (i4 == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t3;
                this.tailIndex = 1;
                objArr[i4] = objArr2;
                this.tail = objArr2;
            } else {
                objArr[i4] = t3;
                this.tailIndex = i4 + 1;
            }
            this.size++;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public int size() {
            return this.size;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public T[] toArray(T[] tArr) {
            int i4 = this.size;
            if (tArr.length < i4) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
            }
            Object[] objArr = this.head;
            int i5 = this.capacity;
            int i6 = 0;
            while (true) {
                int i7 = i6 + i5;
                if (i7 >= i4) {
                    break;
                }
                System.arraycopy(objArr, 0, tArr, i6, i5);
                objArr = objArr[i5];
                i6 = i7;
            }
            System.arraycopy(objArr, 0, tArr, i6, i4 - i6);
            if (tArr.length > i4) {
                tArr[i4] = null;
            }
            return tArr;
        }

        @Override // rx.subjects.ReplaySubject.ReplayBuffer
        public Throwable error() {
            return this.error;
        }
    }
}
