package p147rx;

import p147rx.functions.Cancellable;

/* loaded from: classes.dex */
public interface CompletableEmitter {
    void onCompleted();

    void onError(Throwable th);

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
