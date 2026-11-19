package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        } else {
            RxJavaPlugins.onError(th);
        }
        countDown();
    }

    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        if (this.value == null) {
            this.value = t10;
            this.upstream.cancel();
            countDown();
        }
    }
}
