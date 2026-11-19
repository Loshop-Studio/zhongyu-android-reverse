package androidx.camera.core.internal.utils;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface RingBuffer<T> {

    public interface OnRemoveCallback<T> {
        void onRemove(@NonNull T t8);
    }

    @NonNull
    T dequeue();

    void enqueue(@NonNull T t8);

    int getMaxCapacity();

    boolean isEmpty();
}
