package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC0049b> mapper;
    final int prefetch;
    final InterfaceC0049b source;

    public FlowableConcatMapPublisher(InterfaceC0049b interfaceC0049b, Function<? super T, ? extends InterfaceC0049b> function, int i9, ErrorMode errorMode) {
        this.source = interfaceC0049b;
        this.mapper = function;
        this.prefetch = i9;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC0050c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(interfaceC0050c, this.mapper, this.prefetch, this.errorMode));
    }
}
