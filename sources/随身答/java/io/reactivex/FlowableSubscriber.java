package io.reactivex;

import io.reactivex.annotations.NonNull;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public interface FlowableSubscriber<T> extends InterfaceC0050c {
    @Override // p010a9.InterfaceC0050c
    /* synthetic */ void onComplete();

    @Override // p010a9.InterfaceC0050c
    /* synthetic */ void onError(Throwable th);

    @Override // p010a9.InterfaceC0050c
    /* synthetic */ void onNext(Object obj);

    @Override // p010a9.InterfaceC0050c
    void onSubscribe(@NonNull InterfaceC0051d interfaceC0051d);
}
