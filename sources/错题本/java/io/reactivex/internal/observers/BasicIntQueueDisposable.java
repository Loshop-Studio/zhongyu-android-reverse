package io.reactivex.internal.observers;

import io.reactivex.annotations.Nullable;
import java.util.concurrent.atomic.AtomicInteger;
import p192w5.InterfaceC6720a;

/* loaded from: classes.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements InterfaceC6720a {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // p192w5.InterfaceC6721b
    public abstract /* synthetic */ void clear();

    @Override // p159s5.InterfaceC6559b
    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    @Override // p192w5.InterfaceC6721b
    public abstract /* synthetic */ boolean isEmpty();

    @Override // p192w5.InterfaceC6721b
    public final boolean offer(T t8) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // p192w5.InterfaceC6721b
    @Nullable
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // p192w5.InterfaceC6720a
    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t8, T t9) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
