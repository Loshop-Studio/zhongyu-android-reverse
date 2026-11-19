package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    protected boolean done;
    protected final InterfaceC8989c downstream;

    /* renamed from: qs */
    protected QueueSubscription<T> f13369qs;
    protected int sourceMode;
    protected InterfaceC8990d upstream;

    public BasicFuseableSubscriber(InterfaceC8989c interfaceC8989c) {
        this.downstream = interfaceC8989c;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
    public void cancel() {
        this.upstream.cancel();
    }

    public void clear() {
        this.f13369qs.clear();
    }

    public final void fail(Throwable th) {
        Exceptions.throwIfFatal(th);
        this.upstream.cancel();
        onError(th);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f13369qs.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public final void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
            this.upstream = interfaceC8990d;
            if (interfaceC8990d instanceof QueueSubscription) {
                this.f13369qs = (QueueSubscription) interfaceC8990d;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
    public void request(long j10) {
        this.upstream.request(j10);
    }

    public final int transitiveBoundaryFusion(int i10) {
        QueueSubscription<T> queueSubscription = this.f13369qs;
        if (queueSubscription == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
