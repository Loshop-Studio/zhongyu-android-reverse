package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Notification;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.functions.Func1;
import p147rx.functions.Func2;
import p147rx.internal.producers.ProducerArbiter;
import p147rx.observers.Subscribers;
import p147rx.schedulers.Schedulers;
import p147rx.subjects.BehaviorSubject;
import p147rx.subjects.SerializedSubject;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class OnSubscribeRedo<T> implements Observable.OnSubscribe<T> {
    static final Func1<Observable<? extends Notification<?>>, Observable<?>> REDO_INFINITE = new Func1<Observable<? extends Notification<?>>, Observable<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.1
        @Override // p147rx.functions.Func1
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new Func1<Notification<?>, Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.1.1
                @Override // p147rx.functions.Func1
                public Notification<?> call(Notification<?> notification) {
                    return Notification.createOnNext(null);
                }
            });
        }
    };
    private final Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> controlHandlerFunction;
    private final Scheduler scheduler;
    final Observable<T> source;
    final boolean stopOnComplete;
    final boolean stopOnError;

    public static final class RedoFinite implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        final long count;

        public RedoFinite(long j4) {
            this.count = j4;
        }

        @Override // p147rx.functions.Func1
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new Func1<Notification<?>, Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.RedoFinite.1
                int num;

                @Override // p147rx.functions.Func1
                public Notification<?> call(Notification<?> notification) {
                    long j4 = RedoFinite.this.count;
                    if (j4 == 0) {
                        return notification;
                    }
                    int i4 = this.num + 1;
                    this.num = i4;
                    return ((long) i4) <= j4 ? Notification.createOnNext(Integer.valueOf(i4)) : notification;
                }
            }).dematerialize();
        }
    }

    public static final class RetryWithPredicate implements Func1<Observable<? extends Notification<?>>, Observable<? extends Notification<?>>> {
        final Func2<Integer, Throwable, Boolean> predicate;

        public RetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
            this.predicate = func2;
        }

        @Override // p147rx.functions.Func1
        public Observable<? extends Notification<?>> call(Observable<? extends Notification<?>> observable) {
            return observable.scan(Notification.createOnNext(0), new Func2<Notification<Integer>, Notification<?>, Notification<Integer>>() { // from class: rx.internal.operators.OnSubscribeRedo.RetryWithPredicate.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p147rx.functions.Func2
                public Notification<Integer> call(Notification<Integer> notification, Notification<?> notification2) {
                    int iIntValue = notification.getValue().intValue();
                    return RetryWithPredicate.this.predicate.call(Integer.valueOf(iIntValue), notification2.getThrowable()).booleanValue() ? Notification.createOnNext(Integer.valueOf(iIntValue + 1)) : notification2;
                }
            });
        }
    }

    private OnSubscribeRedo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, boolean z3, boolean z4, Scheduler scheduler) {
        this.source = observable;
        this.controlHandlerFunction = func1;
        this.stopOnComplete = z3;
        this.stopOnError = z4;
        this.scheduler = scheduler;
    }

    public static <T> Observable<T> redo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable) {
        return repeat(observable, Schedulers.trampoline());
    }

    public static <T> Observable<T> retry(Observable<T> observable) {
        return retry(observable, REDO_INFINITE);
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Scheduler scheduler) {
        return repeat(observable, REDO_INFINITE, scheduler);
    }

    public static <T> Observable<T> retry(Observable<T> observable, long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? observable : retry(observable, new RedoFinite(j4));
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    @Override // p147rx.functions.Action1
    public void call(final Subscriber<? super T> subscriber) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicLong atomicLong = new AtomicLong();
        final Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        subscriber.add(workerCreateWorker);
        final SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        final SerializedSubject<T, T> serialized = BehaviorSubject.create().toSerialized();
        serialized.subscribe((Subscriber) Subscribers.empty());
        final ProducerArbiter producerArbiter = new ProducerArbiter();
        final Action0 action0 = new Action0() { // from class: rx.internal.operators.OnSubscribeRedo.2
            @Override // p147rx.functions.Action0
            public void call() {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OnSubscribeRedo.2.1
                    boolean done;

                    private void decrementConsumerCapacity() {
                        long j4;
                        do {
                            j4 = atomicLong.get();
                            if (j4 == Long.MAX_VALUE) {
                                return;
                            }
                        } while (!atomicLong.compareAndSet(j4, j4 - 1));
                    }

                    @Override // p147rx.Observer
                    public void onCompleted() {
                        if (this.done) {
                            return;
                        }
                        this.done = true;
                        unsubscribe();
                        serialized.onNext(Notification.createOnCompleted());
                    }

                    @Override // p147rx.Observer
                    public void onError(Throwable th) {
                        if (this.done) {
                            return;
                        }
                        this.done = true;
                        unsubscribe();
                        serialized.onNext(Notification.createOnError(th));
                    }

                    @Override // p147rx.Observer
                    public void onNext(T t3) {
                        if (this.done) {
                            return;
                        }
                        subscriber.onNext(t3);
                        decrementConsumerCapacity();
                        producerArbiter.produced(1L);
                    }

                    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
                    public void setProducer(Producer producer) {
                        producerArbiter.setProducer(producer);
                    }
                };
                serialSubscription.set(subscriber2);
                OnSubscribeRedo.this.source.unsafeSubscribe(subscriber2);
            }
        };
        final Observable<?> observableCall = this.controlHandlerFunction.call(serialized.lift(new Observable.Operator<Notification<?>, Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.3
            @Override // p147rx.functions.Func1
            public Subscriber<? super Notification<?>> call(final Subscriber<? super Notification<?>> subscriber2) {
                return new Subscriber<Notification<?>>(subscriber2) { // from class: rx.internal.operators.OnSubscribeRedo.3.1
                    @Override // p147rx.Observer
                    public void onCompleted() {
                        subscriber2.onCompleted();
                    }

                    @Override // p147rx.Observer
                    public void onError(Throwable th) {
                        subscriber2.onError(th);
                    }

                    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
                    public void setProducer(Producer producer) {
                        producer.request(Long.MAX_VALUE);
                    }

                    @Override // p147rx.Observer
                    public void onNext(Notification<?> notification) {
                        if (notification.isOnCompleted() && OnSubscribeRedo.this.stopOnComplete) {
                            subscriber2.onCompleted();
                        } else if (notification.isOnError() && OnSubscribeRedo.this.stopOnError) {
                            subscriber2.onError(notification.getThrowable());
                        } else {
                            subscriber2.onNext(notification);
                        }
                    }
                };
            }
        }));
        workerCreateWorker.schedule(new Action0() { // from class: rx.internal.operators.OnSubscribeRedo.4
            @Override // p147rx.functions.Action0
            public void call() {
                observableCall.unsafeSubscribe(new Subscriber<Object>(subscriber) { // from class: rx.internal.operators.OnSubscribeRedo.4.1
                    @Override // p147rx.Observer
                    public void onCompleted() {
                        subscriber.onCompleted();
                    }

                    @Override // p147rx.Observer
                    public void onError(Throwable th) {
                        subscriber.onError(th);
                    }

                    @Override // p147rx.Observer
                    public void onNext(Object obj) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (atomicLong.get() <= 0) {
                            atomicBoolean.compareAndSet(false, true);
                        } else {
                            C31604 c31604 = C31604.this;
                            workerCreateWorker.schedule(action0);
                        }
                    }

                    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
                    public void setProducer(Producer producer) {
                        producer.request(Long.MAX_VALUE);
                    }
                });
            }
        });
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeRedo.5
            @Override // p147rx.Producer
            public void request(long j4) {
                if (j4 > 0) {
                    BackpressureUtils.getAndAddRequest(atomicLong, j4);
                    producerArbiter.request(j4);
                    if (atomicBoolean.compareAndSet(true, false)) {
                        workerCreateWorker.schedule(action0);
                    }
                }
            }
        });
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j4) {
        return repeat(observable, j4, Schedulers.trampoline());
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j4, Scheduler scheduler) {
        if (j4 == 0) {
            return Observable.empty();
        }
        if (j4 >= 0) {
            return repeat(observable, new RedoFinite(j4 - 1), scheduler);
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, true, false, Schedulers.trampoline()));
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, true, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, true, Schedulers.trampoline()));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, true, scheduler));
    }
}
