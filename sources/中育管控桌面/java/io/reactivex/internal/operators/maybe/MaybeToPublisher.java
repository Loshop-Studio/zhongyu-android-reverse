package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import p193y5.InterfaceC7916b;

/* loaded from: classes4.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, InterfaceC7916b> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, InterfaceC7916b> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public InterfaceC7916b apply(MaybeSource<Object> maybeSource) {
        return new MaybeToFlowable(maybeSource);
    }
}
