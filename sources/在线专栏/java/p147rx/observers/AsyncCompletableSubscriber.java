package p147rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import p147rx.CompletableSubscriber;
import p147rx.Subscription;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public abstract class AsyncCompletableSubscriber implements CompletableSubscriber, Subscription {
    static final Unsubscribed UNSUBSCRIBED = new Unsubscribed();
    private final AtomicReference<Subscription> upstream = new AtomicReference<>();

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

    protected final void clear() {
        this.upstream.set(UNSUBSCRIBED);
    }

    @Override // p147rx.Subscription
    public final boolean isUnsubscribed() {
        return this.upstream.get() == UNSUBSCRIBED;
    }

    protected void onStart() {
    }

    @Override // p147rx.CompletableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (this.upstream.compareAndSet(null, subscription)) {
            onStart();
            return;
        }
        subscription.unsubscribe();
        if (this.upstream.get() != UNSUBSCRIBED) {
            RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
        }
    }

    @Override // p147rx.Subscription
    public final void unsubscribe() {
        Subscription andSet;
        Subscription subscription = this.upstream.get();
        Unsubscribed unsubscribed = UNSUBSCRIBED;
        if (subscription == unsubscribed || (andSet = this.upstream.getAndSet(unsubscribed)) == null || andSet == unsubscribed) {
            return;
        }
        andSet.unsubscribe();
    }
}
