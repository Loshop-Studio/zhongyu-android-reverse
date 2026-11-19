package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class ParallelJoin<T> extends Flowable<T> {
    final boolean delayErrors;
    final int prefetch;
    final ParallelFlowable<? extends T> source;

    public static final class JoinInnerSubscriber<T> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        final int limit;
        final JoinSubscriptionBase<T> parent;
        final int prefetch;
        long produced;
        volatile SimplePlainQueue<T> queue;

        public JoinInnerSubscriber(JoinSubscriptionBase<T> joinSubscriptionBase, int i10) {
            this.parent = joinSubscriptionBase;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        public boolean cancel() {
            return SubscriptionHelper.cancel(this);
        }

        public SimplePlainQueue<T> getQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.parent.onNext(this, t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, this.prefetch);
        }

        public void request(long j10) {
            long j11 = this.produced + j10;
            if (j11 < this.limit) {
                this.produced = j11;
            } else {
                this.produced = 0L;
                get().request(j11);
            }
        }

        public void requestOne() {
            long j10 = this.produced + 1;
            if (j10 != this.limit) {
                this.produced = j10;
            } else {
                this.produced = 0L;
                get().request(j10);
            }
        }
    }

    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public JoinSubscription(InterfaceC8989c interfaceC8989c, int i10, int i11) {
            super(interfaceC8989c, i10, i11);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        
            r16 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        
            if (r12 == false) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            if (r15 == false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        
            if (r15 == false) goto L90;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drainLoop() {
            /*
                Method dump skipped, instructions count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscription.drainLoop():void");
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable th) {
            if (this.errors.compareAndSet(null, th)) {
                cancelAll();
                drain();
            } else if (th != this.errors.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t10);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t10)) {
                    cancelAll();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.errors.compareAndSet(null, missingBackpressureException)) {
                        this.downstream.onError(missingBackpressureException);
                        return;
                    } else {
                        RxJavaPlugins.onError(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!joinInnerSubscriber.getQueue().offer(t10)) {
                cancelAll();
                onError(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements InterfaceC8990d {
        private static final long serialVersionUID = 3100232009247827843L;
        volatile boolean cancelled;
        final InterfaceC8989c downstream;
        final JoinInnerSubscriber<T>[] subscribers;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger done = new AtomicInteger();

        public JoinSubscriptionBase(InterfaceC8989c interfaceC8989c, int i10, int i11) {
            this.downstream = interfaceC8989c;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new JoinInnerSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                joinInnerSubscriberArr[i12] = new JoinInnerSubscriber<>(this, i11);
            }
            this.subscribers = joinInnerSubscriberArr;
            this.done.lazySet(i10);
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                cleanup();
            }
        }

        public void cancelAll() {
            int i10 = 0;
            while (true) {
                JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
                if (i10 >= joinInnerSubscriberArr.length) {
                    return;
                }
                joinInnerSubscriberArr[i10].cancel();
                i10++;
            }
        }

        public void cleanup() {
            int i10 = 0;
            while (true) {
                JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
                if (i10 >= joinInnerSubscriberArr.length) {
                    return;
                }
                joinInnerSubscriberArr[i10].queue = null;
                i10++;
            }
        }

        public abstract void drain();

        public abstract void onComplete();

        public abstract void onError(Throwable th);

        public abstract void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t10);

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public JoinSubscriptionDelayError(InterfaceC8989c interfaceC8989c, int i10, int i11) {
            super(interfaceC8989c, i10, i11);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        
            r16 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        
            if (r12 == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        
            if (r15 == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            if (r18.errors.get() == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        
            r3.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        
            if (r15 == false) goto L87;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drainLoop() {
            /*
                Method dump skipped, instructions count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionDelayError.drainLoop():void");
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable th) {
            this.errors.addThrowable(th);
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t10);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t10)) {
                    joinInnerSubscriber.cancel();
                    this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                    drainLoop();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!joinInnerSubscriber.getQueue().offer(t10) && joinInnerSubscriber.cancel()) {
                    this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public ParallelJoin(ParallelFlowable<? extends T> parallelFlowable, int i10, boolean z9) {
        this.source = parallelFlowable;
        this.prefetch = i10;
        this.delayErrors = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        JoinSubscriptionBase joinSubscriptionDelayError = this.delayErrors ? new JoinSubscriptionDelayError(interfaceC8989c, this.source.parallelism(), this.prefetch) : new JoinSubscription(interfaceC8989c, this.source.parallelism(), this.prefetch);
        interfaceC8989c.onSubscribe(joinSubscriptionDelayError);
        this.source.subscribe(joinSubscriptionDelayError.subscribers);
    }
}
