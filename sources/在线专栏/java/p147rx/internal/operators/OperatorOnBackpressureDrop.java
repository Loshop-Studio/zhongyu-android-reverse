package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action1;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public class OperatorOnBackpressureDrop<T> implements Observable.Operator<T, T> {
    final Action1<? super T> onDrop;

    static final class Holder {
        static final OperatorOnBackpressureDrop<Object> INSTANCE = new OperatorOnBackpressureDrop<>();

        Holder() {
        }
    }

    OperatorOnBackpressureDrop() {
        this(null);
    }

    public static <T> OperatorOnBackpressureDrop<T> instance() {
        return (OperatorOnBackpressureDrop<T>) Holder.INSTANCE;
    }

    public OperatorOnBackpressureDrop(Action1<? super T> action1) {
        this.onDrop = action1;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        final AtomicLong atomicLong = new AtomicLong();
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorOnBackpressureDrop.1
            @Override // p147rx.Producer
            public void request(long j4) {
                BackpressureUtils.getAndAddRequest(atomicLong, j4);
            }
        });
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorOnBackpressureDrop.2
            boolean done;

            @Override // p147rx.Observer
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                this.done = true;
                subscriber.onCompleted();
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
                if (atomicLong.get() > 0) {
                    subscriber.onNext(t3);
                    atomicLong.decrementAndGet();
                    return;
                }
                Action1<? super T> action1 = OperatorOnBackpressureDrop.this.onDrop;
                if (action1 != null) {
                    try {
                        action1.call(t3);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this, t3);
                    }
                }
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }
        };
    }
}
