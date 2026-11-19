package io.reactivex.internal.subscribers;

import ba.InterfaceC5219c;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p100f7.AbstractC8462a;
import p244s6.InterfaceC10048e;
import p277v6.InterfaceC10250b;
import p288w6.AbstractC10359a;
import p299x6.InterfaceC10553a;
import p299x6.InterfaceC10555c;

/* loaded from: classes5.dex */
public final class LambdaSubscriber<T> extends AtomicReference<InterfaceC5219c> implements InterfaceC10048e, InterfaceC5219c, InterfaceC10250b {

    /* renamed from: a */
    public final InterfaceC10555c f17119a;

    /* renamed from: b */
    public final InterfaceC10555c f17120b;

    /* renamed from: c */
    public final InterfaceC10553a f17121c;

    /* renamed from: d */
    public final InterfaceC10555c f17122d;

    public LambdaSubscriber(InterfaceC10555c interfaceC10555c, InterfaceC10555c interfaceC10555c2, InterfaceC10553a interfaceC10553a, InterfaceC10555c interfaceC10555c3) {
        this.f17119a = interfaceC10555c;
        this.f17120b = interfaceC10555c2;
        this.f17121c = interfaceC10553a;
        this.f17122d = interfaceC10555c3;
    }

    @Override // ba.InterfaceC5219c
    public void cancel() {
        SubscriptionHelper.m15569a(this);
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
        cancel();
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // ba.InterfaceC5218b
    public void onComplete() {
        InterfaceC5219c interfaceC5219c = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (interfaceC5219c != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f17121c.run();
            } catch (Throwable th) {
                AbstractC10359a.m19297b(th);
                AbstractC8462a.m13801k(th);
            }
        }
    }

    @Override // ba.InterfaceC5218b
    public void onError(Throwable th) {
        InterfaceC5219c interfaceC5219c = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (interfaceC5219c == subscriptionHelper) {
            AbstractC8462a.m13801k(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f17120b.accept(th);
        } catch (Throwable th2) {
            AbstractC10359a.m19297b(th2);
            AbstractC8462a.m13801k(new CompositeException(th, th2));
        }
    }

    @Override // ba.InterfaceC5218b
    public void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f17119a.accept(obj);
        } catch (Throwable th) {
            AbstractC10359a.m19297b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // ba.InterfaceC5218b
    public void onSubscribe(InterfaceC5219c interfaceC5219c) {
        if (SubscriptionHelper.m15573e(this, interfaceC5219c)) {
            try {
                this.f17122d.accept(this);
            } catch (Throwable th) {
                AbstractC10359a.m19297b(th);
                interfaceC5219c.cancel();
                onError(th);
            }
        }
    }

    @Override // ba.InterfaceC5219c
    public void request(long j10) {
        get().request(j10);
    }
}
