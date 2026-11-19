package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {
    final MaybeSource<? extends T>[] sources;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, InterfaceC8990d {
        private static final long serialVersionUID = 3520831347801429610L;
        final InterfaceC8989c downstream;
        int index;
        long produced;
        final MaybeSource<? extends T>[] sources;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable disposables = new SequentialDisposable();
        final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);
        final AtomicThrowable errors = new AtomicThrowable();

        public ConcatMaybeObserver(InterfaceC8989c interfaceC8989c, MaybeSource<? extends T>[] maybeSourceArr) {
            this.downstream = interfaceC8989c;
            this.sources = maybeSourceArr;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.disposables.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.current;
            InterfaceC8989c interfaceC8989c = this.downstream;
            SequentialDisposable sequentialDisposable = this.disposables;
            while (!sequentialDisposable.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.COMPLETE) {
                        long j10 = this.produced;
                        if (j10 != this.requested.get()) {
                            this.produced = j10 + 1;
                            atomicReference.lazySet(null);
                            interfaceC8989c.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        int i10 = this.index;
                        MaybeSource<? extends T>[] maybeSourceArr = this.sources;
                        if (i10 == maybeSourceArr.length) {
                            if (this.errors.get() != null) {
                                interfaceC8989c.onError(this.errors.terminate());
                                return;
                            } else {
                                interfaceC8989c.onComplete();
                                return;
                            }
                        }
                        this.index = i10 + 1;
                        maybeSourceArr[i10].subscribe(this);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.current.lazySet(NotificationLite.COMPLETE);
            if (this.errors.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.disposables.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t10) {
            this.current.lazySet(t10);
            drain();
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public MaybeConcatArrayDelayError(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(interfaceC8989c, this.sources);
        interfaceC8989c.onSubscribe(concatMaybeObserver);
        concatMaybeObserver.drain();
    }
}
