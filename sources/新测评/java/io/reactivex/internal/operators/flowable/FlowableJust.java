package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarCallable<T> {
    private final T value;

    public FlowableJust(T t10) {
        this.value = t10;
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
        return this.value;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        interfaceC8989c.onSubscribe(new ScalarSubscription(interfaceC8989c, this.value));
    }
}
