package io.reactivex.subscribers;

import androidx.camera.view.AbstractC0908q;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, InterfaceC0051d, Disposable {
    private volatile boolean cancelled;
    private final InterfaceC0050c downstream;
    private final AtomicLong missedRequested;

    /* renamed from: qs */
    private QueueSubscription<T> f14205qs;
    private final AtomicReference<InterfaceC0051d> upstream;

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static String fusionModeToString(int i9) {
        if (i9 == 0) {
            return "NONE";
        }
        if (i9 == 1) {
            return "SYNC";
        }
        if (i9 == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i9 + ")";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.f14205qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i9) {
        int i10 = this.establishedFusionMode;
        if (i10 == i9) {
            return this;
        }
        if (this.f14205qs == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i9) + ", actual: " + fusionModeToString(i10));
    }

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.f14205qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // p010a9.InterfaceC0051d
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
            this.done.countDown();
        } catch (Throwable th2) {
            this.done.countDown();
            throw th2;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t9);
            if (t9 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t9);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f14205qs.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.f14205qs.cancel();
                return;
            }
        }
    }

    public void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        this.lastThread = Thread.currentThread();
        if (interfaceC0051d == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!AbstractC0908q.m812a(this.upstream, null, interfaceC0051d)) {
            interfaceC0051d.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC0051d));
                return;
            }
            return;
        }
        int i9 = this.initialFusionMode;
        if (i9 != 0 && (interfaceC0051d instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) interfaceC0051d;
            this.f14205qs = queueSubscription;
            int iRequestFusion = queueSubscription.requestFusion(i9);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f14205qs.poll();
                        if (tPoll == null) {
                            this.completions++;
                            return;
                        }
                        this.values.add(tPoll);
                    } catch (Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(interfaceC0051d);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            interfaceC0051d.request(andSet);
        }
        onStart();
    }

    @Override // p010a9.InterfaceC0051d
    public final void request(long j9) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j9);
    }

    public final TestSubscriber<T> requestMore(long j9) {
        request(j9);
        return this;
    }

    public final TestSubscriber<T> setInitialFusionMode(int i9) {
        this.initialFusionMode = i9;
        return this;
    }

    public TestSubscriber(long j9) {
        this(EmptySubscriber.INSTANCE, j9);
    }

    public static <T> TestSubscriber<T> create(long j9) {
        return new TestSubscriber<>(j9);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    public TestSubscriber(InterfaceC0050c interfaceC0050c) {
        this(interfaceC0050c, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(InterfaceC0050c interfaceC0050c) {
        return new TestSubscriber<>(interfaceC0050c);
    }

    public TestSubscriber(InterfaceC0050c interfaceC0050c, long j9) {
        if (j9 >= 0) {
            this.downstream = interfaceC0050c;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j9);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }

    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        }
    }
}
