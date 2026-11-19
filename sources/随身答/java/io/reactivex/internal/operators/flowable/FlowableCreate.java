package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableCreate<T> extends Flowable<T> {
    final BackpressureStrategy backpressure;
    final FlowableOnSubscribe<T> source;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 */
    public static /* synthetic */ class C81861 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureStrategy = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, InterfaceC0051d {
        private static final long serialVersionUID = 7326289992464377023L;
        final InterfaceC0050c downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        public BaseEmitter(InterfaceC0050c interfaceC0050c) {
            this.downstream = interfaceC0050c;
        }

        @Override // p010a9.InterfaceC0051d
        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        public void complete() {
            if (isCancelled()) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                this.serial.dispose();
            }
        }

        public boolean error(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // p010a9.InterfaceC0051d
        public final void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this, j9);
                onRequested();
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.FlowableEmitter
        public final FlowableEmitter<T> serialize() {
            return new SerializedEmitter(this);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(Disposable disposable) {
            this.serial.update(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th) {
            return error(th);
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicInteger wip;

        public BufferAsyncEmitter(InterfaceC0050c interfaceC0050c, int i9) {
            super(interfaceC0050c);
            this.queue = new SpscLinkedArrayQueue<>(i9);
            this.wip = new AtomicInteger();
        }

        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            InterfaceC0050c interfaceC0050c = this.downstream;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j9 = get();
                long j10 = 0;
                while (j10 != j9) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    T tPoll = spscLinkedArrayQueue.poll();
                    boolean z10 = tPoll == null;
                    if (z9 && z10) {
                        Throwable th = this.error;
                        if (th != null) {
                            error(th);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC0050c.onNext(tPoll);
                    j10++;
                }
                if (j10 == j9) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z11 && zIsEmpty) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            error(th2);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                }
                if (j10 != 0) {
                    BackpressureHelper.produced(this, j10);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t9) {
            if (this.done || isCancelled()) {
                return;
            }
            if (t9 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.offer(t9);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onRequested() {
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(InterfaceC0050c interfaceC0050c) {
            super(interfaceC0050c);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public ErrorAsyncEmitter(InterfaceC0050c interfaceC0050c) {
            super(interfaceC0050c);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        public LatestAsyncEmitter(InterfaceC0050c interfaceC0050c) {
            super(interfaceC0050c);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        
            if (r9 != r5) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        
            if (isCancelled() == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
        
            r5 = r17.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        
            if (r2.get() != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        
            if (r5 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
        
            if (r12 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        
            r1 = r17.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        
            if (r1 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
        
            error(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        
            complete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
        
            if (r9 == 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.produced(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x007c, code lost:
        
            r4 = r17.wip.addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drain() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.wip
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto L85
            Lc:
                a9.c r1 = r0.downstream
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.queue
                r3 = 1
                r4 = r3
            L12:
                long r5 = r0.get()
                r7 = 0
                r9 = r7
            L19:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L50
                boolean r14 = r0.isCancelled()
                if (r14 == 0) goto L29
                r2.lazySet(r13)
                return
            L29:
                boolean r14 = r0.done
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L34
                r16 = r3
                goto L36
            L34:
                r16 = r12
            L36:
                if (r14 == 0) goto L46
                if (r16 == 0) goto L46
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L42
                r0.error(r1)
                return
            L42:
                r0.complete()
                return
            L46:
                if (r16 == 0) goto L49
                goto L50
            L49:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L50:
                if (r11 != 0) goto L75
                boolean r5 = r0.isCancelled()
                if (r5 == 0) goto L5c
                r2.lazySet(r13)
                return
            L5c:
                boolean r5 = r0.done
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L65
                r12 = r3
            L65:
                if (r5 == 0) goto L75
                if (r12 == 0) goto L75
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L71
                r0.error(r1)
                return
            L71:
                r0.complete()
                return
            L75:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7c
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r9)
            L7c:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.wip
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            L85:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCreate.LatestAsyncEmitter.drain():void");
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t9) {
            if (this.done || isCancelled()) {
                return;
            }
            if (t9 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.set(t9);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onRequested() {
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public MissingEmitter(InterfaceC0050c interfaceC0050c) {
            super(interfaceC0050c);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t9) {
            long j9;
            if (isCancelled()) {
                return;
            }
            if (t9 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.downstream.onNext(t9);
            do {
                j9 = get();
                if (j9 == 0) {
                    return;
                }
            } while (!compareAndSet(j9, j9 - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseAsyncEmitter(InterfaceC0050c interfaceC0050c) {
            super(interfaceC0050c);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t9) {
            if (isCancelled()) {
                return;
            }
            if (t9 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                onOverflow();
            } else {
                this.downstream.onNext(t9);
                BackpressureHelper.produced(this, 1L);
            }
        }

        public abstract void onOverflow();
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final BaseEmitter<T> emitter;
        final AtomicThrowable error = new AtomicThrowable();
        final SimplePlainQueue<T> queue = new SpscLinkedArrayQueue(16);

        public SerializedEmitter(BaseEmitter<T> baseEmitter) {
            this.emitter = baseEmitter;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            BaseEmitter<T> baseEmitter = this.emitter;
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int iAddAndGet = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    simplePlainQueue.clear();
                    baseEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z9 = this.done;
                T tPoll = simplePlainQueue.poll();
                boolean z10 = tPoll == null;
                if (z9 && z10) {
                    baseEmitter.onComplete();
                    return;
                } else if (z10) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    baseEmitter.onNext(tPoll);
                }
            }
            simplePlainQueue.clear();
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.emitter.isCancelled() || this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t9) {
            if (this.emitter.isCancelled() || this.done) {
                return;
            }
            if (t9 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.emitter.onNext(t9);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                synchronized (simplePlainQueue) {
                    simplePlainQueue.offer(t9);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableEmitter
        public long requested() {
            return this.emitter.requested();
        }

        @Override // io.reactivex.FlowableEmitter
        public FlowableEmitter<T> serialize() {
            return this;
        }

        @Override // io.reactivex.FlowableEmitter
        public void setCancellable(Cancellable cancellable) {
            this.emitter.setCancellable(cancellable);
        }

        @Override // io.reactivex.FlowableEmitter
        public void setDisposable(Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.emitter.toString();
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }
    }

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.source = flowableOnSubscribe;
        this.backpressure = backpressureStrategy;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        int i9 = C81861.$SwitchMap$io$reactivex$BackpressureStrategy[this.backpressure.ordinal()];
        BaseEmitter bufferAsyncEmitter = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new BufferAsyncEmitter(interfaceC0050c, Flowable.bufferSize()) : new LatestAsyncEmitter(interfaceC0050c) : new DropAsyncEmitter(interfaceC0050c) : new ErrorAsyncEmitter(interfaceC0050c) : new MissingEmitter(interfaceC0050c);
        interfaceC0050c.onSubscribe(bufferAsyncEmitter);
        try {
            this.source.subscribe(bufferAsyncEmitter);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            bufferAsyncEmitter.onError(th);
        }
    }
}
