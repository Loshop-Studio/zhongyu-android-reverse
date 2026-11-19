package io.reactivex.internal.subscribers;

/* loaded from: classes5.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        this.value = null;
        this.error = th;
        countDown();
    }

    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        this.value = t10;
    }
}
