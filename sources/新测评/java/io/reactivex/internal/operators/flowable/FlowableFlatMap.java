package io.reactivex.internal.operators.flowable;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int maxConcurrency;

    public static final class InnerSubscriber<T, U> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id */
        final long f13311id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j10) {
            this.f13311id = j10;
            this.parent = mergeSubscriber;
            int i10 = mergeSubscriber.bufferSize;
            this.bufferSize = i10;
            this.limit = i10 >> 2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(U u10) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u10, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this, interfaceC8990d)) {
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                    }
                }
                interfaceC8990d.request(this.bufferSize);
            }
        }

        public void requestMore(long j10) {
            if (this.fusionMode != 1) {
                long j11 = this.produced + j10;
                if (j11 < this.limit) {
                    this.produced = j11;
                } else {
                    this.produced = 0L;
                    get().request(j11);
                }
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC8989c downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends InterfaceC8988b> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        InterfaceC8990d upstream;
        static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        public MergeSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function, boolean z9, int i10, int i11) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = interfaceC8989c;
            this.mapper = function;
            this.delayErrors = z9;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            this.scalarLimit = Math.max(1, i10 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!AbstractC0920q.m1034a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeAll();
            if (getAndIncrement() != 0 || (simplePlainQueue = this.queue) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            clearScalarQueue();
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        public void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:155:0x018d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drainLoop() {
            /*
                Method dump skipped, instructions count: 441
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.drainLoop():void");
        }

        public SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        public SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> spscLinkedArrayQueue = this.queue;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            innerSubscriber.done = true;
            if (!this.delayErrors) {
                this.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber2.dispose();
                }
            }
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (!this.errs.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Publisher");
                if (!(interfaceC8988b instanceof Callable)) {
                    long j10 = this.uniqueId;
                    this.uniqueId = 1 + j10;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j10);
                    if (addInner(innerSubscriber)) {
                        interfaceC8988b.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC8988b).call();
                    if (objCall != null) {
                        tryEmitScalar(objCall);
                        return;
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                        return;
                    }
                    int i10 = this.scalarEmitted + 1;
                    this.scalarEmitted = i10;
                    int i11 = this.scalarLimit;
                    if (i10 == i11) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i11);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.errs.addThrowable(th);
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i10 = this.maxConcurrency;
                if (i10 == Integer.MAX_VALUE) {
                    interfaceC8990d.request(Long.MAX_VALUE);
                } else {
                    interfaceC8990d.request(i10);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriberArr[i10] == innerSubscriber) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!AbstractC0920q.m1034a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        public void tryEmit(U u10, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.requested.get();
                SimpleQueue<U> innerQueue = innerSubscriber.queue;
                if (j10 == 0 || !(innerQueue == null || innerQueue.isEmpty())) {
                    if (innerQueue == null) {
                        innerQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!innerQueue.offer(u10)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue = innerSubscriber.queue;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u10)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.requested.get();
                SimpleQueue<U> mainQueue = this.queue;
                if (j10 == 0 || !(mainQueue == null || mainQueue.isEmpty())) {
                    if (mainQueue == null) {
                        mainQueue = getMainQueue();
                    }
                    if (!mainQueue.offer(u10)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i10 = this.scalarEmitted + 1;
                        this.scalarEmitted = i10;
                        int i11 = this.scalarLimit;
                        if (i10 == i11) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u10)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC8988b> function, boolean z9, int i10, int i11) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z9;
        this.maxConcurrency = i10;
        this.bufferSize = i11;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function, boolean z9, int i10, int i11) {
        return new MergeSubscriber(interfaceC8989c, function, z9, i10, i11);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC8989c, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(interfaceC8989c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
