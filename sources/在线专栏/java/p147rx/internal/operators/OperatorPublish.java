package p147rx.internal.operators;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.functions.Func1;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.atomic.SpscAtomicArrayQueue;
import p147rx.internal.util.unsafe.SpscArrayQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;
import p147rx.observables.ConnectableObservable;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class OperatorPublish<T> extends ConnectableObservable<T> {
    final AtomicReference<PublishSubscriber<T>> current;
    final Observable<? extends T> source;

    static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final Subscriber<? super T> child;
        final PublishSubscriber<T> parent;

        public InnerProducer(PublishSubscriber<T> publishSubscriber, Subscriber<? super T> subscriber) {
            this.parent = publishSubscriber;
            this.child = subscriber;
            lazySet(NOT_REQUESTED);
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j4) {
            long j5;
            long j6;
            if (j4 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j5 = get();
                if (j5 == NOT_REQUESTED) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j5 == UNSUBSCRIBED) {
                    return UNSUBSCRIBED;
                }
                j6 = j5 - j4;
                if (j6 < 0) {
                    throw new IllegalStateException("More produced (" + j4 + ") than requested (" + j5 + ")");
                }
            } while (!compareAndSet(j5, j6));
            return j6;
        }

        @Override // p147rx.Producer
        public void request(long j4) throws Throwable {
            long j5;
            long j6;
            if (j4 < 0) {
                return;
            }
            do {
                j5 = get();
                if (j5 == UNSUBSCRIBED) {
                    return;
                }
                if (j5 >= 0 && j4 == 0) {
                    return;
                }
                if (j5 == NOT_REQUESTED) {
                    j6 = j4;
                } else {
                    j6 = j5 + j4;
                    if (j6 < 0) {
                        j6 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j5, j6));
            this.parent.dispatch();
        }

        @Override // p147rx.Subscription
        public void unsubscribe() throws Throwable {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.remove(this);
            this.parent.dispatch();
        }
    }

    static final class PublishSubscriber<T> extends Subscriber<T> {
        static final InnerProducer[] EMPTY = new InnerProducer[0];
        static final InnerProducer[] TERMINATED = new InnerProducer[0];
        final AtomicReference<PublishSubscriber<T>> current;
        boolean emitting;
        boolean missed;
        final AtomicReference<InnerProducer[]> producers;
        final Queue<Object> queue;
        final AtomicBoolean shouldConnect;
        volatile Object terminalEvent;

        public PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference) {
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(RxRingBuffer.SIZE) : new SpscAtomicArrayQueue<>(RxRingBuffer.SIZE);
            this.producers = new AtomicReference<>(EMPTY);
            this.current = atomicReference;
            this.shouldConnect = new AtomicBoolean();
        }

        boolean add(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            Objects.requireNonNull(innerProducer);
            do {
                innerProducerArr = this.producers.get();
                if (innerProducerArr == TERMINATED) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!this.producers.compareAndSet(innerProducerArr, innerProducerArr2));
            return true;
        }

        boolean checkTerminated(Object obj, boolean z3) {
            int i4 = 0;
            if (obj != null) {
                if (!NotificationLite.isCompleted(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    this.current.compareAndSet(this, null);
                    try {
                        InnerProducer[] andSet = this.producers.getAndSet(TERMINATED);
                        int length = andSet.length;
                        while (i4 < length) {
                            andSet[i4].child.onError(error);
                            i4++;
                        }
                        return true;
                    } finally {
                    }
                }
                if (z3) {
                    this.current.compareAndSet(this, null);
                    try {
                        InnerProducer[] andSet2 = this.producers.getAndSet(TERMINATED);
                        int length2 = andSet2.length;
                        while (i4 < length2) {
                            andSet2[i4].child.onCompleted();
                            i4++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        void dispatch() throws Throwable {
            boolean z3;
            long j4;
            synchronized (this) {
                if (this.emitting) {
                    this.missed = true;
                    return;
                }
                this.emitting = true;
                this.missed = false;
                while (true) {
                    try {
                        Object obj = this.terminalEvent;
                        boolean zIsEmpty = this.queue.isEmpty();
                        if (checkTerminated(obj, zIsEmpty)) {
                            return;
                        }
                        if (!zIsEmpty) {
                            InnerProducer[] innerProducerArr = this.producers.get();
                            int length = innerProducerArr.length;
                            long jMin = Long.MAX_VALUE;
                            int i4 = 0;
                            for (InnerProducer innerProducer : innerProducerArr) {
                                long j5 = innerProducer.get();
                                if (j5 >= 0) {
                                    jMin = Math.min(jMin, j5);
                                } else if (j5 == Long.MIN_VALUE) {
                                    i4++;
                                }
                            }
                            if (length != i4) {
                                int i5 = 0;
                                while (true) {
                                    j4 = i5;
                                    if (j4 >= jMin) {
                                        break;
                                    }
                                    Object obj2 = this.terminalEvent;
                                    Object objPoll = this.queue.poll();
                                    boolean z4 = objPoll == null;
                                    if (checkTerminated(obj2, z4)) {
                                        return;
                                    }
                                    if (z4) {
                                        zIsEmpty = z4;
                                        break;
                                    }
                                    Object value = NotificationLite.getValue(objPoll);
                                    for (InnerProducer innerProducer2 : innerProducerArr) {
                                        if (innerProducer2.get() > 0) {
                                            try {
                                                innerProducer2.child.onNext(value);
                                                innerProducer2.produced(1L);
                                            } catch (Throwable th) {
                                                innerProducer2.unsubscribe();
                                                Exceptions.throwOrReport(th, innerProducer2.child, value);
                                            }
                                        }
                                    }
                                    i5++;
                                    zIsEmpty = z4;
                                }
                                if (i5 > 0) {
                                    request(j4);
                                }
                                if (jMin == 0 || zIsEmpty) {
                                }
                            } else if (checkTerminated(this.terminalEvent, this.queue.poll() == null)) {
                                return;
                            } else {
                                request(1L);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (this.missed) {
                                    this.missed = false;
                                } else {
                                    this.emitting = false;
                                    try {
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z3 = true;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z3 = false;
                            }
                        }
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            if (!z3) {
                                synchronized (this) {
                                    this.emitting = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z3 = false;
                    }
                }
            }
        }

        void init() {
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorPublish.PublishSubscriber.1
                @Override // p147rx.functions.Action0
                public void call() {
                    PublishSubscriber.this.producers.getAndSet(PublishSubscriber.TERMINATED);
                    PublishSubscriber<T> publishSubscriber = PublishSubscriber.this;
                    publishSubscriber.current.compareAndSet(publishSubscriber, null);
                }
            }));
        }

        @Override // p147rx.Observer
        public void onCompleted() throws Throwable {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.completed();
                dispatch();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) throws Throwable {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.error(th);
                dispatch();
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) throws Throwable {
            if (this.queue.offer(NotificationLite.next(t3))) {
                dispatch();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }

        void remove(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = this.producers.get();
                if (innerProducerArr == EMPTY || innerProducerArr == TERMINATED) {
                    return;
                }
                int i4 = -1;
                int length = innerProducerArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (innerProducerArr[i5].equals(innerProducer)) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    innerProducerArr2 = EMPTY;
                } else {
                    InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                    System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i4);
                    System.arraycopy(innerProducerArr, i4 + 1, innerProducerArr3, i4, (length - i4) - 1);
                    innerProducerArr2 = innerProducerArr3;
                }
            } while (!this.producers.compareAndSet(innerProducerArr, innerProducerArr2));
        }
    }

    private OperatorPublish(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<PublishSubscriber<T>> atomicReference) {
        super(onSubscribe);
        this.source = observable;
        this.current = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorPublish.1
            @Override // p147rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                while (true) {
                    PublishSubscriber publishSubscriber = (PublishSubscriber) atomicReference.get();
                    if (publishSubscriber == null || publishSubscriber.isUnsubscribed()) {
                        PublishSubscriber publishSubscriber2 = new PublishSubscriber(atomicReference);
                        publishSubscriber2.init();
                        if (atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                            publishSubscriber = publishSubscriber2;
                        } else {
                            continue;
                        }
                    }
                    InnerProducer<T> innerProducer = new InnerProducer<>(publishSubscriber, subscriber);
                    if (publishSubscriber.add((InnerProducer) innerProducer)) {
                        subscriber.add(innerProducer);
                        subscriber.setProducer(innerProducer);
                        return;
                    }
                }
            }
        }, observable, atomicReference);
    }

    @Override // p147rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.isUnsubscribed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.current);
            publishSubscriber2.init();
            if (this.current.compareAndSet(publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z3 = !publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true);
        action1.call(publishSubscriber);
        if (z3) {
            this.source.unsafeSubscribe(publishSubscriber);
        }
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> Observable<R> create(final Observable<? extends T> observable, final Func1<? super Observable<T>, ? extends Observable<R>> func1, final boolean z3) {
        return Observable.unsafeCreate(new Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorPublish.2
            @Override // p147rx.functions.Action1
            public void call(final Subscriber<? super R> subscriber) {
                final OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(RxRingBuffer.SIZE, z3);
                Subscriber<R> subscriber2 = new Subscriber<R>() { // from class: rx.internal.operators.OperatorPublish.2.1
                    @Override // p147rx.Observer
                    public void onCompleted() {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onCompleted();
                    }

                    @Override // p147rx.Observer
                    public void onError(Throwable th) {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onError(th);
                    }

                    @Override // p147rx.Observer
                    public void onNext(R r3) {
                        subscriber.onNext(r3);
                    }

                    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
                    public void setProducer(Producer producer) {
                        subscriber.setProducer(producer);
                    }
                };
                subscriber.add(onSubscribePublishMulticast);
                subscriber.add(subscriber2);
                ((Observable) func1.call(Observable.unsafeCreate(onSubscribePublishMulticast))).unsafeSubscribe(subscriber2);
                observable.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
            }
        });
    }
}
