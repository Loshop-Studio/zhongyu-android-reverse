package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int maxConcurrency;
    final InterfaceC8988b source;

    public FlowableFlatMapPublisher(InterfaceC8988b interfaceC8988b, Function<? super T, ? extends InterfaceC8988b> function, boolean z9, int i10, int i11) {
        this.source = interfaceC8988b;
        this.mapper = function;
        this.delayErrors = z9;
        this.maxConcurrency = i10;
        this.bufferSize = i11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC8989c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(interfaceC8989c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
