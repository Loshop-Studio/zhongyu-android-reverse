package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {
    final Function<? super Open, ? extends InterfaceC8988b> bufferClose;
    final InterfaceC8988b bufferOpen;
    final Callable<U> bufferSupplier;

    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -8466418554264089604L;
        final Function<? super Open, ? extends InterfaceC8988b> bufferClose;
        final InterfaceC8988b bufferOpen;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC8989c downstream;
        long emitted;
        long index;
        final SpscLinkedArrayQueue<C> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final CompositeDisposable subscribers = new CompositeDisposable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        Map<Long, C> buffers = new LinkedHashMap();
        final AtomicThrowable errors = new AtomicThrowable();

        public static final class BufferOpenSubscriber<Open> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Open>, Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final BufferBoundarySubscriber<?, ?, Open, ?> parent;

            public BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.parent = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get() == SubscriptionHelper.CANCELLED;
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.openComplete(this);
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onError(Throwable th) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.boundaryError(this, th);
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onSubscribe(InterfaceC8990d interfaceC8990d) {
                SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
            }
        }

        public BufferBoundarySubscriber(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b, Function<? super Open, ? extends InterfaceC8988b> function, Callable<C> callable) {
            this.downstream = interfaceC8989c;
            this.bufferSupplier = callable;
            this.bufferOpen = interfaceC8988b;
            this.bufferClose = function;
        }

        public void boundaryError(Disposable disposable, Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.subscribers.delete(disposable);
            onError(th);
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (SubscriptionHelper.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        public void close(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j10) {
            boolean z9;
            this.subscribers.delete(bufferCloseSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                z9 = true;
            } else {
                z9 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    this.queue.offer(map.remove(Long.valueOf(j10)));
                    if (z9) {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j10 = this.emitted;
            InterfaceC8989c interfaceC8989c = this.downstream;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                while (j10 != j11) {
                    if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    if (z9 && this.errors.get() != null) {
                        spscLinkedArrayQueue.clear();
                        interfaceC8989c.onError(this.errors.terminate());
                        return;
                    }
                    C cPoll = spscLinkedArrayQueue.poll();
                    boolean z10 = cPoll == null;
                    if (z9 && z10) {
                        interfaceC8989c.onComplete();
                        return;
                    } else {
                        if (z10) {
                            break;
                        }
                        interfaceC8989c.onNext(cPoll);
                        j10++;
                    }
                }
                if (j10 == j11) {
                    if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        if (this.errors.get() != null) {
                            spscLinkedArrayQueue.clear();
                            interfaceC8989c.onError(this.errors.terminate());
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            interfaceC8989c.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.queue.offer(it.next());
                    }
                    this.buffers = null;
                    this.done = true;
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC8990d)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.subscribers.add(bufferOpenSubscriber);
                this.bufferOpen.subscribe(bufferOpenSubscriber);
                interfaceC8990d.request(Long.MAX_VALUE);
            }
        }

        public void open(Open open) {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.bufferClose.apply(open), "The bufferClose returned a null Publisher");
                long j10 = this.index;
                this.index = 1 + j10;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.buffers;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j10), collection);
                        BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(this, j10);
                        this.subscribers.add(bufferCloseSubscriber);
                        interfaceC8988b.subscribe(bufferCloseSubscriber);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                SubscriptionHelper.cancel(this.upstream);
                onError(th2);
            }
        }

        public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.subscribers.delete(bufferOpenSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final BufferBoundarySubscriber<T, C, ?, ?> parent;

        public BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j10) {
            this.parent = bufferBoundarySubscriber;
            this.index = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            InterfaceC8990d interfaceC8990d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC8990d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            InterfaceC8990d interfaceC8990d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC8990d == subscriptionHelper) {
                RxJavaPlugins.onError(th);
            } else {
                lazySet(subscriptionHelper);
                this.parent.boundaryError(this, th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            InterfaceC8990d interfaceC8990d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC8990d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                interfaceC8990d.cancel();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary(Flowable<T> flowable, InterfaceC8988b interfaceC8988b, Function<? super Open, ? extends InterfaceC8988b> function, Callable<U> callable) {
        super(flowable);
        this.bufferOpen = interfaceC8988b;
        this.bufferClose = function;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(interfaceC8989c, this.bufferOpen, this.bufferClose, this.bufferSupplier);
        interfaceC8989c.onSubscribe(bufferBoundarySubscriber);
        this.source.subscribe((FlowableSubscriber) bufferBoundarySubscriber);
    }
}
