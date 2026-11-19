package io.reactivex.internal.subscribers;

import ba.InterfaceC5218b;
import ba.InterfaceC5219c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p088e7.AbstractC8370c;
import p244s6.InterfaceC10048e;

/* loaded from: classes5.dex */
public class StrictSubscriber<T> extends AtomicInteger implements InterfaceC10048e, InterfaceC5219c {

    /* renamed from: a */
    public final InterfaceC5218b f17123a;

    /* renamed from: b */
    public final AtomicThrowable f17124b = new AtomicThrowable();

    /* renamed from: c */
    public final AtomicLong f17125c = new AtomicLong();

    /* renamed from: d */
    public final AtomicReference f17126d = new AtomicReference();

    /* renamed from: e */
    public final AtomicBoolean f17127e = new AtomicBoolean();

    /* renamed from: f */
    public volatile boolean f17128f;

    public StrictSubscriber(InterfaceC5218b interfaceC5218b) {
        this.f17123a = interfaceC5218b;
    }

    @Override // ba.InterfaceC5219c
    public void cancel() {
        if (this.f17128f) {
            return;
        }
        SubscriptionHelper.m15569a(this.f17126d);
    }

    @Override // ba.InterfaceC5218b
    public void onComplete() {
        this.f17128f = true;
        AbstractC8370c.m13660a(this.f17123a, this, this.f17124b);
    }

    @Override // ba.InterfaceC5218b
    public void onError(Throwable th) {
        this.f17128f = true;
        AbstractC8370c.m13661b(this.f17123a, th, this, this.f17124b);
    }

    @Override // ba.InterfaceC5218b
    public void onNext(Object obj) {
        AbstractC8370c.m13662c(this.f17123a, obj, this, this.f17124b);
    }

    @Override // ba.InterfaceC5218b
    public void onSubscribe(InterfaceC5219c interfaceC5219c) {
        if (this.f17127e.compareAndSet(false, true)) {
            this.f17123a.onSubscribe(this);
            SubscriptionHelper.m15571c(this.f17126d, this.f17125c, interfaceC5219c);
        } else {
            interfaceC5219c.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // ba.InterfaceC5219c
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.m15570b(this.f17126d, this.f17125c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
