package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final InterfaceC7916b publisher;

    public FlowableFromPublisher(InterfaceC7916b interfaceC7916b) {
        this.publisher = interfaceC7916b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.publisher.subscribe(interfaceC7917c);
    }
}
