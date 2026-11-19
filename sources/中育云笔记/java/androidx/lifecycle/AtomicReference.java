package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.camera.view.AbstractC0979q;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class AtomicReference<V> {
    private final java.util.concurrent.atomic.AtomicReference<V> base;

    public AtomicReference(V v10) {
        this.base = new java.util.concurrent.atomic.AtomicReference<>(v10);
    }

    public final boolean compareAndSet(V v10, V v11) {
        return AbstractC0979q.m884a(this.base, v10, v11);
    }

    public final V get() {
        return this.base.get();
    }
}
