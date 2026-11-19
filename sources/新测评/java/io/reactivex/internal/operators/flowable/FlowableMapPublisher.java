package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final InterfaceC8988b source;

    public FlowableMapPublisher(InterfaceC8988b interfaceC8988b, Function<? super T, ? extends U> function) {
        this.source = interfaceC8988b;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new FlowableMap.MapSubscriber(interfaceC8989c, this.mapper));
    }
}
