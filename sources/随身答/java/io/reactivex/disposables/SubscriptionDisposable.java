package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
final class SubscriptionDisposable extends ReferenceDisposable<InterfaceC0051d> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(InterfaceC0051d interfaceC0051d) {
        super(interfaceC0051d);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull InterfaceC0051d interfaceC0051d) {
        interfaceC0051d.cancel();
    }
}
