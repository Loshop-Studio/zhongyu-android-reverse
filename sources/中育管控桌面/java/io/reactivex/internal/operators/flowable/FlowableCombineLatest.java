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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final InterfaceC7916b[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends InterfaceC7916b> iterable;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC7917c downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        public CombineLatestCoordinator(InterfaceC7917c interfaceC7917c, Function<? super Object[], ? extends R> function, int i6, int i7, boolean z6) {
            this.downstream = interfaceC7917c;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                combineLatestInnerSubscriberArr[i8] = new CombineLatestInnerSubscriber<>(this, i8, i7);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i6];
            this.queue = new SpscLinkedArrayQueue<>(i7);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z6;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        public boolean checkTerminated(boolean z6, boolean z7, InterfaceC7917c interfaceC7917c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z6) {
                return false;
            }
            if (this.delayErrors) {
                if (!z7) {
                    return false;
                }
                cancelAll();
                Throwable thTerminate = ExceptionHelper.terminate(this.error);
                if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                    interfaceC7917c.onComplete();
                } else {
                    interfaceC7917c.onError(thTerminate);
                }
                return true;
            }
            Throwable thTerminate2 = ExceptionHelper.terminate(this.error);
            if (thTerminate2 != null && thTerminate2 != ExceptionHelper.TERMINATED) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                interfaceC7917c.onError(thTerminate2);
                return true;
            }
            if (!z7) {
                return false;
            }
            cancelAll();
            interfaceC7917c.onComplete();
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
            InterfaceC7917c interfaceC7917c = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j6 = this.requested.get();
                long j7 = 0;
                while (j7 != j6) {
                    boolean z6 = this.done;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z7 = objPoll == null;
                    if (checkTerminated(z6, z7, interfaceC7917c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z7) {
                        break;
                    }
                    try {
                        interfaceC7917c.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) objPoll).requestOne();
                        j7++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th);
                        interfaceC7917c.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j7 == j6 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC7917c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j7 != 0 && j6 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j7);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void drainOutput() {
            InterfaceC7917c interfaceC7917c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC7917c.onError(th);
                    return;
                }
                boolean z6 = this.done;
                boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                if (!zIsEmpty) {
                    interfaceC7917c.onNext(null);
                }
                if (z6 && zIsEmpty) {
                    interfaceC7917c.onComplete();
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

        public void innerComplete(int i6) {
            int i7;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i6] != null && (i7 = this.completedSources + 1) != objArr.length) {
                        this.completedSources = i7;
                    } else {
                        this.done = true;
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void innerError(int i6, Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else {
                if (this.delayErrors) {
                    innerComplete(i6);
                    return;
                }
                cancelAll();
                this.done = true;
                drain();
            }
        }

        public void innerValue(int i6, T t6) {
            boolean z6;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i7 = this.nonEmptySources;
                    if (objArr[i6] == null) {
                        i7++;
                        this.nonEmptySources = i7;
                    }
                    objArr[i6] = t6;
                    if (objArr.length == i7) {
                        this.queue.offer(this.subscribers[i6], objArr.clone());
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z6) {
                this.subscribers[i6].requestOne();
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
        public R poll() {
            Object objPoll = this.queue.poll();
            if (objPoll == null) {
                return null;
            }
            R r6 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).requestOne();
            return r6;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i6) {
            if ((i6 & 4) != 0) {
                return 0;
            }
            int i7 = i6 & 2;
            this.outputFused = i7 != 0;
            return i7;
        }

        public void subscribe(InterfaceC7916b[] interfaceC7916bArr, int i6) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i7 = 0; i7 < i6 && !this.done && !this.cancelled; i7++) {
                interfaceC7916bArr[i7].subscribe(combineLatestInnerSubscriberArr[i7]);
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i6, int i7) {
            this.parent = combineLatestCoordinator;
            this.index = i6;
            this.prefetch = i7;
            this.limit = i7 - (i7 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.parent.innerValue(this.index, t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.setOnce(this, interfaceC7918d, this.prefetch);
        }

        public void requestOne() {
            int i6 = this.produced + 1;
            if (i6 != this.limit) {
                this.produced = i6;
            } else {
                this.produced = 0;
                get().request(i6);
            }
        }
    }

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t6) {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t6});
        }
    }

    public FlowableCombineLatest(@NonNull InterfaceC7916b[] interfaceC7916bArr, @NonNull Function<? super Object[], ? extends R> function, int i6, boolean z6) {
        this.array = interfaceC7916bArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i6;
        this.delayErrors = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        int length;
        InterfaceC7916b[] interfaceC7916bArr = this.array;
        if (interfaceC7916bArr == null) {
            interfaceC7916bArr = new InterfaceC7916b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            InterfaceC7916b interfaceC7916b = (InterfaceC7916b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == interfaceC7916bArr.length) {
                                InterfaceC7916b[] interfaceC7916bArr2 = new InterfaceC7916b[(length >> 2) + length];
                                System.arraycopy(interfaceC7916bArr, 0, interfaceC7916bArr2, 0, length);
                                interfaceC7916bArr = interfaceC7916bArr2;
                            }
                            interfaceC7916bArr[length] = interfaceC7916b;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, interfaceC7917c);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, interfaceC7917c);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC7917c);
                return;
            }
        } else {
            length = interfaceC7916bArr.length;
        }
        int i6 = length;
        if (i6 == 0) {
            EmptySubscription.complete(interfaceC7917c);
        } else {
            if (i6 == 1) {
                interfaceC7916bArr[0].subscribe(new FlowableMap.MapSubscriber(interfaceC7917c, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(interfaceC7917c, this.combiner, i6, this.bufferSize, this.delayErrors);
            interfaceC7917c.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(interfaceC7916bArr, i6);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends InterfaceC7916b> iterable, @NonNull Function<? super Object[], ? extends R> function, int i6, boolean z6) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i6;
        this.delayErrors = z6;
    }
}
