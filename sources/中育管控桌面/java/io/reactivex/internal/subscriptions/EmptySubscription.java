package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public static void complete(InterfaceC7917c interfaceC7917c) {
        interfaceC7917c.onSubscribe(INSTANCE);
        interfaceC7917c.onComplete();
    }

    public static void error(Throwable th, InterfaceC7917c interfaceC7917c) {
        interfaceC7917c.onSubscribe(INSTANCE);
        interfaceC7917c.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
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

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public void request(long j6) {
        SubscriptionHelper.validate(j6);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i6) {
        return i6 & 2;
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
