package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, InterfaceC7918d {
    static final int QUEUE_LINK_SIZE = 4;
    final boolean delayError;
    volatile boolean done;
    final InterfaceC7917c downstream;
    boolean emitting;
    AppendOnlyLinkedArrayList<Object> queue;
    InterfaceC7918d upstream;

    public SerializedSubscriber(InterfaceC7917c interfaceC7917c) {
        this(interfaceC7917c, false);
    }

    @Override // p193y5.InterfaceC7918d
    public void cancel() {
        this.upstream.cancel();
    }

    public void emitLoop() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.downstream));
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (!this.emitting) {
                    this.done = true;
                    this.emitting = true;
                    this.downstream.onComplete();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z6 = true;
                if (!this.done) {
                    if (this.emitting) {
                        this.done = true;
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        Object objError = NotificationLite.error(th);
                        if (this.delayError) {
                            appendOnlyLinkedArrayList.add(objError);
                        } else {
                            appendOnlyLinkedArrayList.setFirst(objError);
                        }
                        return;
                    }
                    this.done = true;
                    this.emitting = true;
                    z6 = false;
                }
                if (z6) {
                    RxJavaPlugins.onError(th);
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        if (this.done) {
            return;
        }
        if (t6 == null) {
            this.upstream.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (!this.emitting) {
                    this.emitting = true;
                    this.downstream.onNext(t6);
                    emitLoop();
                } else {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
            this.upstream = interfaceC7918d;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
        this.upstream.request(j6);
    }

    public SerializedSubscriber(InterfaceC7917c interfaceC7917c, boolean z6) {
        this.downstream = interfaceC7917c;
        this.delayError = z6;
    }
}
