package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean delayError;
    final int prefetch;
    final Scheduler scheduler;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        InterfaceC8990d upstream;
        final Scheduler.Worker worker;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, boolean z9, int i10) {
            this.worker = worker;
            this.delayError = z9;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public final boolean checkTerminated(boolean z9, boolean z10, InterfaceC8989c interfaceC8989c) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (!z9) {
                return false;
            }
            if (this.delayError) {
                if (!z10) {
                    return false;
                }
                this.cancelled = true;
                Throwable th = this.error;
                if (th != null) {
                    interfaceC8989c.onError(th);
                } else {
                    interfaceC8989c.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.cancelled = true;
                clear();
                interfaceC8989c.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z10) {
                return false;
            }
            this.cancelled = true;
            interfaceC8989c.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            trySchedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                trySchedule();
                return;
            }
            if (!this.queue.offer(t10)) {
                this.upstream.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            trySchedule();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                trySchedule();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final ConditionalSubscriber<? super T> downstream;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z9, int i10) {
            super(worker, z9, i10);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        interfaceC8990d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j10 = this.consumed + 1;
                if (j10 == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j10);
                    return tPoll;
                }
                this.consumed = j10;
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            long j11 = this.consumed;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.requested.get();
                while (j10 != j12) {
                    boolean z9 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z10 = tPoll == null;
                        if (checkTerminated(z9, z10, conditionalSubscriber)) {
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.limit) {
                            this.upstream.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j10 == j12 && checkTerminated(this.done, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.produced = j10;
                    this.consumed = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z9 = this.done;
                this.downstream.onNext(null);
                if (z9) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.requested.get();
                while (j10 != j11) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            this.cancelled = true;
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j10++;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.cancelled = true;
                    conditionalSubscriber.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.produced = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final InterfaceC8989c downstream;

        public ObserveOnSubscriber(InterfaceC8989c interfaceC8989c, Scheduler.Worker worker, boolean z9, int i10) {
            super(worker, z9, i10);
            this.downstream = interfaceC8989c;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        interfaceC8990d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j10 = this.produced + 1;
                if (j10 == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j10);
                    return tPoll;
                }
                this.produced = j10;
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            InterfaceC8989c interfaceC8989c = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.requested.get();
                while (j10 != jAddAndGet) {
                    boolean z9 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z10 = tPoll == null;
                        if (checkTerminated(z9, z10, interfaceC8989c)) {
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        interfaceC8989c.onNext(tPoll);
                        j10++;
                        if (j10 == this.limit) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.requested.addAndGet(-j10);
                            }
                            this.upstream.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        interfaceC8989c.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && checkTerminated(this.done, simpleQueue.isEmpty(), interfaceC8989c)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.produced = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z9 = this.done;
                this.downstream.onNext(null);
                if (z9) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            InterfaceC8989c interfaceC8989c = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j10 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.requested.get();
                while (j10 != j11) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            this.cancelled = true;
                            interfaceC8989c.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        interfaceC8989c.onNext(tPoll);
                        j10++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        interfaceC8989c.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.cancelled = true;
                    interfaceC8989c.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.produced = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z9, int i10) {
        super(flowable);
        this.scheduler = scheduler;
        this.delayError = z9;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (interfaceC8989c instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) interfaceC8989c, workerCreateWorker, this.delayError, this.prefetch));
        } else {
            this.source.subscribe((FlowableSubscriber) new ObserveOnSubscriber(interfaceC8989c, workerCreateWorker, this.delayError, this.prefetch));
        }
    }
}
