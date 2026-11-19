package p147rx.subscriptions;

import p147rx.Subscription;
import p147rx.internal.subscriptions.SequentialSubscription;

/* loaded from: classes2.dex */
public final class MultipleAssignmentSubscription implements Subscription {
    final SequentialSubscription state = new SequentialSubscription();

    public Subscription get() {
        return this.state.current();
    }

    @Override // p147rx.Subscription
    public boolean isUnsubscribed() {
        return this.state.isUnsubscribed();
    }

    public void set(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.state.replace(subscription);
    }

    @Override // p147rx.Subscription
    public void unsubscribe() {
        this.state.unsubscribe();
    }
}
