package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func1;
import p147rx.internal.producers.SingleDelayedProducer;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OperatorAny<T> implements Observable.Operator<Boolean, T> {
    final Func1<? super T, Boolean> predicate;
    final boolean returnOnEmpty;

    public OperatorAny(Func1<? super T, Boolean> func1, boolean z3) {
        this.predicate = func1;
        this.returnOnEmpty = z3;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super Boolean> subscriber) {
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OperatorAny.1
            boolean done;
            boolean hasElements;

            @Override // p147rx.Observer
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                this.done = true;
                if (this.hasElements) {
                    singleDelayedProducer.setValue(Boolean.FALSE);
                } else {
                    singleDelayedProducer.setValue(Boolean.valueOf(OperatorAny.this.returnOnEmpty));
                }
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaHooks.onError(th);
                } else {
                    this.done = true;
                    subscriber.onError(th);
                }
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                if (this.done) {
                    return;
                }
                this.hasElements = true;
                try {
                    if (OperatorAny.this.predicate.call(t3).booleanValue()) {
                        this.done = true;
                        singleDelayedProducer.setValue(Boolean.valueOf(true ^ OperatorAny.this.returnOnEmpty));
                        unsubscribe();
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this, t3);
                }
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
