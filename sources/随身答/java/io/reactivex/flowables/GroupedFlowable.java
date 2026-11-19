package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {
    final K key;

    public GroupedFlowable(@Nullable K k9) {
        this.key = k9;
    }

    @Nullable
    public K getKey() {
        return this.key;
    }
}
