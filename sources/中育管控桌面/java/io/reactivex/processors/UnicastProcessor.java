package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<InterfaceC7917c> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor.this.downstream.lazySet(null);
            if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                UnicastProcessor.this.downstream.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.enableOperatorFusion) {
                    return;
                }
                unicastProcessor.queue.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j6);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i6) {
            if ((i6 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }
    }

    public UnicastProcessor(int i6) {
        this(i6, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    public boolean checkTerminated(boolean z6, boolean z7, boolean z8, InterfaceC7917c interfaceC7917c, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z7) {
            return false;
        }
        if (z6 && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            interfaceC7917c.onError(this.error);
            return true;
        }
        if (!z8) {
            return false;
        }
        Throwable th = this.error;
        this.downstream.lazySet(null);
        if (th != null) {
            interfaceC7917c.onError(th);
        } else {
            interfaceC7917c.onComplete();
        }
        return true;
    }

    public void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        InterfaceC7917c interfaceC7917c = this.downstream.get();
        int iAddAndGet = 1;
        while (interfaceC7917c == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                interfaceC7917c = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(interfaceC7917c);
        } else {
            drainRegular(interfaceC7917c);
        }
    }

    public void drainFused(InterfaceC7917c interfaceC7917c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z6 = this.delayError;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z7 = this.done;
            if (!z6 && z7 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                interfaceC7917c.onError(this.error);
                return;
            }
            interfaceC7917c.onNext(null);
            if (z7) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    interfaceC7917c.onError(th);
                    return;
                } else {
                    interfaceC7917c.onComplete();
                    return;
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    public void drainRegular(InterfaceC7917c interfaceC7917c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z6 = !this.delayError;
        int iAddAndGet = 1;
        do {
            long j6 = this.requested.get();
            long j7 = 0;
            while (j6 != j7) {
                boolean z7 = this.done;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z8 = tPoll == null;
                if (checkTerminated(z6, z7, z8, interfaceC7917c, spscLinkedArrayQueue)) {
                    return;
                }
                if (z8) {
                    break;
                }
                interfaceC7917c.onNext(tPoll);
                j7++;
            }
            if (j6 == j7 && checkTerminated(z6, this.done, spscLinkedArrayQueue.isEmpty(), interfaceC7917c, spscLinkedArrayQueue)) {
                return;
            }
            if (j7 != 0 && j6 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j7);
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor, p193y5.InterfaceC7917c
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        ObjectHelper.requireNonNull(t6, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t6);
        drain();
    }

    @Override // p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (this.done || this.cancelled) {
            interfaceC7918d.cancel();
        } else {
            interfaceC7918d.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), interfaceC7917c);
            return;
        }
        interfaceC7917c.onSubscribe(this.wip);
        this.downstream.set(interfaceC7917c);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    public UnicastProcessor(int i6, Runnable runnable) {
        this(i6, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i6) {
        return new UnicastProcessor<>(i6);
    }

    public UnicastProcessor(int i6, Runnable runnable, boolean z6) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i6, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z6;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z6) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z6);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i6, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i6, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i6, Runnable runnable, boolean z6) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i6, runnable, z6);
    }
}
