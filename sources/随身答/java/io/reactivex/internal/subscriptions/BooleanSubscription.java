package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class BooleanSubscription extends AtomicBoolean implements InterfaceC0051d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // p010a9.InterfaceC0051d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // p010a9.InterfaceC0051d
    public void request(long j9) {
        SubscriptionHelper.validate(j9);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
