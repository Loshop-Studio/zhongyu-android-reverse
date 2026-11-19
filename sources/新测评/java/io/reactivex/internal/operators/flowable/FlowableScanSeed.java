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
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<R, ? super T, R> accumulator;
    final Callable<R> seedSupplier;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final InterfaceC8989c downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested;
        InterfaceC8990d upstream;
        R value;

        public ScanSeedSubscriber(InterfaceC8989c interfaceC8989c, BiFunction<R, ? super T, R> biFunction, R r10, int i10) {
            this.downstream = interfaceC8989c;
            this.accumulator = biFunction;
            this.value = r10;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i10);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r10);
            this.requested = new AtomicLong();
        }

        @Override // p215q9.InterfaceC8990d
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
            InterfaceC8989c interfaceC8989c = this.downstream;
            SimplePlainQueue<R> simplePlainQueue = this.queue;
            int i10 = this.limit;
            int i11 = this.consumed;
            int iAddAndGet = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    if (z9 && (th = this.error) != null) {
                        simplePlainQueue.clear();
                        interfaceC8989c.onError(th);
                        return;
                    }
                    R rPoll = simplePlainQueue.poll();
                    boolean z10 = rPoll == null;
                    if (z9 && z10) {
                        interfaceC8989c.onComplete();
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC8989c.onNext(rPoll);
                    j11++;
                    i11++;
                    if (i11 == i10) {
                        this.upstream.request(i10);
                        i11 = 0;
                    }
                }
                if (j11 == j10 && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        simplePlainQueue.clear();
                        interfaceC8989c.onError(th2);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        interfaceC8989c.onComplete();
                        return;
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.requested, j11);
                }
                this.consumed = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                R r10 = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t10), "The accumulator returned a null value");
                this.value = r10;
                this.queue.offer(r10);
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(this.prefetch - 1);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
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
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(interfaceC8989c, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC8989c);
        }
    }
}
