package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC7916b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final InterfaceC7916b source;

    public FlowableConcatMapEagerPublisher(InterfaceC7916b interfaceC7916b, Function<? super T, ? extends InterfaceC7916b> function, int i6, int i7, ErrorMode errorMode) {
        this.source = interfaceC7916b;
        this.mapper = function;
        this.maxConcurrency = i6;
        this.prefetch = i7;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(interfaceC7917c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
