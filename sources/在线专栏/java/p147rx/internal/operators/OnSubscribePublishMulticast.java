package p147rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.internal.util.atomic.SpscAtomicArrayQueue;
import p147rx.internal.util.unsafe.SpscArrayQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;

/* loaded from: classes2.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements Observable.OnSubscribe<T>, Observer<T>, Subscription {
    static final PublishProducer<?>[] EMPTY = new PublishProducer[0];
    static final PublishProducer<?>[] TERMINATED = new PublishProducer[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final ParentSubscriber<T> parent;
    final int prefetch;
    volatile Producer producer;
    final Queue<T> queue;
    volatile PublishProducer<T>[] subscribers;

    static final class ParentSubscriber<T> extends Subscriber<T> {
        final OnSubscribePublishMulticast<T> state;

        public ParentSubscriber(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.state = onSubscribePublishMulticast;
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

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.state.setProducer(producer);
        }
    }

    static final class PublishProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = 960704844171597367L;
        final Subscriber<? super T> actual;
        final AtomicBoolean once = new AtomicBoolean();
        final OnSubscribePublishMulticast<T> parent;

        public PublishProducer(Subscriber<? super T> subscriber, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.actual = subscriber;
            this.parent = onSubscribePublishMulticast;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.once.get();
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j4);
            }
            if (j4 != 0) {
                BackpressureUtils.getAndAddRequest(this, j4);
                this.parent.drain();
            }
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i4, boolean z3) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + i4);
        }
        this.prefetch = i4;
        this.delayError = z3;
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.queue = new SpscArrayQueue(i4);
        } else {
            this.queue = new SpscAtomicArrayQueue(i4);
        }
        this.subscribers = (PublishProducer<T>[]) EMPTY;
        this.parent = new ParentSubscriber<>(this);
    }

    boolean add(PublishProducer<T> publishProducer) {
        PublishProducer<T>[] publishProducerArr = this.subscribers;
        PublishProducer<?>[] publishProducerArr2 = TERMINATED;
        if (publishProducerArr == publishProducerArr2) {
            return false;
        }
        synchronized (this) {
            PublishProducer<T>[] publishProducerArr3 = this.subscribers;
            if (publishProducerArr3 == publishProducerArr2) {
                return false;
            }
            int length = publishProducerArr3.length;
            PublishProducer<T>[] publishProducerArr4 = new PublishProducer[length + 1];
            System.arraycopy(publishProducerArr3, 0, publishProducerArr4, 0, length);
            publishProducerArr4[length] = publishProducer;
            this.subscribers = publishProducerArr4;
            return true;
        }
    }

    boolean checkTerminated(boolean z3, boolean z4) {
        int i4 = 0;
        if (z3) {
            if (!this.delayError) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    PublishProducer<T>[] publishProducerArrTerminate = terminate();
                    int length = publishProducerArrTerminate.length;
                    while (i4 < length) {
                        publishProducerArrTerminate[i4].actual.onError(th);
                        i4++;
                    }
                    return true;
                }
                if (z4) {
                    PublishProducer<T>[] publishProducerArrTerminate2 = terminate();
                    int length2 = publishProducerArrTerminate2.length;
                    while (i4 < length2) {
                        publishProducerArrTerminate2[i4].actual.onCompleted();
                        i4++;
                    }
                    return true;
                }
            } else if (z4) {
                PublishProducer<T>[] publishProducerArrTerminate3 = terminate();
                Throwable th2 = this.error;
                if (th2 != null) {
                    int length3 = publishProducerArrTerminate3.length;
                    while (i4 < length3) {
                        publishProducerArrTerminate3[i4].actual.onError(th2);
                        i4++;
                    }
                } else {
                    int length4 = publishProducerArrTerminate3.length;
                    while (i4 < length4) {
                        publishProducerArrTerminate3[i4].actual.onCompleted();
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        Queue<T> queue = this.queue;
        int iAddAndGet = 0;
        do {
            long jMin = Long.MAX_VALUE;
            PublishProducer<T>[] publishProducerArr = this.subscribers;
            int length = publishProducerArr.length;
            for (PublishProducer<T> publishProducer : publishProducerArr) {
                jMin = Math.min(jMin, publishProducer.get());
            }
            if (length != 0) {
                long j4 = 0;
                while (j4 != jMin) {
                    boolean z3 = this.done;
                    T tPoll = queue.poll();
                    boolean z4 = tPoll == null;
                    if (checkTerminated(z3, z4)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    for (PublishProducer<T> publishProducer2 : publishProducerArr) {
                        publishProducer2.actual.onNext(tPoll);
                    }
                    j4++;
                }
                if (j4 == jMin && checkTerminated(this.done, queue.isEmpty())) {
                    return;
                }
                if (j4 != 0) {
                    Producer producer = this.producer;
                    if (producer != null) {
                        producer.request(j4);
                    }
                    for (PublishProducer<T> publishProducer3 : publishProducerArr) {
                        BackpressureUtils.produced(publishProducer3, j4);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // p147rx.Subscription
    public boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        if (!this.queue.offer(t3)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        drain();
    }

    void remove(PublishProducer<T> publishProducer) {
        PublishProducer<?>[] publishProducerArr;
        PublishProducer[] publishProducerArr2;
        PublishProducer<T>[] publishProducerArr3 = this.subscribers;
        PublishProducer<?>[] publishProducerArr4 = TERMINATED;
        if (publishProducerArr3 == publishProducerArr4 || publishProducerArr3 == (publishProducerArr = EMPTY)) {
            return;
        }
        synchronized (this) {
            PublishProducer<T>[] publishProducerArr5 = this.subscribers;
            if (publishProducerArr5 != publishProducerArr4 && publishProducerArr5 != publishProducerArr) {
                int i4 = -1;
                int length = publishProducerArr5.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (publishProducerArr5[i5] == publishProducer) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    publishProducerArr2 = EMPTY;
                } else {
                    PublishProducer[] publishProducerArr6 = new PublishProducer[length - 1];
                    System.arraycopy(publishProducerArr5, 0, publishProducerArr6, 0, i4);
                    System.arraycopy(publishProducerArr5, i4 + 1, publishProducerArr6, i4, (length - i4) - 1);
                    publishProducerArr2 = publishProducerArr6;
                }
                this.subscribers = publishProducerArr2;
            }
        }
    }

    void setProducer(Producer producer) {
        this.producer = producer;
        producer.request(this.prefetch);
    }

    public Subscriber<T> subscriber() {
        return this.parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    PublishProducer<T>[] terminate() {
        PublishProducer<T>[] publishProducerArr = this.subscribers;
        PublishProducer<T>[] publishProducerArr2 = (PublishProducer<T>[]) TERMINATED;
        if (publishProducerArr != publishProducerArr2) {
            synchronized (this) {
                publishProducerArr = this.subscribers;
                if (publishProducerArr != publishProducerArr2) {
                    this.subscribers = publishProducerArr2;
                }
            }
        }
        return publishProducerArr;
    }

    @Override // p147rx.Subscription
    public void unsubscribe() {
        this.parent.unsubscribe();
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        PublishProducer<T> publishProducer = new PublishProducer<>(subscriber, this);
        subscriber.add(publishProducer);
        subscriber.setProducer(publishProducer);
        if (add(publishProducer)) {
            if (publishProducer.isUnsubscribed()) {
                remove(publishProducer);
                return;
            } else {
                drain();
                return;
            }
        }
        Throwable th = this.error;
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onCompleted();
        }
    }
}
