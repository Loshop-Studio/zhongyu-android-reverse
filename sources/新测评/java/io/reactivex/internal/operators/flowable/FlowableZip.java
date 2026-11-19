package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final InterfaceC8988b[] sources;
    final Iterable<? extends InterfaceC8988b> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements InterfaceC8990d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final InterfaceC8989c downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(InterfaceC8989c interfaceC8989c, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z9) {
            this.downstream = interfaceC8989c;
            this.zipper = function;
            this.delayErrors = z9;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                zipSubscriberArr[i12] = new ZipSubscriber<>(this, i11);
            }
            this.current = new Object[i10];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                zipSubscriber.cancel();
            }
        }

        public void drain() {
            long j10;
            boolean z9;
            T tPoll;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.current;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (true) {
                    if (j11 == j12) {
                        j10 = 0;
                        break;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC8989c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z11 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i10];
                        if (objArr[i10] == null) {
                            try {
                                z9 = zipSubscriber.done;
                                SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                tPoll = simpleQueue != null ? simpleQueue.poll() : null;
                                z10 = tPoll == null;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.errors.addThrowable(th);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC8989c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                            if (z9 && z10) {
                                cancelAll();
                                if (this.errors.get() != null) {
                                    interfaceC8989c.onError(this.errors.terminate());
                                    return;
                                } else {
                                    interfaceC8989c.onComplete();
                                    return;
                                }
                            }
                            if (z10) {
                                z11 = true;
                            } else {
                                objArr[i10] = tPoll;
                            }
                        }
                    }
                    j10 = 0;
                    if (z11) {
                        break;
                    }
                    try {
                        interfaceC8989c.onNext(ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                        j12++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancelAll();
                        this.errors.addThrowable(th2);
                        interfaceC8989c.onError(this.errors.terminate());
                        return;
                    }
                }
                if (j11 == j12) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC8989c.onError(this.errors.terminate());
                        return;
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i11];
                        if (objArr[i11] == null) {
                            try {
                                boolean z12 = zipSubscriber2.done;
                                SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                T tPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z13 = tPoll2 == null;
                                if (z12 && z13) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        interfaceC8989c.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        interfaceC8989c.onComplete();
                                        return;
                                    }
                                }
                                if (!z13) {
                                    objArr[i11] = tPoll2;
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.errors.addThrowable(th3);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC8989c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j12 != j10) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j12);
                    }
                    if (j11 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j12);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void error(ZipSubscriber<T, R> zipSubscriber, Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                zipSubscriber.done = true;
                drain();
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        public void subscribe(InterfaceC8988b[] interfaceC8988bArr, int i10) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < i10 && !this.cancelled; i11++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                interfaceC8988bArr[i11].subscribe(zipSubscriberArr[i11]);
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.parent = zipCoordinator;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.sourceMode != 2) {
                this.queue.offer(t10);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this, interfaceC8990d)) {
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        interfaceC8990d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                interfaceC8990d.request(this.prefetch);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (this.sourceMode != 1) {
                long j11 = this.produced + j10;
                if (j11 < this.limit) {
                    this.produced = j11;
                } else {
                    this.produced = 0L;
                    get().request(j11);
                }
            }
        }
    }

    public FlowableZip(InterfaceC8988b[] interfaceC8988bArr, Iterable<? extends InterfaceC8988b> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z9) {
        this.sources = interfaceC8988bArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i10;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        int length;
        InterfaceC8988b[] interfaceC8988bArr = this.sources;
        if (interfaceC8988bArr == null) {
            interfaceC8988bArr = new InterfaceC8988b[8];
            length = 0;
            for (InterfaceC8988b interfaceC8988b : this.sourcesIterable) {
                if (length == interfaceC8988bArr.length) {
                    InterfaceC8988b[] interfaceC8988bArr2 = new InterfaceC8988b[(length >> 2) + length];
                    System.arraycopy(interfaceC8988bArr, 0, interfaceC8988bArr2, 0, length);
                    interfaceC8988bArr = interfaceC8988bArr2;
                }
                interfaceC8988bArr[length] = interfaceC8988b;
                length++;
            }
        } else {
            length = interfaceC8988bArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(interfaceC8989c);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(interfaceC8989c, this.zipper, i10, this.bufferSize, this.delayError);
        interfaceC8989c.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(interfaceC8988bArr, i10);
    }
}
