package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final InterfaceC8988b[] sources;
    final Iterable<? extends InterfaceC8988b> sourcesIterable;

    public static final class AmbCoordinator<T> implements InterfaceC8990d {
        final InterfaceC8989c downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        public AmbCoordinator(InterfaceC8989c interfaceC8989c, int i10) {
            this.downstream = interfaceC8989c;
            this.subscribers = new AmbInnerSubscriber[i10];
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = this.winner.get();
                if (i10 > 0) {
                    this.subscribers[i10 - 1].request(j10);
                    return;
                }
                if (i10 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j10);
                    }
                }
            }
        }

        public void subscribe(InterfaceC8988b[] interfaceC8988bArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                ambInnerSubscriberArr[i10] = new AmbInnerSubscriber<>(this, i11, this.downstream);
                i10 = i11;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.winner.get() == 0; i12++) {
                interfaceC8988bArr[i12].subscribe(ambInnerSubscriberArr[i12]);
            }
        }

        public boolean win(int i10) {
            int i11 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i10)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    ambInnerSubscriberArr[i11].cancel();
                }
                i11 = i12;
            }
            return true;
        }
    }

    public static final class AmbInnerSubscriber<T> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -1185974347409665484L;
        final InterfaceC8989c downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i10, InterfaceC8989c interfaceC8989c) {
            this.parent = ambCoordinator;
            this.index = i10;
            this.downstream = interfaceC8989c;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.won) {
                this.downstream.onNext(t10);
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onNext(t10);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, interfaceC8990d);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j10);
        }
    }

    public FlowableAmb(InterfaceC8988b[] interfaceC8988bArr, Iterable<? extends InterfaceC8988b> iterable) {
        this.sources = interfaceC8988bArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        int length;
        InterfaceC8988b[] interfaceC8988bArr = this.sources;
        if (interfaceC8988bArr == null) {
            interfaceC8988bArr = new InterfaceC8988b[8];
            try {
                length = 0;
                for (InterfaceC8988b interfaceC8988b : this.sourcesIterable) {
                    if (interfaceC8988b == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), interfaceC8989c);
                        return;
                    }
                    if (length == interfaceC8988bArr.length) {
                        InterfaceC8988b[] interfaceC8988bArr2 = new InterfaceC8988b[(length >> 2) + length];
                        System.arraycopy(interfaceC8988bArr, 0, interfaceC8988bArr2, 0, length);
                        interfaceC8988bArr = interfaceC8988bArr2;
                    }
                    int i10 = length + 1;
                    interfaceC8988bArr[length] = interfaceC8988b;
                    length = i10;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, interfaceC8989c);
                return;
            }
        } else {
            length = interfaceC8988bArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(interfaceC8989c);
        } else if (length == 1) {
            interfaceC8988bArr[0].subscribe(interfaceC8989c);
        } else {
            new AmbCoordinator(interfaceC8989c, length).subscribe(interfaceC8988bArr);
        }
    }
}
