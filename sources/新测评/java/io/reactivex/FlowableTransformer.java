package io.reactivex;

import io.reactivex.annotations.NonNull;
import p215q9.InterfaceC8988b;

/* loaded from: classes5.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    InterfaceC8988b apply(@NonNull Flowable<Upstream> flowable);
}
