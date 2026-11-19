package io.reactivex;

import io.reactivex.annotations.NonNull;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public interface FlowableSubscriber<T> extends InterfaceC8989c {
    @Override // p215q9.InterfaceC8989c
    /* synthetic */ void onComplete();

    @Override // p215q9.InterfaceC8989c
    /* synthetic */ void onError(Throwable th);

    @Override // p215q9.InterfaceC8989c
    /* synthetic */ void onNext(Object obj);

    @Override // p215q9.InterfaceC8989c
    void onSubscribe(@NonNull InterfaceC8990d interfaceC8990d);
}
