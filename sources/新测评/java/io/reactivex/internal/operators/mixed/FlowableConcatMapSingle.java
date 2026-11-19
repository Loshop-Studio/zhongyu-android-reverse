package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final InterfaceC8989c downstream;
        long emitted;
        final ErrorMode errorMode;
        R item;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        volatile int state;
        InterfaceC8990d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapSingleSubscriber<?, R> parent;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.parent = concatMapSingleSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r10) {
                this.parent.innerSuccess(r10);
            }
        }

        public ConcatMapSingleSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends SingleSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
            this.prefetch = i10;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i10);
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            r2.clear();
            r15.item = null;
            r0.onError(r3.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drain() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L8
                goto Lc8
            L8:
                q9.c r0 = r15.downstream
                io.reactivex.internal.util.ErrorMode r1 = r15.errorMode
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r2 = r15.queue
                io.reactivex.internal.util.AtomicThrowable r3 = r15.errors
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                int r5 = r15.prefetch
                int r6 = r5 >> 1
                int r5 = r5 - r6
                r6 = 1
                r7 = r6
            L19:
                boolean r8 = r15.cancelled
                r9 = 0
                if (r8 == 0) goto L25
                r2.clear()
                r15.item = r9
                goto Lc1
            L25:
                int r8 = r15.state
                java.lang.Object r10 = r3.get()
                if (r10 == 0) goto L44
                io.reactivex.internal.util.ErrorMode r10 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r1 == r10) goto L37
                io.reactivex.internal.util.ErrorMode r10 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r1 != r10) goto L44
                if (r8 != 0) goto L44
            L37:
                r2.clear()
                r15.item = r9
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L44:
                r10 = 0
                if (r8 != 0) goto La4
                boolean r8 = r15.done
                java.lang.Object r9 = r2.poll()
                if (r9 != 0) goto L51
                r11 = r6
                goto L52
            L51:
                r11 = r10
            L52:
                if (r8 == 0) goto L64
                if (r11 == 0) goto L64
                java.lang.Throwable r1 = r3.terminate()
                if (r1 != 0) goto L60
                r0.onComplete()
                return
            L60:
                r0.onError(r1)
                return
            L64:
                if (r11 == 0) goto L67
                goto Lc1
            L67:
                int r8 = r15.consumed
                int r8 = r8 + r6
                if (r8 != r5) goto L75
                r15.consumed = r10
                q9.d r8 = r15.upstream
                long r10 = (long) r5
                r8.request(r10)
                goto L77
            L75:
                r15.consumed = r8
            L77:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r8 = r15.mapper     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r8 = r8.apply(r9)     // Catch: java.lang.Throwable -> L8d
                java.lang.String r9 = "The mapper returned a null SingleSource"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r9)     // Catch: java.lang.Throwable -> L8d
                io.reactivex.SingleSource r8 = (io.reactivex.SingleSource) r8     // Catch: java.lang.Throwable -> L8d
                r15.state = r6
                io.reactivex.internal.operators.mixed.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver<R> r9 = r15.inner
                r8.subscribe(r9)
                goto Lc1
            L8d:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                q9.d r4 = r15.upstream
                r4.cancel()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            La4:
                r11 = 2
                if (r8 != r11) goto Lc1
                long r11 = r15.emitted
                long r13 = r4.get()
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 == 0) goto Lc1
                R r8 = r15.item
                r15.item = r9
                r0.onNext(r8)
                r8 = 1
                long r11 = r11 + r8
                r15.emitted = r11
                r15.state = r10
                goto L19
            Lc1:
                int r7 = -r7
                int r7 = r15.addAndGet(r7)
                if (r7 != 0) goto L19
            Lc8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber.drain():void");
        }

        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r10) {
            this.item = r10;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.queue.offer(t10)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(this.prefetch);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapSingleSubscriber(interfaceC8989c, this.mapper, this.prefetch, this.errorMode));
    }
}
