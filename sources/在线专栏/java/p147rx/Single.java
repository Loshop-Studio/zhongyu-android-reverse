package p147rx;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.annotations.Experimental;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.functions.Actions;
import p147rx.functions.Func0;
import p147rx.functions.Func1;
import p147rx.functions.Func2;
import p147rx.functions.Func3;
import p147rx.functions.Func4;
import p147rx.functions.Func5;
import p147rx.functions.Func6;
import p147rx.functions.Func7;
import p147rx.functions.Func8;
import p147rx.functions.Func9;
import p147rx.functions.FuncN;
import p147rx.internal.observers.AssertableSubscriberObservable;
import p147rx.internal.operators.CompletableFlatMapSingleToCompletable;
import p147rx.internal.operators.SingleDelay;
import p147rx.internal.operators.SingleDoAfterTerminate;
import p147rx.internal.operators.SingleDoOnEvent;
import p147rx.internal.operators.SingleDoOnSubscribe;
import p147rx.internal.operators.SingleDoOnUnsubscribe;
import p147rx.internal.operators.SingleFromCallable;
import p147rx.internal.operators.SingleFromEmitter;
import p147rx.internal.operators.SingleFromFuture;
import p147rx.internal.operators.SingleFromObservable;
import p147rx.internal.operators.SingleLiftObservableOperator;
import p147rx.internal.operators.SingleObserveOn;
import p147rx.internal.operators.SingleOnErrorReturn;
import p147rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther;
import p147rx.internal.operators.SingleOnSubscribeMap;
import p147rx.internal.operators.SingleOnSubscribeUsing;
import p147rx.internal.operators.SingleOperatorCast;
import p147rx.internal.operators.SingleOperatorOnErrorResumeNext;
import p147rx.internal.operators.SingleOperatorZip;
import p147rx.internal.operators.SingleTakeUntilCompletable;
import p147rx.internal.operators.SingleTakeUntilObservable;
import p147rx.internal.operators.SingleTakeUntilSingle;
import p147rx.internal.operators.SingleTimeout;
import p147rx.internal.operators.SingleToObservable;
import p147rx.internal.util.ScalarSynchronousSingle;
import p147rx.internal.util.UtilityFunctions;
import p147rx.observers.AssertableSubscriber;
import p147rx.observers.SafeSubscriber;
import p147rx.plugins.RxJavaHooks;
import p147rx.schedulers.Schedulers;
import p147rx.singles.BlockingSingle;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes.dex */
public class Single<T> {
    final OnSubscribe<T> onSubscribe;

    public interface OnSubscribe<T> extends Action1<SingleSubscriber<? super T>> {
    }

    public interface Transformer<T, R> extends Func1<Single<T>, Single<R>> {
    }

    protected Single(OnSubscribe<T> onSubscribe) {
        this.onSubscribe = RxJavaHooks.onCreate(onSubscribe);
    }

    private static <T> Observable<T> asObservable(Single<T> single) {
        return Observable.unsafeCreate(new SingleToObservable(single.onSubscribe));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.concat(asObservable(single), asObservable(single2));
    }

    public static <T> Single<T> create(OnSubscribe<T> onSubscribe) {
        return new Single<>(onSubscribe);
    }

    public static <T> Single<T> defer(final Callable<Single<T>> callable) {
        return create(new OnSubscribe<T>() { // from class: rx.Single.18
            @Override // p147rx.functions.Action1
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                try {
                    ((Single) callable.call()).subscribe(singleSubscriber);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    singleSubscriber.onError(th);
                }
            }
        });
    }

    public static <T> Single<T> error(final Throwable th) {
        return create(new OnSubscribe<T>() { // from class: rx.Single.1
            @Override // p147rx.functions.Action1
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                singleSubscriber.onError(th);
            }
        });
    }

    public static <T> Single<T> from(Future<? extends T> future) {
        return create(new SingleFromFuture(future, 0L, null));
    }

    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        return create(new SingleFromCallable(callable));
    }

    public static <T> Single<T> fromEmitter(Action1<SingleEmitter<T>> action1) {
        Objects.requireNonNull(action1, "producer is null");
        return create(new SingleFromEmitter(action1));
    }

    static <T> Single<? extends T>[] iterableToArray(Iterable<? extends Single<? extends T>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (Single[]) collection.toArray(new Single[collection.size()]);
        }
        Single<? extends T>[] singleArr = new Single[8];
        int i4 = 0;
        for (Single<? extends T> single : iterable) {
            if (i4 == singleArr.length) {
                Single<? extends T>[] singleArr2 = new Single[(i4 >> 2) + i4];
                System.arraycopy(singleArr, 0, singleArr2, 0, i4);
                singleArr = singleArr2;
            }
            singleArr[i4] = single;
            i4++;
        }
        if (singleArr.length == i4) {
            return singleArr;
        }
        Single<? extends T>[] singleArr3 = new Single[i4];
        System.arraycopy(singleArr, 0, singleArr3, 0, i4);
        return singleArr3;
    }

    public static <T> Single<T> just(T t3) {
        return ScalarSynchronousSingle.create(t3);
    }

    public static <T> Single<T> merge(Single<? extends Single<? extends T>> single) {
        return single instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) single).scalarFlatMap(UtilityFunctions.identity()) : create(new OnSubscribe<T>() { // from class: rx.Single.2
            @Override // p147rx.functions.Action1
            public void call(final SingleSubscriber<? super T> singleSubscriber) {
                SingleSubscriber<Single<? extends T>> singleSubscriber2 = new SingleSubscriber<Single<? extends T>>() { // from class: rx.Single.2.1
                    @Override // p147rx.SingleSubscriber
                    public void onError(Throwable th) {
                        singleSubscriber.onError(th);
                    }

                    @Override // p147rx.SingleSubscriber
                    public void onSuccess(Single<? extends T> single2) {
                        single2.subscribe(singleSubscriber);
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                Single.this.subscribe(singleSubscriber2);
            }
        });
    }

    public static <T> Observable<T> mergeDelayError(Observable<? extends Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1) {
        return using(func0, func1, action1, false);
    }

    public static <T1, T2, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, final Func2<? super T1, ? super T2, ? extends R> func2) {
        return SingleOperatorZip.zip(new Single[]{single, single2}, new FuncN<R>() { // from class: rx.Single.3
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func2.call(objArr[0], objArr[1]);
            }
        });
    }

    public final Single<T> cache() {
        return toObservable().cacheWithInitialCapacity(1).toSingle();
    }

    @Experimental
    public final <R> Single<R> cast(Class<R> cls) {
        return map(new SingleOperatorCast(cls));
    }

    public <R> Single<R> compose(Transformer<? super T, ? extends R> transformer) {
        return (Single) transformer.call(this);
    }

    public final Observable<T> concatWith(Single<? extends T> single) {
        return concat(this, single);
    }

    public final Single<T> delay(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        return create(new SingleDelay(this.onSubscribe, j4, timeUnit, scheduler));
    }

    public final Single<T> delaySubscription(Observable<?> observable) {
        Objects.requireNonNull(observable);
        return create(new SingleOnSubscribeDelaySubscriptionOther(this, observable));
    }

    public final Single<T> doAfterTerminate(Action0 action0) {
        return create(new SingleDoAfterTerminate(this, action0));
    }

    public final Single<T> doOnEach(final Action1<Notification<? extends T>> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, new Action1<T>() { // from class: rx.Single.16
                @Override // p147rx.functions.Action1
                public void call(T t3) {
                    action1.call(Notification.createOnNext(t3));
                }
            }, new Action1<Throwable>() { // from class: rx.Single.17
                @Override // p147rx.functions.Action1
                public void call(Throwable th) {
                    action1.call(Notification.createOnError(th));
                }
            }));
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final Single<T> doOnError(final Action1<Throwable> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, Actions.empty(), new Action1<Throwable>() { // from class: rx.Single.15
                @Override // p147rx.functions.Action1
                public void call(Throwable th) {
                    action1.call(th);
                }
            }));
        }
        throw new IllegalArgumentException("onError is null");
    }

    public final Single<T> doOnSubscribe(Action0 action0) {
        return create(new SingleDoOnSubscribe(this.onSubscribe, action0));
    }

    public final Single<T> doOnSuccess(Action1<? super T> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, action1, Actions.empty()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    public final Single<T> doOnUnsubscribe(Action0 action0) {
        return create(new SingleDoOnUnsubscribe(this.onSubscribe, action0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Single<R> flatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarFlatMap(func1) : merge(map(func1));
    }

    public final Completable flatMapCompletable(Func1<? super T, ? extends Completable> func1) {
        return Completable.create(new CompletableFlatMapSingleToCompletable(this, func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> flatMapObservable(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.merge(asObservable(map(func1)));
    }

    public final <R> Single<R> lift(Observable.Operator<? extends R, ? super T> operator) {
        return create(new SingleLiftObservableOperator(this.onSubscribe, operator));
    }

    public final <R> Single<R> map(Func1<? super T, ? extends R> func1) {
        return create(new SingleOnSubscribeMap(this, func1));
    }

    public final Observable<T> mergeWith(Single<? extends T> single) {
        return merge(this, single);
    }

    public final Single<T> observeOn(Scheduler scheduler) {
        if (this instanceof ScalarSynchronousSingle) {
            return ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler);
        }
        Objects.requireNonNull(scheduler, "scheduler is null");
        return create(new SingleObserveOn(this.onSubscribe, scheduler));
    }

    public final Single<T> onErrorResumeNext(Single<? extends T> single) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withOther(this, single));
    }

    public final Single<T> onErrorReturn(Func1<Throwable, ? extends T> func1) {
        return create(new SingleOnErrorReturn(this.onSubscribe, func1));
    }

    public final Single<T> retry() {
        return toObservable().retry().toSingle();
    }

    public final Single<T> retryWhen(Func1<Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return toObservable().retryWhen(func1).toSingle();
    }

    public final Subscription subscribe() {
        return subscribe(Actions.empty(), Actions.errorNotImplemented());
    }

    public final Single<T> subscribeOn(final Scheduler scheduler) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler) : create(new OnSubscribe<T>() { // from class: rx.Single.13
            @Override // p147rx.functions.Action1
            public void call(final SingleSubscriber<? super T> singleSubscriber) {
                final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                singleSubscriber.add(workerCreateWorker);
                workerCreateWorker.schedule(new Action0() { // from class: rx.Single.13.1
                    @Override // p147rx.functions.Action0
                    public void call() {
                        SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.Single.13.1.1
                            @Override // p147rx.SingleSubscriber
                            public void onError(Throwable th) {
                                try {
                                    singleSubscriber.onError(th);
                                } finally {
                                    workerCreateWorker.unsubscribe();
                                }
                            }

                            @Override // p147rx.SingleSubscriber
                            public void onSuccess(T t3) {
                                try {
                                    singleSubscriber.onSuccess(t3);
                                } finally {
                                    workerCreateWorker.unsubscribe();
                                }
                            }
                        };
                        singleSubscriber.add(singleSubscriber2);
                        Single.this.subscribe(singleSubscriber2);
                    }
                });
            }
        });
    }

    public final Single<T> takeUntil(Completable completable) {
        return create(new SingleTakeUntilCompletable(this.onSubscribe, completable));
    }

    public final AssertableSubscriber<T> test() {
        AssertableSubscriberObservable assertableSubscriberObservableCreate = AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe((Subscriber) assertableSubscriberObservableCreate);
        return assertableSubscriberObservableCreate;
    }

    public final Single<T> timeout(long j4, TimeUnit timeUnit) {
        return timeout(j4, timeUnit, null, Schedulers.computation());
    }

    /* renamed from: to */
    public final <R> R m10181to(Func1<? super Single<T>, R> func1) {
        return func1.call(this);
    }

    public final BlockingSingle<T> toBlocking() {
        return BlockingSingle.from(this);
    }

    public final Completable toCompletable() {
        return Completable.fromSingle(this);
    }

    public final Observable<T> toObservable() {
        return asObservable(this);
    }

    public final Subscription unsafeSubscribe(Subscriber<? super T> subscriber) {
        return unsafeSubscribe(subscriber, true);
    }

    @Experimental
    public final Single<T> unsubscribeOn(final Scheduler scheduler) {
        return create(new OnSubscribe<T>() { // from class: rx.Single.19
            @Override // p147rx.functions.Action1
            public void call(final SingleSubscriber<? super T> singleSubscriber) {
                final SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.Single.19.1
                    @Override // p147rx.SingleSubscriber
                    public void onError(Throwable th) {
                        singleSubscriber.onError(th);
                    }

                    @Override // p147rx.SingleSubscriber
                    public void onSuccess(T t3) {
                        singleSubscriber.onSuccess(t3);
                    }
                };
                singleSubscriber.add(Subscriptions.create(new Action0() { // from class: rx.Single.19.2
                    @Override // p147rx.functions.Action0
                    public void call() {
                        final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
                        workerCreateWorker.schedule(new Action0() { // from class: rx.Single.19.2.1
                            @Override // p147rx.functions.Action0
                            public void call() {
                                try {
                                    singleSubscriber2.unsubscribe();
                                } finally {
                                    workerCreateWorker.unsubscribe();
                                }
                            }
                        });
                    }
                }));
                Single.this.subscribe(singleSubscriber2);
            }
        });
    }

    public final <T2, R> Single<R> zipWith(Single<? extends T2> single, Func2<? super T, ? super T2, ? extends R> func2) {
        return zip(this, single, func2);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3));
    }

    public static <T> Single<T> from(Future<? extends T> future, long j4, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit is null");
        return create(new SingleFromFuture(future, j4, timeUnit));
    }

    public static <T> Observable<T> mergeDelayError(Observable<? extends Single<? extends T>> observable, int i4) {
        return (Observable<T>) observable.flatMapSingle(UtilityFunctions.identity(), true, i4);
    }

    private Subscription unsafeSubscribe(Subscriber<? super T> subscriber, boolean z3) {
        if (z3) {
            try {
                subscriber.onStart();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                try {
                    subscriber.onError(RxJavaHooks.onSingleError(th));
                    return Subscriptions.unsubscribed();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        RxJavaHooks.onSingleStart(this, this.onSubscribe).call(SingleLiftObservableOperator.wrap(subscriber));
        return RxJavaHooks.onSingleReturn(subscriber);
    }

    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z3) {
        Objects.requireNonNull(func0, "resourceFactory is null");
        Objects.requireNonNull(func1, "singleFactory is null");
        Objects.requireNonNull(action1, "disposeAction is null");
        return create(new SingleOnSubscribeUsing(func0, func1, action1, z3));
    }

    public static <T1, T2, T3, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, final Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3}, new FuncN<R>() { // from class: rx.Single.4
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func3.call(objArr[0], objArr[1], objArr[2]);
            }
        });
    }

    public final Single<T> delay(long j4, TimeUnit timeUnit) {
        return delay(j4, timeUnit, Schedulers.computation());
    }

    public final Single<T> onErrorResumeNext(Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withFunction(this, func1));
    }

    public final Single<T> retry(long j4) {
        return toObservable().retry(j4).toSingle();
    }

    public final Subscription subscribe(Action1<? super T> action1) {
        return subscribe(action1, Actions.errorNotImplemented());
    }

    public final <E> Single<T> takeUntil(Observable<? extends E> observable) {
        return create(new SingleTakeUntilObservable(this.onSubscribe, observable));
    }

    public final Single<T> timeout(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout(j4, timeUnit, null, scheduler);
    }

    @Deprecated
    protected Single(Observable.OnSubscribe<T> onSubscribe) {
        this.onSubscribe = RxJavaHooks.onCreate(new SingleFromObservable(onSubscribe));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4));
    }

    public static <T1, T2, T3, T4, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, final Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4}, new FuncN<R>() { // from class: rx.Single.5
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func4.call(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
    }

    public final Single<T> retry(Func2<Integer, Throwable, Boolean> func2) {
        return toObservable().retry(func2).toSingle();
    }

    public final Subscription subscribe(final Action1<? super T> action1, final Action1<Throwable> action12) {
        if (action1 == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (action12 != null) {
            return subscribe(new SingleSubscriber<T>() { // from class: rx.Single.11
                @Override // p147rx.SingleSubscriber
                public final void onError(Throwable th) {
                    try {
                        action12.call(th);
                    } finally {
                        unsubscribe();
                    }
                }

                @Override // p147rx.SingleSubscriber
                public final void onSuccess(T t3) {
                    try {
                        action1.call(t3);
                    } finally {
                        unsubscribe();
                    }
                }
            });
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final <E> Single<T> takeUntil(Single<? extends E> single) {
        return create(new SingleTakeUntilSingle(this.onSubscribe, single));
    }

    public final Single<T> timeout(long j4, TimeUnit timeUnit, Single<? extends T> single) {
        return timeout(j4, timeUnit, single, Schedulers.computation());
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5));
    }

    public static <T> Single<T> from(Future<? extends T> future, Scheduler scheduler) {
        return from(future).subscribeOn(scheduler);
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.merge(asObservable(single), asObservable(single2));
    }

    public static <T1, T2, T3, T4, T5, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, final Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5}, new FuncN<R>() { // from class: rx.Single.6
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func5.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
    }

    public final Single<T> timeout(long j4, TimeUnit timeUnit, Single<? extends T> single, Scheduler scheduler) {
        if (single == null) {
            single = defer(new Func0<Single<T>>() { // from class: rx.Single.14
                @Override // p147rx.functions.Func0, java.util.concurrent.Callable
                public Single<T> call() {
                    return Single.error(new TimeoutException());
                }
            });
        }
        return create(new SingleTimeout(this.onSubscribe, j4, timeUnit, scheduler, single.onSubscribe));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, final Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6}, new FuncN<R>() { // from class: rx.Single.7
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func6.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, final Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7}, new FuncN<R>() { // from class: rx.Single.8
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func7.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
    }

    public final Subscription subscribe(final Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        return subscribe(new SingleSubscriber<T>() { // from class: rx.Single.12
            @Override // p147rx.SingleSubscriber
            public void onError(Throwable th) {
                observer.onError(th);
            }

            @Override // p147rx.SingleSubscriber
            public void onSuccess(T t3) {
                observer.onNext(t3);
                observer.onCompleted();
            }
        });
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, final Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8}, new FuncN<R>() { // from class: rx.Single.9
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func8.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.concat(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8), asObservable(single9));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, Single<? extends T9> single9, final Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8, single9}, new FuncN<R>() { // from class: rx.Single.10
            @Override // p147rx.functions.FuncN
            public R call(Object... objArr) {
                return (R) func9.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
        });
    }

    public final Subscription subscribe(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onStart();
            if (!(subscriber instanceof SafeSubscriber)) {
                return unsafeSubscribe(new SafeSubscriber(subscriber), false);
            }
            return unsafeSubscribe(subscriber, true);
        }
        throw new IllegalArgumentException("observer can not be null");
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7));
    }

    public static <R> Single<R> zip(Iterable<? extends Single<?>> iterable, FuncN<? extends R> funcN) {
        return SingleOperatorZip.zip(iterableToArray(iterable), funcN);
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.merge(asObservable(single), asObservable(single2), asObservable(single3), asObservable(single4), asObservable(single5), asObservable(single6), asObservable(single7), asObservable(single8), asObservable(single9));
    }

    public static <T> Observable<T> merge(Observable<? extends Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T> Observable<T> merge(Observable<? extends Single<? extends T>> observable, int i4) {
        return (Observable<T>) observable.flatMapSingle(UtilityFunctions.identity(), false, i4);
    }

    public final Subscription subscribe(SingleSubscriber<? super T> singleSubscriber) {
        if (singleSubscriber != null) {
            try {
                RxJavaHooks.onSingleStart(this, this.onSubscribe).call(singleSubscriber);
                return RxJavaHooks.onSingleReturn(singleSubscriber);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                try {
                    singleSubscriber.onError(RxJavaHooks.onSingleError(th));
                    return Subscriptions.empty();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        throw new IllegalArgumentException("te is null");
    }
}
