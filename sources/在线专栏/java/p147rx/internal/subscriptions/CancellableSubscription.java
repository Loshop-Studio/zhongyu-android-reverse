package p147rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Cancellable;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class CancellableSubscription extends AtomicReference<Cancellable> implements Subscription {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(Cancellable cancellable) {
        super(cancellable);
    }

    @Override // p147rx.Subscription
    public boolean isUnsubscribed() {
        return get() == null;
    }

    @Override // p147rx.Subscription
    public void unsubscribe() {
        Cancellable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e4) {
            Exceptions.throwIfFatal(e4);
            RxJavaHooks.onError(e4);
        }
    }
}
