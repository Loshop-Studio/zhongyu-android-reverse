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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<R, ? super T, R> accumulator;
    final Callable<R> seedSupplier;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = -1776795561228106469L;
        final BiFunction<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final InterfaceC7917c downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final SimplePlainQueue<R> queue;
        final AtomicLong requested;
        InterfaceC7918d upstream;
        R value;

        public ScanSeedSubscriber(InterfaceC7917c interfaceC7917c, BiFunction<R, ? super T, R> biFunction, R r6, int i6) {
            this.downstream = interfaceC7917c;
            this.accumulator = biFunction;
            this.value = r6;
            this.prefetch = i6;
            this.limit = i6 - (i6 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i6);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r6);
            this.requested = new AtomicLong();
        }

        @Override // p193y5.InterfaceC7918d
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
            InterfaceC7917c interfaceC7917c = this.downstream;
            SimplePlainQueue<R> simplePlainQueue = this.queue;
            int i6 = this.limit;
            int i7 = this.consumed;
            int iAddAndGet = 1;
            do {
                long j6 = this.requested.get();
                long j7 = 0;
                while (j7 != j6) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z6 = this.done;
                    if (z6 && (th = this.error) != null) {
                        simplePlainQueue.clear();
                        interfaceC7917c.onError(th);
                        return;
                    }
                    R rPoll = simplePlainQueue.poll();
                    boolean z7 = rPoll == null;
                    if (z6 && z7) {
                        interfaceC7917c.onComplete();
                        return;
                    }
                    if (z7) {
                        break;
                    }
                    interfaceC7917c.onNext(rPoll);
                    j7++;
                    i7++;
                    if (i7 == i6) {
                        this.upstream.request(i6);
                        i7 = 0;
                    }
                }
                if (j7 == j6 && this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        simplePlainQueue.clear();
                        interfaceC7917c.onError(th2);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        interfaceC7917c.onComplete();
                        return;
                    }
                }
                if (j7 != 0) {
                    BackpressureHelper.produced(this.requested, j7);
                }
                this.consumed = i7;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (this.done) {
                return;
            }
            try {
                R r6 = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t6), "The accumulator returned a null value");
                this.value = r6;
                this.queue.offer(r6);
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(this.prefetch - 1);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
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
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(interfaceC7917c, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC7917c);
        }
    }
}
