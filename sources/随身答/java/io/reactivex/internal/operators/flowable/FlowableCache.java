package io.reactivex.internal.operators.flowable;

import androidx.camera.view.AbstractC0908q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

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

    public static final class CacheSubscription<T> extends AtomicInteger implements InterfaceC0051d {
        private static final long serialVersionUID = 6770240836423125754L;
        final InterfaceC0050c downstream;
        long index;
        Node<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        public CacheSubscription(InterfaceC0050c interfaceC0050c, FlowableCache<T> flowableCache) {
            this.downstream = interfaceC0050c;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.addCancel(this.requested, j9);
                this.parent.replay(this);
            }
        }
    }

    public static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        public Node(int i9) {
            this.values = (T[]) new Object[i9];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i9) {
        super(flowable);
        this.capacityHint = i9;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i9);
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
        } while (!AbstractC0908q.m812a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
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

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onComplete() {
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
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

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        int i9 = this.tailOffset;
        if (i9 == this.capacityHint) {
            Node<T> node = new Node<>(i9);
            node.values[0] = t9;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i9] = t9;
            this.tailOffset = i9 + 1;
        }
        this.size++;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        interfaceC0051d.request(Long.MAX_VALUE);
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
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                } else if (cacheSubscriptionArr[i9] == cacheSubscription) {
                    break;
                } else {
                    i9++;
                }
            }
            if (i9 < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr2 = EMPTY;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i9);
                System.arraycopy(cacheSubscriptionArr, i9 + 1, cacheSubscriptionArr3, i9, (length - i9) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!AbstractC0908q.m812a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    public void replay(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j9 = cacheSubscription.index;
        int i9 = cacheSubscription.offset;
        Node<T> node = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        InterfaceC0050c interfaceC0050c = cacheSubscription.downstream;
        int i10 = this.capacityHint;
        int iAddAndGet = 1;
        while (true) {
            boolean z9 = this.done;
            boolean z10 = this.size == j9;
            if (z9 && z10) {
                cacheSubscription.node = null;
                Throwable th = this.error;
                if (th != null) {
                    interfaceC0050c.onError(th);
                    return;
                } else {
                    interfaceC0050c.onComplete();
                    return;
                }
            }
            if (!z10) {
                long j10 = atomicLong.get();
                if (j10 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j10 != j9) {
                    if (i9 == i10) {
                        node = node.next;
                        i9 = 0;
                    }
                    interfaceC0050c.onNext(node.values[i9]);
                    i9++;
                    j9++;
                }
            }
            cacheSubscription.index = j9;
            cacheSubscription.offset = i9;
            cacheSubscription.node = node;
            iAddAndGet = cacheSubscription.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(interfaceC0050c, this);
        interfaceC0050c.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            replay(cacheSubscription);
        } else {
            this.source.subscribe((FlowableSubscriber) this);
        }
    }
}
