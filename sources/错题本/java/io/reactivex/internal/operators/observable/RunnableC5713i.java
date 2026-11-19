package io.reactivex.internal.operators.observable;

/* renamed from: io.reactivex.internal.operators.observable.i */
/* loaded from: classes.dex */
public final class RunnableC5713i implements Runnable {

    /* renamed from: a */
    public final ObservableSubscribeOn$SubscribeOnObserver f9012a;

    /* renamed from: b */
    public final /* synthetic */ C5714j f9013b;

    public RunnableC5713i(C5714j c5714j, ObservableSubscribeOn$SubscribeOnObserver observableSubscribeOn$SubscribeOnObserver) {
        this.f9013b = c5714j;
        this.f9012a = observableSubscribeOn$SubscribeOnObserver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9013b.f8999a.m6078b(this.f9012a);
    }
}
