package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC7916b> mapper;
    final int prefetch;
    final InterfaceC7916b source;

    public FlowableConcatMapPublisher(InterfaceC7916b interfaceC7916b, Function<? super T, ? extends InterfaceC7916b> function, int i6, ErrorMode errorMode) {
        this.source = interfaceC7916b;
        this.mapper = function;
        this.prefetch = i6;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC7917c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(interfaceC7917c, this.mapper, this.prefetch, this.errorMode));
    }
}
