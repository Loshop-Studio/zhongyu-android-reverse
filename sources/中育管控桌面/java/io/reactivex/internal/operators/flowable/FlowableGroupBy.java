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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
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
        final InterfaceC7917c downstream;
        Throwable error;
        final Queue<GroupedUnicast<K, V>> evictedGroups;
        volatile boolean finished;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final SpscLinkedArrayQueue<GroupedFlowable<K, V>> queue;
        InterfaceC7918d upstream;
        final Function<? super T, ? extends V> valueSelector;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger groupCount = new AtomicInteger(1);

        public GroupBySubscriber(InterfaceC7917c interfaceC7917c, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i6, boolean z6, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.downstream = interfaceC7917c;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i6;
            this.delayError = z6;
            this.groups = map;
            this.evictedGroups = queue;
            this.queue = new SpscLinkedArrayQueue<>(i6);
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i6 = 0;
                while (true) {
                    GroupedUnicast<K, V> groupedUnicastPoll = this.evictedGroups.poll();
                    if (groupedUnicastPoll == null) {
                        break;
                    }
                    groupedUnicastPoll.onComplete();
                    i6++;
                }
                if (i6 != 0) {
                    this.groupCount.addAndGet(-i6);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public boolean checkTerminated(boolean z6, boolean z7, InterfaceC7917c interfaceC7917c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.delayError) {
                if (!z6 || !z7) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    interfaceC7917c.onError(th);
                } else {
                    interfaceC7917c.onComplete();
                }
                return true;
            }
            if (!z6) {
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                spscLinkedArrayQueue.clear();
                interfaceC7917c.onError(th2);
                return true;
            }
            if (!z7) {
                return false;
            }
            interfaceC7917c.onComplete();
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
            InterfaceC7917c interfaceC7917c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled.get()) {
                boolean z6 = this.finished;
                if (z6 && !this.delayError && (th = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC7917c.onError(th);
                    return;
                }
                interfaceC7917c.onNext(null);
                if (z6) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        interfaceC7917c.onError(th2);
                        return;
                    } else {
                        interfaceC7917c.onComplete();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void drainNormal() {
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            InterfaceC7917c interfaceC7917c = this.downstream;
            int iAddAndGet = 1;
            do {
                long j6 = this.requested.get();
                long j7 = 0;
                while (j7 != j6) {
                    boolean z6 = this.finished;
                    GroupedFlowable<K, V> groupedFlowablePoll = spscLinkedArrayQueue.poll();
                    boolean z7 = groupedFlowablePoll == null;
                    if (checkTerminated(z6, z7, interfaceC7917c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z7) {
                        break;
                    }
                    interfaceC7917c.onNext(groupedFlowablePoll);
                    j7++;
                }
                if (j7 == j6 && checkTerminated(this.finished, spscLinkedArrayQueue.isEmpty(), interfaceC7917c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j7 != 0) {
                    if (j6 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j7);
                    }
                    this.upstream.request(j7);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
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
        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            boolean z6;
            GroupedUnicast groupedUnicast;
            if (this.done) {
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            try {
                K kApply = this.keySelector.apply(t6);
                Object obj = kApply != null ? kApply : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicast2 = this.groups.get(obj);
                if (groupedUnicast2 != null) {
                    z6 = false;
                    groupedUnicast = groupedUnicast2;
                } else {
                    if (this.cancelled.get()) {
                        return;
                    }
                    GroupedUnicast groupedUnicastCreateWith = GroupedUnicast.createWith(kApply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicastCreateWith);
                    this.groupCount.getAndIncrement();
                    z6 = true;
                    groupedUnicast = groupedUnicastCreateWith;
                }
                try {
                    groupedUnicast.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t6), "The valueSelector returned null"));
                    completeEvictions();
                    if (z6) {
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(this.bufferSize);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i6) {
            if ((i6 & 2) == 0) {
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

        public void cancel(K k6) {
            if (k6 == null) {
                k6 = (K) NULL_KEY;
            }
            this.groups.remove(k6);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (this.outputFused || getAndIncrement() != 0) {
                    return;
                }
                this.queue.clear();
            }
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        final State<T, K> state;

        public GroupedUnicast(K k6, State<T, K> state) {
            super(k6);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k6, int i6, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z6) {
            return new GroupedUnicast<>(k6, new State(i6, groupBySubscriber, k6, z6));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th) {
            this.state.onError(th);
        }

        public void onNext(T t6) {
            this.state.onNext(t6);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC7917c interfaceC7917c) {
            this.state.subscribe(interfaceC7917c);
        }
    }

    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements InterfaceC7916b {
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
        final AtomicReference<InterfaceC7917c> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();

        public State(int i6, GroupBySubscriber<?, K, T> groupBySubscriber, K k6, boolean z6) {
            this.queue = new SpscLinkedArrayQueue<>(i6);
            this.parent = groupBySubscriber;
            this.key = k6;
            this.delayError = z6;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
                drain();
            }
        }

        public boolean checkTerminated(boolean z6, boolean z7, InterfaceC7917c interfaceC7917c, boolean z8, long j6) {
            if (this.cancelled.get()) {
                while (this.queue.poll() != null) {
                    j6++;
                }
                if (j6 != 0) {
                    this.parent.upstream.request(j6);
                }
                return true;
            }
            if (!z6) {
                return false;
            }
            if (z8) {
                if (!z7) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    interfaceC7917c.onError(th);
                } else {
                    interfaceC7917c.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                interfaceC7917c.onError(th2);
                return true;
            }
            if (!z7) {
                return false;
            }
            interfaceC7917c.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            while (spscLinkedArrayQueue.poll() != null) {
                this.produced++;
            }
            tryReplenish();
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
            InterfaceC7917c interfaceC7917c = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (interfaceC7917c != null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    boolean z6 = this.done;
                    if (z6 && !this.delayError && (th = this.error) != null) {
                        spscLinkedArrayQueue.clear();
                        interfaceC7917c.onError(th);
                        return;
                    }
                    interfaceC7917c.onNext(null);
                    if (z6) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            interfaceC7917c.onError(th2);
                            return;
                        } else {
                            interfaceC7917c.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (interfaceC7917c == null) {
                    interfaceC7917c = this.actual.get();
                }
            }
        }

        public void drainNormal() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z6 = this.delayError;
            InterfaceC7917c interfaceC7917c = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (interfaceC7917c != null) {
                    long j6 = this.requested.get();
                    long j7 = 0;
                    while (j7 != j6) {
                        boolean z7 = this.done;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z8 = tPoll == null;
                        if (checkTerminated(z7, z8, interfaceC7917c, z6, j7)) {
                            return;
                        }
                        if (z8) {
                            break;
                        }
                        interfaceC7917c.onNext(tPoll);
                        j7++;
                    }
                    if (j7 == j6 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC7917c, z6, j7)) {
                        return;
                    }
                    if (j7 != 0) {
                        if (j6 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j7);
                        }
                        this.parent.upstream.request(j7);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (interfaceC7917c == null) {
                    interfaceC7917c = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (!this.queue.isEmpty()) {
                return false;
            }
            tryReplenish();
            return true;
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

        public void onNext(T t6) {
            this.queue.offer(t6);
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
            tryReplenish();
            return null;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i6) {
            if ((i6 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // p193y5.InterfaceC7916b
        public void subscribe(InterfaceC7917c interfaceC7917c) {
            if (!this.once.compareAndSet(false, true)) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), interfaceC7917c);
                return;
            }
            interfaceC7917c.onSubscribe(this);
            this.actual.lazySet(interfaceC7917c);
            drain();
        }

        public void tryReplenish() {
            int i6 = this.produced;
            if (i6 != 0) {
                this.produced = 0;
                this.parent.upstream.request(i6);
            }
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i6, boolean z6, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i6;
        this.delayError = z6;
        this.mapFactory = function3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
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
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(interfaceC7917c, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, mapApply, concurrentLinkedQueue));
        } catch (Exception e6) {
            Exceptions.throwIfFatal(e6);
            interfaceC7917c.onSubscribe(EmptyComponent.INSTANCE);
            interfaceC7917c.onError(e6);
        }
    }
}
