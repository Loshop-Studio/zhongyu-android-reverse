package io.reactivex.internal.operators.flowable;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    static final Callable DEFAULT_UNBOUNDED_FACTORY = new DefaultUnboundedFactory();
    final Callable<? extends ReplayBuffer<T>> bufferFactory;
    final AtomicReference<ReplaySubscriber<T>> current;
    final InterfaceC8988b onSubscribe;
    final Flowable<T> source;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node head = getHead();
            while (true) {
                head = head.get();
                if (head == null) {
                    return;
                }
                Object objLeaveTransform = leaveTransform(head.value);
                if (NotificationLite.isComplete(objLeaveTransform) || NotificationLite.isError(objLeaveTransform)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objLeaveTransform));
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
            Object objEnterTransform = enterTransform(NotificationLite.complete());
            long j10 = this.index + 1;
            this.index = j10;
            addLast(new Node(objEnterTransform, j10));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void error(Throwable th) {
            Object objEnterTransform = enterTransform(NotificationLite.error(th));
            long j10 = this.index + 1;
            this.index = j10;
            addLast(new Node(objEnterTransform, j10));
            truncateFinal();
        }

        public Node getHead() {
            return get();
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isComplete(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isError(leaveTransform(obj));
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void next(T t10) {
            Object objEnterTransform = enterTransform(NotificationLite.next(t10));
            long j10 = this.index + 1;
            this.index = j10;
            addLast(new Node(objEnterTransform, j10));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            if (node == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.size--;
            setFirst(node);
        }

        public final void removeSome(int i10) {
            Node node = get();
            while (i10 > 0) {
                node = node.get();
                i10--;
                this.size--;
            }
            setFirst(node);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void replay(InnerSubscription<T> innerSubscription) {
            Node node;
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.emitting) {
                        innerSubscription.missed = true;
                        return;
                    }
                    innerSubscription.emitting = true;
                    while (!innerSubscription.isDisposed()) {
                        long j10 = innerSubscription.get();
                        boolean z9 = j10 == Long.MAX_VALUE;
                        Node head = (Node) innerSubscription.index();
                        if (head == null) {
                            head = getHead();
                            innerSubscription.index = head;
                            BackpressureHelper.add(innerSubscription.totalRequested, head.index);
                        }
                        long j11 = 0;
                        while (j10 != 0 && (node = head.get()) != null) {
                            Object objLeaveTransform = leaveTransform(node.value);
                            try {
                                if (NotificationLite.accept(objLeaveTransform, innerSubscription.child)) {
                                    innerSubscription.index = null;
                                    return;
                                }
                                j11++;
                                j10--;
                                if (innerSubscription.isDisposed()) {
                                    return;
                                } else {
                                    head = node;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                innerSubscription.index = null;
                                innerSubscription.dispose();
                                if (NotificationLite.isError(objLeaveTransform) || NotificationLite.isComplete(objLeaveTransform)) {
                                    return;
                                }
                                innerSubscription.child.onError(th);
                                return;
                            }
                        }
                        if (j11 != 0) {
                            innerSubscription.index = head;
                            if (!z9) {
                                innerSubscription.produced(j11);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.missed) {
                                    innerSubscription.emitting = false;
                                    return;
                                }
                                innerSubscription.missed = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public void truncate() {
        }

        public void truncateFinal() {
            trimHead();
        }
    }

    public static final class ConnectableFlowableReplay<T> extends ConnectableFlowable<T> {

        /* renamed from: cf */
        private final ConnectableFlowable<T> f13318cf;
        private final Flowable<T> flowable;

        public ConnectableFlowableReplay(ConnectableFlowable<T> connectableFlowable, Flowable<T> flowable) {
            this.f13318cf = connectableFlowable;
            this.flowable = flowable;
        }

        @Override // io.reactivex.flowables.ConnectableFlowable
        public void connect(Consumer<? super Disposable> consumer) {
            this.f13318cf.connect(consumer);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC8989c interfaceC8989c) {
            this.flowable.subscribe(interfaceC8989c);
        }
    }

    public static final class DefaultUnboundedFactory implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements InterfaceC8990d, Disposable {
        static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final InterfaceC8989c child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerSubscription(ReplaySubscriber<T> replaySubscriber, InterfaceC8989c interfaceC8989c) {
            this.parent = replaySubscriber;
            this.child = interfaceC8989c;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.manageRequests();
            }
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j10) {
            return BackpressureHelper.producedCancel(this, j10);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || BackpressureHelper.addCancel(this, j10) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.add(this.totalRequested, j10);
            this.parent.manageRequests();
            this.parent.buffer.replay(this);
        }
    }

    public static final class MulticastFlowable<R, U> extends Flowable<R> {
        private final Callable<? extends ConnectableFlowable<U>> connectableFactory;
        private final Function<? super Flowable<U>, ? extends InterfaceC8988b> selector;

        public final class DisposableConsumer implements Consumer<Disposable> {
            private final SubscriberResourceWrapper<R> srw;

            public DisposableConsumer(SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.srw = subscriberResourceWrapper;
            }

            @Override // io.reactivex.functions.Consumer
            public void accept(Disposable disposable) {
                this.srw.setResource(disposable);
            }
        }

        public MulticastFlowable(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends InterfaceC8988b> function) {
            this.connectableFactory = callable;
            this.selector = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC8989c interfaceC8989c) {
            try {
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) ObjectHelper.requireNonNull(this.connectableFactory.call(), "The connectableFactory returned null");
                try {
                    InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.selector.apply(connectableFlowable), "The selector returned a null Publisher");
                    SubscriberResourceWrapper subscriberResourceWrapper = new SubscriberResourceWrapper(interfaceC8989c);
                    interfaceC8988b.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new DisposableConsumer(subscriberResourceWrapper));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, interfaceC8989c);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC8989c);
            }
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        public Node(Object obj, long j10) {
            this.value = obj;
            this.index = j10;
        }
    }

    public interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th);

        void next(T t10);

        void replay(InnerSubscription<T> innerSubscription);
    }

    public static final class ReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        private final int bufferSize;

        public ReplayBufferTask(int i10) {
            this.bufferSize = i10;
        }

        @Override // java.util.concurrent.Callable
        public ReplayBuffer<T> call() {
            return new SizeBoundReplayBuffer(this.bufferSize);
        }
    }

    public static final class ReplayPublisher<T> implements InterfaceC8988b {
        private final Callable<? extends ReplayBuffer<T>> bufferFactory;
        private final AtomicReference<ReplaySubscriber<T>> curr;

        public ReplayPublisher(AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends ReplayBuffer<T>> callable) {
            this.curr = atomicReference;
            this.bufferFactory = callable;
        }

        @Override // p215q9.InterfaceC8988b
        public void subscribe(InterfaceC8989c interfaceC8989c) {
            ReplaySubscriber<T> replaySubscriber;
            while (true) {
                replaySubscriber = this.curr.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.call());
                    if (AbstractC0920q.m1034a(this.curr, null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, interfaceC8989c);
                    return;
                }
            }
            InnerSubscription<T> innerSubscription = new InnerSubscription<>(replaySubscriber, interfaceC8989c);
            interfaceC8989c.onSubscribe(innerSubscription);
            replaySubscriber.add(innerSubscription);
            if (innerSubscription.isDisposed()) {
                replaySubscriber.remove(innerSubscription);
            } else {
                replaySubscriber.manageRequests();
                replaySubscriber.buffer.replay(innerSubscription);
            }
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final ReplayBuffer<T> buffer;
        boolean done;
        long maxChildRequested;
        long maxUpstreamRequested;
        final AtomicInteger management = new AtomicInteger();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public ReplaySubscriber(ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
        }

        public boolean add(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            innerSubscription.getClass();
            do {
                innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!AbstractC0920q.m1034a(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.set(TERMINATED);
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        public void manageRequests() {
            if (this.management.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                long j10 = this.maxChildRequested;
                long jMax = j10;
                for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                    jMax = Math.max(jMax, innerSubscription.totalRequested.get());
                }
                long j11 = this.maxUpstreamRequested;
                InterfaceC8990d interfaceC8990d = get();
                long j12 = jMax - j10;
                if (j12 != 0) {
                    this.maxChildRequested = jMax;
                    if (interfaceC8990d == null) {
                        long j13 = j11 + j12;
                        if (j13 < 0) {
                            j13 = Long.MAX_VALUE;
                        }
                        this.maxUpstreamRequested = j13;
                    } else if (j11 != 0) {
                        this.maxUpstreamRequested = 0L;
                        interfaceC8990d.request(j11 + j12);
                    } else {
                        interfaceC8990d.request(j12);
                    }
                } else if (j11 != 0 && interfaceC8990d != null) {
                    this.maxUpstreamRequested = 0L;
                    interfaceC8990d.request(j11);
                }
                iAddAndGet = this.management.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer.error(th);
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            this.buffer.next(t10);
            for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this, interfaceC8990d)) {
                manageRequests();
                for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                    this.buffer.replay(innerSubscription);
                }
            }
        }

        public void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriptionArr[i10].equals(innerSubscription)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = EMPTY;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i10);
                    System.arraycopy(innerSubscriptionArr, i10 + 1, innerSubscriptionArr3, i10, (length - i10) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!AbstractC0920q.m1034a(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
        }
    }

    public static final class ScheduledReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        private final int bufferSize;
        private final long maxAge;
        private final Scheduler scheduler;
        private final TimeUnit unit;

        public ScheduledReplayBufferTask(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.bufferSize = i10;
            this.maxAge = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ReplayBuffer<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.bufferSize, this.maxAge, this.unit, this.scheduler);
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final Scheduler scheduler;
        final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i10;
            this.maxAge = j10;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new Timed(obj, this.scheduler.now(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public Node getHead() {
            Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                Timed timed = (Timed) node2.value;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i11 = this.size;
                    if (i11 <= this.limit) {
                        if (((Timed) node2.value).time() > jNow) {
                            break;
                        }
                        i10++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i10++;
                        this.size = i11 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void truncateFinal() {
            Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((Timed) node2.value).time() > jNow) {
                    break;
                }
                i10++;
                this.size--;
                node3 = node2.get();
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i10) {
            this.limit = i10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        public UnboundedReplayBuffer(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void next(T t10) {
            add(NotificationLite.next(t10));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void replay(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.emitting) {
                        innerSubscription.missed = true;
                        return;
                    }
                    innerSubscription.emitting = true;
                    InterfaceC8989c interfaceC8989c = innerSubscription.child;
                    while (!innerSubscription.isDisposed()) {
                        int i10 = this.size;
                        Integer num = (Integer) innerSubscription.index();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j10 = innerSubscription.get();
                        long j11 = j10;
                        long j12 = 0;
                        while (j11 != 0 && iIntValue < i10) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.accept(obj, interfaceC8989c) || innerSubscription.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j11--;
                                j12++;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                innerSubscription.dispose();
                                if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                                    return;
                                }
                                interfaceC8989c.onError(th);
                                return;
                            }
                        }
                        if (j12 != 0) {
                            innerSubscription.index = Integer.valueOf(iIntValue);
                            if (j10 != Long.MAX_VALUE) {
                                innerSubscription.produced(j12);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.missed) {
                                    innerSubscription.emitting = false;
                                    return;
                                }
                                innerSubscription.missed = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    private FlowableReplay(InterfaceC8988b interfaceC8988b, Flowable<T> flowable, AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends ReplayBuffer<T>> callable) {
        this.onSubscribe = interfaceC8988b;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferFactory = callable;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i10) {
        return i10 == Integer.MAX_VALUE ? createFrom(flowable) : create(flowable, new ReplayBufferTask(i10));
    }

    public static <T> ConnectableFlowable<T> createFrom(Flowable<? extends T> flowable) {
        return create(flowable, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static <U, R> Flowable<R> multicastSelector(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends InterfaceC8988b> function) {
        return new MulticastFlowable(callable, function);
    }

    public static <T> ConnectableFlowable<T> observeOn(ConnectableFlowable<T> connectableFlowable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new ConnectableFlowableReplay(connectableFlowable, connectableFlowable.observeOn(scheduler)));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.current.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.call());
                if (AbstractC0920q.m1034a(this.current, replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } finally {
                Exceptions.throwIfFatal(th);
                RuntimeException runtimeExceptionWrapOrThrow = ExceptionHelper.wrapOrThrow(th);
            }
        }
        boolean z9 = !replaySubscriber.shouldConnect.get() && replaySubscriber.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z9) {
                this.source.subscribe((FlowableSubscriber) replaySubscriber);
            }
        } catch (Throwable th) {
            if (z9) {
                replaySubscriber.shouldConnect.compareAndSet(true, false);
            }
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AbstractC0920q.m1034a(this.current, (ReplaySubscriber) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public InterfaceC8988b source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.onSubscribe.subscribe(interfaceC8989c);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return create(flowable, j10, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return create(flowable, new ScheduledReplayBufferTask(i10, j10, timeUnit, scheduler));
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, Callable<? extends ReplayBuffer<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowableReplay(new ReplayPublisher(atomicReference, callable), flowable, atomicReference, callable));
    }
}
