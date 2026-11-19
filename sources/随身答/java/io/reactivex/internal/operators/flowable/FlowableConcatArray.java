package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final InterfaceC0049b[] sources;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final InterfaceC0050c downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final InterfaceC0049b[] sources;
        final AtomicInteger wip;

        public ConcatArraySubscriber(InterfaceC0049b[] interfaceC0049bArr, boolean z9, InterfaceC0050c interfaceC0050c) {
            super(false);
            this.downstream = interfaceC0050c;
            this.sources = interfaceC0049bArr;
            this.delayError = z9;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC0049b[] interfaceC0049bArr = this.sources;
                int length = interfaceC0049bArr.length;
                int i9 = this.index;
                while (i9 != length) {
                    InterfaceC0049b interfaceC0049b = interfaceC0049bArr[i9];
                    if (interfaceC0049b == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.errors;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i9) + 1);
                            this.errors = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i9++;
                    } else {
                        long j9 = this.produced;
                        if (j9 != 0) {
                            this.produced = 0L;
                            produced(j9);
                        }
                        interfaceC0049b.subscribe(this);
                        i9++;
                        this.index = i9;
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.produced++;
            this.downstream.onNext(t9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            setSubscription(interfaceC0051d);
        }
    }

    public FlowableConcatArray(InterfaceC0049b[] interfaceC0049bArr, boolean z9) {
        this.sources = interfaceC0049bArr;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, interfaceC0050c);
        interfaceC0050c.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
