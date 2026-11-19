package p147rx.internal.operators;

import java.util.NoSuchElementException;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.internal.producers.SingleProducer;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OperatorSingle<T> implements Observable.Operator<T, T> {
    private final T defaultValue;
    private final boolean hasDefaultValue;

    static final class Holder {
        static final OperatorSingle<?> INSTANCE = new OperatorSingle<>();

        Holder() {
        }
    }

    static final class ParentSubscriber<T> extends Subscriber<T> {
        private final Subscriber<? super T> child;
        private final T defaultValue;
        private final boolean hasDefaultValue;
        private boolean hasTooManyElements;
        private boolean isNonEmpty;
        private T value;

        ParentSubscriber(Subscriber<? super T> subscriber, boolean z3, T t3) {
            this.child = subscriber;
            this.hasDefaultValue = z3;
            this.defaultValue = t3;
            request(2L);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.hasTooManyElements) {
                return;
            }
            if (this.isNonEmpty) {
                this.child.setProducer(new SingleProducer(this.child, this.value));
            } else if (this.hasDefaultValue) {
                this.child.setProducer(new SingleProducer(this.child, this.defaultValue));
            } else {
                this.child.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.hasTooManyElements) {
                RxJavaHooks.onError(th);
            } else {
                this.child.onError(th);
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.hasTooManyElements) {
                return;
            }
            if (!this.isNonEmpty) {
                this.value = t3;
                this.isNonEmpty = true;
            } else {
                this.hasTooManyElements = true;
                this.child.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    OperatorSingle() {
        this(false, null);
    }

    public static <T> OperatorSingle<T> instance() {
        return (OperatorSingle<T>) Holder.INSTANCE;
    }

    public OperatorSingle(T t3) {
        this(true, t3);
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        ParentSubscriber parentSubscriber = new ParentSubscriber(subscriber, this.hasDefaultValue, this.defaultValue);
        subscriber.add(parentSubscriber);
        return parentSubscriber;
    }

    private OperatorSingle(boolean z3, T t3) {
        this.hasDefaultValue = z3;
        this.defaultValue = t3;
    }
}
