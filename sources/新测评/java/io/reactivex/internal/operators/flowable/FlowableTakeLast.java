package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {
    final int count;

    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final InterfaceC8989c downstream;
        InterfaceC8990d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger wip = new AtomicInteger();

        public TakeLastSubscriber(InterfaceC8989c interfaceC8989c, int i10) {
            this.downstream = interfaceC8989c;
            this.count = i10;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC8989c interfaceC8989c = this.downstream;
                long jAddAndGet = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j10 = 0;
                        while (j10 != jAddAndGet) {
                            if (this.cancelled) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                interfaceC8989c.onComplete();
                                return;
                            } else {
                                interfaceC8989c.onNext(tPoll);
                                j10++;
                            }
                        }
                        if (j10 != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.requested.addAndGet(-j10);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.count == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(Long.MAX_VALUE);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableTakeLast(Flowable<T> flowable, int i10) {
        super(flowable);
        this.count = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new TakeLastSubscriber(interfaceC8989c, this.count));
    }
}
