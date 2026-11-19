package p147rx;

import p147rx.internal.util.SubscriptionList;

/* loaded from: classes.dex */
public abstract class SingleSubscriber<T> implements Subscription {

    /* renamed from: cs */
    private final SubscriptionList f11767cs = new SubscriptionList();

    public final void add(Subscription subscription) {
        this.f11767cs.add(subscription);
    }

    @Override // p147rx.Subscription
    public final boolean isUnsubscribed() {
        return this.f11767cs.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    public abstract void onSuccess(T t3);

    @Override // p147rx.Subscription
    public final void unsubscribe() {
        this.f11767cs.unsubscribe();
    }
}
