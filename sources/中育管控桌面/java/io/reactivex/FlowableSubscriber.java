package io.reactivex;

import io.reactivex.annotations.NonNull;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public interface FlowableSubscriber<T> extends InterfaceC7917c {
    @Override // p193y5.InterfaceC7917c
    /* synthetic */ void onComplete();

    @Override // p193y5.InterfaceC7917c
    /* synthetic */ void onError(Throwable th);

    @Override // p193y5.InterfaceC7917c
    /* synthetic */ void onNext(Object obj);

    @Override // p193y5.InterfaceC7917c
    void onSubscribe(@NonNull InterfaceC7918d interfaceC7918d);
}
