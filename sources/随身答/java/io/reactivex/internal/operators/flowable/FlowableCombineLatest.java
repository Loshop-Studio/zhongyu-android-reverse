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
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final InterfaceC0049b[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends InterfaceC0049b> iterable;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC0050c downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        public CombineLatestCoordinator(InterfaceC0050c interfaceC0050c, Function<? super Object[], ? extends R> function, int i9, int i10, boolean z9) {
            this.downstream = interfaceC0050c;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i9];
            for (int i11 = 0; i11 < i9; i11++) {
                combineLatestInnerSubscriberArr[i11] = new CombineLatestInnerSubscriber<>(this, i11, i10);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i9];
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z9;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
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
                    interfaceC0050c.onComplete();
                } else {
                    interfaceC0050c.onError(thTerminate);
                }
                return true;
            }
            Throwable thTerminate2 = ExceptionHelper.terminate(this.error);
            if (thTerminate2 != null && thTerminate2 != ExceptionHelper.TERMINATED) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                interfaceC0050c.onError(thTerminate2);
                return true;
            }
            if (!z10) {
                return false;
            }
            cancelAll();
            interfaceC0050c.onComplete();
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
            InterfaceC0050c interfaceC0050c = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    boolean z9 = this.done;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z10 = objPoll == null;
                    if (checkTerminated(z9, z10, interfaceC0050c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    try {
                        interfaceC0050c.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) objPoll).requestOne();
                        j10++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th);
                        interfaceC0050c.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j10 == j9 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC0050c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j10 != 0 && j9 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void drainOutput() {
            InterfaceC0050c interfaceC0050c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC0050c.onError(th);
                    return;
                }
                boolean z9 = this.done;
                boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                if (!zIsEmpty) {
                    interfaceC0050c.onNext(null);
                }
                if (z9 && zIsEmpty) {
                    interfaceC0050c.onComplete();
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

        public void innerComplete(int i9) {
            int i10;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i9] != null && (i10 = this.completedSources + 1) != objArr.length) {
                        this.completedSources = i10;
                    } else {
                        this.done = true;
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void innerError(int i9, Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else {
                if (this.delayErrors) {
                    innerComplete(i9);
                    return;
                }
                cancelAll();
                this.done = true;
                drain();
            }
        }

        public void innerValue(int i9, T t9) {
            boolean z9;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int i10 = this.nonEmptySources;
                    if (objArr[i9] == null) {
                        i10++;
                        this.nonEmptySources = i10;
                    }
                    objArr[i9] = t9;
                    if (objArr.length == i10) {
                        this.queue.offer(this.subscribers[i9], objArr.clone());
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9) {
                this.subscribers[i9].requestOne();
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
            R r9 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).requestOne();
            return r9;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i9) {
            if ((i9 & 4) != 0) {
                return 0;
            }
            int i10 = i9 & 2;
            this.outputFused = i10 != 0;
            return i10;
        }

        public void subscribe(InterfaceC0049b[] interfaceC0049bArr, int i9) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i10 = 0; i10 < i9 && !this.done && !this.cancelled; i10++) {
                interfaceC0049bArr[i10].subscribe(combineLatestInnerSubscriberArr[i10]);
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<InterfaceC0051d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i9, int i10) {
            this.parent = combineLatestCoordinator;
            this.index = i9;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.parent.innerValue(this.index, t9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.setOnce(this, interfaceC0051d, this.prefetch);
        }

        public void requestOne() {
            int i9 = this.produced + 1;
            if (i9 != this.limit) {
                this.produced = i9;
            } else {
                this.produced = 0;
                get().request(i9);
            }
        }
    }

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t9) throws Exception {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t9});
        }
    }

    public FlowableCombineLatest(@NonNull InterfaceC0049b[] interfaceC0049bArr, @NonNull Function<? super Object[], ? extends R> function, int i9, boolean z9) {
        this.array = interfaceC0049bArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i9;
        this.delayErrors = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        int length;
        InterfaceC0049b[] interfaceC0049bArr = this.array;
        if (interfaceC0049bArr == null) {
            interfaceC0049bArr = new InterfaceC0049b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            InterfaceC0049b interfaceC0049b = (InterfaceC0049b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == interfaceC0049bArr.length) {
                                InterfaceC0049b[] interfaceC0049bArr2 = new InterfaceC0049b[(length >> 2) + length];
                                System.arraycopy(interfaceC0049bArr, 0, interfaceC0049bArr2, 0, length);
                                interfaceC0049bArr = interfaceC0049bArr2;
                            }
                            interfaceC0049bArr[length] = interfaceC0049b;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, interfaceC0050c);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, interfaceC0050c);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC0050c);
                return;
            }
        } else {
            length = interfaceC0049bArr.length;
        }
        int i9 = length;
        if (i9 == 0) {
            EmptySubscription.complete(interfaceC0050c);
        } else {
            if (i9 == 1) {
                interfaceC0049bArr[0].subscribe(new FlowableMap.MapSubscriber(interfaceC0050c, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(interfaceC0050c, this.combiner, i9, this.bufferSize, this.delayErrors);
            interfaceC0050c.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(interfaceC0049bArr, i9);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends InterfaceC0049b> iterable, @NonNull Function<? super Object[], ? extends R> function, int i9, boolean z9) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i9;
        this.delayErrors = z9;
    }
}
