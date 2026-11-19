package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class OperatorElementAt<T> implements Observable.Operator<T, T> {
    final T defaultValue;
    final boolean hasDefault;
    final int index;

    static class InnerProducer extends AtomicBoolean implements Producer {
        private static final long serialVersionUID = 1;
        final Producer actual;

        public InnerProducer(Producer producer) {
            this.actual = producer;
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j4 <= 0 || !compareAndSet(false, true)) {
                return;
            }
            this.actual.request(Long.MAX_VALUE);
        }
    }

    public OperatorElementAt(int i4) {
        this(i4, null, false);
    }

    public OperatorElementAt(int i4, T t3) {
        this(i4, t3, true);
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OperatorElementAt.1
            private int currentIndex;

            @Override // p147rx.Observer
            public void onCompleted() {
                int i4 = this.currentIndex;
                OperatorElementAt operatorElementAt = OperatorElementAt.this;
                if (i4 <= operatorElementAt.index) {
                    if (operatorElementAt.hasDefault) {
                        subscriber.onNext(operatorElementAt.defaultValue);
                        subscriber.onCompleted();
                        return;
                    }
                    subscriber.onError(new IndexOutOfBoundsException(OperatorElementAt.this.index + " is out of bounds"));
                }
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                int i4 = this.currentIndex;
                this.currentIndex = i4 + 1;
                if (i4 == OperatorElementAt.this.index) {
                    subscriber.onNext(t3);
                    subscriber.onCompleted();
                    unsubscribe();
                }
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(new InnerProducer(producer));
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }

    private OperatorElementAt(int i4, T t3, boolean z3) {
        if (i4 >= 0) {
            this.index = i4;
            this.defaultValue = t3;
            this.hasDefault = z3;
        } else {
            throw new IndexOutOfBoundsException(i4 + " is out of bounds");
        }
    }
}
