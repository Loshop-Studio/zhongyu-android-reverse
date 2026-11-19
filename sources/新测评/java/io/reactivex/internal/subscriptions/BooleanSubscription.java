package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class BooleanSubscription extends AtomicBoolean implements InterfaceC8990d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
