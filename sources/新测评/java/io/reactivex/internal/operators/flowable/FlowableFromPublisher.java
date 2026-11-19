package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final InterfaceC8988b publisher;

    public FlowableFromPublisher(InterfaceC8988b interfaceC8988b) {
        this.publisher = interfaceC8988b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.publisher.subscribe(interfaceC8989c);
    }
}
