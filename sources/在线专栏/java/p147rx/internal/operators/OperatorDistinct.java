package p147rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.functions.Func1;
import p147rx.internal.util.UtilityFunctions;

/* loaded from: classes2.dex */
public final class OperatorDistinct<T, U> implements Observable.Operator<T, T> {
    final Func1<? super T, ? extends U> keySelector;

    static final class Holder {
        static final OperatorDistinct<?, ?> INSTANCE = new OperatorDistinct<>(UtilityFunctions.identity());

        Holder() {
        }
    }

    public OperatorDistinct(Func1<? super T, ? extends U> func1) {
        this.keySelector = func1;
    }

    public static <T> OperatorDistinct<T, T> instance() {
        return (OperatorDistinct<T, T>) Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDistinct.1
            Set<U> keyMemory = new HashSet();

            @Override // p147rx.Observer
            public void onCompleted() {
                this.keyMemory = null;
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                this.keyMemory = null;
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                if (this.keyMemory.add(OperatorDistinct.this.keySelector.call(t3))) {
                    subscriber.onNext(t3);
                } else {
                    request(1L);
                }
            }
        };
    }
}
