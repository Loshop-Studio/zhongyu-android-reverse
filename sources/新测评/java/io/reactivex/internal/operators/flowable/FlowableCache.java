package io.reactivex.internal.operators.flowable;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {
    static final CacheSubscription[] EMPTY = new CacheSubscription[0];
    static final CacheSubscription[] TERMINATED = new CacheSubscription[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicBoolean once;
    volatile long size;
    final AtomicReference<CacheSubscription<T>[]> subscribers;
    Node<T> tail;
    int tailOffset;

    public static final class CacheSubscription<T> extends AtomicInteger implements InterfaceC8990d {
        private static final long serialVersionUID = 6770240836423125754L;
        final InterfaceC8989c downstream;
        long index;
        Node<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        public CacheSubscription(InterfaceC8989c interfaceC8989c, FlowableCache<T> flowableCache) {
            this.downstream = interfaceC8989c;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.addCancel(this.requested, j10);
                this.parent.replay(this);
            }
        }
    }

    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i10) {
            this.values = (T[]) new Object[i10];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i10) {
        super(flowable);
        this.capacityHint = i10;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i10);
        this.head = node;
        this.tail = node;
        this.subscribers = new AtomicReference<>(EMPTY);
    }

    public void add(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            if (cacheSubscriptionArr == TERMINATED) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!AbstractC0920q.m1034a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    public long cachedEventCount() {
        return this.size;
    }

    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    public boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onComplete() {
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        int i10 = this.tailOffset;
        if (i10 == this.capacityHint) {
            Node<T> node = new Node<>(i10);
            node.values[0] = t10;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i10] = t10;
            this.tailOffset = i10 + 1;
        }
        this.size++;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        interfaceC8990d.request(Long.MAX_VALUE);
    }

    public void remove(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (cacheSubscriptionArr[i10] == cacheSubscription) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr2 = EMPTY;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i10);
                System.arraycopy(cacheSubscriptionArr, i10 + 1, cacheSubscriptionArr3, i10, (length - i10) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!AbstractC0920q.m1034a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    public void replay(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j10 = cacheSubscription.index;
        int i10 = cacheSubscription.offset;
        Node<T> node = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        InterfaceC8989c interfaceC8989c = cacheSubscription.downstream;
        int i11 = this.capacityHint;
        int iAddAndGet = 1;
        while (true) {
            boolean z9 = this.done;
            boolean z10 = this.size == j10;
            if (z9 && z10) {
                cacheSubscription.node = null;
                Throwable th = this.error;
                if (th != null) {
                    interfaceC8989c.onError(th);
                    return;
                } else {
                    interfaceC8989c.onComplete();
                    return;
                }
            }
            if (!z10) {
                long j11 = atomicLong.get();
                if (j11 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j11 != j10) {
                    if (i10 == i11) {
                        node = node.next;
                        i10 = 0;
                    }
                    interfaceC8989c.onNext(node.values[i10]);
                    i10++;
                    j10++;
                }
            }
            cacheSubscription.index = j10;
            cacheSubscription.offset = i10;
            cacheSubscription.node = node;
            iAddAndGet = cacheSubscription.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(interfaceC8989c, this);
        interfaceC8989c.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            replay(cacheSubscription);
        } else {
            this.source.subscribe((FlowableSubscriber) this);
        }
    }
}
