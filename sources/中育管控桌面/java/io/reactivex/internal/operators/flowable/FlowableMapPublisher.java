package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final InterfaceC7916b source;

    public FlowableMapPublisher(InterfaceC7916b interfaceC7916b, Function<? super T, ? extends U> function) {
        this.source = interfaceC7916b;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe(new FlowableMap.MapSubscriber(interfaceC7917c, this.mapper));
    }
}
