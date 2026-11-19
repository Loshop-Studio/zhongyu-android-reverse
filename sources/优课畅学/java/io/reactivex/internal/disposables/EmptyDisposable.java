package io.reactivex.internal.disposables;

import p008a7.InterfaceC0042a;
import p277v6.InterfaceC10250b;

/* loaded from: classes5.dex */
public enum EmptyDisposable implements InterfaceC0042a, InterfaceC10250b {
    INSTANCE,
    NEVER;

    @Override // p008a7.InterfaceC0044c
    public void clear() {
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // p008a7.InterfaceC0044c
    public boolean isEmpty() {
        return true;
    }

    @Override // p008a7.InterfaceC0044c
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p008a7.InterfaceC0044c
    public Object poll() {
        return null;
    }
}
