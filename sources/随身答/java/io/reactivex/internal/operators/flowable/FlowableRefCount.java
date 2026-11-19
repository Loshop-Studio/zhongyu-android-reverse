package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    RefConnection connection;

    /* renamed from: n */
    final int f14129n;
    final Scheduler scheduler;
    final ConnectableFlowable<T> source;
    final long timeout;
    final TimeUnit unit;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
        long subscriberCount;
        Disposable timer;

        public RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        ((ResettableConnectable) this.parent.source).resetIf(disposable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final InterfaceC0050c downstream;
        final FlowableRefCount<T> parent;
        InterfaceC0051d upstream;

        public RefCountSubscriber(InterfaceC0050c interfaceC0050c, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = interfaceC0050c;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
            } else {
                this.parent.terminated(this.connection);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.downstream.onNext(t9);
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
            this.upstream.request(j9);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    public void cancel(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    long j9 = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j9;
                    if (j9 == 0 && refConnection.connected) {
                        if (this.timeout == 0) {
                            timeout(refConnection);
                            return;
                        }
                        SequentialDisposable sequentialDisposable = new SequentialDisposable();
                        refConnection.timer = sequentialDisposable;
                        sequentialDisposable.replace(this.scheduler.scheduleDirect(refConnection, this.timeout, this.unit));
                    }
                }
            } finally {
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        RefConnection refConnection;
        boolean z9;
        Disposable disposable;
        synchronized (this) {
            try {
                refConnection = this.connection;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.connection = refConnection;
                }
                long j9 = refConnection.subscriberCount;
                if (j9 == 0 && (disposable = refConnection.timer) != null) {
                    disposable.dispose();
                }
                long j10 = j9 + 1;
                refConnection.subscriberCount = j10;
                if (refConnection.connected || j10 != this.f14129n) {
                    z9 = false;
                } else {
                    z9 = true;
                    refConnection.connected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.source.subscribe((FlowableSubscriber) new RefCountSubscriber(interfaceC0050c, this, refConnection));
        if (z9) {
            this.source.connect(refConnection);
        }
    }

    public void terminated(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    this.connection = null;
                    Disposable disposable = refConnection.timer;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
                long j9 = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j9;
                if (j9 == 0) {
                    ConnectableFlowable<T> connectableFlowable = this.source;
                    if (connectableFlowable instanceof Disposable) {
                        ((Disposable) connectableFlowable).dispose();
                    } else if (connectableFlowable instanceof ResettableConnectable) {
                        ((ResettableConnectable) connectableFlowable).resetIf(refConnection.get());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void timeout(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                    this.connection = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.dispose(refConnection);
                    ConnectableFlowable<T> connectableFlowable = this.source;
                    if (connectableFlowable instanceof Disposable) {
                        ((Disposable) connectableFlowable).dispose();
                    } else if (connectableFlowable instanceof ResettableConnectable) {
                        if (disposable == null) {
                            refConnection.disconnectedEarly = true;
                        } else {
                            ((ResettableConnectable) connectableFlowable).resetIf(disposable);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i9, long j9, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = connectableFlowable;
        this.f14129n = i9;
        this.timeout = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
