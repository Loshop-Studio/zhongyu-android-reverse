package io.reactivex.subscribers;

import ba.InterfaceC5219c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p088e7.AbstractC8369b;
import p244s6.InterfaceC10048e;
import p277v6.InterfaceC10250b;

/* renamed from: io.reactivex.subscribers.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8974a implements InterfaceC10048e, InterfaceC10250b {
    final AtomicReference<InterfaceC5219c> upstream = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    @Override // p277v6.InterfaceC10250b
    public final void dispose() {
        SubscriptionHelper.m15569a(this.upstream);
    }

    @Override // p277v6.InterfaceC10250b
    public final boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // ba.InterfaceC5218b
    public final void onSubscribe(InterfaceC5219c interfaceC5219c) {
        if (AbstractC8369b.m13659c(this.upstream, interfaceC5219c, getClass())) {
            onStart();
        }
    }

    public final void request(long j10) {
        this.upstream.get().request(j10);
    }
}
