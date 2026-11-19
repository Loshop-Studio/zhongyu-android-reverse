package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.CompositeException;
import p147rx.functions.FuncN;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.atomic.SpscLinkedArrayQueue;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OnSubscribeCombineLatest<T, R> implements Observable.OnSubscribe<R> {
    final int bufferSize;
    final FuncN<? extends R> combiner;
    final boolean delayError;
    final Observable<? extends T>[] sources;
    final Iterable<? extends Observable<? extends T>> sourcesIterable;

    static final class CombinerSubscriber<T, R> extends Subscriber<T> {
        boolean done;
        final int index;
        final LatestCoordinator<T, R> parent;

        public CombinerSubscriber(LatestCoordinator<T, R> latestCoordinator, int i4) {
            this.parent = latestCoordinator;
            this.index = i4;
            request(latestCoordinator.bufferSize);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.combine(null, this.index);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaHooks.onError(th);
                return;
            }
            this.parent.onError(th);
            this.done = true;
            this.parent.combine(null, this.index);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.done) {
                return;
            }
            this.parent.combine(NotificationLite.next(t3), this.index);
        }

        public void requestMore(long j4) {
            request(j4);
        }
    }

    static final class LatestCoordinator<T, R> extends AtomicInteger implements Producer, Subscription {
        static final Object MISSING = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final Subscriber<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final FuncN<? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombinerSubscriber<T, R>[] subscribers;

        public LatestCoordinator(Subscriber<? super R> subscriber, FuncN<? extends R> funcN, int i4, int i5, boolean z3) {
            this.actual = subscriber;
            this.combiner = funcN;
            this.bufferSize = i5;
            this.delayError = z3;
            Object[] objArr = new Object[i4];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new CombinerSubscriber[i4];
            this.queue = new SpscLinkedArrayQueue<>(i5);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
        }

        void cancel(Queue<?> queue) {
            queue.clear();
            for (CombinerSubscriber<T, R> combinerSubscriber : this.subscribers) {
                combinerSubscriber.unsubscribe();
            }
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<?> subscriber, Queue<?> queue, boolean z5) {
            if (this.cancelled) {
                cancel(queue);
                return true;
            }
            if (!z3) {
                return false;
            }
            if (z5) {
                if (!z4) {
                    return false;
                }
                Throwable th = this.error.get();
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.error.get();
            if (th2 != null) {
                cancel(queue);
                subscriber.onError(th2);
                return true;
            }
            if (!z4) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        void combine(Object obj, int i4) {
            boolean z3;
            CombinerSubscriber<T, R> combinerSubscriber = this.subscribers[i4];
            synchronized (this) {
                Object[] objArr = this.latest;
                int length = objArr.length;
                Object obj2 = objArr[i4];
                int i5 = this.active;
                Object obj3 = MISSING;
                if (obj2 == obj3) {
                    i5++;
                    this.active = i5;
                }
                int i6 = this.complete;
                if (obj == null) {
                    i6++;
                    this.complete = i6;
                } else {
                    objArr[i4] = NotificationLite.getValue(obj);
                }
                boolean z4 = false;
                z3 = i5 == length;
                if (i6 == length || (obj == null && obj2 == obj3)) {
                    z4 = true;
                }
                if (z4) {
                    this.done = true;
                } else if (obj != null && z3) {
                    this.queue.offer(combinerSubscriber, this.latest.clone());
                } else if (obj == null && this.error.get() != null && (obj2 == obj3 || !this.delayError)) {
                    this.done = true;
                }
            }
            if (z3 || obj == null) {
                drain();
            } else {
                combinerSubscriber.requestMore(1L);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        
            if (r3 == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        
            if (r13 == Long.MAX_VALUE) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            p147rx.internal.operators.BackpressureUtils.produced(r10, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        
            r12 = addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        
            if (r12 != 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drain() {
            /*
                r19 = this;
                r7 = r19
                int r0 = r19.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                rx.internal.util.atomic.SpscLinkedArrayQueue<java.lang.Object> r8 = r7.queue
                rx.Subscriber<? super R> r9 = r7.actual
                boolean r0 = r7.delayError
                java.util.concurrent.atomic.AtomicLong r10 = r7.requested
                r11 = 1
                r12 = 1
            L13:
                boolean r2 = r7.done
                boolean r3 = r8.isEmpty()
                r1 = r19
                r4 = r9
                r5 = r8
                r6 = r0
                boolean r1 = r1.checkTerminated(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L25
                return
            L25:
                long r13 = r10.get()
                r5 = 0
            L2b:
                int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r1 == 0) goto L8e
                boolean r2 = r7.done
                java.lang.Object r1 = r8.peek()
                r4 = r1
                rx.internal.operators.OnSubscribeCombineLatest$CombinerSubscriber r4 = (rx.internal.operators.OnSubscribeCombineLatest.CombinerSubscriber) r4
                if (r4 != 0) goto L3d
                r16 = 1
                goto L40
            L3d:
                r1 = 0
                r16 = 0
            L40:
                r1 = r19
                r3 = r16
                r15 = r4
                r4 = r9
                r17 = r5
                r5 = r8
                r6 = r0
                boolean r1 = r1.checkTerminated(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L51
                return
            L51:
                if (r16 == 0) goto L56
                r3 = r17
                goto L8f
            L56:
                r8.poll()
                java.lang.Object r1 = r8.poll()
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                if (r1 != 0) goto L71
                r7.cancelled = r11
                r7.cancel(r8)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Broken queue?! Sender received but not the array."
                r0.<init>(r1)
                r9.onError(r0)
                return
            L71:
                rx.functions.FuncN<? extends R> r2 = r7.combiner     // Catch: java.lang.Throwable -> L84
                java.lang.Object r1 = r2.call(r1)     // Catch: java.lang.Throwable -> L84
                r9.onNext(r1)
                r1 = 1
                r15.requestMore(r1)
                r3 = r17
                long r5 = r3 + r1
                goto L2b
            L84:
                r0 = move-exception
                r7.cancelled = r11
                r7.cancel(r8)
                r9.onError(r0)
                return
            L8e:
                r3 = r5
            L8f:
                r1 = 0
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto La1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r5 == 0) goto La1
                p147rx.internal.operators.BackpressureUtils.produced(r10, r3)
            La1:
                int r1 = -r12
                int r12 = r7.addAndGet(r1)
                if (r12 != 0) goto L13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeCombineLatest.LatestCoordinator.drain():void");
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancelled;
        }

        void onError(Throwable th) {
            Throwable th2;
            Throwable compositeException;
            AtomicReference<Throwable> atomicReference = this.error;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    compositeException = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                    arrayList.add(th);
                    compositeException = new CompositeException(arrayList);
                } else {
                    compositeException = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, compositeException));
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j4);
            }
            if (j4 != 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j4);
                drain();
            }
        }

        public void subscribe(Observable<? extends T>[] observableArr) {
            CombinerSubscriber<T, R>[] combinerSubscriberArr = this.subscribers;
            int length = combinerSubscriberArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                combinerSubscriberArr[i4] = new CombinerSubscriber<>(this, i4);
            }
            lazySet(0);
            this.actual.add(this);
            this.actual.setProducer(this);
            for (int i5 = 0; i5 < length && !this.cancelled; i5++) {
                observableArr[i5].subscribe((Subscriber<? super Object>) combinerSubscriberArr[i5]);
            }
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (getAndIncrement() == 0) {
                cancel(this.queue);
            }
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN) {
        this(null, iterable, funcN, RxRingBuffer.SIZE, false);
    }

    public OnSubscribeCombineLatest(Observable<? extends T>[] observableArr, Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN, int i4, boolean z3) {
        this.sources = observableArr;
        this.sourcesIterable = iterable;
        this.combiner = funcN;
        this.bufferSize = i4;
        this.delayError = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // p147rx.functions.Action1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void call(p147rx.Subscriber<? super R> r9) {
        /*
            r8 = this;
            rx.Observable<? extends T>[] r0 = r8.sources
            if (r0 != 0) goto L45
            java.lang.Iterable<? extends rx.Observable<? extends T>> r0 = r8.sourcesIterable
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.Observable[] r1 = new p147rx.Observable[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.Observable[] r0 = (p147rx.Observable[]) r0
            int r1 = r0.length
            goto L46
        L1a:
            r1 = 8
            rx.Observable[] r1 = new p147rx.Observable[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L24:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r0.next()
            rx.Observable r4 = (p147rx.Observable) r4
            int r5 = r1.length
            if (r3 != r5) goto L3c
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.Observable[] r5 = new p147rx.Observable[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L3c:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L24
        L42:
            r0 = r1
            r4 = r3
            goto L47
        L45:
            int r1 = r0.length
        L46:
            r4 = r1
        L47:
            if (r4 != 0) goto L4d
            r9.onCompleted()
            return
        L4d:
            rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator r7 = new rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator
            rx.functions.FuncN<? extends R> r3 = r8.combiner
            int r5 = r8.bufferSize
            boolean r6 = r8.delayError
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.subscribe(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147rx.internal.operators.OnSubscribeCombineLatest.call(rx.Subscriber):void");
    }
}
