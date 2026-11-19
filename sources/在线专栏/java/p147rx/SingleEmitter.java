package p147rx;

import p147rx.functions.Cancellable;

/* loaded from: classes.dex */
public interface SingleEmitter<T> {
    void onError(Throwable th);

    void onSuccess(T t3);

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
