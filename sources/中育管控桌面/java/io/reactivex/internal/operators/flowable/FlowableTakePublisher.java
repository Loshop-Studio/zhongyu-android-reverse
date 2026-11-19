package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final InterfaceC7916b source;

    public FlowableTakePublisher(InterfaceC7916b interfaceC7916b, long j6) {
        this.source = interfaceC7916b;
        this.limit = j6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(interfaceC7917c, this.limit));
    }
}
