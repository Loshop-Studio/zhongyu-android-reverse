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
        final CompletableObserver f13300co;

        public CompletableFromObservableObserver(CompletableObserver completableObserver) {
            this.f13300co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f13300co.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f13300co.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t10) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f13300co.onSubscribe(disposable);
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
