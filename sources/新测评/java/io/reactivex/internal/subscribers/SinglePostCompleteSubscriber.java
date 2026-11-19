package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC8990d {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final InterfaceC8989c downstream;
    protected long produced;
    protected InterfaceC8990d upstream;
    protected R value;

    public SinglePostCompleteSubscriber(InterfaceC8989c interfaceC8989c) {
        this.downstream = interfaceC8989c;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r10) {
        long j10 = this.produced;
        if (j10 != 0) {
            BackpressureHelper.produced(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                onDrop(r10);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r10);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r10;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r10) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
            this.upstream = interfaceC8990d;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p215q9.InterfaceC8990d
    public final void request(long j10) {
        long j11;
        if (SubscriptionHelper.validate(j10)) {
            do {
                j11 = get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, BackpressureHelper.addCap(j11, j10)));
            this.upstream.request(j10);
        }
    }
}
