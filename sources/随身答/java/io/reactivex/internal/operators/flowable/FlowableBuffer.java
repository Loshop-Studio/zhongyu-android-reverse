package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Callable<C> bufferSupplier;
    final int size;
    final int skip;

    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, InterfaceC0051d {
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final InterfaceC0050c downstream;
        int index;
        final int size;
        InterfaceC0051d upstream;

        public PublisherBufferExactSubscriber(InterfaceC0050c interfaceC0050c, int i9, Callable<C> callable) {
            this.downstream = interfaceC0050c;
            this.size = i9;
            this.bufferSupplier = callable;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c10 = this.buffer;
            if (c10 != null && !c10.isEmpty()) {
                this.downstream.onNext(c10);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            C c10 = this.buffer;
            if (c10 == null) {
                try {
                    c10 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c10;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c10.add(t9);
            int i9 = this.index + 1;
            if (i9 != this.size) {
                this.index = i9;
                return;
            }
            this.index = 0;
            this.buffer = null;
            this.downstream.onNext(c10);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j9, this.size));
            }
        }
    }

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC0051d, BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final InterfaceC0050c downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        InterfaceC0051d upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        public PublisherBufferOverlappingSubscriber(InterfaceC0050c interfaceC0050c, int i9, int i10, Callable<C> callable) {
            this.downstream = interfaceC0050c;
            this.size = i9;
            this.skip = i10;
            this.bufferSupplier = callable;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j9 = this.produced;
            if (j9 != 0) {
                BackpressureHelper.produced(this, j9);
            }
            QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i9 = this.index;
            int i10 = i9 + 1;
            if (i9 == 0) {
                try {
                    arrayDeque.offer((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer"));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t9);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t9);
            }
            if (i10 == this.skip) {
                i10 = 0;
            }
            this.index = i10;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (!SubscriptionHelper.validate(j9) || QueueDrainHelper.postCompleteRequest(j9, this.downstream, this.buffers, this, this)) {
                return;
            }
            if (this.once.get() || !this.once.compareAndSet(false, true)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j9));
            } else {
                this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j9 - 1)));
            }
        }
    }

    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final InterfaceC0050c downstream;
        int index;
        final int size;
        final int skip;
        InterfaceC0051d upstream;

        public PublisherBufferSkipSubscriber(InterfaceC0050c interfaceC0050c, int i9, int i10, Callable<C> callable) {
            this.downstream = interfaceC0050c;
            this.size = i9;
            this.skip = i10;
            this.bufferSupplier = callable;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c10 = this.buffer;
            this.buffer = null;
            if (c10 != null) {
                this.downstream.onNext(c10);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            C c10 = this.buffer;
            int i9 = this.index;
            int i10 = i9 + 1;
            if (i9 == 0) {
                try {
                    c10 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c10;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c10 != null) {
                c10.add(t9);
                if (c10.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c10);
                }
            }
            if (i10 == this.skip) {
                i10 = 0;
            }
            this.index = i10;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j9));
                    return;
                }
                this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j9, this.size), BackpressureHelper.multiplyCap(this.skip - this.size, j9 - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i9, int i10, Callable<C> callable) {
        super(flowable);
        this.size = i9;
        this.skip = i10;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        int i9 = this.size;
        int i10 = this.skip;
        if (i9 == i10) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(interfaceC0050c, i9, this.bufferSupplier));
        } else if (i10 > i9) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(interfaceC0050c, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(interfaceC0050c, this.size, this.skip, this.bufferSupplier));
        }
    }
}
