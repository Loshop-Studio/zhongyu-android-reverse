package io.reactivex.subscribers;

import androidx.compose.animation.core.AbstractC0433h;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, InterfaceC7918d, Disposable {
    private volatile boolean cancelled;
    private final InterfaceC7917c downstream;
    private final AtomicLong missedRequested;

    /* renamed from: qs */
    private QueueSubscription<T> f8513qs;
    private final AtomicReference<InterfaceC7918d> upstream;

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static String fusionModeToString(int i6) {
        if (i6 == 0) {
            return "NONE";
        }
        if (i6 == 1) {
            return "SYNC";
        }
        if (i6 == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i6 + ")";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.f8513qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i6) {
        int i7 = this.establishedFusionMode;
        if (i7 == i6) {
            return this;
        }
        if (this.f8513qs == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i6) + ", actual: " + fusionModeToString(i7));
    }

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.f8513qs == null) {
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

    @Override // p193y5.InterfaceC7918d
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

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
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

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
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

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t6);
            if (t6 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t6);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f8513qs.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.f8513qs.cancel();
                return;
            }
        }
    }

    public void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        this.lastThread = Thread.currentThread();
        if (interfaceC7918d == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!AbstractC0433h.m112a(this.upstream, null, interfaceC7918d)) {
            interfaceC7918d.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC7918d));
                return;
            }
            return;
        }
        int i6 = this.initialFusionMode;
        if (i6 != 0 && (interfaceC7918d instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) interfaceC7918d;
            this.f8513qs = queueSubscription;
            int iRequestFusion = queueSubscription.requestFusion(i6);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f8513qs.poll();
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
        this.downstream.onSubscribe(interfaceC7918d);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            interfaceC7918d.request(andSet);
        }
        onStart();
    }

    @Override // p193y5.InterfaceC7918d
    public final void request(long j6) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j6);
    }

    public final TestSubscriber<T> requestMore(long j6) {
        request(j6);
        return this;
    }

    public final TestSubscriber<T> setInitialFusionMode(int i6) {
        this.initialFusionMode = i6;
        return this;
    }

    public TestSubscriber(long j6) {
        this(EmptySubscriber.INSTANCE, j6);
    }

    public static <T> TestSubscriber<T> create(long j6) {
        return new TestSubscriber<>(j6);
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

    public TestSubscriber(InterfaceC7917c interfaceC7917c) {
        this(interfaceC7917c, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(InterfaceC7917c interfaceC7917c) {
        return new TestSubscriber<>(interfaceC7917c);
    }

    public TestSubscriber(InterfaceC7917c interfaceC7917c, long j6) {
        if (j6 >= 0) {
            this.downstream = interfaceC7917c;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j6);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }

    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        }
    }
}
