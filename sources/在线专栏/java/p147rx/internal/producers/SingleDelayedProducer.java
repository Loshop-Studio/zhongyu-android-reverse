package p147rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;

/* loaded from: classes2.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements Producer {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final Subscriber<? super T> child;
    T value;

    public SingleDelayedProducer(Subscriber<? super T> subscriber) {
        this.child = subscriber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void emit(Subscriber<? super T> subscriber, T t3) {
        if (subscriber.isUnsubscribed()) {
            return;
        }
        try {
            subscriber.onNext(t3);
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onCompleted();
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber, t3);
        }
    }

    @Override // p147rx.Producer
    public void request(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j4 == 0) {
            return;
        }
        do {
            int i4 = get();
            if (i4 != 0) {
                if (i4 == 1 && compareAndSet(1, 3)) {
                    emit(this.child, this.value);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public void setValue(T t3) {
        do {
            int i4 = get();
            if (i4 != 0) {
                if (i4 == 2 && compareAndSet(2, 3)) {
                    emit(this.child, t3);
                    return;
                }
                return;
            }
            this.value = t3;
        } while (!compareAndSet(0, 1));
    }
}
