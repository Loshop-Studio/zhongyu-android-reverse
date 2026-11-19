package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p159s5.InterfaceC6559b;
import p168t5.InterfaceC6598b;

/* loaded from: classes.dex */
public final class CancellableDisposable extends AtomicReference<InterfaceC6598b> implements InterfaceC6559b {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(InterfaceC6598b interfaceC6598b) {
        super(interfaceC6598b);
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
        if (get() != null && getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
