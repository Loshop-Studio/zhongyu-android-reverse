package io.reactivex.processors;

import androidx.camera.view.AbstractC0908q;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

@SchedulerSupport("none")
@BackpressureSupport(BackpressureKind.FULL)
/* loaded from: classes5.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
    static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile Throwable error;
    int fusionMode;
    final int limit;
    final AtomicBoolean once;
    volatile SimpleQueue<T> queue;
    final boolean refcount;
    final AtomicReference<MulticastSubscription<T>[]> subscribers;
    final AtomicReference<InterfaceC0051d> upstream;
    final AtomicInteger wip;

    public static final class MulticastSubscription<T> extends AtomicLong implements InterfaceC0051d {
        private static final long serialVersionUID = -363282618957264509L;
        final InterfaceC0050c downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(InterfaceC0050c interfaceC0050c, MulticastProcessor<T> multicastProcessor) {
            this.downstream = interfaceC0050c;
            this.parent = multicastProcessor;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t9) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t9);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            long j10;
            long j11;
            if (SubscriptionHelper.validate(j9)) {
                do {
                    j10 = get();
                    if (j10 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j10 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j11 = j10 + j9;
                    }
                } while (!compareAndSet(j10, j11 >= 0 ? j11 : Long.MAX_VALUE));
                this.parent.drain();
            }
        }
    }

    public MulticastProcessor(int i9, boolean z9) {
        ObjectHelper.verifyPositive(i9, "bufferSize");
        this.bufferSize = i9;
        this.limit = i9 - (i9 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z9;
        this.once = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    public boolean add(MulticastSubscription<T> multicastSubscription) {
        MulticastSubscription<T>[] multicastSubscriptionArr;
        MulticastSubscription[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!AbstractC0908q.m812a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    public void drain() {
        T tPoll;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i9 = this.consumed;
        int i10 = this.limit;
        int i11 = this.fusionMode;
        int iAddAndGet = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int i12 = 0;
                    long jMin = -1;
                    for (MulticastSubscription<T> multicastSubscription : multicastSubscriptionArr) {
                        long j9 = multicastSubscription.get();
                        if (j9 >= 0) {
                            jMin = jMin == -1 ? j9 - multicastSubscription.emitted : Math.min(jMin, j9 - multicastSubscription.emitted);
                        }
                    }
                    int i13 = i9;
                    while (jMin > 0) {
                        MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                        if (multicastSubscriptionArr2 == TERMINATED) {
                            simpleQueue.clear();
                            return;
                        }
                        if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                            break;
                        }
                        boolean z9 = this.done;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            SubscriptionHelper.cancel(this.upstream);
                            this.error = th;
                            this.done = true;
                            tPoll = null;
                            z9 = true;
                        }
                        boolean z10 = tPoll == null;
                        if (z9 && z10) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                MulticastSubscription<T>[] andSet = atomicReference.getAndSet(TERMINATED);
                                int length = andSet.length;
                                while (i12 < length) {
                                    andSet[i12].onError(th2);
                                    i12++;
                                }
                                return;
                            }
                            MulticastSubscription<T>[] andSet2 = atomicReference.getAndSet(TERMINATED);
                            int length2 = andSet2.length;
                            while (i12 < length2) {
                                andSet2[i12].onComplete();
                                i12++;
                            }
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        for (MulticastSubscription<T> multicastSubscription2 : multicastSubscriptionArr) {
                            multicastSubscription2.onNext(tPoll);
                        }
                        jMin--;
                        if (i11 != 1 && (i13 = i13 + 1) == i10) {
                            this.upstream.get().request(i10);
                            i13 = 0;
                        }
                    }
                    if (jMin == 0) {
                        MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                        MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                        if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                            simpleQueue.clear();
                            return;
                        }
                        if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                            i9 = i13;
                        } else if (this.done && simpleQueue.isEmpty()) {
                            Throwable th3 = this.error;
                            if (th3 != null) {
                                MulticastSubscription<T>[] andSet3 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                int length3 = andSet3.length;
                                while (i12 < length3) {
                                    andSet3[i12].onError(th3);
                                    i12++;
                                }
                                return;
                            }
                            MulticastSubscription<T>[] andSet4 = atomicReference.getAndSet(multicastSubscriptionArr4);
                            int length4 = andSet4.length;
                            while (i12 < length4) {
                                andSet4[i12].onComplete();
                                i12++;
                            }
                            return;
                        }
                    }
                    i9 = i13;
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.once.get() && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.once.get() && this.error != null;
    }

    public boolean offer(T t9) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t9, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t9)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, p010a9.InterfaceC0050c
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, p010a9.InterfaceC0050c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.once.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t9, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t9)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC0051d)) {
            if (interfaceC0051d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC0051d;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    interfaceC0051d.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            interfaceC0051d.request(this.bufferSize);
        }
    }

    public void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                } else if (multicastSubscriptionArr[i9] == multicastSubscription) {
                    break;
                } else {
                    i9++;
                }
            }
            if (i9 < 0) {
                return;
            }
            if (length != 1) {
                MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i9);
                System.arraycopy(multicastSubscriptionArr, i9 + 1, multicastSubscriptionArr2, i9, (length - i9) - 1);
                if (AbstractC0908q.m812a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            } else if (this.refcount) {
                if (AbstractC0908q.m812a(this.subscribers, multicastSubscriptionArr, TERMINATED)) {
                    SubscriptionHelper.cancel(this.upstream);
                    this.once.set(true);
                    return;
                }
            } else if (AbstractC0908q.m812a(this.subscribers, multicastSubscriptionArr, EMPTY)) {
                return;
            }
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        Throwable th;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(interfaceC0050c, this);
        interfaceC0050c.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
                return;
            } else {
                drain();
                return;
            }
        }
        if ((this.once.get() || !this.refcount) && (th = this.error) != null) {
            interfaceC0050c.onError(th);
        } else {
            interfaceC0050c.onComplete();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z9) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z9);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i9) {
        return new MulticastProcessor<>(i9, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i9, boolean z9) {
        return new MulticastProcessor<>(i9, z9);
    }
}
