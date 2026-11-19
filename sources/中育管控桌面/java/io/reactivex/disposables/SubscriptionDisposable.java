package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
final class SubscriptionDisposable extends ReferenceDisposable<InterfaceC7918d> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(InterfaceC7918d interfaceC7918d) {
        super(interfaceC7918d);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull InterfaceC7918d interfaceC7918d) {
        interfaceC7918d.cancel();
    }
}
