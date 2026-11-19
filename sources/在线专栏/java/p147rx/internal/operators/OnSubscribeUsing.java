package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.CompositeException;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.functions.Func0;
import p147rx.functions.Func1;
import p147rx.observers.Subscribers;

/* loaded from: classes2.dex */
public final class OnSubscribeUsing<T, Resource> implements Observable.OnSubscribe<T> {
    private final Action1<? super Resource> dispose;
    private final boolean disposeEagerly;
    private final Func1<? super Resource, ? extends Observable<? extends T>> observableFactory;
    private final Func0<Resource> resourceFactory;

    static final class DisposeAction<Resource> extends AtomicBoolean implements Action0, Subscription {
        private static final long serialVersionUID = 4262875056400218316L;
        private Action1<? super Resource> dispose;
        private Resource resource;

        DisposeAction(Action1<? super Resource> action1, Resource resource) {
            this.dispose = action1;
            this.resource = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, rx.functions.Action1<? super Resource>] */
        @Override // p147rx.functions.Action0
        public void call() {
            if (compareAndSet(false, true)) {
                ?? r02 = (Resource) null;
                try {
                    this.dispose.call(this.resource);
                } finally {
                    this.resource = null;
                    this.dispose = null;
                }
            }
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Observable<? extends T>> func1, Action1<? super Resource> action1, boolean z3) {
        this.resourceFactory = func0;
        this.observableFactory = func1;
        this.dispose = action1;
        this.disposeEagerly = z3;
    }

    private Throwable dispose(Action0 action0) {
        try {
            action0.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        try {
            Resource resourceCall = this.resourceFactory.call();
            DisposeAction disposeAction = new DisposeAction(this.dispose, resourceCall);
            subscriber.add(disposeAction);
            try {
                Observable<? extends T> observableCall = this.observableFactory.call(resourceCall);
                try {
                    (this.disposeEagerly ? observableCall.doOnTerminate(disposeAction) : observableCall.doAfterTerminate(disposeAction)).unsafeSubscribe(Subscribers.wrap(subscriber));
                } catch (Throwable th) {
                    Throwable thDispose = dispose(disposeAction);
                    Exceptions.throwIfFatal(th);
                    Exceptions.throwIfFatal(thDispose);
                    if (thDispose != null) {
                        subscriber.onError(new CompositeException(th, thDispose));
                    } else {
                        subscriber.onError(th);
                    }
                }
            } catch (Throwable th2) {
                Throwable thDispose2 = dispose(disposeAction);
                Exceptions.throwIfFatal(th2);
                Exceptions.throwIfFatal(thDispose2);
                if (thDispose2 != null) {
                    subscriber.onError(new CompositeException(th2, thDispose2));
                } else {
                    subscriber.onError(th2);
                }
            }
        } catch (Throwable th3) {
            Exceptions.throwOrReport(th3, subscriber);
        }
    }
}
