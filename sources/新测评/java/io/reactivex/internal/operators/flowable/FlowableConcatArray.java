package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final InterfaceC8988b[] sources;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final InterfaceC8989c downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final InterfaceC8988b[] sources;
        final AtomicInteger wip;

        public ConcatArraySubscriber(InterfaceC8988b[] interfaceC8988bArr, boolean z9, InterfaceC8989c interfaceC8989c) {
            super(false);
            this.downstream = interfaceC8989c;
            this.sources = interfaceC8988bArr;
            this.delayError = z9;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                InterfaceC8988b[] interfaceC8988bArr = this.sources;
                int length = interfaceC8988bArr.length;
                int i10 = this.index;
                while (i10 != length) {
                    InterfaceC8988b interfaceC8988b = interfaceC8988bArr[i10];
                    if (interfaceC8988b == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.errors;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i10) + 1);
                            this.errors = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i10++;
                    } else {
                        long j10 = this.produced;
                        if (j10 != 0) {
                            this.produced = 0L;
                            produced(j10);
                        }
                        interfaceC8988b.subscribe(this);
                        i10++;
                        this.index = i10;
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            setSubscription(interfaceC8990d);
        }
    }

    public FlowableConcatArray(InterfaceC8988b[] interfaceC8988bArr, boolean z9) {
        this.sources = interfaceC8988bArr;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, interfaceC8989c);
        interfaceC8989c.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
