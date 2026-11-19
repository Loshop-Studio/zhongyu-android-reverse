package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p277v6.InterfaceC10250b;
import p321z6.AbstractC10726b;

/* loaded from: classes5.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements InterfaceC10250b {
    public ReferenceDisposable(Object obj) {
        super(AbstractC10726b.m20030c(obj, "value is null"));
    }

    /* renamed from: a */
    public abstract void mo15519a(Object obj);

    @Override // p277v6.InterfaceC10250b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo15519a(andSet);
    }

    @Override // p277v6.InterfaceC10250b
    public final boolean isDisposed() {
        return get() == null;
    }
}
