package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class BooleanSubscription extends AtomicBoolean implements InterfaceC7918d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // p193y5.InterfaceC7918d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
        SubscriptionHelper.validate(j6);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
