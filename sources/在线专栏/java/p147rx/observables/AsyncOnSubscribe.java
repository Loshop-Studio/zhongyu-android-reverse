package p147rx.observables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.annotations.Beta;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.functions.Action2;
import p147rx.functions.Action3;
import p147rx.functions.Func0;
import p147rx.functions.Func1;
import p147rx.functions.Func3;
import p147rx.internal.operators.BufferUntilSubscriber;
import p147rx.observers.SerializedObserver;
import p147rx.plugins.RxJavaHooks;
import p147rx.subscriptions.CompositeSubscription;

@Beta
/* loaded from: classes2.dex */
public abstract class AsyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {

    static final class AsyncOuterManager<S, T> implements Producer, Subscription, Observer<Observable<? extends T>> {
        Producer concatProducer;
        boolean emitting;
        long expectedDelivery;
        private boolean hasTerminated;
        private final UnicastSubject<Observable<T>> merger;
        private boolean onNextCalled;
        private final AsyncOnSubscribe<S, T> parent;
        List<Long> requests;
        private S state;
        final CompositeSubscription subscriptions = new CompositeSubscription();
        private final SerializedObserver<Observable<? extends T>> serializedSubscriber = new SerializedObserver<>(this);
        final AtomicBoolean isUnsubscribed = new AtomicBoolean();

        public AsyncOuterManager(AsyncOnSubscribe<S, T> asyncOnSubscribe, S s3, UnicastSubject<Observable<T>> unicastSubject) {
            this.parent = asyncOnSubscribe;
            this.state = s3;
            this.merger = unicastSubject;
        }

        private void handleThrownError(Throwable th) {
            if (this.hasTerminated) {
                RxJavaHooks.onError(th);
                return;
            }
            this.hasTerminated = true;
            this.merger.onError(th);
            cleanup();
        }

        private void subscribeBufferToObservable(Observable<? extends T> observable) {
            BufferUntilSubscriber bufferUntilSubscriberCreate = BufferUntilSubscriber.create();
            final Subscriber<T> subscriber = new Subscriber<T>(this.expectedDelivery, bufferUntilSubscriberCreate) { // from class: rx.observables.AsyncOnSubscribe.AsyncOuterManager.1
                long remaining;
                final /* synthetic */ BufferUntilSubscriber val$buffer;
                final /* synthetic */ long val$expected;

                {
                    this.val$expected = j;
                    this.val$buffer = bufferUntilSubscriberCreate;
                    this.remaining = j;
                }

                @Override // p147rx.Observer
                public void onCompleted() {
                    this.val$buffer.onCompleted();
                    long j4 = this.remaining;
                    if (j4 > 0) {
                        AsyncOuterManager.this.requestRemaining(j4);
                    }
                }

                @Override // p147rx.Observer
                public void onError(Throwable th) {
                    this.val$buffer.onError(th);
                }

                @Override // p147rx.Observer
                public void onNext(T t3) {
                    this.remaining--;
                    this.val$buffer.onNext(t3);
                }
            };
            this.subscriptions.add(subscriber);
            observable.doOnTerminate(new Action0() { // from class: rx.observables.AsyncOnSubscribe.AsyncOuterManager.2
                @Override // p147rx.functions.Action0
                public void call() {
                    AsyncOuterManager.this.subscriptions.remove(subscriber);
                }
            }).subscribe((Subscriber<? super Object>) subscriber);
            this.merger.onNext(bufferUntilSubscriberCreate);
        }

        void cleanup() {
            this.subscriptions.unsubscribe();
            try {
                this.parent.onUnsubscribe(this.state);
            } catch (Throwable th) {
                handleThrownError(th);
            }
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.isUnsubscribed.get();
        }

        public void nextIteration(long j4) {
            this.state = this.parent.next(this.state, j4, this.serializedSubscriber);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.hasTerminated) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.hasTerminated = true;
            this.merger.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.hasTerminated) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.hasTerminated = true;
            this.merger.onError(th);
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            boolean z3;
            if (j4 == 0) {
                return;
            }
            if (j4 < 0) {
                throw new IllegalStateException("Request can't be negative! " + j4);
            }
            synchronized (this) {
                z3 = true;
                if (this.emitting) {
                    List arrayList = this.requests;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.requests = arrayList;
                    }
                    arrayList.add(Long.valueOf(j4));
                } else {
                    this.emitting = true;
                    z3 = false;
                }
            }
            this.concatProducer.request(j4);
            if (z3 || tryEmit(j4)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    List<Long> list = this.requests;
                    if (list == null) {
                        this.emitting = false;
                        return;
                    }
                    this.requests = null;
                    Iterator<Long> it = list.iterator();
                    while (it.hasNext()) {
                        if (tryEmit(it.next().longValue())) {
                            return;
                        }
                    }
                }
            }
        }

        public void requestRemaining(long j4) {
            if (j4 == 0) {
                return;
            }
            if (j4 < 0) {
                throw new IllegalStateException("Request can't be negative! " + j4);
            }
            synchronized (this) {
                if (this.emitting) {
                    List arrayList = this.requests;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.requests = arrayList;
                    }
                    arrayList.add(Long.valueOf(j4));
                    return;
                }
                this.emitting = true;
                if (tryEmit(j4)) {
                    return;
                }
                while (true) {
                    synchronized (this) {
                        List<Long> list = this.requests;
                        if (list == null) {
                            this.emitting = false;
                            return;
                        }
                        this.requests = null;
                        Iterator<Long> it = list.iterator();
                        while (it.hasNext()) {
                            if (tryEmit(it.next().longValue())) {
                                return;
                            }
                        }
                    }
                }
            }
        }

        void setConcatProducer(Producer producer) {
            if (this.concatProducer != null) {
                throw new IllegalStateException("setConcatProducer may be called at most once!");
            }
            this.concatProducer = producer;
        }

        boolean tryEmit(long j4) {
            if (isUnsubscribed()) {
                cleanup();
                return true;
            }
            try {
                this.onNextCalled = false;
                this.expectedDelivery = j4;
                nextIteration(j4);
                if ((this.hasTerminated && !this.subscriptions.hasSubscriptions()) || isUnsubscribed()) {
                    cleanup();
                    return true;
                }
                if (this.onNextCalled) {
                    return false;
                }
                handleThrownError(new IllegalStateException("No events emitted!"));
                return true;
            } catch (Throwable th) {
                handleThrownError(th);
                return true;
            }
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            if (this.isUnsubscribed.compareAndSet(false, true)) {
                synchronized (this) {
                    if (!this.emitting) {
                        this.emitting = true;
                        cleanup();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        this.requests = arrayList;
                        arrayList.add(0L);
                    }
                }
            }
        }

        @Override // p147rx.Observer
        public void onNext(Observable<? extends T> observable) {
            if (this.onNextCalled) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.onNextCalled = true;
            if (this.hasTerminated) {
                return;
            }
            subscribeBufferToObservable(observable);
        }
    }

    static final class UnicastSubject<T> extends Observable<T> implements Observer<T> {
        private final State<T> state;

        static final class State<T> implements Observable.OnSubscribe<T> {
            Subscriber<? super T> subscriber;

            State() {
            }

            @Override // p147rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                synchronized (this) {
                    if (this.subscriber == null) {
                        this.subscriber = subscriber;
                    } else {
                        subscriber.onError(new IllegalStateException("There can be only one subscriber"));
                    }
                }
            }
        }

        protected UnicastSubject(State<T> state) {
            super(state);
            this.state = state;
        }

        public static <T> UnicastSubject<T> create() {
            return new UnicastSubject<>(new State());
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.state.subscriber.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.state.subscriber.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.state.subscriber.onNext(t3);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3) {
        return new AsyncOnSubscribeImpl(func0, new Func3<S, Long, Observer<Observable<? extends T>>, S>() { // from class: rx.observables.AsyncOnSubscribe.1
            @Override // p147rx.functions.Func3
            public /* bridge */ /* synthetic */ Object call(Object obj, Long l3, Object obj2) {
                return call((C32941) obj, l3, (Observer) obj2);
            }

            public S call(S s3, Long l3, Observer<Observable<? extends T>> observer) {
                action3.call(s3, l3, observer);
                return s3;
            }
        });
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
        return new AsyncOnSubscribeImpl(func0, func3, action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(final Action2<Long, ? super Observer<Observable<? extends T>>> action2) {
        return new AsyncOnSubscribeImpl(new Func3<Void, Long, Observer<Observable<? extends T>>, Void>() { // from class: rx.observables.AsyncOnSubscribe.3
            @Override // p147rx.functions.Func3
            public Void call(Void r22, Long l3, Observer<Observable<? extends T>> observer) {
                action2.call(l3, observer);
                return r22;
            }
        });
    }

    protected abstract S generateState();

    protected abstract S next(S s3, long j4, Observer<Observable<? extends T>> observer);

    protected void onUnsubscribe(S s3) {
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
        return new AsyncOnSubscribeImpl(func0, func3);
    }

    @Override // p147rx.functions.Action1
    public final void call(final Subscriber<? super T> subscriber) {
        try {
            S sGenerateState = generateState();
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            final AsyncOuterManager asyncOuterManager = new AsyncOuterManager(this, sGenerateState, unicastSubjectCreate);
            Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.observables.AsyncOnSubscribe.6
                @Override // p147rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }

                @Override // p147rx.Observer
                public void onError(Throwable th) {
                    subscriber.onError(th);
                }

                @Override // p147rx.Observer
                public void onNext(T t3) {
                    subscriber.onNext(t3);
                }

                @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
                public void setProducer(Producer producer) {
                    asyncOuterManager.setConcatProducer(producer);
                }
            };
            unicastSubjectCreate.onBackpressureBuffer().concatMap(new Func1<Observable<T>, Observable<T>>() { // from class: rx.observables.AsyncOnSubscribe.7
                @Override // p147rx.functions.Func1
                public Observable<T> call(Observable<T> observable) {
                    return observable.onBackpressureBuffer();
                }
            }).unsafeSubscribe(subscriber2);
            subscriber.add(subscriber2);
            subscriber.add(asyncOuterManager);
            subscriber.setProducer(asyncOuterManager);
        } catch (Throwable th) {
            subscriber.onError(th);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, final Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3, Action1<? super S> action1) {
        return new AsyncOnSubscribeImpl(func0, new Func3<S, Long, Observer<Observable<? extends T>>, S>() { // from class: rx.observables.AsyncOnSubscribe.2
            @Override // p147rx.functions.Func3
            public /* bridge */ /* synthetic */ Object call(Object obj, Long l3, Object obj2) {
                return call((C32952) obj, l3, (Observer) obj2);
            }

            public S call(S s3, Long l3, Observer<Observable<? extends T>> observer) {
                action3.call(s3, l3, observer);
                return s3;
            }
        }, action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(final Action2<Long, ? super Observer<Observable<? extends T>>> action2, final Action0 action0) {
        return new AsyncOnSubscribeImpl(new Func3<Void, Long, Observer<Observable<? extends T>>, Void>() { // from class: rx.observables.AsyncOnSubscribe.4
            @Override // p147rx.functions.Func3
            public Void call(Void r12, Long l3, Observer<Observable<? extends T>> observer) {
                action2.call(l3, observer);
                return null;
            }
        }, new Action1<Void>() { // from class: rx.observables.AsyncOnSubscribe.5
            @Override // p147rx.functions.Action1
            public void call(Void r12) {
                action0.call();
            }
        });
    }

    static final class AsyncOnSubscribeImpl<S, T> extends AsyncOnSubscribe<S, T> {
        private final Func0<? extends S> generator;
        private final Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> next;
        private final Action1<? super S> onUnsubscribe;

        AsyncOnSubscribeImpl(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
            this.generator = func0;
            this.next = func3;
            this.onUnsubscribe = action1;
        }

        @Override // p147rx.observables.AsyncOnSubscribe, p147rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) obj);
        }

        @Override // p147rx.observables.AsyncOnSubscribe
        protected S generateState() {
            Func0<? extends S> func0 = this.generator;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // p147rx.observables.AsyncOnSubscribe
        protected S next(S s3, long j4, Observer<Observable<? extends T>> observer) {
            return this.next.call(s3, Long.valueOf(j4), observer);
        }

        @Override // p147rx.observables.AsyncOnSubscribe
        protected void onUnsubscribe(S s3) {
            Action1<? super S> action1 = this.onUnsubscribe;
            if (action1 != null) {
                action1.call(s3);
            }
        }

        public AsyncOnSubscribeImpl(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
            this(func0, func3, null);
        }

        public AsyncOnSubscribeImpl(Func3<S, Long, Observer<Observable<? extends T>>, S> func3, Action1<? super S> action1) {
            this(null, func3, action1);
        }

        public AsyncOnSubscribeImpl(Func3<S, Long, Observer<Observable<? extends T>>, S> func3) {
            this(null, func3, null);
        }
    }
}
