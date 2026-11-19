package io.reactivex;

import io.reactivex.annotations.NonNull;
import p193y5.InterfaceC7916b;

/* loaded from: classes4.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    InterfaceC7916b apply(@NonNull Flowable<Upstream> flowable);
}
