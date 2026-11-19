package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableDematerialize<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super T, ? extends Notification<R>> selector;

    public static final class DematerializeSubscriber<T, R> implements FlowableSubscriber<T>, InterfaceC8990d {
        boolean done;
        final InterfaceC8989c downstream;
        final Function<? super T, ? extends Notification<R>> selector;
        InterfaceC8990d upstream;

        public DematerializeSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends Notification<R>> function) {
            this.downstream = interfaceC8989c;
            this.selector = function;
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                if (t10 instanceof Notification) {
                    Notification notification = (Notification) t10;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.selector.apply(t10), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.upstream.cancel();
                    onError(notification2.getError());
                } else if (!notification2.isOnComplete()) {
                    this.downstream.onNext(notification2.getValue());
                } else {
                    this.upstream.cancel();
                    onComplete();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
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

    public FlowableDematerialize(Flowable<T> flowable, Function<? super T, ? extends Notification<R>> function) {
        super(flowable);
        this.selector = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new DematerializeSubscriber(interfaceC8989c, this.selector));
    }
}
