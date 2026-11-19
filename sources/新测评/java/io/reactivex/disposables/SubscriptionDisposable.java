package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
final class SubscriptionDisposable extends ReferenceDisposable<InterfaceC8990d> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(InterfaceC8990d interfaceC8990d) {
        super(interfaceC8990d);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull InterfaceC8990d interfaceC8990d) {
        interfaceC8990d.cancel();
    }
}
