package p147rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import p147rx.Observable;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public class OperatorSkipLast<T> implements Observable.Operator<T, T> {
    final int count;

    public OperatorSkipLast(int i4) {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.count = i4;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipLast.1
            private final Deque<Object> deque = new ArrayDeque();

            @Override // p147rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p147rx.Observer
            public void onNext(T t3) {
                if (OperatorSkipLast.this.count == 0) {
                    subscriber.onNext(t3);
                    return;
                }
                if (this.deque.size() == OperatorSkipLast.this.count) {
                    subscriber.onNext(NotificationLite.getValue(this.deque.removeFirst()));
                } else {
                    request(1L);
                }
                this.deque.offerLast(NotificationLite.next(t3));
            }
        };
    }
}
