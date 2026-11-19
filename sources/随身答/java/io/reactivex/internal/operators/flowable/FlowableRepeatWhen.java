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
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Object>, ? extends InterfaceC0049b> handler;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public RepeatWhenSubscriber(InterfaceC0050c interfaceC0050c, FlowableProcessor<Object> flowableProcessor, InterfaceC0051d interfaceC0051d) {
            super(interfaceC0050c, flowableProcessor, interfaceC0051d);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            again(0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, InterfaceC0051d {
        private static final long serialVersionUID = 2827772011130406689L;
        final InterfaceC0049b source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<InterfaceC0051d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public WhenReceiver(InterfaceC0049b interfaceC0049b) {
            this.source = interfaceC0049b;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC0051d);
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j9);
        }
    }

    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final InterfaceC0050c downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final InterfaceC0051d receiver;

        public WhenSourceSubscriber(InterfaceC0050c interfaceC0050c, FlowableProcessor<U> flowableProcessor, InterfaceC0051d interfaceC0051d) {
            super(false);
            this.downstream = interfaceC0050c;
            this.processor = flowableProcessor;
            this.receiver = interfaceC0051d;
        }

        public final void again(U u9) {
            setSubscription(EmptySubscription.INSTANCE);
            long j9 = this.produced;
            if (j9 != 0) {
                this.produced = 0L;
                produced(j9);
            }
            this.receiver.request(1L);
            this.processor.onNext(u9);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p010a9.InterfaceC0051d
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        public abstract /* synthetic */ void onComplete();

        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onNext(T t9) {
            this.produced++;
            this.downstream.onNext(t9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public final void onSubscribe(InterfaceC0051d interfaceC0051d) {
            setSubscription(interfaceC0051d);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends InterfaceC0049b> function) {
        super(flowable);
        this.handler = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC0050c);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            InterfaceC0049b interfaceC0049b = (InterfaceC0049b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            interfaceC0050c.onSubscribe(repeatWhenSubscriber);
            interfaceC0049b.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC0050c);
        }
    }
}
