package io.reactivex.disposables;

/* loaded from: classes5.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo15519a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
