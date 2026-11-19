package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, InterfaceC8990d {
    final InterfaceC8989c subscriber;
    Disposable upstream;

    public SubscriberCompletableObserver(InterfaceC8989c interfaceC8989c) {
        this.subscriber = interfaceC8989c;
    }

    @Override // p215q9.InterfaceC8990d
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

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
    }
}
