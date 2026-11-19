package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class CompletableFromObservable<T> extends Completable {
    final ObservableSource<T> observable;

    public static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* renamed from: co */
        final CompletableObserver f14114co;

        public CompletableFromObservableObserver(CompletableObserver completableObserver) {
            this.f14114co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f14114co.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f14114co.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t9) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f14114co.onSubscribe(disposable);
        }
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.observable = observableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.observable.subscribe(new CompletableFromObservableObserver(completableObserver));
    }
}
