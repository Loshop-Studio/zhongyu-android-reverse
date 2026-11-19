package io.reactivex;

import io.reactivex.annotations.NonNull;
import p010a9.InterfaceC0049b;

/* loaded from: classes5.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    InterfaceC0049b apply(@NonNull Flowable<Upstream> flowable);
}
