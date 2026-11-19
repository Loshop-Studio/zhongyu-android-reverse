package io.reactivex.internal.operators.flowable;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC8988b> mapper;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile SimpleQueue<R> queue;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j10, int i10) {
            this.parent = switchMapSubscriber;
            this.index = j10;
            this.bufferSize = i10;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !switchMapSubscriber.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.cancel();
            }
            this.done = true;
            switchMapSubscriber.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(R r10) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode != 0 || this.queue.offer(r10)) {
                    switchMapSubscriber.drain();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this, interfaceC8990d)) {
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        interfaceC8990d.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                interfaceC8990d.request(this.bufferSize);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC8989c downstream;
        final Function<? super T, ? extends InterfaceC8988b> mapper;
        volatile long unique;
        InterfaceC8990d upstream;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable error = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        public SwitchMapSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function, int i10, boolean z9) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
            this.bufferSize = i10;
            this.delayErrors = z9;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        public void disposeInner() {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = CANCELLED;
            if (switchMapInnerSubscriber2 == switchMapInnerSubscriber3 || (switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.getAndSet(switchMapInnerSubscriber3)) == switchMapInnerSubscriber3 || switchMapInnerSubscriber == null) {
                return;
            }
            switchMapInnerSubscriber.cancel();
        }

        public void drain() {
            boolean z9;
            R rPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            if (this.error.get() != null) {
                                interfaceC8989c.onError(this.error.terminate());
                                return;
                            } else {
                                interfaceC8989c.onComplete();
                                return;
                            }
                        }
                    } else if (this.error.get() != null) {
                        disposeInner();
                        interfaceC8989c.onError(this.error.terminate());
                        return;
                    } else if (this.active.get() == null) {
                        interfaceC8989c.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                SimpleQueue<R> simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.queue : null;
                if (simpleQueue != null) {
                    if (switchMapInnerSubscriber.done) {
                        if (this.delayErrors) {
                            if (simpleQueue.isEmpty()) {
                                AbstractC0920q.m1034a(this.active, switchMapInnerSubscriber, null);
                            }
                        } else if (this.error.get() != null) {
                            disposeInner();
                            interfaceC8989c.onError(this.error.terminate());
                            return;
                        } else if (simpleQueue.isEmpty()) {
                            AbstractC0920q.m1034a(this.active, switchMapInnerSubscriber, null);
                        }
                    }
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        z9 = false;
                        if (j11 != j10) {
                            if (!this.cancelled) {
                                boolean z10 = switchMapInnerSubscriber.done;
                                try {
                                    rPoll = simpleQueue.poll();
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    switchMapInnerSubscriber.cancel();
                                    this.error.addThrowable(th);
                                    rPoll = null;
                                    z10 = true;
                                }
                                boolean z11 = rPoll == null;
                                if (switchMapInnerSubscriber != this.active.get()) {
                                    break;
                                }
                                if (z10) {
                                    if (!this.delayErrors) {
                                        if (this.error.get() == null) {
                                            if (z11) {
                                                AbstractC0920q.m1034a(this.active, switchMapInnerSubscriber, null);
                                                break;
                                            }
                                        } else {
                                            interfaceC8989c.onError(this.error.terminate());
                                            return;
                                        }
                                    } else if (z11) {
                                        AbstractC0920q.m1034a(this.active, switchMapInnerSubscriber, null);
                                        break;
                                    }
                                }
                                if (z11) {
                                    break;
                                }
                                interfaceC8989c.onNext(rPoll);
                                j11++;
                            } else {
                                return;
                            }
                        } else {
                            break;
                        }
                    }
                    z9 = true;
                    if (j11 != 0 && !this.cancelled) {
                        if (j10 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j11);
                        }
                        switchMapInnerSubscriber.get().request(j11);
                    }
                    if (z9) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.active.lazySet(null);
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
            if (this.done || !this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.done) {
                return;
            }
            long j10 = this.unique + 1;
            this.unique = j10;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.cancel();
            }
            try {
                InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The publisher returned is null");
                SwitchMapInnerSubscriber switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber(this, j10, this.bufferSize);
                do {
                    switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber == CANCELLED) {
                        return;
                    }
                } while (!AbstractC0920q.m1034a(this.active, switchMapInnerSubscriber, switchMapInnerSubscriber3));
                interfaceC8988b.subscribe(switchMapInnerSubscriber3);
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
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC8988b> function, int i10, boolean z9) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i10;
        this.delayErrors = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC8989c, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(interfaceC8989c, this.mapper, this.bufferSize, this.delayErrors));
    }
}
