package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final InterfaceC8988b source;

    public FlowableTakePublisher(InterfaceC8988b interfaceC8988b, long j10) {
        this.source = interfaceC8988b;
        this.limit = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(interfaceC8989c, this.limit));
    }
}
