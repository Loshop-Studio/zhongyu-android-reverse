package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final InterfaceFutureC5453a mValueFuture;

    private ConstantObservable(@Nullable T t8) {
        this.mValueFuture = Futures.immediateFuture(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$addObserver$0(Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            observer.onError(e);
        }
    }

    @NonNull
    public static <U> Observable<U> withValue(@Nullable U u8) {
        return u8 == null ? NULL_OBSERVABLE : new ConstantObservable(u8);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new RunnableC0365g(3, this, observer), executor);
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public InterfaceFutureC5453a fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
    }
}
