package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p145q5.AbstractC6434e;
import p145q5.InterfaceC6436g;

/* renamed from: io.reactivex.internal.operators.observable.d */
/* loaded from: classes.dex */
public final class CallableC5708d extends AbstractC6434e implements Callable {

    /* renamed from: a */
    public final Long f9001a;

    public CallableC5708d(Long l) {
        this.f9001a = l;
    }

    @Override // p145q5.AbstractC6434e
    /* renamed from: c */
    public final void mo2173c(InterfaceC6436g interfaceC6436g) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(interfaceC6436g, this.f9001a);
        interfaceC6436g.onSubscribe(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f9001a;
    }
}
