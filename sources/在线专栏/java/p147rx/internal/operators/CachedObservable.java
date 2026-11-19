package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.internal.util.LinkedArrayList;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class CachedObservable<T> extends Observable<T> {
    private final CacheState<T> state;

    static final class CacheState<T> extends LinkedArrayList implements Observer<T> {
        static final ReplayProducer<?>[] EMPTY = new ReplayProducer[0];
        final SerialSubscription connection;
        volatile boolean isConnected;
        volatile ReplayProducer<?>[] producers;
        final Observable<? extends T> source;
        boolean sourceDone;

        public CacheState(Observable<? extends T> observable, int i4) {
            super(i4);
            this.source = observable;
            this.producers = EMPTY;
            this.connection = new SerialSubscription();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void addProducer(ReplayProducer<T> replayProducer) {
            synchronized (this.connection) {
                ReplayProducer<?>[] replayProducerArr = this.producers;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.producers = replayProducerArr2;
            }
        }

        public void connect() {
            Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.CachedObservable.CacheState.1
                @Override // p147rx.Observer
                public void onCompleted() throws Throwable {
                    CacheState.this.onCompleted();
                }

                @Override // p147rx.Observer
                public void onError(Throwable th) throws Throwable {
                    CacheState.this.onError(th);
                }

                @Override // p147rx.Observer
                public void onNext(T t3) throws Throwable {
                    CacheState.this.onNext(t3);
                }
            };
            this.connection.set(subscriber);
            this.source.unsafeSubscribe(subscriber);
            this.isConnected = true;
        }

        void dispatch() throws Throwable {
            for (ReplayProducer<?> replayProducer : this.producers) {
                replayProducer.replay();
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() throws Throwable {
            if (this.sourceDone) {
                return;
            }
            this.sourceDone = true;
            add(NotificationLite.completed());
            this.connection.unsubscribe();
            dispatch();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) throws Throwable {
            if (this.sourceDone) {
                return;
            }
            this.sourceDone = true;
            add(NotificationLite.error(th));
            this.connection.unsubscribe();
            dispatch();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) throws Throwable {
            if (this.sourceDone) {
                return;
            }
            add(NotificationLite.next(t3));
            dispatch();
        }

        public void removeProducer(ReplayProducer<T> replayProducer) {
            synchronized (this.connection) {
                ReplayProducer<?>[] replayProducerArr = this.producers;
                int length = replayProducerArr.length;
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (replayProducerArr[i5].equals(replayProducer)) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    this.producers = EMPTY;
                    return;
                }
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length - 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i4);
                System.arraycopy(replayProducerArr, i4 + 1, replayProducerArr2, i4, (length - i4) - 1);
                this.producers = replayProducerArr2;
            }
        }
    }

    static final class CachedSubscribe<T> extends AtomicBoolean implements Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final CacheState<T> state;

        public CachedSubscribe(CacheState<T> cacheState) {
            this.state = cacheState;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(subscriber, this.state);
            this.state.addProducer(replayProducer);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.state.connect();
        }
    }

    static final class ReplayProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        final Subscriber<? super T> child;
        Object[] currentBuffer;
        int currentIndexInBuffer;
        boolean emitting;
        int index;
        boolean missed;
        final CacheState<T> state;

        public ReplayProducer(Subscriber<? super T> subscriber, CacheState<T> cacheState) {
            this.child = subscriber;
            this.state = cacheState;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        public long produced(long j4) {
            return addAndGet(-j4);
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void replay() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.CachedObservable.ReplayProducer.replay():void");
        }

        @Override // p147rx.Producer
        public void request(long j4) throws Throwable {
            long j5;
            long j6;
            do {
                j5 = get();
                if (j5 < 0) {
                    return;
                }
                j6 = j5 + j4;
                if (j6 < 0) {
                    j6 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j5, j6));
            replay();
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.state.removeProducer(this);
        }
    }

    private CachedObservable(Observable.OnSubscribe<T> onSubscribe, CacheState<T> cacheState) {
        super(onSubscribe);
        this.state = cacheState;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable) {
        return from(observable, 16);
    }

    boolean hasObservers() {
        return this.state.producers.length != 0;
    }

    boolean isConnected() {
        return this.state.isConnected;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable, int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required");
        }
        CacheState cacheState = new CacheState(observable, i4);
        return new CachedObservable<>(new CachedSubscribe(cacheState), cacheState);
    }
}
