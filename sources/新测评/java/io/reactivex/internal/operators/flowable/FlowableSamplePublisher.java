package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {
    final boolean emitLast;
    final InterfaceC8988b other;
    final InterfaceC8988b source;

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        public SampleMainEmitLast(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b) {
            super(interfaceC8989c, interfaceC8988b);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z9 = this.done;
                    emit();
                    if (z9) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public SampleMainNoLast(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b) {
            super(interfaceC8989c, interfaceC8988b);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeMain() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completeOther() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            emit();
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -3517602651313910099L;
        final InterfaceC8989c downstream;
        final InterfaceC8988b sampler;
        InterfaceC8990d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC8990d> other = new AtomicReference<>();

        public SamplePublisherSubscriber(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b) {
            this.downstream = interfaceC8989c;
            this.sampler = interfaceC8988b;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }

        public void complete() {
            this.upstream.cancel();
            completeOther();
        }

        public abstract void completeMain();

        public abstract void completeOther();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public void error(Throwable th) {
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            completeMain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SamplerSubscriber(this));
                    interfaceC8990d.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
            }
        }

        public abstract void run();

        public void setOther(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this.other, interfaceC8990d, Long.MAX_VALUE);
        }
    }

    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        final SamplePublisherSubscriber<T> parent;

        public SamplerSubscriber(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.parent = samplePublisherSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.parent.complete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.error(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            this.parent.run();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            this.parent.setOther(interfaceC8990d);
        }
    }

    public FlowableSamplePublisher(InterfaceC8988b interfaceC8988b, InterfaceC8988b interfaceC8988b2, boolean z9) {
        this.source = interfaceC8988b;
        this.other = interfaceC8988b2;
        this.emitLast = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC8989c);
        if (this.emitLast) {
            this.source.subscribe(new SampleMainEmitLast(serializedSubscriber, this.other));
        } else {
            this.source.subscribe(new SampleMainNoLast(serializedSubscriber, this.other));
        }
    }
}
