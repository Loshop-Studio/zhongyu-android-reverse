package p147rx.observers;

import p147rx.Observer;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public class SerializedSubscriber<T> extends Subscriber<T> {

    /* renamed from: s */
    private final Observer<T> f11807s;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.f11807s.onCompleted();
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.f11807s.onError(th);
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        this.f11807s.onNext(t3);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z3) {
        super(subscriber, z3);
        this.f11807s = new SerializedObserver(subscriber);
    }
}
