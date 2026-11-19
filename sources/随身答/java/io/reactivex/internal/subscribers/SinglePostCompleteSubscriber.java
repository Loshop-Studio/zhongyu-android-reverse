package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC0051d {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final InterfaceC0050c downstream;
    protected long produced;
    protected InterfaceC0051d upstream;
    protected R value;

    public SinglePostCompleteSubscriber(InterfaceC0050c interfaceC0050c) {
        this.downstream = interfaceC0050c;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r9) {
        long j9 = this.produced;
        if (j9 != 0) {
            BackpressureHelper.produced(this, j9);
        }
        while (true) {
            long j10 = get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                onDrop(r9);
                return;
            }
            if ((j10 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r9);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r9;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r9) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
            this.upstream = interfaceC0051d;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p010a9.InterfaceC0051d
    public final void request(long j9) {
        long j10;
        if (SubscriptionHelper.validate(j9)) {
            do {
                j10 = get();
                if ((j10 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j10, BackpressureHelper.addCap(j10, j9)));
            this.upstream.request(j9);
        }
    }
}
