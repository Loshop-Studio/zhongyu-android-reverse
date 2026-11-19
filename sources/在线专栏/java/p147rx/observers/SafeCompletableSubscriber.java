package p147rx.observers;

import p147rx.CompletableSubscriber;
import p147rx.Subscription;
import p147rx.exceptions.CompositeException;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.OnCompletedFailedException;
import p147rx.exceptions.OnErrorFailedException;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class SafeCompletableSubscriber implements CompletableSubscriber, Subscription {
    final CompletableSubscriber actual;
    boolean done;

    /* renamed from: s */
    Subscription f11806s;

    public SafeCompletableSubscriber(CompletableSubscriber completableSubscriber) {
        this.actual = completableSubscriber;
    }

    @Override // p147rx.Subscription
    public boolean isUnsubscribed() {
        return this.done || this.f11806s.isUnsubscribed();
    }

    @Override // p147rx.CompletableSubscriber
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.actual.onCompleted();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw new OnCompletedFailedException(th);
        }
    }

    @Override // p147rx.CompletableSubscriber
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaHooks.onError(th);
            return;
        }
        this.done = true;
        try {
            this.actual.onError(th);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    @Override // p147rx.CompletableSubscriber
    public void onSubscribe(Subscription subscription) {
        this.f11806s = subscription;
        try {
            this.actual.onSubscribe(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscription.unsubscribe();
            onError(th);
        }
    }

    @Override // p147rx.Subscription
    public void unsubscribe() {
        this.f11806s.unsubscribe();
    }
}
