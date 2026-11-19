package p147rx.internal.subscriptions;

import p147rx.Subscription;

/* loaded from: classes2.dex */
public enum Unsubscribed implements Subscription {
    INSTANCE;

    @Override // p147rx.Subscription
    public boolean isUnsubscribed() {
        return true;
    }

    @Override // p147rx.Subscription
    public void unsubscribe() {
    }
}
