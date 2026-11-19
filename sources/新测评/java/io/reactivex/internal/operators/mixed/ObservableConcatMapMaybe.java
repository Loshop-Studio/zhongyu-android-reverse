package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final int prefetch;
    final Observable<T> source;

    public static final class ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final Observer<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);
        R item;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final SimplePlainQueue<T> queue;
        volatile int state;
        Disposable upstream;

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapMaybeMainObserver<?, R> parent;

            public ConcatMapMaybeObserver(ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver) {
                this.parent = concatMapMaybeMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r10) {
                this.parent.innerSuccess(r10);
            }
        }

        public ConcatMapMaybeMainObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.downstream = observer;
            this.mapper = function;
            this.errorMode = errorMode;
            this.queue = new SpscLinkedArrayQueue(i10);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            r2.clear();
            r10.item = null;
            r0.onError(r3.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drain() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L8
                goto La0
            L8:
                io.reactivex.Observer<? super R> r0 = r10.downstream
                io.reactivex.internal.util.ErrorMode r1 = r10.errorMode
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r2 = r10.queue
                io.reactivex.internal.util.AtomicThrowable r3 = r10.errors
                r4 = 1
                r5 = r4
            L12:
                boolean r6 = r10.cancelled
                r7 = 0
                if (r6 == 0) goto L1e
                r2.clear()
                r10.item = r7
                goto L99
            L1e:
                int r6 = r10.state
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3d
                io.reactivex.internal.util.ErrorMode r8 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r1 == r8) goto L30
                io.reactivex.internal.util.ErrorMode r8 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r1 != r8) goto L3d
                if (r6 != 0) goto L3d
            L30:
                r2.clear()
                r10.item = r7
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L3d:
                r8 = 0
                if (r6 != 0) goto L8b
                boolean r6 = r10.done
                java.lang.Object r7 = r2.poll()
                if (r7 != 0) goto L49
                r8 = r4
            L49:
                if (r6 == 0) goto L5b
                if (r8 == 0) goto L5b
                java.lang.Throwable r1 = r3.terminate()
                if (r1 != 0) goto L57
                r0.onComplete()
                return
            L57:
                r0.onError(r1)
                return
            L5b:
                if (r8 == 0) goto L5e
                goto L99
            L5e:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r6 = r10.mapper     // Catch: java.lang.Throwable -> L74
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L74
                java.lang.String r7 = "The mapper returned a null MaybeSource"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L74
                io.reactivex.MaybeSource r6 = (io.reactivex.MaybeSource) r6     // Catch: java.lang.Throwable -> L74
                r10.state = r4
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver<R> r7 = r10.inner
                r6.subscribe(r7)
                goto L99
            L74:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.disposables.Disposable r4 = r10.upstream
                r4.dispose()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L8b:
                r9 = 2
                if (r6 != r9) goto L99
                R r6 = r10.item
                r10.item = r7
                r0.onNext(r6)
                r10.state = r8
                goto L12
            L99:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L12
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver.drain():void");
        }

        public void innerComplete() {
            this.state = 0;
            drain();
        }

        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r10) {
            this.item = r10;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
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

        @Override // io.reactivex.Observer
        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.source = observable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ScalarXMapZHelper.tryAsMaybe(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new ConcatMapMaybeMainObserver(observer, this.mapper, this.prefetch, this.errorMode));
    }
}
