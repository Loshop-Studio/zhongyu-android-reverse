package p147rx.subscriptions;

import java.util.concurrent.Future;
import p147rx.Subscription;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class Subscriptions {
    private static final Unsubscribed UNSUBSCRIBED = new Unsubscribed();

    static final class FutureSubscription implements Subscription {

        /* renamed from: f */
        final Future<?> f11809f;

        public FutureSubscription(Future<?> future) {
            this.f11809f = future;
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.f11809f.isCancelled();
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.f11809f.cancel(true);
        }
    }

    static final class Unsubscribed implements Subscription {
        Unsubscribed() {
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
        }
    }

    private Subscriptions() {
        throw new IllegalStateException("No instances!");
    }

    public static Subscription create(Action0 action0) {
        return BooleanSubscription.create(action0);
    }

    public static Subscription empty() {
        return BooleanSubscription.create();
    }

    public static Subscription from(Future<?> future) {
        return new FutureSubscription(future);
    }

    public static Subscription unsubscribed() {
        return UNSUBSCRIBED;
    }

    public static CompositeSubscription from(Subscription... subscriptionArr) {
        return new CompositeSubscription(subscriptionArr);
    }
}
