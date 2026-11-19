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
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final InterfaceC0049b[] sources;
    final Iterable<? extends InterfaceC0049b> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements InterfaceC0051d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final InterfaceC0050c downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(InterfaceC0050c interfaceC0050c, Function<? super Object[], ? extends R> function, int i9, int i10, boolean z9) {
            this.downstream = interfaceC0050c;
            this.zipper = function;
            this.delayErrors = z9;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i9];
            for (int i11 = 0; i11 < i9; i11++) {
                zipSubscriberArr[i11] = new ZipSubscriber<>(this, i10);
            }
            this.current = new Object[i9];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // p010a9.InterfaceC0051d
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
            long j9;
            boolean z9;
            T tPoll;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC0050c interfaceC0050c = this.downstream;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.current;
            int iAddAndGet = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (true) {
                    if (j10 == j11) {
                        j9 = 0;
                        break;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC0050c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z11 = false;
                    for (int i9 = 0; i9 < length; i9++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i9];
                        if (objArr[i9] == null) {
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
                                    interfaceC0050c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                            if (z9 && z10) {
                                cancelAll();
                                if (this.errors.get() != null) {
                                    interfaceC0050c.onError(this.errors.terminate());
                                    return;
                                } else {
                                    interfaceC0050c.onComplete();
                                    return;
                                }
                            }
                            if (z10) {
                                z11 = true;
                            } else {
                                objArr[i9] = tPoll;
                            }
                        }
                    }
                    j9 = 0;
                    if (z11) {
                        break;
                    }
                    try {
                        interfaceC0050c.onNext(ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                        j11++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancelAll();
                        this.errors.addThrowable(th2);
                        interfaceC0050c.onError(this.errors.terminate());
                        return;
                    }
                }
                if (j10 == j11) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC0050c.onError(this.errors.terminate());
                        return;
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i10];
                        if (objArr[i10] == null) {
                            try {
                                boolean z12 = zipSubscriber2.done;
                                SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                T tPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z13 = tPoll2 == null;
                                if (z12 && z13) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        interfaceC0050c.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        interfaceC0050c.onComplete();
                                        return;
                                    }
                                }
                                if (!z13) {
                                    objArr[i10] = tPoll2;
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.errors.addThrowable(th3);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC0050c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j11 != j9) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j11);
                    }
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j11);
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

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
                drain();
            }
        }

        public void subscribe(InterfaceC0049b[] interfaceC0049bArr, int i9) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i10 = 0; i10 < i9 && !this.cancelled; i10++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                interfaceC0049bArr[i10].subscribe(zipSubscriberArr[i10]);
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<InterfaceC0051d> implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i9) {
            this.parent = zipCoordinator;
            this.prefetch = i9;
            this.limit = i9 - (i9 >> 2);
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.sourceMode != 2) {
                this.queue.offer(t9);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.setOnce(this, interfaceC0051d)) {
                if (interfaceC0051d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC0051d;
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
                        interfaceC0051d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                interfaceC0051d.request(this.prefetch);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (this.sourceMode != 1) {
                long j10 = this.produced + j9;
                if (j10 < this.limit) {
                    this.produced = j10;
                } else {
                    this.produced = 0L;
                    get().request(j10);
                }
            }
        }
    }

    public FlowableZip(InterfaceC0049b[] interfaceC0049bArr, Iterable<? extends InterfaceC0049b> iterable, Function<? super Object[], ? extends R> function, int i9, boolean z9) {
        this.sources = interfaceC0049bArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i9;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        int length;
        InterfaceC0049b[] interfaceC0049bArr = this.sources;
        if (interfaceC0049bArr == null) {
            interfaceC0049bArr = new InterfaceC0049b[8];
            length = 0;
            for (InterfaceC0049b interfaceC0049b : this.sourcesIterable) {
                if (length == interfaceC0049bArr.length) {
                    InterfaceC0049b[] interfaceC0049bArr2 = new InterfaceC0049b[(length >> 2) + length];
                    System.arraycopy(interfaceC0049bArr, 0, interfaceC0049bArr2, 0, length);
                    interfaceC0049bArr = interfaceC0049bArr2;
                }
                interfaceC0049bArr[length] = interfaceC0049b;
                length++;
            }
        } else {
            length = interfaceC0049bArr.length;
        }
        int i9 = length;
        if (i9 == 0) {
            EmptySubscription.complete(interfaceC0050c);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(interfaceC0050c, this.zipper, i9, this.bufferSize, this.delayError);
        interfaceC0050c.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(interfaceC0049bArr, i9);
    }
}
