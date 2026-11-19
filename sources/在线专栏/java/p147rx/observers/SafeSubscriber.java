package p147rx.observers;

import java.util.Arrays;
import p147rx.Subscriber;
import p147rx.exceptions.CompositeException;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.OnCompletedFailedException;
import p147rx.exceptions.OnErrorFailedException;
import p147rx.exceptions.OnErrorNotImplementedException;
import p147rx.exceptions.UnsubscribeFailedException;
import p147rx.plugins.RxJavaHooks;
import p147rx.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public class SafeSubscriber<T> extends Subscriber<T> {
    private final Subscriber<? super T> actual;
    boolean done;

    public SafeSubscriber(Subscriber<? super T> subscriber) {
        super(subscriber);
        this.actual = subscriber;
    }

    protected void _onError(Throwable th) {
        RxJavaPlugins.getInstance().getErrorHandler().handleError(th);
        try {
            this.actual.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                RxJavaHooks.onError(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e4) {
            try {
                unsubscribe();
                throw e4;
            } catch (Throwable th3) {
                RxJavaHooks.onError(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            RxJavaHooks.onError(th4);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                RxJavaHooks.onError(th5);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th4, th5)));
            }
        }
    }

    public Subscriber<? super T> getActual() {
        return this.actual;
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        UnsubscribeFailedException unsubscribeFailedException;
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.actual.onCompleted();
            try {
                unsubscribe();
            } finally {
            }
        } catch (Throwable th) {
            try {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
                throw new OnCompletedFailedException(th.getMessage(), th);
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        Exceptions.throwIfFatal(th);
        if (this.done) {
            return;
        }
        this.done = true;
        _onError(th);
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        try {
            if (this.done) {
                return;
            }
            this.actual.onNext(t3);
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, this);
        }
    }
}
