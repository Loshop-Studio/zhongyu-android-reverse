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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {
    final boolean emitLast;
    final InterfaceC7916b other;
    final InterfaceC7916b source;

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        public SampleMainEmitLast(InterfaceC7917c interfaceC7917c, InterfaceC7916b interfaceC7916b) {
            super(interfaceC7917c, interfaceC7916b);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completion() {
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
                    boolean z6 = this.done;
                    emit();
                    if (z6) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public SampleMainNoLast(InterfaceC7917c interfaceC7917c, InterfaceC7916b interfaceC7916b) {
            super(interfaceC7917c, interfaceC7916b);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public void run() {
            emit();
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = -3517602651313910099L;
        final InterfaceC7917c downstream;
        final InterfaceC7916b sampler;
        InterfaceC7918d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC7918d> other = new AtomicReference<>();

        public SamplePublisherSubscriber(InterfaceC7917c interfaceC7917c, InterfaceC7916b interfaceC7916b) {
            this.downstream = interfaceC7917c;
            this.sampler = interfaceC7916b;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }

        public void complete() {
            this.upstream.cancel();
            completion();
        }

        public abstract void completion();

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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            completion();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            lazySet(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new SamplerSubscriber(this));
                    interfaceC7918d.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
            }
        }

        public abstract void run();

        public void setOther(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.setOnce(this.other, interfaceC7918d, Long.MAX_VALUE);
        }
    }

    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        final SamplePublisherSubscriber<T> parent;

        public SamplerSubscriber(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.parent = samplePublisherSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.parent.complete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.parent.error(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(Object obj) {
            this.parent.run();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            this.parent.setOther(interfaceC7918d);
        }
    }

    public FlowableSamplePublisher(InterfaceC7916b interfaceC7916b, InterfaceC7916b interfaceC7916b2, boolean z6) {
        this.source = interfaceC7916b;
        this.other = interfaceC7916b2;
        this.emitLast = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC7917c);
        if (this.emitLast) {
            this.source.subscribe(new SampleMainEmitLast(serializedSubscriber, this.other));
        } else {
            this.source.subscribe(new SampleMainNoLast(serializedSubscriber, this.other));
        }
    }
}
