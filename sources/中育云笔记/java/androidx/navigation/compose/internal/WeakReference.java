package androidx.navigation.compose.internal;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class WeakReference<T> {
    public static final int $stable = 8;
    private final java.lang.ref.WeakReference<T> weakReference;

    public WeakReference(T t10) {
        this.weakReference = new java.lang.ref.WeakReference<>(t10);
    }

    public final void clear() {
        this.weakReference.clear();
    }

    public final T get() {
        return this.weakReference.get();
    }
}
