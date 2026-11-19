package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.functions.Func1;
import p147rx.internal.producers.ProducerArbiter;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.UtilityFunctions;
import p147rx.observables.GroupedObservable;
import p147rx.observers.Subscribers;
import p147rx.plugins.RxJavaHooks;
import p147rx.subscriptions.Subscriptions;

@Deprecated
/* loaded from: classes2.dex */
public final class OperatorGroupBy<T, K, V> implements Observable.Operator<GroupedObservable<K, V>, T> {
    final int bufferSize;
    final boolean delayError;
    final Func1<? super T, ? extends K> keySelector;
    final Func1<Action1<K>, Map<K, Object>> mapFactory;
    final Func1<? super T, ? extends V> valueSelector;

    public static final class GroupByProducer implements Producer {
        final GroupBySubscriber<?, ?, ?> parent;

        public GroupByProducer(GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.parent = groupBySubscriber;
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            this.parent.requestMore(j4);
        }
    }

    static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {
        final State<T, K> state;

        protected GroupedUnicast(K k4, State<T, K> state) {
            super(k4, state);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k4, int i4, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z3) {
            return new GroupedUnicast<>(k4, new State(i4, groupBySubscriber, k4, z3));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th) {
            this.state.onError(th);
        }

        public void onNext(T t3) {
            this.state.onNext(t3);
        }
    }

    static final class State<T, K> extends AtomicInteger implements Producer, Subscription, Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final GroupBySubscriber<?, K, T> parent;
        final Queue<Object> queue = new ConcurrentLinkedQueue();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<Subscriber<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public State(int i4, GroupBySubscriber<?, K, T> groupBySubscriber, K k4, boolean z3) {
            this.parent = groupBySubscriber;
            this.key = k4;
            this.delayError = z3;
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<? super T> subscriber, boolean z5) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                return true;
            }
            if (!z3) {
                return false;
            }
            if (z5) {
                if (!z4) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z4) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.queue;
            boolean z3 = this.delayError;
            Subscriber<? super T> subscriber = this.actual.get();
            int iAddAndGet = 1;
            while (true) {
                if (subscriber != null) {
                    if (checkTerminated(this.done, queue.isEmpty(), subscriber, z3)) {
                        return;
                    }
                    long j4 = this.requested.get();
                    long j5 = 0;
                    while (j5 != j4) {
                        boolean z4 = this.done;
                        Object objPoll = queue.poll();
                        boolean z5 = objPoll == null;
                        if (checkTerminated(z4, z5, subscriber, z3)) {
                            return;
                        }
                        if (z5) {
                            break;
                        }
                        subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                        j5++;
                    }
                    if (j5 != 0) {
                        if (j4 != Long.MAX_VALUE) {
                            BackpressureUtils.produced(this.requested, j5);
                        }
                        this.parent.f11781s.request(j5);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.actual.get();
                }
            }
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancelled.get();
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

        public void onNext(T t3) {
            if (t3 == null) {
                this.error = new NullPointerException();
                this.done = true;
            } else {
                this.queue.offer(NotificationLite.next(t3));
            }
            drain();
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j4);
            }
            if (j4 != 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j4);
                drain();
            }
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.cancel(this.key);
            }
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            if (!this.once.compareAndSet(false, true)) {
                subscriber.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            subscriber.add(this);
            subscriber.setProducer(this);
            this.actual.lazySet(subscriber);
            drain();
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1) {
        this(func1, UtilityFunctions.identity(), RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(func1, func12, RxRingBuffer.SIZE, false, null);
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super GroupedObservable<K, V>> subscriber) {
        try {
            final GroupBySubscriber groupBySubscriber = new GroupBySubscriber(subscriber, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, this.mapFactory);
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorGroupBy.1
                @Override // p147rx.functions.Action0
                public void call() {
                    groupBySubscriber.cancel();
                }
            }));
            subscriber.setProducer(groupBySubscriber.producer);
            return groupBySubscriber;
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            Subscriber<? super T> subscriberEmpty = Subscribers.empty();
            subscriberEmpty.unsubscribe();
            return subscriberEmpty;
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends Subscriber<T> {
        static final Object NULL_KEY = new Object();
        final Subscriber<? super GroupedObservable<K, V>> actual;
        final int bufferSize;
        final AtomicBoolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final Queue<K> evictedKeys;
        final AtomicInteger groupCount;
        final Map<Object, GroupedUnicast<K, V>> groups;
        final Map<Object, GroupedUnicast<K, V>> groupsCopy;
        final Func1<? super T, ? extends K> keySelector;
        final GroupByProducer producer;
        final Queue<GroupedObservable<K, V>> queue = new ConcurrentLinkedQueue();
        final AtomicLong requested;

        /* renamed from: s */
        final ProducerArbiter f11781s;
        final Func1<? super T, ? extends V> valueSelector;
        final AtomicInteger wip;

        static class EvictionAction<K> implements Action1<K> {
            final Queue<K> evictedKeys;

            EvictionAction(Queue<K> queue) {
                this.evictedKeys = queue;
            }

            @Override // p147rx.functions.Action1
            public void call(K k4) {
                this.evictedKeys.offer(k4);
            }
        }

        public GroupBySubscriber(Subscriber<? super GroupedObservable<K, V>> subscriber, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i4, boolean z3, Func1<Action1<K>, Map<K, Object>> func13) {
            this.actual = subscriber;
            this.keySelector = func1;
            this.valueSelector = func12;
            this.bufferSize = i4;
            this.delayError = z3;
            ProducerArbiter producerArbiter = new ProducerArbiter();
            this.f11781s = producerArbiter;
            producerArbiter.request(i4);
            this.producer = new GroupByProducer(this);
            this.cancelled = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.groupCount = new AtomicInteger(1);
            this.wip = new AtomicInteger();
            if (func13 == null) {
                this.groups = new ConcurrentHashMap();
                this.evictedKeys = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.evictedKeys = concurrentLinkedQueue;
                this.groups = createMap(func13, new EvictionAction(concurrentLinkedQueue));
            }
            this.groupsCopy = new ConcurrentHashMap();
        }

        private Map<Object, GroupedUnicast<K, V>> createMap(Func1<Action1<K>, Map<K, Object>> func1, Action1<K> action1) {
            return func1.call(action1);
        }

        public void cancel() {
            if (this.cancelled.compareAndSet(false, true) && this.groupCount.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue) {
            if (!z3) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                errorAll(subscriber, queue, th);
                return true;
            }
            if (!z4) {
                return false;
            }
            this.actual.onCompleted();
            return true;
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Queue<GroupedObservable<K, V>> queue = this.queue;
            Subscriber<? super GroupedObservable<K, V>> subscriber = this.actual;
            int iAddAndGet = 1;
            while (!checkTerminated(this.done, queue.isEmpty(), subscriber, queue)) {
                long j4 = this.requested.get();
                long j5 = 0;
                while (j5 != j4) {
                    boolean z3 = this.done;
                    GroupedObservable<K, V> groupedObservablePoll = queue.poll();
                    boolean z4 = groupedObservablePoll == null;
                    if (checkTerminated(z3, z4, subscriber, queue)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    subscriber.onNext(groupedObservablePoll);
                    j5++;
                }
                if (j5 != 0) {
                    if (j4 != Long.MAX_VALUE) {
                        BackpressureUtils.produced(this.requested, j5);
                    }
                    this.f11781s.request(j5);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void errorAll(Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            if (this.evictedKeys != null) {
                this.groupsCopy.clear();
                this.evictedKeys.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GroupedUnicast) it.next()).onError(th);
            }
            subscriber.onError(th);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            Iterator<GroupedUnicast<K, V>> it = this.groups.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.groups.clear();
            if (this.evictedKeys != null) {
                this.groupsCopy.clear();
                this.evictedKeys.clear();
            }
            this.done = true;
            this.groupCount.decrementAndGet();
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaHooks.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            this.groupCount.decrementAndGet();
            drain();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.done) {
                return;
            }
            Queue<?> queue = this.queue;
            Subscriber<? super GroupedObservable<K, V>> subscriber = this.actual;
            try {
                K kCall = this.keySelector.call(t3);
                boolean z3 = false;
                Object obj = kCall != null ? kCall : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicastCreateWith = this.groups.get(obj);
                if (groupedUnicastCreateWith == null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    groupedUnicastCreateWith = GroupedUnicast.createWith(kCall, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicastCreateWith);
                    if (this.evictedKeys != null) {
                        this.groupsCopy.put(obj, groupedUnicastCreateWith);
                    }
                    this.groupCount.getAndIncrement();
                    z3 = true;
                }
                try {
                    groupedUnicastCreateWith.onNext(this.valueSelector.call(t3));
                    if (this.evictedKeys != null) {
                        while (true) {
                            K kPoll = this.evictedKeys.poll();
                            if (kPoll == null) {
                                break;
                            }
                            GroupedUnicast<K, V> groupedUnicastRemove = this.groupsCopy.remove(kPoll);
                            if (groupedUnicastRemove != null) {
                                groupedUnicastRemove.onComplete();
                            }
                        }
                    }
                    if (z3) {
                        queue.offer(groupedUnicastCreateWith);
                        drain();
                    }
                } catch (Throwable th) {
                    unsubscribe();
                    errorAll(subscriber, queue, th);
                }
            } catch (Throwable th2) {
                unsubscribe();
                errorAll(subscriber, queue, th2);
            }
        }

        public void requestMore(long j4) {
            if (j4 >= 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j4);
                drain();
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j4);
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f11781s.setProducer(producer);
        }

        public void cancel(K k4) {
            if (k4 == null) {
                k4 = (K) NULL_KEY;
            }
            if (this.groups.remove(k4) != null && this.groupCount.decrementAndGet() == 0) {
                unsubscribe();
            }
            if (this.evictedKeys != null) {
                this.groupsCopy.remove(k4);
            }
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func1<Action1<K>, Map<K, Object>> func13) {
        this(func1, func12, RxRingBuffer.SIZE, false, func13);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i4, boolean z3, Func1<Action1<K>, Map<K, Object>> func13) {
        this.keySelector = func1;
        this.valueSelector = func12;
        this.bufferSize = i4;
        this.delayError = z3;
        this.mapFactory = func13;
    }
}
