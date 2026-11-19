package p147rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;

/* loaded from: classes2.dex */
public final class SingleProducer<T> extends AtomicBoolean implements Producer {
    private static final long serialVersionUID = -3353584923995471404L;
    final Subscriber<? super T> child;
    final T value;

    public SingleProducer(Subscriber<? super T> subscriber, T t3) {
        this.child = subscriber;
        this.value = t3;
    }

    @Override // p147rx.Producer
    public void request(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j4 != 0 && compareAndSet(false, true)) {
            Subscriber<? super T> subscriber = this.child;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t3 = this.value;
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
    }
}
