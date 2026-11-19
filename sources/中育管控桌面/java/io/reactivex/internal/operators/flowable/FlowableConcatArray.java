package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final InterfaceC7916b[] sources;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final InterfaceC7917c downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final InterfaceC7916b[] sources;
        final AtomicInteger wip;

        public ConcatArraySubscriber(InterfaceC7916b[] interfaceC7916bArr, boolean z6, InterfaceC7917c interfaceC7917c) {
            super(false);
            this.downstream = interfaceC7917c;
            this.sources = interfaceC7916bArr;
            this.delayError = z6;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC7916b[] interfaceC7916bArr = this.sources;
                int length = interfaceC7916bArr.length;
                int i6 = this.index;
                while (i6 != length) {
                    InterfaceC7916b interfaceC7916b = interfaceC7916bArr[i6];
                    if (interfaceC7916b == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.errors;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i6) + 1);
                            this.errors = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i6++;
                    } else {
                        long j6 = this.produced;
                        if (j6 != 0) {
                            this.produced = 0L;
                            produced(j6);
                        }
                        interfaceC7916b.subscribe(this);
                        i6++;
                        this.index = i6;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.errors;
                if (list == null) {
                    this.downstream.onComplete();
                } else if (list.size() == 1) {
                    this.downstream.onError(list.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (!this.delayError) {
                this.downstream.onError(th);
                return;
            }
            List arrayList = this.errors;
            if (arrayList == null) {
                arrayList = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = arrayList;
            }
            arrayList.add(th);
            onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.produced++;
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            setSubscription(interfaceC7918d);
        }
    }

    public FlowableConcatArray(InterfaceC7916b[] interfaceC7916bArr, boolean z6) {
        this.sources = interfaceC7916bArr;
        this.delayError = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, interfaceC7917c);
        interfaceC7917c.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
