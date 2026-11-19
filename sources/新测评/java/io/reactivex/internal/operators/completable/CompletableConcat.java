package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class CompletableConcat extends Completable {
    final int prefetch;
    final InterfaceC8988b sources;

    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        private static final long serialVersionUID = 9032184911934499404L;
        volatile boolean active;
        int consumed;
        volatile boolean done;
        final CompletableObserver downstream;
        final int limit;
        final int prefetch;
        SimpleQueue<CompletableSource> queue;
        int sourceFused;
        InterfaceC8990d upstream;
        final ConcatInnerObserver inner = new ConcatInnerObserver(this);
        final AtomicBoolean once = new AtomicBoolean();

        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -5454794857847146511L;
            final CompletableConcatSubscriber parent;

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.parent = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver, int i10) {
            this.downstream = completableObserver;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.inner);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.active) {
                    boolean z9 = this.done;
                    try {
                        CompletableSource completableSourcePoll = this.queue.poll();
                        boolean z10 = completableSourcePoll == null;
                        if (z9 && z10) {
                            if (this.once.compareAndSet(false, true)) {
                                this.downstream.onComplete();
                                return;
                            }
                            return;
                        } else if (!z10) {
                            this.active = true;
                            completableSourcePoll.subscribe(this.inner);
                            request();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        public void innerError(Throwable th) {
            if (!this.once.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
            } else {
                this.upstream.cancel();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.inner.get());
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (!this.once.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
            } else {
                DisposableHelper.dispose(this.inner);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                int i10 = this.prefetch;
                long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceFused = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceFused = iRequestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        interfaceC8990d.request(j10);
                        return;
                    }
                }
                if (this.prefetch == Integer.MAX_VALUE) {
                    this.queue = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.queue = new SpscArrayQueue(this.prefetch);
                }
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(j10);
            }
        }

        public void request() {
            if (this.sourceFused != 1) {
                int i10 = this.consumed + 1;
                if (i10 != this.limit) {
                    this.consumed = i10;
                } else {
                    this.consumed = 0;
                    this.upstream.request(i10);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(CompletableSource completableSource) {
            if (this.sourceFused != 0 || this.queue.offer(completableSource)) {
                drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public CompletableConcat(InterfaceC8988b interfaceC8988b, int i10) {
        this.sources = interfaceC8988b;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.sources.subscribe(new CompletableConcatSubscriber(completableObserver, this.prefetch));
    }
}
