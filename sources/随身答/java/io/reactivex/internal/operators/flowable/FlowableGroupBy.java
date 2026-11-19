package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final Function<? super T, ? extends K> keySelector;
    final Function<? super Consumer<Object>, ? extends Map<K, Object>> mapFactory;
    final Function<? super T, ? extends V> valueSelector;

    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        final Queue<GroupedUnicast<K, V>> evictedGroups;

        public EvictionAction(Queue<GroupedUnicast<K, V>> queue) {
            this.evictedGroups = queue;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(GroupedUnicast<K, V> groupedUnicast) {
            this.evictedGroups.offer(groupedUnicast);
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final boolean delayError;
        boolean done;
        final InterfaceC0050c downstream;
        Throwable error;
        final Queue<GroupedUnicast<K, V>> evictedGroups;
        volatile boolean finished;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final SpscLinkedArrayQueue<GroupedFlowable<K, V>> queue;
        InterfaceC0051d upstream;
        final Function<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger groupCount = new AtomicInteger(1);

        public GroupBySubscriber(InterfaceC0050c interfaceC0050c, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i9, boolean z9, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.downstream = interfaceC0050c;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i9;
            this.delayError = z9;
            this.groups = map;
            this.evictedGroups = queue;
            this.queue = new SpscLinkedArrayQueue<>(i9);
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i9 = 0;
                while (true) {
                    GroupedUnicast<K, V> groupedUnicastPoll = this.evictedGroups.poll();
                    if (groupedUnicastPoll == null) {
                        break;
                    }
                    groupedUnicastPoll.onComplete();
                    i9++;
                }
                if (i9 != 0) {
                    this.groupCount.addAndGet(-i9);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.delayError) {
                if (!z9 || !z10) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    interfaceC0050c.onError(th);
                } else {
                    interfaceC0050c.onComplete();
                }
                return true;
            }
            if (!z9) {
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                spscLinkedArrayQueue.clear();
                interfaceC0050c.onError(th2);
                return true;
            }
            if (!z10) {
                return false;
            }
            interfaceC0050c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC0050c interfaceC0050c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled.get()) {
                boolean z9 = this.finished;
                if (z9 && !this.delayError && (th = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC0050c.onError(th);
                    return;
                }
                interfaceC0050c.onNext(null);
                if (z9) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        interfaceC0050c.onError(th2);
                        return;
                    } else {
                        interfaceC0050c.onComplete();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void drainNormal() {
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC0050c interfaceC0050c = this.downstream;
            int iAddAndGet = 1;
            do {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    boolean z9 = this.finished;
                    GroupedFlowable<K, V> groupedFlowablePoll = spscLinkedArrayQueue.poll();
                    boolean z10 = groupedFlowablePoll == null;
                    if (checkTerminated(z9, z10, interfaceC0050c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC0050c.onNext(groupedFlowablePoll);
                    j10++;
                }
                if (j10 == j9 && checkTerminated(this.finished, spscLinkedArrayQueue.isEmpty(), interfaceC0050c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j10 != 0) {
                    if (j9 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j10);
                    }
                    this.upstream.request(j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.done = true;
            this.finished = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.error = th;
            this.finished = true;
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            boolean z9;
            GroupedUnicast groupedUnicast;
            if (this.done) {
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            try {
                K kApply = this.keySelector.apply(t9);
                Object obj = kApply != null ? kApply : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicast2 = this.groups.get(obj);
                if (groupedUnicast2 != null) {
                    z9 = false;
                    groupedUnicast = groupedUnicast2;
                } else {
                    if (this.cancelled.get()) {
                        return;
                    }
                    GroupedUnicast groupedUnicastCreateWith = GroupedUnicast.createWith(kApply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicastCreateWith);
                    this.groupCount.getAndIncrement();
                    z9 = true;
                    groupedUnicast = groupedUnicastCreateWith;
                }
                try {
                    groupedUnicast.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t9), "The valueSelector returned null"));
                    completeEvictions();
                    if (z9) {
                        spscLinkedArrayQueue.offer(groupedUnicast);
                        drain();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(this.bufferSize);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i9) {
            if ((i9 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public GroupedFlowable<K, V> poll() {
            return this.queue.poll();
        }

        public void cancel(K k9) {
            if (k9 == null) {
                k9 = (K) NULL_KEY;
            }
            this.groups.remove(k9);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        final State<T, K> state;

        public GroupedUnicast(K k9, State<T, K> state) {
            super(k9);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k9, int i9, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z9) {
            return new GroupedUnicast<>(k9, new State(i9, groupBySubscriber, k9, z9));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th) {
            this.state.onError(th);
        }

        public void onNext(T t9) {
            this.state.onNext(t9);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC0050c interfaceC0050c) {
            this.state.subscribe(interfaceC0050c);
        }
    }

    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements InterfaceC0049b {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        boolean outputFused;
        final GroupBySubscriber<?, K, T> parent;
        int produced;
        final SpscLinkedArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<InterfaceC0050c> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();

        public State(int i9, GroupBySubscriber<?, K, T> groupBySubscriber, K k9, boolean z9) {
            this.queue = new SpscLinkedArrayQueue<>(i9);
            this.parent = groupBySubscriber;
            this.key = k9;
            this.delayError = z9;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
            }
        }

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c, boolean z11) {
            if (this.cancelled.get()) {
                this.queue.clear();
                return true;
            }
            if (!z9) {
                return false;
            }
            if (z11) {
                if (!z10) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    interfaceC0050c.onError(th);
                } else {
                    interfaceC0050c.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                interfaceC0050c.onError(th2);
                return true;
            }
            if (!z10) {
                return false;
            }
            interfaceC0050c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            InterfaceC0050c interfaceC0050c = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (interfaceC0050c != null) {
                    if (this.cancelled.get()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z9 = this.done;
                    if (z9 && !this.delayError && (th = this.error) != null) {
                        spscLinkedArrayQueue.clear();
                        interfaceC0050c.onError(th);
                        return;
                    }
                    interfaceC0050c.onNext(null);
                    if (z9) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            interfaceC0050c.onError(th2);
                            return;
                        } else {
                            interfaceC0050c.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (interfaceC0050c == null) {
                    interfaceC0050c = this.actual.get();
                }
            }
        }

        public void drainNormal() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z9 = this.delayError;
            InterfaceC0050c interfaceC0050c = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (interfaceC0050c != null) {
                    long j9 = this.requested.get();
                    long j10 = 0;
                    while (j10 != j9) {
                        boolean z10 = this.done;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z11 = tPoll == null;
                        if (checkTerminated(z10, z11, interfaceC0050c, z9)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC0050c.onNext(tPoll);
                        j10++;
                    }
                    if (j10 == j9 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC0050c, z9)) {
                        return;
                    }
                    if (j10 != 0) {
                        if (j9 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j10);
                        }
                        this.parent.upstream.request(j10);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (interfaceC0050c == null) {
                    interfaceC0050c = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t9) {
            this.queue.offer(t9);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T tPoll = this.queue.poll();
            if (tPoll != null) {
                this.produced++;
                return tPoll;
            }
            int i9 = this.produced;
            if (i9 == 0) {
                return null;
            }
            this.produced = 0;
            this.parent.upstream.request(i9);
            return null;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i9) {
            if ((i9 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // p010a9.InterfaceC0049b
        public void subscribe(InterfaceC0050c interfaceC0050c) {
            if (!this.once.compareAndSet(false, true)) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), interfaceC0050c);
                return;
            }
            interfaceC0050c.onSubscribe(this);
            this.actual.lazySet(interfaceC0050c);
            drain();
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i9, boolean z9, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i9;
        this.delayError = z9;
        this.mapFactory = function3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        try {
            if (this.mapFactory == null) {
                mapApply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = this.mapFactory.apply(new EvictionAction(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(interfaceC0050c, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, mapApply, concurrentLinkedQueue));
        } catch (Exception e10) {
            Exceptions.throwIfFatal(e10);
            interfaceC0050c.onSubscribe(EmptyComponent.INSTANCE);
            interfaceC0050c.onError(e10);
        }
    }
}
