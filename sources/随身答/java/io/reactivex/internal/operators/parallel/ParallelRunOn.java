package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC0051d upstream;
        final Scheduler.Worker worker;

        public BaseRunOnSubscriber(int i9, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i9;
            this.queue = spscArrayQueue;
            this.limit = i9 - (i9 >> 2);
            this.worker = worker;
        }

        @Override // p010a9.InterfaceC0051d
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onNext(T t9) {
            if (this.done) {
                return;
            }
            if (this.queue.offer(t9)) {
                schedule();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // p010a9.InterfaceC0051d
        public final void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
                schedule();
            }
        }

        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        final InterfaceC0050c[] parents;
        final InterfaceC0050c[] subscribers;

        public MultiWorkerCallback(InterfaceC0050c[] interfaceC0050cArr, InterfaceC0050c[] interfaceC0050cArr2) {
            this.subscribers = interfaceC0050cArr;
            this.parents = interfaceC0050cArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i9, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i9, this.subscribers, this.parents, worker);
        }
    }

    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        public RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i9, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i9, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i9 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i10 = this.limit;
            int iAddAndGet = 1;
            while (true) {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    if (z9 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z10 = tPoll == null;
                    if (z9 && z10) {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z10) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j10++;
                        }
                        i9++;
                        if (i9 == i10) {
                            this.upstream.request(i9);
                            i9 = 0;
                        }
                    }
                }
                if (j10 == j9) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j10 != 0 && j9 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j10);
                }
                int i11 = get();
                if (i11 == iAddAndGet) {
                    this.consumed = i9;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i11;
                }
            }
        }
    }

    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final InterfaceC0050c downstream;

        public RunOnSubscriber(InterfaceC0050c interfaceC0050c, int i9, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i9, spscArrayQueue, worker);
            this.downstream = interfaceC0050c;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i9 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            InterfaceC0050c interfaceC0050c = this.downstream;
            int i10 = this.limit;
            int iAddAndGet = 1;
            while (true) {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    if (z9 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        interfaceC0050c.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z10 = tPoll == null;
                    if (z9 && z10) {
                        interfaceC0050c.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z10) {
                            break;
                        }
                        interfaceC0050c.onNext(tPoll);
                        j10++;
                        i9++;
                        if (i9 == i10) {
                            this.upstream.request(i9);
                            i9 = 0;
                        }
                    }
                }
                if (j10 == j9) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            interfaceC0050c.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            interfaceC0050c.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j10 != 0 && j9 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j10);
                }
                int i11 = get();
                if (i11 == iAddAndGet) {
                    this.consumed = i9;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i11;
                }
            }
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i9) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i9;
    }

    public void createSubscriber(int i9, InterfaceC0050c[] interfaceC0050cArr, InterfaceC0050c[] interfaceC0050cArr2, Scheduler.Worker worker) {
        InterfaceC0050c interfaceC0050c = interfaceC0050cArr[i9];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (interfaceC0050c instanceof ConditionalSubscriber) {
            interfaceC0050cArr2[i9] = new RunOnConditionalSubscriber((ConditionalSubscriber) interfaceC0050c, this.prefetch, spscArrayQueue, worker);
        } else {
            interfaceC0050cArr2[i9] = new RunOnSubscriber(interfaceC0050c, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC0050c[] interfaceC0050cArr) {
        if (validate(interfaceC0050cArr)) {
            int length = interfaceC0050cArr.length;
            InterfaceC0050c[] interfaceC0050cArr2 = new InterfaceC0050c[length];
            Object obj = this.scheduler;
            if (obj instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(interfaceC0050cArr, interfaceC0050cArr2));
            } else {
                for (int i9 = 0; i9 < length; i9++) {
                    createSubscriber(i9, interfaceC0050cArr, interfaceC0050cArr2, this.scheduler.createWorker());
                }
            }
            this.source.subscribe(interfaceC0050cArr2);
        }
    }
}
