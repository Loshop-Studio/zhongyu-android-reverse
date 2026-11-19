package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {
    final Function<? super T, ? extends R> mapper;
    final ParallelFlowable<T> source;

    public static final class ParallelMapConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, InterfaceC8990d {
        boolean done;
        final ConditionalSubscriber<? super R> downstream;
        final Function<? super T, ? extends R> mapper;
        InterfaceC8990d upstream;

        public ParallelMapConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function) {
            this.downstream = conditionalSubscriber;
            this.mapper = function;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            this.upstream.request(j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            try {
                return this.downstream.tryOnNext(ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }
    }

    public static final class ParallelMapSubscriber<T, R> implements FlowableSubscriber<T>, InterfaceC8990d {
        boolean done;
        final InterfaceC8989c downstream;
        final Function<? super T, ? extends R> mapper;
        InterfaceC8990d upstream;

        public ParallelMapSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends R> function) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            this.upstream.request(j10);
        }
    }

    public ParallelMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function) {
        this.source = parallelFlowable;
        this.mapper = function;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC8989c[] interfaceC8989cArr) {
        if (validate(interfaceC8989cArr)) {
            int length = interfaceC8989cArr.length;
            InterfaceC8989c[] interfaceC8989cArr2 = new InterfaceC8989c[length];
            for (int i10 = 0; i10 < length; i10++) {
                InterfaceC8989c interfaceC8989c = interfaceC8989cArr[i10];
                if (interfaceC8989c instanceof ConditionalSubscriber) {
                    interfaceC8989cArr2[i10] = new ParallelMapConditionalSubscriber((ConditionalSubscriber) interfaceC8989c, this.mapper);
                } else {
                    interfaceC8989cArr2[i10] = new ParallelMapSubscriber(interfaceC8989c, this.mapper);
                }
            }
            this.source.subscribe(interfaceC8989cArr2);
        }
    }
}
