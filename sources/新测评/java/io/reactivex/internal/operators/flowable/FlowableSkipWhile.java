package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSkipWhile<T> extends AbstractFlowableWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    public static final class SkipWhileSubscriber<T> implements FlowableSubscriber<T>, InterfaceC8990d {
        final InterfaceC8989c downstream;
        boolean notSkipping;
        final Predicate<? super T> predicate;
        InterfaceC8990d upstream;

        public SkipWhileSubscriber(InterfaceC8989c interfaceC8989c, Predicate<? super T> predicate) {
            this.downstream = interfaceC8989c;
            this.predicate = predicate;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.notSkipping) {
                this.downstream.onNext(t10);
                return;
            }
            try {
                if (this.predicate.test(t10)) {
                    this.upstream.request(1L);
                } else {
                    this.notSkipping = true;
                    this.downstream.onNext(t10);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.downstream.onError(th);
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

    public FlowableSkipWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new SkipWhileSubscriber(interfaceC8989c, this.predicate));
    }
}
