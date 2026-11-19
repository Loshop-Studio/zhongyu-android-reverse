package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<R, ? super T, R> accumulator;
    final Callable<R> seedSupplier;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final InterfaceC0050c downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested;
        InterfaceC0051d upstream;
        R value;

        public ScanSeedSubscriber(InterfaceC0050c interfaceC0050c, BiFunction<R, ? super T, R> biFunction, R r9, int i9) {
            this.downstream = interfaceC0050c;
            this.accumulator = biFunction;
            this.value = r9;
            this.prefetch = i9;
            this.limit = i9 - (i9 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i9);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r9);
            this.requested = new AtomicLong();
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC0050c interfaceC0050c = this.downstream;
            SimplePlainQueue<R> simplePlainQueue = this.queue;
            int i9 = this.limit;
            int i10 = this.consumed;
            int iAddAndGet = 1;
            do {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    if (z9 && (th = this.error) != null) {
                        simplePlainQueue.clear();
                        interfaceC0050c.onError(th);
                        return;
                    }
                    R rPoll = simplePlainQueue.poll();
                    boolean z10 = rPoll == null;
                    if (z9 && z10) {
                        interfaceC0050c.onComplete();
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC0050c.onNext(rPoll);
                    j10++;
                    i10++;
                    if (i10 == i9) {
                        this.upstream.request(i9);
                        i10 = 0;
                    }
                }
                if (j10 == j9 && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        simplePlainQueue.clear();
                        interfaceC0050c.onError(th2);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        interfaceC0050c.onComplete();
                        return;
                    }
                }
                if (j10 != 0) {
                    BackpressureHelper.produced(this.requested, j10);
                }
                this.consumed = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            try {
                R r9 = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t9), "The accumulator returned a null value");
                this.value = r9;
                this.queue.offer(r9);
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(this.prefetch - 1);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
                drain();
            }
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(interfaceC0050c, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC0050c);
        }
    }
}
