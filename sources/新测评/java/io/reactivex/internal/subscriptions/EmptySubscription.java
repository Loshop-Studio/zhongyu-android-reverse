package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public static void complete(InterfaceC8989c interfaceC8989c) {
        interfaceC8989c.onSubscribe(INSTANCE);
        interfaceC8989c.onComplete();
    }

    public static void error(Throwable th, InterfaceC8989c interfaceC8989c) {
        interfaceC8989c.onSubscribe(INSTANCE);
        interfaceC8989c.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
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

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return i10 & 2;
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
