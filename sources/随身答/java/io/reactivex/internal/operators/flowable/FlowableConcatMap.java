package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC0049b> mapper;
    final int prefetch;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 */
    public static /* synthetic */ class C81851 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            $SwitchMap$io$reactivex$internal$util$ErrorMode = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$internal$util$ErrorMode[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, InterfaceC0051d {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final Function<? super T, ? extends InterfaceC0049b> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        InterfaceC0051d upstream;
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final AtomicThrowable errors = new AtomicThrowable();

        public BaseConcatMapSubscriber(Function<? super T, ? extends InterfaceC0049b> function, int i9) {
            this.mapper = function;
            this.prefetch = i9;
            this.limit = i9 - (i9 >> 2);
        }

        @Override // p010a9.InterfaceC0051d
        public abstract /* synthetic */ void cancel();

        public abstract void drain();

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onNext(T t9) {
            if (this.sourceMode == 2 || this.queue.offer(t9)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                if (interfaceC0051d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC0051d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        interfaceC0051d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                interfaceC0051d.request(this.prefetch);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public abstract /* synthetic */ void request(long j9);

        public abstract void subscribeActual();
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final InterfaceC0050c downstream;
        final boolean veryEnd;

        public ConcatMapDelayed(InterfaceC0050c interfaceC0050c, Function<? super T, ? extends InterfaceC0049b> function, int i9, boolean z9) {
            super(function, i9);
            this.downstream = interfaceC0050c;
            this.veryEnd = z9;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p010a9.InterfaceC0051d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z9 = this.done;
                        if (z9 && !this.veryEnd && this.errors.get() != null) {
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                        try {
                            T tPoll = this.queue.poll();
                            boolean z10 = tPoll == null;
                            if (z9 && z10) {
                                Throwable thTerminate = this.errors.terminate();
                                if (thTerminate != null) {
                                    this.downstream.onError(thTerminate);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            }
                            if (!z10) {
                                try {
                                    InterfaceC0049b interfaceC0049b = (InterfaceC0049b) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i9 = this.consumed + 1;
                                        if (i9 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i9);
                                        } else {
                                            this.consumed = i9;
                                        }
                                    }
                                    if (interfaceC0049b instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) interfaceC0049b).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.inner.isUnbounded()) {
                                                this.downstream.onNext(objCall);
                                            } else {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.setSubscription(new WeakScalarSubscription(objCall, concatMapInner));
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        interfaceC0049b.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.veryEnd) {
                this.upstream.cancel();
                this.done = true;
            }
            this.active = false;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r9) {
            this.downstream.onNext(r9);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p010a9.InterfaceC0051d
        public void request(long j9) {
            this.inner.request(j9);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final InterfaceC0050c downstream;
        final AtomicInteger wip;

        public ConcatMapImmediate(InterfaceC0050c interfaceC0050c, Function<? super T, ? extends InterfaceC0049b> function, int i9) {
            super(function, i9);
            this.downstream = interfaceC0050c;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p010a9.InterfaceC0051d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z9 = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z10 = tPoll == null;
                            if (z9 && z10) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z10) {
                                try {
                                    InterfaceC0049b interfaceC0049b = (InterfaceC0049b) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i9 = this.consumed + 1;
                                        if (i9 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i9);
                                        } else {
                                            this.consumed = i9;
                                        }
                                    }
                                    if (interfaceC0049b instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) interfaceC0049b).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.inner.isUnbounded()) {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.setSubscription(new WeakScalarSubscription(objCall, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.downstream.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.downstream.onError(this.errors.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        interfaceC0049b.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r9) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r9);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.inner.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p010a9.InterfaceC0051d
        public void request(long j9) {
            this.inner.request(j9);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final ConcatMapSupport<R> parent;
        long produced;

        public ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            long j9 = this.produced;
            if (j9 != 0) {
                this.produced = 0L;
                produced(j9);
            }
            this.parent.innerComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            long j9 = this.produced;
            if (j9 != 0) {
                this.produced = 0L;
                produced(j9);
            }
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(R r9) {
            this.produced++;
            this.parent.innerNext(r9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            setSubscription(interfaceC0051d);
        }
    }

    public interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t9);
    }

    public static final class WeakScalarSubscription<T> implements InterfaceC0051d {
        final InterfaceC0050c downstream;
        boolean once;
        final T value;

        public WeakScalarSubscription(T t9, InterfaceC0050c interfaceC0050c) {
            this.value = t9;
            this.downstream = interfaceC0050c;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (j9 <= 0 || this.once) {
                return;
            }
            this.once = true;
            InterfaceC0050c interfaceC0050c = this.downstream;
            interfaceC0050c.onNext(this.value);
            interfaceC0050c.onComplete();
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC0049b> function, int i9, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i9;
        this.errorMode = errorMode;
    }

    public static <T, R> InterfaceC0050c subscribe(InterfaceC0050c interfaceC0050c, Function<? super T, ? extends InterfaceC0049b> function, int i9, ErrorMode errorMode) {
        int i10 = C81851.$SwitchMap$io$reactivex$internal$util$ErrorMode[errorMode.ordinal()];
        return i10 != 1 ? i10 != 2 ? new ConcatMapImmediate(interfaceC0050c, function, i9) : new ConcatMapDelayed(interfaceC0050c, function, i9, true) : new ConcatMapDelayed(interfaceC0050c, function, i9, false);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC0050c, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(interfaceC0050c, this.mapper, this.prefetch, this.errorMode));
    }
}
