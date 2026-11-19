package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC0049b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final InterfaceC0049b source;

    public FlowableConcatMapEagerPublisher(InterfaceC0049b interfaceC0049b, Function<? super T, ? extends InterfaceC0049b> function, int i9, int i10, ErrorMode errorMode) {
        this.source = interfaceC0049b;
        this.mapper = function;
        this.maxConcurrency = i9;
        this.prefetch = i10;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(interfaceC0050c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
