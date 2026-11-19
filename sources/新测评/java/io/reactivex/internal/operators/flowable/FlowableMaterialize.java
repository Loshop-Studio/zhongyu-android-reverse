package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        public MaterializeSubscriber(InterfaceC8989c interfaceC8989c) {
            super(interfaceC8989c);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            complete(Notification.createOnComplete());
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            complete(Notification.createOnError(th));
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(Notification.createOnNext(t10));
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        public void onDrop(Notification<T> notification) {
            if (notification.isOnError()) {
                RxJavaPlugins.onError(notification.getError());
            }
        }
    }

    public FlowableMaterialize(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new MaterializeSubscriber(interfaceC8989c));
    }
}
