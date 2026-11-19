package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableWindowBoundary<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int capacityHint;
    final InterfaceC8988b other;

    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {
        boolean done;
        final WindowBoundaryMainSubscriber<T, B> parent;

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.parent = windowBoundaryMainSubscriber;
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(B b10) {
            if (this.done) {
                return;
            }
            this.parent.innerNext();
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final InterfaceC8989c downstream;
        long emitted;
        UnicastProcessor<T> window;
        final WindowBoundaryInnerSubscriber<T, B> boundarySubscriber = new WindowBoundaryInnerSubscriber<>(this);
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public WindowBoundaryMainSubscriber(InterfaceC8989c interfaceC8989c, int i10) {
            this.downstream = interfaceC8989c;
            this.capacityHint = i10;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundarySubscriber.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    SubscriptionHelper.cancel(this.upstream);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            long j10 = this.emitted;
            int iAddAndGet = 1;
            while (this.windows.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.window;
                boolean z9 = this.done;
                if (z9 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastProcessor != 0) {
                        this.window = null;
                        unicastProcessor.onError(thTerminate);
                    }
                    interfaceC8989c.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z10 = objPoll == null;
                if (z9 && z10) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastProcessor != 0) {
                            this.window = null;
                            unicastProcessor.onComplete();
                        }
                        interfaceC8989c.onComplete();
                        return;
                    }
                    if (unicastProcessor != 0) {
                        this.window = null;
                        unicastProcessor.onError(thTerminate2);
                    }
                    interfaceC8989c.onError(thTerminate2);
                    return;
                }
                if (z10) {
                    this.emitted = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != NEXT_WINDOW) {
                    unicastProcessor.onNext(objPoll);
                } else {
                    if (unicastProcessor != 0) {
                        this.window = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.capacityHint, this);
                        this.window = unicastProcessorCreate;
                        this.windows.getAndIncrement();
                        if (j10 != this.requested.get()) {
                            j10++;
                            interfaceC8989c.onNext(unicastProcessorCreate);
                        } else {
                            SubscriptionHelper.cancel(this.upstream);
                            this.boundarySubscriber.dispose();
                            atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.done = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }

        public void innerComplete() {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }

        public void innerError(Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.boundarySubscriber.dispose();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.boundarySubscriber.dispose();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this.upstream, interfaceC8990d, Long.MAX_VALUE);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.upstream);
            }
        }
    }

    public FlowableWindowBoundary(Flowable<T> flowable, InterfaceC8988b interfaceC8988b, int i10) {
        super(flowable);
        this.other = interfaceC8988b;
        this.capacityHint = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(interfaceC8989c, this.capacityHint);
        interfaceC8989c.onSubscribe(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.innerNext();
        this.other.subscribe(windowBoundaryMainSubscriber.boundarySubscriber);
        this.source.subscribe((FlowableSubscriber) windowBoundaryMainSubscriber);
    }
}
