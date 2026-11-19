package androidx.navigation.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class AtomicInt {
    private final AtomicInteger atomicInt;

    public AtomicInt(int i10) {
        this.atomicInt = new AtomicInteger(i10);
    }

    public final int decrementAndGet$navigation_runtime_release() {
        return this.atomicInt.decrementAndGet();
    }

    public final int get$navigation_runtime_release() {
        return this.atomicInt.get();
    }

    public final int incrementAndGet$navigation_runtime_release() {
        return this.atomicInt.incrementAndGet();
    }
}
