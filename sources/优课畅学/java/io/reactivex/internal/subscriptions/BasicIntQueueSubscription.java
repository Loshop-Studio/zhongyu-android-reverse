package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p008a7.InterfaceC0043b;

/* loaded from: classes5.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements InterfaceC0043b {
    @Override // p008a7.InterfaceC0044c
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
