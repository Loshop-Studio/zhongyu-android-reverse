package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* loaded from: classes4.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    /* synthetic */ void onNext(Object obj);

    boolean tryOnNext(T t6);
}
