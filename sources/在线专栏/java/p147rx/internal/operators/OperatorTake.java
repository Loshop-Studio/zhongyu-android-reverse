package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OperatorTake<T> implements Observable.Operator<T, T> {
    final int limit;

    /* renamed from: rx.internal.operators.OperatorTake$1 */
    class C32401 extends Subscriber<T> {
        boolean completed;
        int count;
        final /* synthetic */ Subscriber val$child;

        C32401(Subscriber subscriber) {
            this.val$child = subscriber;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.completed) {
                return;
            }
            this.completed = true;
            this.val$child.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.completed) {
                RxJavaHooks.onError(th);
                return;
            }
            this.completed = true;
            try {
                this.val$child.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (isUnsubscribed()) {
                return;
            }
            int i4 = this.count;
            int i5 = i4 + 1;
            this.count = i5;
            int i6 = OperatorTake.this.limit;
            if (i4 < i6) {
                boolean z3 = i5 == i6;
                this.val$child.onNext(t3);
                if (!z3 || this.completed) {
                    return;
                }
                this.completed = true;
                try {
                    this.val$child.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(final Producer producer) {
            this.val$child.setProducer(new Producer() { // from class: rx.internal.operators.OperatorTake.1.1
                final AtomicLong requested = new AtomicLong(0);

                @Override // p147rx.Producer
                public void request(long j4) {
                    long j5;
                    long jMin;
                    if (j4 <= 0 || C32401.this.completed) {
                        return;
                    }
                    do {
                        j5 = this.requested.get();
                        jMin = Math.min(j4, OperatorTake.this.limit - j5);
                        if (jMin == 0) {
                            return;
                        }
                    } while (!this.requested.compareAndSet(j5, j5 + jMin));
                    producer.request(jMin);
                }
            });
        }
    }

    public OperatorTake(int i4) {
        if (i4 >= 0) {
            this.limit = i4;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i4);
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C32401 c32401 = new C32401(subscriber);
        if (this.limit == 0) {
            subscriber.onCompleted();
            c32401.unsubscribe();
        }
        subscriber.add(c32401);
        return c32401;
    }
}
