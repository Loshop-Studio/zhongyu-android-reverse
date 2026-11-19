package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p277v6.InterfaceC10250b;

/* loaded from: classes5.dex */
public final class SequentialDisposable extends AtomicReference<InterfaceC10250b> implements InterfaceC10250b {
    public SequentialDisposable() {
    }

    /* renamed from: a */
    public boolean m15535a(InterfaceC10250b interfaceC10250b) {
        return DisposableHelper.m15531c(this, interfaceC10250b);
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
        DisposableHelper.m15529a(this);
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return DisposableHelper.m15530b(get());
    }

    public SequentialDisposable(InterfaceC10250b interfaceC10250b) {
        lazySet(interfaceC10250b);
    }
}
