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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC7918d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC7918d upstream;
        final Scheduler.Worker worker;

        public BaseRunOnSubscriber(int i6, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i6;
            this.queue = spscArrayQueue;
            this.limit = i6 - (i6 >> 2);
            this.worker = worker;
        }

        @Override // p193y5.InterfaceC7918d
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public final void onNext(T t6) {
            if (this.done) {
                return;
            }
            if (this.queue.offer(t6)) {
                schedule();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // p193y5.InterfaceC7918d
        public final void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
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
        final InterfaceC7917c[] parents;
        final InterfaceC7917c[] subscribers;

        public MultiWorkerCallback(InterfaceC7917c[] interfaceC7917cArr, InterfaceC7917c[] interfaceC7917cArr2) {
            this.subscribers = interfaceC7917cArr;
            this.parents = interfaceC7917cArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i6, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i6, this.subscribers, this.parents, worker);
        }
    }

    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        public RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i6, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i6, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i6 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i7 = this.limit;
            int iAddAndGet = 1;
            while (true) {
                long j6 = this.requested.get();
                long j7 = 0;
                while (j7 != j6) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z6 = this.done;
                    if (z6 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z7 = tPoll == null;
                    if (z6 && z7) {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z7) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j7++;
                        }
                        i6++;
                        if (i6 == i7) {
                            this.upstream.request(i6);
                            i6 = 0;
                        }
                    }
                }
                if (j7 == j6) {
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
                if (j7 != 0 && j6 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j7);
                }
                int i8 = get();
                if (i8 == iAddAndGet) {
                    this.consumed = i6;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i8;
                }
            }
        }
    }

    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final InterfaceC7917c downstream;

        public RunOnSubscriber(InterfaceC7917c interfaceC7917c, int i6, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i6, spscArrayQueue, worker);
            this.downstream = interfaceC7917c;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i6 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            InterfaceC7917c interfaceC7917c = this.downstream;
            int i7 = this.limit;
            int iAddAndGet = 1;
            while (true) {
                long j6 = this.requested.get();
                long j7 = 0;
                while (j7 != j6) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z6 = this.done;
                    if (z6 && (th = this.error) != null) {
                        spscArrayQueue.clear();
                        interfaceC7917c.onError(th);
                        this.worker.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z7 = tPoll == null;
                    if (z6 && z7) {
                        interfaceC7917c.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z7) {
                            break;
                        }
                        interfaceC7917c.onNext(tPoll);
                        j7++;
                        i6++;
                        if (i6 == i7) {
                            this.upstream.request(i6);
                            i6 = 0;
                        }
                    }
                }
                if (j7 == j6) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            interfaceC7917c.onError(th2);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            interfaceC7917c.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j7 != 0 && j6 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j7);
                }
                int i8 = get();
                if (i8 == iAddAndGet) {
                    this.consumed = i6;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i8;
                }
            }
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i6) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i6;
    }

    public void createSubscriber(int i6, InterfaceC7917c[] interfaceC7917cArr, InterfaceC7917c[] interfaceC7917cArr2, Scheduler.Worker worker) {
        InterfaceC7917c interfaceC7917c = interfaceC7917cArr[i6];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (interfaceC7917c instanceof ConditionalSubscriber) {
            interfaceC7917cArr2[i6] = new RunOnConditionalSubscriber((ConditionalSubscriber) interfaceC7917c, this.prefetch, spscArrayQueue, worker);
        } else {
            interfaceC7917cArr2[i6] = new RunOnSubscriber(interfaceC7917c, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC7917c[] interfaceC7917cArr) {
        if (validate(interfaceC7917cArr)) {
            int length = interfaceC7917cArr.length;
            InterfaceC7917c[] interfaceC7917cArr2 = new InterfaceC7917c[length];
            Object obj = this.scheduler;
            if (obj instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(interfaceC7917cArr, interfaceC7917cArr2));
            } else {
                for (int i6 = 0; i6 < length; i6++) {
                    createSubscriber(i6, interfaceC7917cArr, interfaceC7917cArr2, this.scheduler.createWorker());
                }
            }
            this.source.subscribe(interfaceC7917cArr2);
        }
    }
}
