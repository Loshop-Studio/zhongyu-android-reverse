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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final InterfaceC7916b[] sources;
    final Iterable<? extends InterfaceC7916b> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements InterfaceC7918d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final InterfaceC7917c downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(InterfaceC7917c interfaceC7917c, Function<? super Object[], ? extends R> function, int i6, int i7, boolean z6) {
            this.downstream = interfaceC7917c;
            this.zipper = function;
            this.delayErrors = z6;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                zipSubscriberArr[i8] = new ZipSubscriber<>(this, i7);
            }
            this.current = new Object[i6];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // p193y5.InterfaceC7918d
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
            long j6;
            boolean z6;
            T tPoll;
            boolean z7;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC7917c interfaceC7917c = this.downstream;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.current;
            int iAddAndGet = 1;
            do {
                long j7 = this.requested.get();
                long j8 = 0;
                while (true) {
                    if (j7 == j8) {
                        j6 = 0;
                        break;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC7917c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z8 = false;
                    for (int i6 = 0; i6 < length; i6++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i6];
                        if (objArr[i6] == null) {
                            try {
                                z6 = zipSubscriber.done;
                                SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                tPoll = simpleQueue != null ? simpleQueue.poll() : null;
                                z7 = tPoll == null;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.errors.addThrowable(th);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC7917c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                            if (z6 && z7) {
                                cancelAll();
                                if (this.errors.get() != null) {
                                    interfaceC7917c.onError(this.errors.terminate());
                                    return;
                                } else {
                                    interfaceC7917c.onComplete();
                                    return;
                                }
                            }
                            if (z7) {
                                z8 = true;
                            } else {
                                objArr[i6] = tPoll;
                            }
                        }
                    }
                    j6 = 0;
                    if (z8) {
                        break;
                    }
                    try {
                        interfaceC7917c.onNext(ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                        j8++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancelAll();
                        this.errors.addThrowable(th2);
                        interfaceC7917c.onError(this.errors.terminate());
                        return;
                    }
                }
                if (j7 == j8) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC7917c.onError(this.errors.terminate());
                        return;
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i7];
                        if (objArr[i7] == null) {
                            try {
                                boolean z9 = zipSubscriber2.done;
                                SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                T tPoll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z10 = tPoll2 == null;
                                if (z9 && z10) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        interfaceC7917c.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        interfaceC7917c.onComplete();
                                        return;
                                    }
                                }
                                if (!z10) {
                                    objArr[i7] = tPoll2;
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.errors.addThrowable(th3);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC7917c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j8 != j6) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j8);
                    }
                    if (j7 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j8);
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

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
                drain();
            }
        }

        public void subscribe(InterfaceC7916b[] interfaceC7916bArr, int i6) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i7 = 0; i7 < i6 && !this.cancelled; i7++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                interfaceC7916bArr[i7].subscribe(zipSubscriberArr[i7]);
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i6) {
            this.parent = zipCoordinator;
            this.prefetch = i6;
            this.limit = i6 - (i6 >> 2);
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (this.sourceMode != 2) {
                this.queue.offer(t6);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.setOnce(this, interfaceC7918d)) {
                if (interfaceC7918d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC7918d;
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
                        interfaceC7918d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                interfaceC7918d.request(this.prefetch);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (this.sourceMode != 1) {
                long j7 = this.produced + j6;
                if (j7 < this.limit) {
                    this.produced = j7;
                } else {
                    this.produced = 0L;
                    get().request(j7);
                }
            }
        }
    }

    public FlowableZip(InterfaceC7916b[] interfaceC7916bArr, Iterable<? extends InterfaceC7916b> iterable, Function<? super Object[], ? extends R> function, int i6, boolean z6) {
        this.sources = interfaceC7916bArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i6;
        this.delayError = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        int length;
        InterfaceC7916b[] interfaceC7916bArr = this.sources;
        if (interfaceC7916bArr == null) {
            interfaceC7916bArr = new InterfaceC7916b[8];
            length = 0;
            for (InterfaceC7916b interfaceC7916b : this.sourcesIterable) {
                if (length == interfaceC7916bArr.length) {
                    InterfaceC7916b[] interfaceC7916bArr2 = new InterfaceC7916b[(length >> 2) + length];
                    System.arraycopy(interfaceC7916bArr, 0, interfaceC7916bArr2, 0, length);
                    interfaceC7916bArr = interfaceC7916bArr2;
                }
                interfaceC7916bArr[length] = interfaceC7916b;
                length++;
            }
        } else {
            length = interfaceC7916bArr.length;
        }
        int i6 = length;
        if (i6 == 0) {
            EmptySubscription.complete(interfaceC7917c);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(interfaceC7917c, this.zipper, i6, this.bufferSize, this.delayError);
        interfaceC7917c.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(interfaceC7916bArr, i6);
    }
}
