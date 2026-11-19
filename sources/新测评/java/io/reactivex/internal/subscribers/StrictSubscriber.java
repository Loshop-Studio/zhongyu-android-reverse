package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final InterfaceC8989c downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(InterfaceC8989c interfaceC8989c) {
        this.downstream = interfaceC8989c;
    }

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        HalfSerializer.onNext(this.downstream, t10, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC8990d);
        } else {
            interfaceC8990d.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
