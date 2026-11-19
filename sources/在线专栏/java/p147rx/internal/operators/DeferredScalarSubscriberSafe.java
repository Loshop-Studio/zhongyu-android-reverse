package p147rx.internal.operators;

import p147rx.Subscriber;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public abstract class DeferredScalarSubscriberSafe<T, R> extends DeferredScalarSubscriber<T, R> {
    protected boolean done;

    public DeferredScalarSubscriberSafe(Subscriber<? super R> subscriber) {
        super(subscriber);
    }

    @Override // p147rx.internal.operators.DeferredScalarSubscriber, p147rx.Observer
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        super.onCompleted();
    }

    @Override // p147rx.internal.operators.DeferredScalarSubscriber, p147rx.Observer
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaHooks.onError(th);
        } else {
            this.done = true;
            super.onError(th);
        }
    }
}
