package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, InterfaceC0051d {
    final InterfaceC0050c subscriber;
    Disposable upstream;

    public SubscriberCompletableObserver(InterfaceC0050c interfaceC0050c) {
        this.subscriber = interfaceC0050c;
    }

    @Override // p010a9.InterfaceC0051d
    public void cancel() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.subscriber.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }

    @Override // p010a9.InterfaceC0051d
    public void request(long j9) {
    }
}
