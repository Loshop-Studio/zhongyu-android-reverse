package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final SingleSource<T> source;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final InterfaceC8989c downstream;

        /* renamed from: it */
        volatile Iterator<? extends R> f13362it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public FlatMapIterableObserver(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f13362it = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            Iterator<? extends R> it = this.f13362it;
            if (this.outputFused && it != null) {
                interfaceC8989c.onNext(null);
                interfaceC8989c.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.requested.get();
                    if (j10 == Long.MAX_VALUE) {
                        slowPath(interfaceC8989c, it);
                        return;
                    }
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            interfaceC8989c.onNext(ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.cancelled) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    interfaceC8989c.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                interfaceC8989c.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            interfaceC8989c.onError(th2);
                            return;
                        }
                    }
                    if (j11 != 0) {
                        BackpressureHelper.produced(this.requested, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f13362it;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f13362it == null;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t10) {
            try {
                Iterator<? extends R> it = this.mapper.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                } else {
                    this.f13362it = it;
                    drain();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f13362it;
            if (it == null) {
                return null;
            }
            R r10 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f13362it = null;
            }
            return r10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public void slowPath(InterfaceC8989c interfaceC8989c, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    interfaceC8989c.onNext(it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            interfaceC8989c.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        interfaceC8989c.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    interfaceC8989c.onError(th2);
                    return;
                }
            }
        }
    }

    public SingleFlatMapIterableFlowable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new FlatMapIterableObserver(interfaceC8989c, this.mapper));
    }
}
