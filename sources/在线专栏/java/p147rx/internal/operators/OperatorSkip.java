package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class OperatorSkip<T> implements Observable.Operator<T, T> {
    final int toSkip;

    public OperatorSkip(int i4) {
        if (i4 >= 0) {
            this.toSkip = i4;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i4);
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkip.1
            int skipped;

            @Override // p147rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                int i4 = this.skipped;
                if (i4 >= OperatorSkip.this.toSkip) {
                    subscriber.onNext(t3);
                } else {
                    this.skipped = i4 + 1;
                }
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(producer);
                producer.request(OperatorSkip.this.toSkip);
            }
        };
    }
}
