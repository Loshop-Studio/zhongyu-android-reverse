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
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final InterfaceC8989c downstream;
        long index;
        final AtomicBoolean once;
        final long size;
        InterfaceC8990d upstream;
        UnicastProcessor<T> window;

        public WindowExactSubscriber(InterfaceC8989c interfaceC8989c, long j10, int i10) {
            super(1);
            this.downstream = interfaceC8989c;
            this.size = j10;
            this.once = new AtomicBoolean();
            this.bufferSize = i10;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            long j10 = this.index;
            UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j11 = j10 + 1;
            unicastProcessorCreate.onNext(t10);
            if (j11 != this.size) {
                this.index = j11;
                return;
            }
            this.index = 0L;
            this.window = null;
            unicastProcessorCreate.onComplete();
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
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC8989c downstream;
        Throwable error;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        long produced;
        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        final AtomicLong requested;
        final long size;
        final long skip;
        InterfaceC8990d upstream;
        final ArrayDeque<UnicastProcessor<T>> windows;
        final AtomicInteger wip;

        public WindowOverlapSubscriber(InterfaceC8989c interfaceC8989c, long j10, long j11, int i10) {
            super(1);
            this.downstream = interfaceC8989c;
            this.size = j10;
            this.skip = j11;
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i10;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC8989c interfaceC8989c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
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
                interfaceC8989c.onError(th);
                return true;
            }
            if (!z10) {
                return false;
            }
            interfaceC8989c.onComplete();
            return true;
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z9 = this.done;
                    UnicastProcessor<T> unicastProcessorPoll = spscLinkedArrayQueue.poll();
                    boolean z10 = unicastProcessorPoll == null;
                    if (checkTerminated(z9, z10, interfaceC8989c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC8989c.onNext(unicastProcessorPoll);
                    j11++;
                }
                if (j11 == j10 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC8989c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            long j10 = this.index;
            if (j10 == 0 && !this.cancelled) {
                getAndIncrement();
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.windows.offer(unicastProcessorCreate);
                this.queue.offer(unicastProcessorCreate);
                drain();
            }
            long j11 = j10 + 1;
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            long j12 = this.produced + 1;
            if (j12 == this.size) {
                this.produced = j12 - this.skip;
                UnicastProcessor<T> unicastProcessorPoll = this.windows.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.produced = j12;
            }
            if (j11 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j11;
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
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j10));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j10 - 1)));
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

    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final InterfaceC8989c downstream;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        final long size;
        final long skip;
        InterfaceC8990d upstream;
        UnicastProcessor<T> window;

        public WindowSkipSubscriber(InterfaceC8989c interfaceC8989c, long j10, long j11, int i10) {
            super(1);
            this.downstream = interfaceC8989c;
            this.size = j10;
            this.skip = j11;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i10;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            long j10 = this.index;
            UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessorCreate = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j11 = j10 + 1;
            if (unicastProcessorCreate != null) {
                unicastProcessorCreate.onNext(t10);
            }
            if (j11 == this.size) {
                this.window = null;
                unicastProcessorCreate.onComplete();
            }
            if (j11 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j11;
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
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j10));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j10), BackpressureHelper.multiplyCap(this.skip - this.size, j10 - 1)));
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

    public FlowableWindow(Flowable<T> flowable, long j10, long j11, int i10) {
        super(flowable);
        this.size = j10;
        this.skip = j11;
        this.bufferSize = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        long j10 = this.skip;
        long j11 = this.size;
        if (j10 == j11) {
            this.source.subscribe((FlowableSubscriber) new WindowExactSubscriber(interfaceC8989c, this.size, this.bufferSize));
        } else if (j10 > j11) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(interfaceC8989c, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowOverlapSubscriber(interfaceC8989c, this.size, this.skip, this.bufferSize));
        }
    }
}
