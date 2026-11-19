package com.alibaba.sdk.android.emas;

/* loaded from: classes3.dex */
public interface Cache<T> {
    void add(T t10);

    void clear();

    T get();

    boolean remove(T t10);
}
