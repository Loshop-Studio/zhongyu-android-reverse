package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public enum EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, InterfaceC8990d, Disposable {
    INSTANCE;

    public static <T> Observer<T> asObserver() {
        return INSTANCE;
    }

    public static <T> InterfaceC8989c asSubscriber() {
        return INSTANCE;
    }

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onComplete() {
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(Object obj) {
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        interfaceC8990d.cancel();
    }
}
