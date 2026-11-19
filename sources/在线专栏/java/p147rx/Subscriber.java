package p147rx;

import p147rx.internal.util.SubscriptionList;

/* loaded from: classes.dex */
public abstract class Subscriber<T> implements Observer<T>, Subscription {
    private static final long NOT_SET = Long.MIN_VALUE;
    private Producer producer;
    private long requested;
    private final Subscriber<?> subscriber;
    private final SubscriptionList subscriptions;

    protected Subscriber() {
        this(null, false);
    }

    private void addToRequested(long j4) {
        long j5 = this.requested;
        if (j5 == NOT_SET) {
            this.requested = j4;
            return;
        }
        long j6 = j5 + j4;
        if (j6 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j6;
        }
    }

    public final void add(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    @Override // p147rx.Subscription
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    protected final void request(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j4);
        }
        synchronized (this) {
            Producer producer = this.producer;
            if (producer != null) {
                producer.request(j4);
            } else {
                addToRequested(j4);
            }
        }
    }

    public void setProducer(Producer producer) {
        long j4;
        Subscriber<?> subscriber;
        boolean z3;
        synchronized (this) {
            j4 = this.requested;
            this.producer = producer;
            subscriber = this.subscriber;
            z3 = subscriber != null && j4 == NOT_SET;
        }
        if (z3) {
            subscriber.setProducer(producer);
        } else if (j4 == NOT_SET) {
            producer.request(Long.MAX_VALUE);
        } else {
            producer.request(j4);
        }
    }

    @Override // p147rx.Subscription
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected Subscriber(Subscriber<?> subscriber) {
        this(subscriber, true);
    }

    protected Subscriber(Subscriber<?> subscriber, boolean z3) {
        this.requested = NOT_SET;
        this.subscriber = subscriber;
        this.subscriptions = (!z3 || subscriber == null) ? new SubscriptionList() : subscriber.subscriptions;
    }
}
