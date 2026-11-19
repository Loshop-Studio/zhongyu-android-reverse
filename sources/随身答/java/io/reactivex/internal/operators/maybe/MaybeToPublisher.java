package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import p010a9.InterfaceC0049b;

/* loaded from: classes5.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, InterfaceC0049b> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, InterfaceC0049b> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public InterfaceC0049b apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
