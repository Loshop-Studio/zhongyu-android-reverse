package androidx.datastore.core.okio;

/* loaded from: classes2.dex */
public final class AtomicBoolean {
    private final java.util.concurrent.atomic.AtomicBoolean delegate;

    public AtomicBoolean(boolean z10) {
        this.delegate = new java.util.concurrent.atomic.AtomicBoolean(z10);
    }

    public final boolean get() {
        return this.delegate.get();
    }

    public final void set(boolean z10) {
        this.delegate.set(z10);
    }
}
