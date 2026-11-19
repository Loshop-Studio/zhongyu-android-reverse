package p147rx.internal.util;

import anetwork.channel.util.RequestConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;
import p147rx.functions.Func1;
import p147rx.internal.producers.SingleProducer;
import p147rx.internal.schedulers.EventLoopsScheduler;
import p147rx.observers.Subscribers;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class ScalarSynchronousObservable<T> extends Observable<T> {
    static final boolean STRONG_MODE = Boolean.valueOf(System.getProperty("rx.just.strong-mode", RequestConstant.FALSE)).booleanValue();

    /* renamed from: t */
    final T f11793t;

    static final class JustOnSubscribe<T> implements Observable.OnSubscribe<T> {
        final T value;

        JustOnSubscribe(T t3) {
            this.value = t3;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(ScalarSynchronousObservable.createProducer(subscriber, this.value));
        }
    }

    static final class ScalarAsyncOnSubscribe<T> implements Observable.OnSubscribe<T> {
        final Func1<Action0, Subscription> onSchedule;
        final T value;

        ScalarAsyncOnSubscribe(T t3, Func1<Action0, Subscription> func1) {
            this.value = t3;
            this.onSchedule = func1;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(new ScalarAsyncProducer(subscriber, this.value, this.onSchedule));
        }
    }

    static final class ScalarAsyncProducer<T> extends AtomicBoolean implements Producer, Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        final Subscriber<? super T> actual;
        final Func1<Action0, Subscription> onSchedule;
        final T value;

        public ScalarAsyncProducer(Subscriber<? super T> subscriber, T t3, Func1<Action0, Subscription> func1) {
            this.actual = subscriber;
            this.value = t3;
            this.onSchedule = func1;
        }

        @Override // p147rx.functions.Action0
        public void call() {
            Subscriber<? super T> subscriber = this.actual;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t3 = this.value;
            try {
                subscriber.onNext(t3);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, t3);
            }
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j4);
            }
            if (j4 == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.actual.add(this.onSchedule.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + "]";
        }
    }

    static final class WeakSingleProducer<T> implements Producer {
        final Subscriber<? super T> actual;
        boolean once;
        final T value;

        public WeakSingleProducer(Subscriber<? super T> subscriber, T t3) {
            this.actual = subscriber;
            this.value = t3;
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (this.once) {
                return;
            }
            if (j4 < 0) {
                throw new IllegalStateException("n >= required but it was " + j4);
            }
            if (j4 == 0) {
                return;
            }
            this.once = true;
            Subscriber<? super T> subscriber = this.actual;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t3 = this.value;
            try {
                subscriber.onNext(t3);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, t3);
            }
        }
    }

    protected ScalarSynchronousObservable(T t3) {
        super(RxJavaHooks.onCreate(new JustOnSubscribe(t3)));
        this.f11793t = t3;
    }

    public static <T> ScalarSynchronousObservable<T> create(T t3) {
        return new ScalarSynchronousObservable<>(t3);
    }

    static <T> Producer createProducer(Subscriber<? super T> subscriber, T t3) {
        return STRONG_MODE ? new SingleProducer(subscriber, t3) : new WeakSingleProducer(subscriber, t3);
    }

    public T get() {
        return this.f11793t;
    }

    public <R> Observable<R> scalarFlatMap(final Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.unsafeCreate(new Observable.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousObservable.3
            @Override // p147rx.functions.Action1
            public void call(Subscriber<? super R> subscriber) {
                Observable observable = (Observable) func1.call(ScalarSynchronousObservable.this.f11793t);
                if (observable instanceof ScalarSynchronousObservable) {
                    subscriber.setProducer(ScalarSynchronousObservable.createProducer(subscriber, ((ScalarSynchronousObservable) observable).f11793t));
                } else {
                    observable.unsafeSubscribe(Subscribers.wrap(subscriber));
                }
            }
        });
    }

    public Observable<T> scalarScheduleOn(final Scheduler scheduler) {
        Func1<Action0, Subscription> func1;
        if (scheduler instanceof EventLoopsScheduler) {
            final EventLoopsScheduler eventLoopsScheduler = (EventLoopsScheduler) scheduler;
            func1 = new Func1<Action0, Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.1
                @Override // p147rx.functions.Func1
                public Subscription call(Action0 action0) {
                    return eventLoopsScheduler.scheduleDirect(action0);
                }
            };
        } else {
            func1 = new Func1<Action0, Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.2
                @Override // p147rx.functions.Func1
                public Subscription call(final Action0 action0) {
                    final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                    workerCreateWorker.schedule(new Action0() { // from class: rx.internal.util.ScalarSynchronousObservable.2.1
                        @Override // p147rx.functions.Action0
                        public void call() {
                            try {
                                action0.call();
                            } finally {
                                workerCreateWorker.unsubscribe();
                            }
                        }
                    });
                    return workerCreateWorker;
                }
            };
        }
        return Observable.unsafeCreate(new ScalarAsyncOnSubscribe(this.f11793t, func1));
    }
}
