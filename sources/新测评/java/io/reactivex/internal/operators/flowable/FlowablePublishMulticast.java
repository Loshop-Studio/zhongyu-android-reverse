package io.reactivex.internal.operators.flowable;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final Function<? super Flowable<T>, ? extends InterfaceC8988b> selector;

    public static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, Disposable {
        static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
        static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
        int consumed;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicInteger wip = new AtomicInteger();
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        final AtomicReference<MulticastSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

        public MulticastProcessor(int i10, boolean z9) {
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
            this.delayError = z9;
        }

        public boolean add(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.subscribers.get();
                if (multicastSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!AbstractC0920q.m1034a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
            return true;
        }

        public void completeAll() {
            for (MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SimpleQueue<T> simpleQueue;
            SubscriptionHelper.cancel(this.upstream);
            if (this.wip.getAndIncrement() != 0 || (simpleQueue = this.queue) == null) {
                return;
            }
            simpleQueue.clear();
        }

        public void drain() {
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            Throwable th;
            Throwable th2;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.queue;
            int i10 = this.consumed;
            int i11 = this.limit;
            boolean z9 = this.sourceMode != 1;
            AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
            MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j10 = Long.MAX_VALUE;
                    long j11 = Long.MAX_VALUE;
                    int i12 = 0;
                    while (i12 < length2) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i12];
                        AtomicReference<MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                        long j12 = multicastSubscription.get() - multicastSubscription.emitted;
                        if (j12 == Long.MIN_VALUE) {
                            length--;
                        } else if (j11 > j12) {
                            j11 = j12;
                        }
                        i12++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j13 = 0;
                    if (length == 0) {
                        j11 = 0;
                    }
                    while (j11 != j13) {
                        if (isDisposed()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z10 = this.done;
                        if (z10 && !this.delayError && (th2 = this.error) != null) {
                            errorAll(th2);
                            return;
                        }
                        try {
                            T tPoll = simpleQueue.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                Throwable th3 = this.error;
                                if (th3 != null) {
                                    errorAll(th3);
                                    return;
                                } else {
                                    completeAll();
                                    return;
                                }
                            }
                            if (z11) {
                                break;
                            }
                            int length3 = multicastSubscriptionArr.length;
                            int i13 = 0;
                            boolean z12 = false;
                            while (i13 < length3) {
                                MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i13];
                                long j14 = multicastSubscription2.get();
                                if (j14 != Long.MIN_VALUE) {
                                    if (j14 != j10) {
                                        multicastSubscription2.emitted++;
                                    }
                                    multicastSubscription2.downstream.onNext(tPoll);
                                } else {
                                    z12 = true;
                                }
                                i13++;
                                j10 = Long.MAX_VALUE;
                            }
                            j11--;
                            if (z9 && (i10 = i10 + 1) == i11) {
                                this.upstream.get().request(i11);
                                i10 = 0;
                            }
                            MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (z12 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                multicastSubscriptionArr = multicastSubscriptionArr2;
                                break;
                            } else {
                                j13 = 0;
                                j10 = Long.MAX_VALUE;
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            SubscriptionHelper.cancel(this.upstream);
                            errorAll(th4);
                            return;
                        }
                    }
                    if (j11 == j13) {
                        if (isDisposed()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z13 = this.done;
                        if (z13 && !this.delayError && (th = this.error) != null) {
                            errorAll(th);
                            return;
                        }
                        if (z13 && simpleQueue.isEmpty()) {
                            Throwable th5 = this.error;
                            if (th5 != null) {
                                errorAll(th5);
                                return;
                            } else {
                                completeAll();
                                return;
                            }
                        }
                    }
                }
                this.consumed = i10;
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.queue;
                }
                multicastSubscriptionArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        public void errorAll(Throwable th) {
            for (MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.get() == SubscriptionHelper.CANCELLED;
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
            if (this.sourceMode != 0 || this.queue.offer(t10)) {
                drain();
            } else {
                this.upstream.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC8990d)) {
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        QueueDrainHelper.request(interfaceC8990d, this.prefetch);
                        return;
                    }
                }
                this.queue = QueueDrainHelper.createQueue(this.prefetch);
                QueueDrainHelper.request(interfaceC8990d, this.prefetch);
            }
        }

        public void remove(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.subscribers.get();
                int length = multicastSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (multicastSubscriptionArr[i10] == multicastSubscription) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr2 = EMPTY;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i10);
                    System.arraycopy(multicastSubscriptionArr, i10 + 1, multicastSubscriptionArr3, i10, (length - i10) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!AbstractC0920q.m1034a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC8989c interfaceC8989c) {
            MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(interfaceC8989c, this);
            interfaceC8989c.onSubscribe(multicastSubscription);
            if (add(multicastSubscription)) {
                if (multicastSubscription.isCancelled()) {
                    remove(multicastSubscription);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            Throwable th = this.error;
            if (th != null) {
                interfaceC8989c.onError(th);
            } else {
                interfaceC8989c.onComplete();
            }
        }
    }

    public static final class MulticastSubscription<T> extends AtomicLong implements InterfaceC8990d {
        private static final long serialVersionUID = 8664815189257569791L;
        final InterfaceC8989c downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(InterfaceC8989c interfaceC8989c, MulticastProcessor<T> multicastProcessor) {
            this.downstream = interfaceC8989c;
            this.parent = multicastProcessor;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this, j10);
                this.parent.drain();
            }
        }
    }

    public static final class OutputCanceller<R> implements FlowableSubscriber<R>, InterfaceC8990d {
        final InterfaceC8989c downstream;
        final MulticastProcessor<?> processor;
        InterfaceC8990d upstream;

        public OutputCanceller(InterfaceC8989c interfaceC8989c, MulticastProcessor<?> multicastProcessor) {
            this.downstream = interfaceC8989c;
            this.processor = multicastProcessor;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.cancel();
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.downstream.onComplete();
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(R r10) {
            this.downstream.onNext(r10);
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
            this.upstream.request(j10);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends InterfaceC8988b> function, int i10, boolean z9) {
        super(flowable);
        this.selector = function;
        this.prefetch = i10;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        MulticastProcessor multicastProcessor = new MulticastProcessor(this.prefetch, this.delayError);
        try {
            ((InterfaceC8988b) ObjectHelper.requireNonNull(this.selector.apply(multicastProcessor), "selector returned a null Publisher")).subscribe(new OutputCanceller(interfaceC8989c, multicastProcessor));
            this.source.subscribe((FlowableSubscriber) multicastProcessor);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC8989c);
        }
    }
}
