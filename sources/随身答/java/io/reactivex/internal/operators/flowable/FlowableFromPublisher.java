package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final InterfaceC0049b publisher;

    public FlowableFromPublisher(InterfaceC0049b interfaceC0049b) {
        this.publisher = interfaceC0049b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.publisher.subscribe(interfaceC0050c);
    }
}
