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
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<InterfaceC0050c> downstream;
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

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.enableOperatorFusion || unicastProcessor.wip.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.queue.clear();
            UnicastProcessor.this.downstream.lazySet(null);
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

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j9);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i9) {
            if ((i9 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }
    }

    public UnicastProcessor(int i9) {
        this(i9, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    public boolean checkTerminated(boolean z9, boolean z10, boolean z11, InterfaceC0050c interfaceC0050c, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z9 && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            interfaceC0050c.onError(this.error);
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th = this.error;
        this.downstream.lazySet(null);
        if (th != null) {
            interfaceC0050c.onError(th);
        } else {
            interfaceC0050c.onComplete();
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
        InterfaceC0050c interfaceC0050c = this.downstream.get();
        int iAddAndGet = 1;
        while (interfaceC0050c == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                interfaceC0050c = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(interfaceC0050c);
        } else {
            drainRegular(interfaceC0050c);
        }
    }

    public void drainFused(InterfaceC0050c interfaceC0050c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z9 = this.delayError;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z10 = this.done;
            if (!z9 && z10 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                interfaceC0050c.onError(this.error);
                return;
            }
            interfaceC0050c.onNext(null);
            if (z10) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    interfaceC0050c.onError(th);
                    return;
                } else {
                    interfaceC0050c.onComplete();
                    return;
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        spscLinkedArrayQueue.clear();
        this.downstream.lazySet(null);
    }

    public void drainRegular(InterfaceC0050c interfaceC0050c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z9 = !this.delayError;
        int iAddAndGet = 1;
        do {
            long j9 = this.requested.get();
            long j10 = 0;
            while (j9 != j10) {
                boolean z10 = this.done;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z11 = tPoll == null;
                if (checkTerminated(z9, z10, z11, interfaceC0050c, spscLinkedArrayQueue)) {
                    return;
                }
                if (z11) {
                    break;
                }
                interfaceC0050c.onNext(tPoll);
                j10++;
            }
            if (j9 == j10 && checkTerminated(z9, this.done, spscLinkedArrayQueue.isEmpty(), interfaceC0050c, spscLinkedArrayQueue)) {
                return;
            }
            if (j10 != 0 && j9 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j10);
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

    @Override // io.reactivex.processors.FlowableProcessor, p010a9.InterfaceC0050c
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, p010a9.InterfaceC0050c
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

    @Override // io.reactivex.processors.FlowableProcessor, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        ObjectHelper.requireNonNull(t9, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t9);
        drain();
    }

    @Override // p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        if (this.done || this.cancelled) {
            interfaceC0051d.cancel();
        } else {
            interfaceC0051d.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), interfaceC0050c);
            return;
        }
        interfaceC0050c.onSubscribe(this.wip);
        this.downstream.set(interfaceC0050c);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    public UnicastProcessor(int i9, Runnable runnable) {
        this(i9, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i9) {
        return new UnicastProcessor<>(i9);
    }

    public UnicastProcessor(int i9, Runnable runnable, boolean z9) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i9, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z9;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z9) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z9);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i9, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i9, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i9, Runnable runnable, boolean z9) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i9, runnable, z9);
    }
}
