package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final InterfaceC8988b[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends InterfaceC8988b> iterable;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC8989c downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        public CombineLatestCoordinator(InterfaceC8989c interfaceC8989c, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z9) {
            this.downstream = interfaceC8989c;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combineLatestInnerSubscriberArr[i12] = new CombineLatestInnerSubscriber<>(this, i12, i11);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i10];
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z9;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC8989c interfaceC8989c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z9) {
                return false;
            }
            if (this.delayErrors) {
                if (!z10) {
                    return false;
                }
                cancelAll();
                Throwable thTerminate = ExceptionHelper.terminate(this.error);
                if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                    interfaceC8989c.onComplete();
                } else {
                    interfaceC8989c.onError(thTerminate);
                }
                return true;
            }
            Throwable thTerminate2 = ExceptionHelper.terminate(this.error);
            if (thTerminate2 != null && thTerminate2 != ExceptionHelper.TERMINATED) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                interfaceC8989c.onError(thTerminate2);
                return true;
            }
            if (!z10) {
                return false;
            }
            cancelAll();
            interfaceC8989c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        public void drainAsync() {
            InterfaceC8989c interfaceC8989c = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z9 = this.done;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z10 = objPoll == null;
                    if (checkTerminated(z9, z10, interfaceC8989c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    try {
                        interfaceC8989c.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) objPoll).requestOne();
                        j11++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th);
                        interfaceC8989c.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j11 == j10 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC8989c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void drainOutput() {
            InterfaceC8989c interfaceC8989c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC8989c.onError(th);
                    return;
                }
                boolean z9 = this.done;
                boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                if (!zIsEmpty) {
                    interfaceC8989c.onNext(null);
                }
                if (z9 && zIsEmpty) {
                    interfaceC8989c.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void innerComplete(int i10) {
            int i11;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i10] != null && (i11 = this.completedSources + 1) != objArr.length) {
                        this.completedSources = i11;
                    } else {
                        this.done = true;
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void innerError(int i10, Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else {
                if (this.delayErrors) {
                    innerComplete(i10);
                    return;
                }
                cancelAll();
                this.done = true;
                drain();
            }
        }

        public void innerValue(int i10, T t10) {
            boolean z9;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i11 = this.nonEmptySources;
                    if (objArr[i10] == null) {
                        i11++;
                        this.nonEmptySources = i11;
                    }
                    objArr[i10] = t10;
                    if (objArr.length == i11) {
                        this.queue.offer(this.subscribers[i10], objArr.clone());
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9) {
                this.subscribers[i10].requestOne();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Object objPoll = this.queue.poll();
            if (objPoll == null) {
                return null;
            }
            R r10 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).requestOne();
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
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            this.outputFused = i11 != 0;
            return i11;
        }

        public void subscribe(InterfaceC8988b[] interfaceC8988bArr, int i10) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < i10 && !this.done && !this.cancelled; i11++) {
                interfaceC8988bArr[i11].subscribe(combineLatestInnerSubscriberArr[i11]);
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i10, int i11) {
            this.parent = combineLatestCoordinator;
            this.index = i10;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.parent.innerValue(this.index, t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, this.prefetch);
        }

        public void requestOne() {
            int i10 = this.produced + 1;
            if (i10 != this.limit) {
                this.produced = i10;
            } else {
                this.produced = 0;
                get().request(i10);
            }
        }
    }

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t10) throws Exception {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t10});
        }
    }

    public FlowableCombineLatest(@NonNull InterfaceC8988b[] interfaceC8988bArr, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z9) {
        this.array = interfaceC8988bArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayErrors = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        int length;
        InterfaceC8988b[] interfaceC8988bArr = this.array;
        if (interfaceC8988bArr == null) {
            interfaceC8988bArr = new InterfaceC8988b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == interfaceC8988bArr.length) {
                                InterfaceC8988b[] interfaceC8988bArr2 = new InterfaceC8988b[(length >> 2) + length];
                                System.arraycopy(interfaceC8988bArr, 0, interfaceC8988bArr2, 0, length);
                                interfaceC8988bArr = interfaceC8988bArr2;
                            }
                            interfaceC8988bArr[length] = interfaceC8988b;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, interfaceC8989c);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, interfaceC8989c);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC8989c);
                return;
            }
        } else {
            length = interfaceC8988bArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(interfaceC8989c);
        } else {
            if (i10 == 1) {
                interfaceC8988bArr[0].subscribe(new FlowableMap.MapSubscriber(interfaceC8989c, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(interfaceC8989c, this.combiner, i10, this.bufferSize, this.delayErrors);
            interfaceC8989c.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(interfaceC8988bArr, i10);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends InterfaceC8988b> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z9) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayErrors = z9;
    }
}
