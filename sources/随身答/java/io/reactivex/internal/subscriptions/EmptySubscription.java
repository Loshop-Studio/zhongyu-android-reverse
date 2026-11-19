package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public static void complete(InterfaceC0050c interfaceC0050c) {
        interfaceC0050c.onSubscribe(INSTANCE);
        interfaceC0050c.onComplete();
    }

    public static void error(Throwable th, InterfaceC0050c interfaceC0050c) {
        interfaceC0050c.onSubscribe(INSTANCE);
        interfaceC0050c.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
    public void request(long j9) {
        SubscriptionHelper.validate(j9);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i9) {
        return i9 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
