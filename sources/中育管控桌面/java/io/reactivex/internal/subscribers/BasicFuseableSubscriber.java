package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    protected boolean done;
    protected final InterfaceC7917c downstream;

    /* renamed from: qs */
    protected QueueSubscription<T> f8491qs;
    protected int sourceMode;
    protected InterfaceC7918d upstream;

    public BasicFuseableSubscriber(InterfaceC7917c interfaceC7917c) {
        this.downstream = interfaceC7917c;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public void cancel() {
        this.upstream.cancel();
    }

    public void clear() {
        this.f8491qs.clear();
    }

    public final void fail(Throwable th) {
        Exceptions.throwIfFatal(th);
        this.upstream.cancel();
        onError(th);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f8491qs.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r6) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public final void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
            this.upstream = interfaceC7918d;
            if (interfaceC7918d instanceof QueueSubscription) {
                this.f8491qs = (QueueSubscription) interfaceC7918d;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public void request(long j6) {
        this.upstream.request(j6);
    }

    public final int transitiveBoundaryFusion(int i6) {
        QueueSubscription<T> queueSubscription = this.f8491qs;
        if (queueSubscription == null || (i6 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i6);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r6, R r7) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
