package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int prefetch;
    final InterfaceC8988b source;

    public FlowableConcatMapPublisher(InterfaceC8988b interfaceC8988b, Function<? super T, ? extends InterfaceC8988b> function, int i10, ErrorMode errorMode) {
        this.source = interfaceC8988b;
        this.mapper = function;
        this.prefetch = i10;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC8989c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(interfaceC8989c, this.mapper, this.prefetch, this.errorMode));
    }
}
