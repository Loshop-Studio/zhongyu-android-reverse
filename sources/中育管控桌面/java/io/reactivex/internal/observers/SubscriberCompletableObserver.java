package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, InterfaceC7918d {
    final InterfaceC7917c subscriber;
    Disposable upstream;

    public SubscriberCompletableObserver(InterfaceC7917c interfaceC7917c) {
        this.subscriber = interfaceC7917c;
    }

    @Override // p193y5.InterfaceC7918d
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

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
    }
}
