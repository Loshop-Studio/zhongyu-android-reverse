package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final InterfaceC0049b source;

    public FlowableMapPublisher(InterfaceC0049b interfaceC0049b, Function<? super T, ? extends U> function) {
        this.source = interfaceC0049b;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe(new FlowableMap.MapSubscriber(interfaceC0050c, this.mapper));
    }
}
