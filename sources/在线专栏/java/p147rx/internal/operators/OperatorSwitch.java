package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p001a0.C0005d;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.CompositeException;
import p147rx.functions.Action0;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.atomic.SpscLinkedArrayQueue;
import p147rx.plugins.RxJavaHooks;
import p147rx.subscriptions.SerialSubscription;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class OperatorSwitch<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean delayError;

    static final class Holder {
        static final OperatorSwitch<Object> INSTANCE = new OperatorSwitch<>(false);

        Holder() {
        }
    }

    static final class HolderDelayError {
        static final OperatorSwitch<Object> INSTANCE = new OperatorSwitch<>(true);

        HolderDelayError() {
        }
    }

    static final class InnerSubscriber<T> extends Subscriber<T> {

        /* renamed from: id */
        private final long f11786id;
        private final SwitchSubscriber<T> parent;

        InnerSubscriber(long j4, SwitchSubscriber<T> switchSubscriber) {
            this.f11786id = j4;
            this.parent = switchSubscriber;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.parent.complete(this.f11786id);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.parent.error(th, this.f11786id);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.parent.emit(t3, this);
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.parent.innerProducer(producer, this.f11786id);
        }
    }

    static final class SwitchSubscriber<T> extends Subscriber<Observable<? extends T>> {
        static final Throwable TERMINAL_ERROR = new Throwable("Terminal error");
        final Subscriber<? super T> child;
        final boolean delayError;
        boolean emitting;
        Throwable error;
        boolean innerActive;
        volatile boolean mainDone;
        boolean missed;
        Producer producer;
        long requested;
        final SerialSubscription serial = new SerialSubscription();
        final AtomicLong index = new AtomicLong();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(RxRingBuffer.SIZE);

        SwitchSubscriber(Subscriber<? super T> subscriber, boolean z3) {
            this.child = subscriber;
            this.delayError = z3;
        }

        protected boolean checkTerminated(boolean z3, boolean z4, Throwable th, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue, Subscriber<? super T> subscriber, boolean z5) {
            if (this.delayError) {
                if (!z3 || z4 || !z5) {
                    return false;
                }
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z3 || z4 || !z5) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        void childRequested(long j4) {
            Producer producer;
            synchronized (this) {
                producer = this.producer;
                this.requested = BackpressureUtils.addCap(this.requested, j4);
            }
            if (producer != null) {
                producer.request(j4);
            }
            drain();
        }

        void clearProducer() {
            synchronized (this) {
                this.producer = null;
            }
        }

        void complete(long j4) {
            synchronized (this) {
                if (this.index.get() != j4) {
                    return;
                }
                this.innerActive = false;
                this.producer = null;
                drain();
            }
        }

        void drain() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                if (this.emitting) {
                    this.missed = true;
                    return;
                }
                this.emitting = true;
                boolean z3 = this.innerActive;
                long j4 = this.requested;
                Throwable th3 = this.error;
                if (th3 != null && th3 != (th2 = TERMINAL_ERROR) && !this.delayError) {
                    this.error = th2;
                }
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                AtomicLong atomicLong = this.index;
                Subscriber<? super T> subscriber = this.child;
                long j5 = j4;
                Throwable th4 = th3;
                boolean z4 = this.mainDone;
                while (true) {
                    long j6 = 0;
                    while (j6 != j5) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                        if (checkTerminated(z4, z3, th4, spscLinkedArrayQueue, subscriber, zIsEmpty)) {
                            return;
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        InnerSubscriber innerSubscriber = (InnerSubscriber) spscLinkedArrayQueue.poll();
                        C0005d c0005d = (Object) NotificationLite.getValue(spscLinkedArrayQueue.poll());
                        if (atomicLong.get() == innerSubscriber.f11786id) {
                            subscriber.onNext(c0005d);
                            j6++;
                        }
                    }
                    if (j6 == j5) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (checkTerminated(this.mainDone, z3, th4, spscLinkedArrayQueue, subscriber, spscLinkedArrayQueue.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        long j7 = this.requested;
                        if (j7 != Long.MAX_VALUE) {
                            j7 -= j6;
                            this.requested = j7;
                        }
                        j5 = j7;
                        if (!this.missed) {
                            this.emitting = false;
                            return;
                        }
                        this.missed = false;
                        z4 = this.mainDone;
                        z3 = this.innerActive;
                        th4 = this.error;
                        if (th4 != null && th4 != (th = TERMINAL_ERROR) && !this.delayError) {
                            this.error = th;
                        }
                    }
                }
            }
        }

        void emit(T t3, InnerSubscriber<T> innerSubscriber) {
            synchronized (this) {
                if (this.index.get() != ((InnerSubscriber) innerSubscriber).f11786id) {
                    return;
                }
                this.queue.offer(innerSubscriber, NotificationLite.next(t3));
                drain();
            }
        }

        void error(Throwable th, long j4) {
            boolean zUpdateError;
            synchronized (this) {
                if (this.index.get() == j4) {
                    zUpdateError = updateError(th);
                    this.innerActive = false;
                    this.producer = null;
                } else {
                    zUpdateError = true;
                }
            }
            if (zUpdateError) {
                drain();
            } else {
                pluginError(th);
            }
        }

        void init() {
            this.child.add(this.serial);
            this.child.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorSwitch.SwitchSubscriber.1
                @Override // p147rx.functions.Action0
                public void call() {
                    SwitchSubscriber.this.clearProducer();
                }
            }));
            this.child.setProducer(new Producer() { // from class: rx.internal.operators.OperatorSwitch.SwitchSubscriber.2
                @Override // p147rx.Producer
                public void request(long j4) {
                    if (j4 > 0) {
                        SwitchSubscriber.this.childRequested(j4);
                    } else {
                        if (j4 >= 0) {
                            return;
                        }
                        throw new IllegalArgumentException("n >= 0 expected but it was " + j4);
                    }
                }
            });
        }

        void innerProducer(Producer producer, long j4) {
            synchronized (this) {
                if (this.index.get() != j4) {
                    return;
                }
                long j5 = this.requested;
                this.producer = producer;
                producer.request(j5);
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.mainDone = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            boolean zUpdateError;
            synchronized (this) {
                zUpdateError = updateError(th);
            }
            if (!zUpdateError) {
                pluginError(th);
            } else {
                this.mainDone = true;
                drain();
            }
        }

        void pluginError(Throwable th) {
            RxJavaHooks.onError(th);
        }

        boolean updateError(Throwable th) {
            Throwable th2 = this.error;
            if (th2 == TERMINAL_ERROR) {
                return false;
            }
            if (th2 == null) {
                this.error = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                arrayList.add(th);
                this.error = new CompositeException(arrayList);
            } else {
                this.error = new CompositeException(th2, th);
            }
            return true;
        }

        @Override // p147rx.Observer
        public void onNext(Observable<? extends T> observable) {
            InnerSubscriber innerSubscriber;
            long jIncrementAndGet = this.index.incrementAndGet();
            Subscription subscription = this.serial.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                innerSubscriber = new InnerSubscriber(jIncrementAndGet, this);
                this.innerActive = true;
                this.producer = null;
            }
            this.serial.set(innerSubscriber);
            observable.unsafeSubscribe(innerSubscriber);
        }
    }

    OperatorSwitch(boolean z3) {
        this.delayError = z3;
    }

    public static <T> OperatorSwitch<T> instance(boolean z3) {
        return z3 ? (OperatorSwitch<T>) HolderDelayError.INSTANCE : (OperatorSwitch<T>) Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        SwitchSubscriber switchSubscriber = new SwitchSubscriber(subscriber, this.delayError);
        subscriber.add(switchSubscriber);
        switchSubscriber.init();
        return switchSubscriber;
    }
}
