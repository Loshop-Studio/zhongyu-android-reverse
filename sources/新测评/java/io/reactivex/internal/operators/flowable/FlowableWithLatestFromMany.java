package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableWithLatestFromMany<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super Object[], R> combiner;

    @Nullable
    final InterfaceC8988b[] otherArray;

    @Nullable
    final Iterable<? extends InterfaceC8988b> otherIterable;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t10) throws Exception {
            return (R) ObjectHelper.requireNonNull(FlowableWithLatestFromMany.this.combiner.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    public static final class WithLatestFromSubscriber<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = 1577321883966341961L;
        final Function<? super Object[], R> combiner;
        volatile boolean done;
        final InterfaceC8989c downstream;
        final AtomicThrowable error;
        final AtomicLong requested;
        final WithLatestInnerSubscriber[] subscribers;
        final AtomicReference<InterfaceC8990d> upstream;
        final AtomicReferenceArray<Object> values;

        public WithLatestFromSubscriber(InterfaceC8989c interfaceC8989c, Function<? super Object[], R> function, int i10) {
            this.downstream = interfaceC8989c;
            this.combiner = function;
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = new WithLatestInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                withLatestInnerSubscriberArr[i11] = new WithLatestInnerSubscriber(this, i11);
            }
            this.subscribers = withLatestInnerSubscriberArr;
            this.values = new AtomicReferenceArray<>(i10);
            this.upstream = new AtomicReference<>();
            this.requested = new AtomicLong();
            this.error = new AtomicThrowable();
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            for (WithLatestInnerSubscriber withLatestInnerSubscriber : this.subscribers) {
                withLatestInnerSubscriber.dispose();
            }
        }

        public void cancelAllBut(int i10) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < withLatestInnerSubscriberArr.length; i11++) {
                if (i11 != i10) {
                    withLatestInnerSubscriberArr[i11].dispose();
                }
            }
        }

        public void innerComplete(int i10, boolean z9) {
            if (z9) {
                return;
            }
            this.done = true;
            SubscriptionHelper.cancel(this.upstream);
            cancelAllBut(i10);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        public void innerError(int i10, Throwable th) {
            this.done = true;
            SubscriptionHelper.cancel(this.upstream);
            cancelAllBut(i10);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        public void innerNext(int i10, Object obj) {
            this.values.set(i10, obj);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (tryOnNext(t10) || this.done) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC8990d);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }

        public void subscribe(InterfaceC8988b[] interfaceC8988bArr, int i10) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.subscribers;
            AtomicReference<InterfaceC8990d> atomicReference = this.upstream;
            for (int i11 = 0; i11 < i10 && atomicReference.get() != SubscriptionHelper.CANCELLED; i11++) {
                interfaceC8988bArr[i11].subscribe(withLatestInnerSubscriberArr[i11]);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t10;
            int i10 = 0;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return false;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                HalfSerializer.onNext(this.downstream, ObjectHelper.requireNonNull(this.combiner.apply(objArr), "The combiner returned a null value"), this, this.error);
                return true;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    public static final class WithLatestInnerSubscriber extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final WithLatestFromSubscriber<?, ?> parent;

        public WithLatestInnerSubscriber(WithLatestFromSubscriber<?, ?> withLatestFromSubscriber, int i10) {
            this.parent = withLatestFromSubscriber;
            this.index = i10;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
        }
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull InterfaceC8988b[] interfaceC8988bArr, Function<? super Object[], R> function) {
        super(flowable);
        this.otherArray = interfaceC8988bArr;
        this.otherIterable = null;
        this.combiner = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        int length;
        InterfaceC8988b[] interfaceC8988bArr = this.otherArray;
        if (interfaceC8988bArr == null) {
            interfaceC8988bArr = new InterfaceC8988b[8];
            try {
                length = 0;
                for (InterfaceC8988b interfaceC8988b : this.otherIterable) {
                    if (length == interfaceC8988bArr.length) {
                        interfaceC8988bArr = (InterfaceC8988b[]) Arrays.copyOf(interfaceC8988bArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    interfaceC8988bArr[length] = interfaceC8988b;
                    length = i10;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, interfaceC8989c);
                return;
            }
        } else {
            length = interfaceC8988bArr.length;
        }
        if (length == 0) {
            new FlowableMap(this.source, new SingletonArrayFunc()).subscribeActual(interfaceC8989c);
            return;
        }
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(interfaceC8989c, this.combiner, length);
        interfaceC8989c.onSubscribe(withLatestFromSubscriber);
        withLatestFromSubscriber.subscribe(interfaceC8988bArr, length);
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Iterable<? extends InterfaceC8988b> iterable, @NonNull Function<? super Object[], R> function) {
        super(flowable);
        this.otherArray = null;
        this.otherIterable = iterable;
        this.combiner = function;
    }
}
