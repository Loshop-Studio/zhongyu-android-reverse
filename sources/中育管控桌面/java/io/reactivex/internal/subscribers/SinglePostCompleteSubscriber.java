package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC7918d {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final InterfaceC7917c downstream;
    protected long produced;
    protected InterfaceC7918d upstream;
    protected R value;

    public SinglePostCompleteSubscriber(InterfaceC7917c interfaceC7917c) {
        this.downstream = interfaceC7917c;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r6) {
        long j6 = this.produced;
        if (j6 != 0) {
            BackpressureHelper.produced(this, j6);
        }
        while (true) {
            long j7 = get();
            if ((j7 & Long.MIN_VALUE) != 0) {
                onDrop(r6);
                return;
            }
            if ((j7 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r6);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r6;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r6) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
            this.upstream = interfaceC7918d;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p193y5.InterfaceC7918d
    public final void request(long j6) {
        long j7;
        if (SubscriptionHelper.validate(j6)) {
            do {
                j7 = get();
                if ((j7 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j7, BackpressureHelper.addCap(j7, j6)));
            this.upstream.request(j6);
        }
    }
}
