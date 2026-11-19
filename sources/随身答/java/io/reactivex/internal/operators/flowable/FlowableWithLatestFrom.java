package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<? super T, ? super U, ? extends R> combiner;
    final InterfaceC0049b other;

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        private final WithLatestFromSubscriber<T, U, R> wlf;

        public FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.wlf = withLatestFromSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.wlf.otherError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(U u9) {
            this.wlf.lazySet(u9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (this.wlf.setOther(interfaceC0051d)) {
                interfaceC0051d.request(Long.MAX_VALUE);
            }
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -312246233408980075L;
        final BiFunction<? super T, ? super U, ? extends R> combiner;
        final InterfaceC0050c downstream;
        final AtomicReference<InterfaceC0051d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC0051d> other = new AtomicReference<>();

        public WithLatestFromSubscriber(InterfaceC0050c interfaceC0050c, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = interfaceC0050c;
            this.combiner = biFunction;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (tryOnNext(t9)) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC0051d);
        }

        public void otherError(Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j9);
        }

        public boolean setOther(InterfaceC0051d interfaceC0051d) {
            return SubscriptionHelper.setOnce(this.other, interfaceC0051d);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t9) {
            U u9 = get();
            if (u9 != null) {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.combiner.apply(t9, u9), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
            return false;
        }
    }

    public FlowableWithLatestFrom(Flowable<T> flowable, BiFunction<? super T, ? super U, ? extends R> biFunction, InterfaceC0049b interfaceC0049b) {
        super(flowable);
        this.combiner = biFunction;
        this.other = interfaceC0049b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC0050c);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.combiner);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.other.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }
}
