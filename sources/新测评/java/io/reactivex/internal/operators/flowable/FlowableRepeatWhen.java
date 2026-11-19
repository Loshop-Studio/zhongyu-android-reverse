package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Object>, ? extends InterfaceC8988b> handler;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RepeatWhenSubscriber(InterfaceC8989c interfaceC8989c, FlowableProcessor<Object> flowableProcessor, InterfaceC8990d interfaceC8990d) {
            super(interfaceC8989c, flowableProcessor, interfaceC8990d);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            again(0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, InterfaceC8990d {
        private static final long serialVersionUID = 2827772011130406689L;
        final InterfaceC8988b source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public WhenReceiver(InterfaceC8988b interfaceC8988b) {
            this.source = interfaceC8988b;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC8990d);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }
    }

    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final InterfaceC8989c downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final InterfaceC8990d receiver;

        public WhenSourceSubscriber(InterfaceC8989c interfaceC8989c, FlowableProcessor<U> flowableProcessor, InterfaceC8990d interfaceC8990d) {
            super(false);
            this.downstream = interfaceC8989c;
            this.processor = flowableProcessor;
            this.receiver = interfaceC8990d;
        }

        public final void again(U u10) {
            setSubscription(EmptySubscription.INSTANCE);
            long j10 = this.produced;
            if (j10 != 0) {
                this.produced = 0L;
                produced(j10);
            }
            this.receiver.request(1L);
            this.processor.onNext(u10);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p215q9.InterfaceC8990d
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        public abstract /* synthetic */ void onComplete();

        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public final void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public final void onSubscribe(InterfaceC8990d interfaceC8990d) {
            setSubscription(interfaceC8990d);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends InterfaceC8988b> function) {
        super(flowable);
        this.handler = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC8989c);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            interfaceC8989c.onSubscribe(repeatWhenSubscriber);
            interfaceC8988b.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC8989c);
        }
    }
}
