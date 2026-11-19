package io.reactivex.processors;

import androidx.compose.animation.core.AbstractC0433h;
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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

@SchedulerSupport(SchedulerSupport.NONE)
@BackpressureSupport(BackpressureKind.FULL)
/* loaded from: classes4.dex */
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
    final AtomicReference<InterfaceC7918d> upstream;
    final AtomicInteger wip;

    public static final class MulticastSubscription<T> extends AtomicLong implements InterfaceC7918d {
        private static final long serialVersionUID = -363282618957264509L;
        final InterfaceC7917c downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(InterfaceC7917c interfaceC7917c, MulticastProcessor<T> multicastProcessor) {
            this.downstream = interfaceC7917c;
            this.parent = multicastProcessor;
        }

        @Override // p193y5.InterfaceC7918d
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

        public void onNext(T t6) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t6);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            long j7;
            long j8;
            if (SubscriptionHelper.validate(j6)) {
                do {
                    j7 = get();
                    if (j7 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j7 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j8 = j7 + j6;
                    }
                } while (!compareAndSet(j7, j8 >= 0 ? j8 : Long.MAX_VALUE));
                this.parent.drain();
            }
        }
    }

    public MulticastProcessor(int i6, boolean z6) {
        ObjectHelper.verifyPositive(i6, "bufferSize");
        this.bufferSize = i6;
        this.limit = i6 - (i6 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z6;
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
        } while (!AbstractC0433h.m112a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    public void drain() {
        T tPoll;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i6 = this.consumed;
        int i7 = this.limit;
        int i8 = this.fusionMode;
        int iAddAndGet = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int i9 = 0;
                    long jMin = -1;
                    for (MulticastSubscription<T> multicastSubscription : multicastSubscriptionArr) {
                        long j6 = multicastSubscription.get();
                        if (j6 >= 0) {
                            jMin = jMin == -1 ? j6 - multicastSubscription.emitted : Math.min(jMin, j6 - multicastSubscription.emitted);
                        }
                    }
                    int i10 = i6;
                    while (jMin > 0) {
                        MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                        if (multicastSubscriptionArr2 == TERMINATED) {
                            simpleQueue.clear();
                            return;
                        }
                        if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                            break;
                        }
                        boolean z6 = this.done;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            SubscriptionHelper.cancel(this.upstream);
                            this.error = th;
                            this.done = true;
                            tPoll = null;
                            z6 = true;
                        }
                        boolean z7 = tPoll == null;
                        if (z6 && z7) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                MulticastSubscription<T>[] andSet = atomicReference.getAndSet(TERMINATED);
                                int length = andSet.length;
                                while (i9 < length) {
                                    andSet[i9].onError(th2);
                                    i9++;
                                }
                                return;
                            }
                            MulticastSubscription<T>[] andSet2 = atomicReference.getAndSet(TERMINATED);
                            int length2 = andSet2.length;
                            while (i9 < length2) {
                                andSet2[i9].onComplete();
                                i9++;
                            }
                            return;
                        }
                        if (z7) {
                            break;
                        }
                        for (MulticastSubscription<T> multicastSubscription2 : multicastSubscriptionArr) {
                            multicastSubscription2.onNext(tPoll);
                        }
                        jMin--;
                        if (i8 != 1 && (i10 = i10 + 1) == i7) {
                            this.upstream.get().request(i7);
                            i10 = 0;
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
                            i6 = i10;
                        } else if (this.done && simpleQueue.isEmpty()) {
                            Throwable th3 = this.error;
                            if (th3 != null) {
                                MulticastSubscription<T>[] andSet3 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                int length3 = andSet3.length;
                                while (i9 < length3) {
                                    andSet3[i9].onError(th3);
                                    i9++;
                                }
                                return;
                            }
                            MulticastSubscription<T>[] andSet4 = atomicReference.getAndSet(multicastSubscriptionArr4);
                            int length4 = andSet4.length;
                            while (i9 < length4) {
                                andSet4[i9].onComplete();
                                i9++;
                            }
                            return;
                        }
                    }
                    i6 = i10;
                }
            }
            this.consumed = i6;
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

    public boolean offer(T t6) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t6, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t6)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, p193y5.InterfaceC7917c
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, p193y5.InterfaceC7917c
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

    @Override // io.reactivex.processors.FlowableProcessor, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t6, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t6)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC7918d)) {
            if (interfaceC7918d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC7918d;
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
                    interfaceC7918d.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            interfaceC7918d.request(this.bufferSize);
        }
    }

    public void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                } else if (multicastSubscriptionArr[i6] == multicastSubscription) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 < 0) {
                return;
            }
            if (length != 1) {
                MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i6);
                System.arraycopy(multicastSubscriptionArr, i6 + 1, multicastSubscriptionArr2, i6, (length - i6) - 1);
                if (AbstractC0433h.m112a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            } else if (this.refcount) {
                if (AbstractC0433h.m112a(this.subscribers, multicastSubscriptionArr, TERMINATED)) {
                    SubscriptionHelper.cancel(this.upstream);
                    this.once.set(true);
                    return;
                }
            } else if (AbstractC0433h.m112a(this.subscribers, multicastSubscriptionArr, EMPTY)) {
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
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        Throwable th;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(interfaceC7917c, this);
        interfaceC7917c.onSubscribe(multicastSubscription);
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
            interfaceC7917c.onError(th);
        } else {
            interfaceC7917c.onComplete();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z6) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z6);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i6) {
        return new MulticastProcessor<>(i6, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i6, boolean z6) {
        return new MulticastProcessor<>(i6, z6);
    }
}
