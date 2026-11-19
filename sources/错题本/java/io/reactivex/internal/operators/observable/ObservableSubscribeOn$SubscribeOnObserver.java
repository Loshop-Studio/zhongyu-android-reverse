package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p145q5.InterfaceC6436g;
import p159s5.InterfaceC6559b;

/* loaded from: classes.dex */
final class ObservableSubscribeOn$SubscribeOnObserver<T> extends AtomicReference<InterfaceC6559b> implements InterfaceC6436g, InterfaceC6559b {
    private static final long serialVersionUID = 8094547886072529208L;
    final InterfaceC6436g downstream;
    final AtomicReference<InterfaceC6559b> upstream = new AtomicReference<>();

    public ObservableSubscribeOn$SubscribeOnObserver(InterfaceC6436g interfaceC6436g) {
        this.downstream = interfaceC6436g;
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // p145q5.InterfaceC6436g
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // p145q5.InterfaceC6436g
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // p145q5.InterfaceC6436g
    public void onNext(T t8) {
        this.downstream.onNext(t8);
    }

    @Override // p145q5.InterfaceC6436g
    public void onSubscribe(InterfaceC6559b interfaceC6559b) {
        DisposableHelper.setOnce(this.upstream, interfaceC6559b);
    }

    public void setDisposable(InterfaceC6559b interfaceC6559b) {
        DisposableHelper.setOnce(this, interfaceC6559b);
    }
}
