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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final InterfaceC7916b[] sources;
    final Iterable<? extends InterfaceC7916b> sourcesIterable;

    public static final class AmbCoordinator<T> implements InterfaceC7918d {
        final InterfaceC7917c downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        public AmbCoordinator(InterfaceC7917c interfaceC7917c, int i6) {
            this.downstream = interfaceC7917c;
            this.subscribers = new AmbInnerSubscriber[i6];
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                int i6 = this.winner.get();
                if (i6 > 0) {
                    this.subscribers[i6 - 1].request(j6);
                    return;
                }
                if (i6 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j6);
                    }
                }
            }
        }

        public void subscribe(InterfaceC7916b[] interfaceC7916bArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i6 + 1;
                ambInnerSubscriberArr[i6] = new AmbInnerSubscriber<>(this, i7, this.downstream);
                i6 = i7;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i8 = 0; i8 < length && this.winner.get() == 0; i8++) {
                interfaceC7916bArr[i8].subscribe(ambInnerSubscriberArr[i8]);
            }
        }

        public boolean win(int i6) {
            int i7 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i6)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i7 < length) {
                int i8 = i7 + 1;
                if (i8 != i6) {
                    ambInnerSubscriberArr[i7].cancel();
                }
                i7 = i8;
            }
            return true;
        }
    }

    public static final class AmbInnerSubscriber<T> extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = -1185974347409665484L;
        final InterfaceC7917c downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        public AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i6, InterfaceC7917c interfaceC7917c) {
            this.parent = ambCoordinator;
            this.index = i6;
            this.downstream = interfaceC7917c;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (this.won) {
                this.downstream.onNext(t6);
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onNext(t6);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, interfaceC7918d);
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j6);
        }
    }

    public FlowableAmb(InterfaceC7916b[] interfaceC7916bArr, Iterable<? extends InterfaceC7916b> iterable) {
        this.sources = interfaceC7916bArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        int length;
        InterfaceC7916b[] interfaceC7916bArr = this.sources;
        if (interfaceC7916bArr == null) {
            interfaceC7916bArr = new InterfaceC7916b[8];
            try {
                length = 0;
                for (InterfaceC7916b interfaceC7916b : this.sourcesIterable) {
                    if (interfaceC7916b == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), interfaceC7917c);
                        return;
                    }
                    if (length == interfaceC7916bArr.length) {
                        InterfaceC7916b[] interfaceC7916bArr2 = new InterfaceC7916b[(length >> 2) + length];
                        System.arraycopy(interfaceC7916bArr, 0, interfaceC7916bArr2, 0, length);
                        interfaceC7916bArr = interfaceC7916bArr2;
                    }
                    int i6 = length + 1;
                    interfaceC7916bArr[length] = interfaceC7916b;
                    length = i6;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, interfaceC7917c);
                return;
            }
        } else {
            length = interfaceC7916bArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(interfaceC7917c);
        } else if (length == 1) {
            interfaceC7916bArr[0].subscribe(interfaceC7917c);
        } else {
            new AmbCoordinator(interfaceC7917c, length).subscribe(interfaceC7916bArr);
        }
    }
}
