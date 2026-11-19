package io.reactivex.subscribers;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, InterfaceC8990d, Disposable {
    private volatile boolean cancelled;
    private final InterfaceC8989c downstream;
    private final AtomicLong missedRequested;

    /* renamed from: qs */
    private QueueSubscription<T> f13391qs;
    private final AtomicReference<InterfaceC8990d> upstream;

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static String fusionModeToString(int i10) {
        if (i10 == 0) {
            return "NONE";
        }
        if (i10 == 1) {
            return "SYNC";
        }
        if (i10 == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i10 + ")";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.f13391qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i10) {
        int i11 = this.establishedFusionMode;
        if (i11 == i10) {
            return this;
        }
        if (this.f13391qs == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i10) + ", actual: " + fusionModeToString(i11));
    }

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.f13391qs == null) {
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

    @Override // p215q9.InterfaceC8990d
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

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
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

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
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

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t10);
            if (t10 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f13391qs.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.f13391qs.cancel();
                return;
            }
        }
    }

    public void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        this.lastThread = Thread.currentThread();
        if (interfaceC8990d == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!AbstractC0920q.m1034a(this.upstream, null, interfaceC8990d)) {
            interfaceC8990d.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC8990d));
                return;
            }
            return;
        }
        int i10 = this.initialFusionMode;
        if (i10 != 0 && (interfaceC8990d instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) interfaceC8990d;
            this.f13391qs = queueSubscription;
            int iRequestFusion = queueSubscription.requestFusion(i10);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f13391qs.poll();
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
        this.downstream.onSubscribe(interfaceC8990d);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            interfaceC8990d.request(andSet);
        }
        onStart();
    }

    @Override // p215q9.InterfaceC8990d
    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j10);
    }

    public final TestSubscriber<T> requestMore(long j10) {
        request(j10);
        return this;
    }

    public final TestSubscriber<T> setInitialFusionMode(int i10) {
        this.initialFusionMode = i10;
        return this;
    }

    public TestSubscriber(long j10) {
        this(EmptySubscriber.INSTANCE, j10);
    }

    public static <T> TestSubscriber<T> create(long j10) {
        return new TestSubscriber<>(j10);
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

    public TestSubscriber(InterfaceC8989c interfaceC8989c) {
        this(interfaceC8989c, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(InterfaceC8989c interfaceC8989c) {
        return new TestSubscriber<>(interfaceC8989c);
    }

    public TestSubscriber(InterfaceC8989c interfaceC8989c, long j10) {
        if (j10 >= 0) {
            this.downstream = interfaceC8989c;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j10);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }

    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        }
    }
}
