package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final InterfaceC8988b source;

    public FlowableConcatMapEagerPublisher(InterfaceC8988b interfaceC8988b, Function<? super T, ? extends InterfaceC8988b> function, int i10, int i11, ErrorMode errorMode) {
        this.source = interfaceC8988b;
        this.mapper = function;
        this.maxConcurrency = i10;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(interfaceC8989c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
