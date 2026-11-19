package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final InterfaceC0049b source;

    public FlowableTakePublisher(InterfaceC0049b interfaceC0049b, long j9) {
        this.source = interfaceC0049b;
        this.limit = j9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(interfaceC0050c, this.limit));
    }
}
