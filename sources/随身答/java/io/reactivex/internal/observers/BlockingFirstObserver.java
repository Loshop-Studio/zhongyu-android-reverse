package io.reactivex.internal.observers;

/* loaded from: classes5.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        }
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t9) {
        if (this.value == null) {
            this.value = t9;
            this.upstream.dispose();
            countDown();
        }
    }
}
