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
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final InterfaceC0049b[] sources;
    final Iterable<? extends InterfaceC0049b> sourcesIterable;

    public static final class AmbCoordinator<T> implements InterfaceC0051d {
        final InterfaceC0050c downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        public AmbCoordinator(InterfaceC0050c interfaceC0050c, int i9) {
            this.downstream = interfaceC0050c;
            this.subscribers = new AmbInnerSubscriber[i9];
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                int i9 = this.winner.get();
                if (i9 > 0) {
                    this.subscribers[i9 - 1].request(j9);
                    return;
                }
                if (i9 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j9);
                    }
                }
            }
        }

        public void subscribe(InterfaceC0049b[] interfaceC0049bArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9 + 1;
                ambInnerSubscriberArr[i9] = new AmbInnerSubscriber<>(this, i10, this.downstream);
                i9 = i10;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i11 = 0; i11 < length && this.winner.get() == 0; i11++) {
                interfaceC0049bArr[i11].subscribe(ambInnerSubscriberArr[i11]);
            }
        }

        public boolean win(int i9) {
            int i10 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i9)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i10 < length) {
                int i11 = i10 + 1;
                if (i11 != i9) {
                    ambInnerSubscriberArr[i10].cancel();
                }
                i10 = i11;
            }
            return true;
        }
    }

    public static final class AmbInnerSubscriber<T> extends AtomicReference<InterfaceC0051d> implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -1185974347409665484L;
        final InterfaceC0050c downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i9, InterfaceC0050c interfaceC0050c) {
            this.parent = ambCoordinator;
            this.index = i9;
            this.downstream = interfaceC0050c;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.won) {
                this.downstream.onNext(t9);
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onNext(t9);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, interfaceC0051d);
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j9);
        }
    }

    public FlowableAmb(InterfaceC0049b[] interfaceC0049bArr, Iterable<? extends InterfaceC0049b> iterable) {
        this.sources = interfaceC0049bArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        int length;
        InterfaceC0049b[] interfaceC0049bArr = this.sources;
        if (interfaceC0049bArr == null) {
            interfaceC0049bArr = new InterfaceC0049b[8];
            try {
                length = 0;
                for (InterfaceC0049b interfaceC0049b : this.sourcesIterable) {
                    if (interfaceC0049b == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), interfaceC0050c);
                        return;
                    }
                    if (length == interfaceC0049bArr.length) {
                        InterfaceC0049b[] interfaceC0049bArr2 = new InterfaceC0049b[(length >> 2) + length];
                        System.arraycopy(interfaceC0049bArr, 0, interfaceC0049bArr2, 0, length);
                        interfaceC0049bArr = interfaceC0049bArr2;
                    }
                    int i9 = length + 1;
                    interfaceC0049bArr[length] = interfaceC0049b;
                    length = i9;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, interfaceC0050c);
                return;
            }
        } else {
            length = interfaceC0049bArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(interfaceC0050c);
        } else if (length == 1) {
            interfaceC0049bArr[0].subscribe(interfaceC0050c);
        } else {
            new AmbCoordinator(interfaceC0050c, length).subscribe(interfaceC0049bArr);
        }
    }
}
