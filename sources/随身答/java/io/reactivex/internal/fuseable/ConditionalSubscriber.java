package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* loaded from: classes5.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    /* synthetic */ void onNext(Object obj);

    boolean tryOnNext(T t9);
}
