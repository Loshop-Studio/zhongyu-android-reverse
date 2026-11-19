package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final InterfaceC0050c downstream;
        long index;
        final AtomicBoolean once;
        final long size;
        InterfaceC0051d upstream;
        UnicastProcessor<T> window;

        public WindowExactSubscriber(InterfaceC0050c interfaceC0050c, long j9, int i9) {
            super(1);
            this.downstream = interfaceC0050c;
            this.size = j9;
            this.once = new AtomicBoolean();
            this.bufferSize = i9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            long j9 = this.index;
            UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j9 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j10 = j9 + 1;
            unicastProcessorCreate.onNext(t9);
            if (j10 != this.size) {
                this.index = j10;
                return;
            }
            this.index = 0L;
            this.window = null;
            unicastProcessorCreate.onComplete();
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
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j9));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC0050c downstream;
        Throwable error;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        long produced;
        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        final AtomicLong requested;
        final long size;
        final long skip;
        InterfaceC0051d upstream;
        final ArrayDeque<UnicastProcessor<T>> windows;
        final AtomicInteger wip;

        public WindowOverlapSubscriber(InterfaceC0050c interfaceC0050c, long j9, long j10, int i9) {
            super(1);
            this.downstream = interfaceC0050c;
            this.size = j9;
            this.skip = j10;
            this.queue = new SpscLinkedArrayQueue<>(i9);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z9) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                spscLinkedArrayQueue.clear();
                interfaceC0050c.onError(th);
                return true;
            }
            if (!z10) {
                return false;
            }
            interfaceC0050c.onComplete();
            return true;
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            InterfaceC0050c interfaceC0050c = this.downstream;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    boolean z9 = this.done;
                    UnicastProcessor<T> unicastProcessorPoll = spscLinkedArrayQueue.poll();
                    boolean z10 = unicastProcessorPoll == null;
                    if (checkTerminated(z9, z10, interfaceC0050c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC0050c.onNext(unicastProcessorPoll);
                    j10++;
                }
                if (j10 == j9 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC0050c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j10 != 0 && j9 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j10);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            long j9 = this.index;
            if (j9 == 0 && !this.cancelled) {
                getAndIncrement();
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.windows.offer(unicastProcessorCreate);
                this.queue.offer(unicastProcessorCreate);
                drain();
            }
            long j10 = j9 + 1;
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t9);
            }
            long j11 = this.produced + 1;
            if (j11 == this.size) {
                this.produced = j11 - this.skip;
                UnicastProcessor<T> unicastProcessorPoll = this.windows.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.produced = j11;
            }
            if (j10 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j10;
            }
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
                BackpressureHelper.add(this.requested, j9);
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j9));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j9 - 1)));
                }
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final InterfaceC0050c downstream;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        final long size;
        final long skip;
        InterfaceC0051d upstream;
        UnicastProcessor<T> window;

        public WindowSkipSubscriber(InterfaceC0050c interfaceC0050c, long j9, long j10, int i9) {
            super(1);
            this.downstream = interfaceC0050c;
            this.size = j9;
            this.skip = j10;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            long j9 = this.index;
            UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j9 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j10 = j9 + 1;
            if (unicastProcessorCreate != null) {
                unicastProcessorCreate.onNext(t9);
            }
            if (j10 == this.size) {
                this.window = null;
                unicastProcessorCreate.onComplete();
            }
            if (j10 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j10;
            }
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
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j9));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j9), BackpressureHelper.multiplyCap(this.skip - this.size, j9 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j9, long j10, int i9) {
        super(flowable);
        this.size = j9;
        this.skip = j10;
        this.bufferSize = i9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        long j9 = this.skip;
        long j10 = this.size;
        if (j9 == j10) {
            this.source.subscribe((FlowableSubscriber) new WindowExactSubscriber(interfaceC0050c, this.size, this.bufferSize));
        } else if (j9 > j10) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(interfaceC0050c, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowOverlapSubscriber(interfaceC0050c, this.size, this.skip, this.bufferSize));
        }
    }
}
