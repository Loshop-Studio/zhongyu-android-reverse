package com.jeremyliao.liveeventbus.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* loaded from: classes5.dex */
public interface Observable<T> {
    @Deprecated
    void broadcast(T t10);

    void broadcast(T t10, boolean z10, boolean z11);

    void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer);

    void observeForever(@NonNull Observer<T> observer);

    void observeSticky(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<T> observer);

    void observeStickyForever(@NonNull Observer<T> observer);

    void post(T t10);

    void postAcrossApp(T t10);

    void postAcrossProcess(T t10);

    void postDelay(LifecycleOwner lifecycleOwner, T t10, long j10);

    void postDelay(T t10, long j10);

    void postOrderly(T t10);

    void removeObserver(@NonNull Observer<T> observer);
}
