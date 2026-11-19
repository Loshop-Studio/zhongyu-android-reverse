package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import p215q9.InterfaceC8988b;

/* loaded from: classes5.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, InterfaceC8988b> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, InterfaceC8988b> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public InterfaceC8988b apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
