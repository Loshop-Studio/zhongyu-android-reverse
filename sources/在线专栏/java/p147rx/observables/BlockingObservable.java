package p147rx.observables;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.OnErrorNotImplementedException;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.functions.Actions;
import p147rx.functions.Func1;
import p147rx.internal.operators.BlockingOperatorLatest;
import p147rx.internal.operators.BlockingOperatorMostRecent;
import p147rx.internal.operators.BlockingOperatorNext;
import p147rx.internal.operators.BlockingOperatorToFuture;
import p147rx.internal.operators.BlockingOperatorToIterator;
import p147rx.internal.operators.NotificationLite;
import p147rx.internal.util.BlockingUtils;
import p147rx.internal.util.UtilityFunctions;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class BlockingObservable<T> {
    static final Object ON_START = new Object();
    static final Object SET_PRODUCER = new Object();
    static final Object UNSUBSCRIBE = new Object();

    /* renamed from: o */
    private final Observable<? extends T> f11805o;

    private BlockingObservable(Observable<? extends T> observable) {
        this.f11805o = observable;
    }

    private T blockForSingle(Observable<? extends T> observable) throws InterruptedException {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, observable.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.3
            @Override // p147rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                atomicReference.set(t3);
            }
        }));
        if (atomicReference2.get() != null) {
            Exceptions.propagate((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    public static <T> BlockingObservable<T> from(Observable<? extends T> observable) {
        return new BlockingObservable<>(observable);
    }

    public T first() {
        return blockForSingle(this.f11805o.first());
    }

    public T firstOrDefault(T t3) {
        return blockForSingle(this.f11805o.map(UtilityFunctions.identity()).firstOrDefault(t3));
    }

    public void forEach(final Action1<? super T> action1) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        BlockingUtils.awaitForComplete(countDownLatch, this.f11805o.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.1
            @Override // p147rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                atomicReference.set(th);
                countDownLatch.countDown();
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                action1.call(t3);
            }
        }));
        if (atomicReference.get() != null) {
            Exceptions.propagate((Throwable) atomicReference.get());
        }
    }

    public Iterator<T> getIterator() {
        return BlockingOperatorToIterator.toIterator(this.f11805o);
    }

    public T last() {
        return blockForSingle(this.f11805o.last());
    }

    public T lastOrDefault(T t3) {
        return blockForSingle(this.f11805o.map(UtilityFunctions.identity()).lastOrDefault(t3));
    }

    public Iterable<T> latest() {
        return BlockingOperatorLatest.latest(this.f11805o);
    }

    public Iterable<T> mostRecent(T t3) {
        return BlockingOperatorMostRecent.mostRecent(this.f11805o, t3);
    }

    public Iterable<T> next() {
        return BlockingOperatorNext.next(this.f11805o);
    }

    public T single() {
        return blockForSingle(this.f11805o.single());
    }

    public T singleOrDefault(T t3) {
        return blockForSingle(this.f11805o.map(UtilityFunctions.identity()).singleOrDefault(t3));
    }

    public void subscribe() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = {null};
        BlockingUtils.awaitForComplete(countDownLatch, this.f11805o.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.4
            @Override // p147rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                thArr[0] = th;
                countDownLatch.countDown();
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
            }
        }));
        Throwable th = thArr[0];
        if (th != null) {
            Exceptions.propagate(th);
        }
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.f11805o);
    }

    public Iterable<T> toIterable() {
        return new Iterable<T>() { // from class: rx.observables.BlockingObservable.2
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return BlockingObservable.this.getIterator();
            }
        };
    }

    public T first(Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f11805o.first(func1));
    }

    public T firstOrDefault(T t3, Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f11805o.filter(func1).map(UtilityFunctions.identity()).firstOrDefault(t3));
    }

    public T last(Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f11805o.last(func1));
    }

    public T lastOrDefault(T t3, Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f11805o.filter(func1).map(UtilityFunctions.identity()).lastOrDefault(t3));
    }

    public T single(Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f11805o.single(func1));
    }

    public T singleOrDefault(T t3, Func1<? super T, Boolean> func1) {
        return blockForSingle(this.f11805o.filter(func1).map(UtilityFunctions.identity()).singleOrDefault(t3));
    }

    public void subscribe(Observer<? super T> observer) {
        Object objPoll;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Subscription subscriptionSubscribe = this.f11805o.subscribe((Subscriber<? super Object>) new Subscriber<T>() { // from class: rx.observables.BlockingObservable.5
            @Override // p147rx.Observer
            public void onCompleted() {
                linkedBlockingQueue.offer(NotificationLite.completed());
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                linkedBlockingQueue.offer(NotificationLite.error(th));
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                linkedBlockingQueue.offer(NotificationLite.next(t3));
            }
        });
        do {
            try {
                objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    objPoll = linkedBlockingQueue.take();
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                observer.onError(e4);
                return;
            } finally {
                subscriptionSubscribe.unsubscribe();
            }
        } while (!NotificationLite.accept(observer, objPoll));
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final Producer[] producerArr = {null};
        Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.observables.BlockingObservable.6
            @Override // p147rx.Observer
            public void onCompleted() {
                linkedBlockingQueue.offer(NotificationLite.completed());
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                linkedBlockingQueue.offer(NotificationLite.error(th));
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                linkedBlockingQueue.offer(NotificationLite.next(t3));
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void onStart() {
                linkedBlockingQueue.offer(BlockingObservable.ON_START);
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producerArr[0] = producer;
                linkedBlockingQueue.offer(BlockingObservable.SET_PRODUCER);
            }
        };
        subscriber.add(subscriber2);
        subscriber.add(Subscriptions.create(new Action0() { // from class: rx.observables.BlockingObservable.7
            @Override // p147rx.functions.Action0
            public void call() {
                linkedBlockingQueue.offer(BlockingObservable.UNSUBSCRIBE);
            }
        }));
        this.f11805o.subscribe((Subscriber<? super Object>) subscriber2);
        while (!subscriber.isUnsubscribed()) {
            try {
                try {
                    Object objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                    if (subscriber.isUnsubscribed() || objPoll == UNSUBSCRIBE) {
                        break;
                    }
                    if (objPoll == ON_START) {
                        subscriber.onStart();
                    } else if (objPoll == SET_PRODUCER) {
                        subscriber.setProducer(producerArr[0]);
                    } else if (NotificationLite.accept(subscriber, objPoll)) {
                        return;
                    }
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    subscriber.onError(e4);
                }
            } finally {
                subscriber2.unsubscribe();
            }
        }
    }

    public void subscribe(Action1<? super T> action1) {
        subscribe(action1, new Action1<Throwable>() { // from class: rx.observables.BlockingObservable.8
            @Override // p147rx.functions.Action1
            public void call(Throwable th) {
                throw new OnErrorNotImplementedException(th);
            }
        }, Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action12) {
        subscribe(action1, action12, Actions.empty());
    }

    public void subscribe(final Action1<? super T> action1, final Action1<? super Throwable> action12, final Action0 action0) {
        subscribe(new Observer<T>() { // from class: rx.observables.BlockingObservable.9
            @Override // p147rx.Observer
            public void onCompleted() {
                action0.call();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                action12.call(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                action1.call(t3);
            }
        });
    }
}
