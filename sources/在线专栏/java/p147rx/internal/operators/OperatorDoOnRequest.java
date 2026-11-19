package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.functions.Action1;

/* loaded from: classes2.dex */
public class OperatorDoOnRequest<T> implements Observable.Operator<T, T> {
    final Action1<? super Long> request;

    static final class ParentSubscriber<T> extends Subscriber<T> {
        private final Subscriber<? super T> child;

        ParentSubscriber(Subscriber<? super T> subscriber) {
            this.child = subscriber;
            request(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j4) {
            request(j4);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.child.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.child.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.child.onNext(t3);
        }
    }

    public OperatorDoOnRequest(Action1<? super Long> action1) {
        this.request = action1;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final ParentSubscriber parentSubscriber = new ParentSubscriber(subscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorDoOnRequest.1
            @Override // p147rx.Producer
            public void request(long j4) {
                OperatorDoOnRequest.this.request.call(Long.valueOf(j4));
                parentSubscriber.requestMore(j4);
            }
        });
        subscriber.add(parentSubscriber);
        return parentSubscriber;
    }
}
