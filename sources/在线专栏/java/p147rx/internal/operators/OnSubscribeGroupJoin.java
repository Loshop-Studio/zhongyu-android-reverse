package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func1;
import p147rx.functions.Func2;
import p147rx.observers.SerializedObserver;
import p147rx.observers.SerializedSubscriber;
import p147rx.subjects.PublishSubject;
import p147rx.subscriptions.CompositeSubscription;
import p147rx.subscriptions.RefCountSubscription;

/* loaded from: classes2.dex */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements Observable.OnSubscribe<R> {
    final Observable<T1> left;
    final Func1<? super T1, ? extends Observable<D1>> leftDuration;
    final Func2<? super T1, ? super Observable<T2>, ? extends R> resultSelector;
    final Observable<T2> right;
    final Func1<? super T2, ? extends Observable<D2>> rightDuration;

    final class ResultManager extends HashMap<Integer, Observer<T2>> implements Subscription {
        private static final long serialVersionUID = -3035156013812425335L;
        final RefCountSubscription cancel;
        final CompositeSubscription group;
        boolean leftDone;
        int leftIds;
        boolean rightDone;
        int rightIds;
        final Map<Integer, T2> rightMap = new HashMap();
        final Subscriber<? super R> subscriber;

        final class LeftDurationObserver extends Subscriber<D1> {

            /* renamed from: id */
            final int f11777id;
            boolean once = true;

            public LeftDurationObserver(int i4) {
                this.f11777id = i4;
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                Observer<T2> observerRemove;
                if (this.once) {
                    this.once = false;
                    synchronized (ResultManager.this) {
                        observerRemove = ResultManager.this.leftMap().remove(Integer.valueOf(this.f11777id));
                    }
                    if (observerRemove != null) {
                        observerRemove.onCompleted();
                    }
                    ResultManager.this.group.remove(this);
                }
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                ResultManager.this.errorMain(th);
            }

            @Override // p147rx.Observer
            public void onNext(D1 d12) {
                onCompleted();
            }
        }

        final class LeftObserver extends Subscriber<T1> {
            LeftObserver() {
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    ResultManager resultManager = ResultManager.this;
                    resultManager.leftDone = true;
                    if (resultManager.rightDone) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                        ResultManager.this.leftMap().clear();
                        ResultManager.this.rightMap.clear();
                    } else {
                        arrayList = null;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                ResultManager.this.errorAll(th);
            }

            @Override // p147rx.Observer
            public void onNext(T1 t12) {
                int i4;
                ArrayList arrayList;
                try {
                    PublishSubject publishSubjectCreate = PublishSubject.create();
                    SerializedObserver serializedObserver = new SerializedObserver(publishSubjectCreate);
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i4 = resultManager.leftIds;
                        resultManager.leftIds = i4 + 1;
                        resultManager.leftMap().put(Integer.valueOf(i4), serializedObserver);
                    }
                    Observable observableUnsafeCreate = Observable.unsafeCreate(new WindowObservableFunc(publishSubjectCreate, ResultManager.this.cancel));
                    Observable<D1> observableCall = OnSubscribeGroupJoin.this.leftDuration.call(t12);
                    LeftDurationObserver leftDurationObserver = ResultManager.this.new LeftDurationObserver(i4);
                    ResultManager.this.group.add(leftDurationObserver);
                    observableCall.unsafeSubscribe(leftDurationObserver);
                    R rCall = OnSubscribeGroupJoin.this.resultSelector.call(t12, observableUnsafeCreate);
                    synchronized (ResultManager.this) {
                        arrayList = new ArrayList(ResultManager.this.rightMap.values());
                    }
                    ResultManager.this.subscriber.onNext(rCall);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        serializedObserver.onNext(it.next());
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        final class RightDurationObserver extends Subscriber<D2> {

            /* renamed from: id */
            final int f11778id;
            boolean once = true;

            public RightDurationObserver(int i4) {
                this.f11778id = i4;
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                if (this.once) {
                    this.once = false;
                    synchronized (ResultManager.this) {
                        ResultManager.this.rightMap.remove(Integer.valueOf(this.f11778id));
                    }
                    ResultManager.this.group.remove(this);
                }
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                ResultManager.this.errorMain(th);
            }

            @Override // p147rx.Observer
            public void onNext(D2 d22) {
                onCompleted();
            }
        }

        final class RightObserver extends Subscriber<T2> {
            RightObserver() {
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    ResultManager resultManager = ResultManager.this;
                    resultManager.rightDone = true;
                    if (resultManager.leftDone) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                        ResultManager.this.leftMap().clear();
                        ResultManager.this.rightMap.clear();
                    } else {
                        arrayList = null;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                ResultManager.this.errorAll(th);
            }

            @Override // p147rx.Observer
            public void onNext(T2 t22) {
                int i4;
                ArrayList arrayList;
                try {
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i4 = resultManager.rightIds;
                        resultManager.rightIds = i4 + 1;
                        resultManager.rightMap.put(Integer.valueOf(i4), t22);
                    }
                    Observable<D2> observableCall = OnSubscribeGroupJoin.this.rightDuration.call(t22);
                    RightDurationObserver rightDurationObserver = ResultManager.this.new RightDurationObserver(i4);
                    ResultManager.this.group.add(rightDurationObserver);
                    observableCall.unsafeSubscribe(rightDurationObserver);
                    synchronized (ResultManager.this) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Observer) it.next()).onNext(t22);
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public ResultManager(Subscriber<? super R> subscriber) {
            this.subscriber = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.group = compositeSubscription;
            this.cancel = new RefCountSubscription(compositeSubscription);
        }

        void complete(List<Observer<T2>> list) {
            if (list != null) {
                Iterator<Observer<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.subscriber.onCompleted();
                this.cancel.unsubscribe();
            }
        }

        void errorAll(Throwable th) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(leftMap().values());
                leftMap().clear();
                this.rightMap.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).onError(th);
            }
            this.subscriber.onError(th);
            this.cancel.unsubscribe();
        }

        void errorMain(Throwable th) {
            synchronized (this) {
                leftMap().clear();
                this.rightMap.clear();
            }
            this.subscriber.onError(th);
            this.cancel.unsubscribe();
        }

        public void init() {
            LeftObserver leftObserver = new LeftObserver();
            RightObserver rightObserver = new RightObserver();
            this.group.add(leftObserver);
            this.group.add(rightObserver);
            OnSubscribeGroupJoin.this.left.unsafeSubscribe(leftObserver);
            OnSubscribeGroupJoin.this.right.unsafeSubscribe(rightObserver);
        }

        @Override // p147rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancel.isUnsubscribed();
        }

        Map<Integer, Observer<T2>> leftMap() {
            return this;
        }

        @Override // p147rx.Subscription
        public void unsubscribe() {
            this.cancel.unsubscribe();
        }
    }

    static final class WindowObservableFunc<T> implements Observable.OnSubscribe<T> {
        final RefCountSubscription refCount;
        final Observable<T> underlying;

        final class WindowSubscriber extends Subscriber<T> {
            private final Subscription ref;
            final Subscriber<? super T> subscriber;

            public WindowSubscriber(Subscriber<? super T> subscriber, Subscription subscription) {
                super(subscriber);
                this.subscriber = subscriber;
                this.ref = subscription;
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                this.subscriber.onCompleted();
                this.ref.unsubscribe();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                this.subscriber.onError(th);
                this.ref.unsubscribe();
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                this.subscriber.onNext(t3);
            }
        }

        public WindowObservableFunc(Observable<T> observable, RefCountSubscription refCountSubscription) {
            this.refCount = refCountSubscription;
            this.underlying = observable;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            Subscription subscription = this.refCount.get();
            WindowSubscriber windowSubscriber = new WindowSubscriber(subscriber, subscription);
            windowSubscriber.add(subscription);
            this.underlying.unsafeSubscribe(windowSubscriber);
        }
    }

    public OnSubscribeGroupJoin(Observable<T1> observable, Observable<T2> observable2, Func1<? super T1, ? extends Observable<D1>> func1, Func1<? super T2, ? extends Observable<D2>> func12, Func2<? super T1, ? super Observable<T2>, ? extends R> func2) {
        this.left = observable;
        this.right = observable2;
        this.leftDuration = func1;
        this.rightDuration = func12;
        this.resultSelector = func2;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        ResultManager resultManager = new ResultManager(new SerializedSubscriber(subscriber));
        subscriber.add(resultManager);
        resultManager.init();
    }
}
