package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC7918d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final InterfaceC7917c downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<InterfaceC7918d> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(InterfaceC7917c interfaceC7917c) {
        this.downstream = interfaceC7917c;
    }

    @Override // p193y5.InterfaceC7918d
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        HalfSerializer.onNext(this.downstream, t6, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC7918d);
        } else {
            interfaceC7918d.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
        if (j6 > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j6);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j6));
    }
}
