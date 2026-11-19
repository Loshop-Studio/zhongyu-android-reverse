package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC0049b> mapper;
    final int maxConcurrency;
    final InterfaceC0049b source;

    public FlowableFlatMapPublisher(InterfaceC0049b interfaceC0049b, Function<? super T, ? extends InterfaceC0049b> function, boolean z9, int i9, int i10) {
        this.source = interfaceC0049b;
        this.mapper = function;
        this.delayErrors = z9;
        this.maxConcurrency = i9;
        this.bufferSize = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC0050c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(interfaceC0050c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
