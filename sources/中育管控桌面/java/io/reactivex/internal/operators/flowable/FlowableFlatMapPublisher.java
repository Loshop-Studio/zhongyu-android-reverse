package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC7916b> mapper;
    final int maxConcurrency;
    final InterfaceC7916b source;

    public FlowableFlatMapPublisher(InterfaceC7916b interfaceC7916b, Function<? super T, ? extends InterfaceC7916b> function, boolean z6, int i6, int i7) {
        this.source = interfaceC7916b;
        this.mapper = function;
        this.delayErrors = z6;
        this.maxConcurrency = i6;
        this.bufferSize = i7;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC7917c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(interfaceC7917c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
