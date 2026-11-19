package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func1;
import p147rx.functions.Func2;
import p147rx.observers.SerializedSubscriber;
import p147rx.subscriptions.CompositeSubscription;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements Observable.OnSubscribe<R> {
    final Observable<TLeft> left;
    final Func1<TLeft, Observable<TLeftDuration>> leftDurationSelector;
    final Func2<TLeft, TRight, R> resultSelector;
    final Observable<TRight> right;
    final Func1<TRight, Observable<TRightDuration>> rightDurationSelector;

    final class ResultSink extends HashMap<Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        boolean leftDone;
        int leftId;
        boolean rightDone;
        int rightId;
        final Subscriber<? super R> subscriber;
        final CompositeSubscription group = new CompositeSubscription();
        final Map<Integer, TRight> rightMap = new HashMap();

        final class LeftSubscriber extends Subscriber<TLeft> {

            final class LeftDurationSubscriber extends Subscriber<TLeftDuration> {

                /* renamed from: id */
                final int f11779id;
                boolean once = true;

                public LeftDurationSubscriber(int i4) {
                    this.f11779id = i4;
                }

                @Override // p147rx.Observer
                public void onCompleted() {
                    if (this.once) {
                        this.once = false;
                        LeftSubscriber.this.expire(this.f11779id, this);
                    }
                }

                @Override // p147rx.Observer
                public void onError(Throwable th) {
                    LeftSubscriber.this.onError(th);
                }

                @Override // p147rx.Observer
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            LeftSubscriber() {
            }

            protected void expire(int i4, Subscription subscription) {
                boolean z3;
                synchronized (ResultSink.this) {
                    z3 = ResultSink.this.leftMap().remove(Integer.valueOf(i4)) != null && ResultSink.this.leftMap().isEmpty() && ResultSink.this.leftDone;
                }
                if (!z3) {
                    ResultSink.this.group.remove(subscription);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                boolean z3;
                synchronized (ResultSink.this) {
                    ResultSink resultSink = ResultSink.this;
                    z3 = true;
                    resultSink.leftDone = true;
                    if (!resultSink.rightDone && !resultSink.leftMap().isEmpty()) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    ResultSink.this.group.remove(this);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                ResultSink.this.subscriber.onError(th);
                ResultSink.this.subscriber.unsubscribe();
            }

            @Override // p147rx.Observer
            public void onNext(TLeft tleft) {
                int i4;
                ResultSink resultSink;
                int i5;
                synchronized (ResultSink.this) {
                    ResultSink resultSink2 = ResultSink.this;
                    i4 = resultSink2.leftId;
                    resultSink2.leftId = i4 + 1;
                    resultSink2.leftMap().put(Integer.valueOf(i4), tleft);
                    resultSink = ResultSink.this;
                    i5 = resultSink.rightId;
                }
                try {
                    Observable<TLeftDuration> observableCall = OnSubscribeJoin.this.leftDurationSelector.call(tleft);
                    LeftDurationSubscriber leftDurationSubscriber = new LeftDurationSubscriber(i4);
                    ResultSink.this.group.add(leftDurationSubscriber);
                    observableCall.unsafeSubscribe(leftDurationSubscriber);
                    ArrayList arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        for (Map.Entry<Integer, TRight> entry : ResultSink.this.rightMap.entrySet()) {
                            if (entry.getKey().intValue() < i5) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.resultSelector.call(tleft, it.next()));
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        final class RightSubscriber extends Subscriber<TRight> {

            final class RightDurationSubscriber extends Subscriber<TRightDuration> {

                /* renamed from: id */
                final int f11780id;
                boolean once = true;

                public RightDurationSubscriber(int i4) {
                    this.f11780id = i4;
                }

                @Override // p147rx.Observer
                public void onCompleted() {
                    if (this.once) {
                        this.once = false;
                        RightSubscriber.this.expire(this.f11780id, this);
                    }
                }

                @Override // p147rx.Observer
                public void onError(Throwable th) {
                    RightSubscriber.this.onError(th);
                }

                @Override // p147rx.Observer
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            RightSubscriber() {
            }

            void expire(int i4, Subscription subscription) {
                boolean z3;
                synchronized (ResultSink.this) {
                    z3 = ResultSink.this.rightMap.remove(Integer.valueOf(i4)) != null && ResultSink.this.rightMap.isEmpty() && ResultSink.this.rightDone;
                }
                if (!z3) {
                    ResultSink.this.group.remove(subscription);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                boolean z3;
                synchronized (ResultSink.this) {
                    ResultSink resultSink = ResultSink.this;
                    z3 = true;
                    resultSink.rightDone = true;
                    if (!resultSink.leftDone && !resultSink.rightMap.isEmpty()) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    ResultSink.this.group.remove(this);
                } else {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                }
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                ResultSink.this.subscriber.onError(th);
                ResultSink.this.subscriber.unsubscribe();
            }

            @Override // p147rx.Observer
            public void onNext(TRight tright) {
                int i4;
                int i5;
                synchronized (ResultSink.this) {
                    ResultSink resultSink = ResultSink.this;
                    i4 = resultSink.rightId;
                    resultSink.rightId = i4 + 1;
                    resultSink.rightMap.put(Integer.valueOf(i4), tright);
                    i5 = ResultSink.this.leftId;
                }
                ResultSink.this.group.add(new SerialSubscription());
                try {
                    Observable<TRightDuration> observableCall = OnSubscribeJoin.this.rightDurationSelector.call(tright);
                    RightDurationSubscriber rightDurationSubscriber = new RightDurationSubscriber(i4);
                    ResultSink.this.group.add(rightDurationSubscriber);
                    observableCall.unsafeSubscribe(rightDurationSubscriber);
                    ArrayList arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        for (Map.Entry<Integer, TLeft> entry : ResultSink.this.leftMap().entrySet()) {
                            if (entry.getKey().intValue() < i5) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.resultSelector.call(it.next(), tright));
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public ResultSink(Subscriber<? super R> subscriber) {
            this.subscriber = subscriber;
        }

        HashMap<Integer, TLeft> leftMap() {
            return this;
        }

        public void run() {
            this.subscriber.add(this.group);
            LeftSubscriber leftSubscriber = new LeftSubscriber();
            RightSubscriber rightSubscriber = new RightSubscriber();
            this.group.add(leftSubscriber);
            this.group.add(rightSubscriber);
            OnSubscribeJoin.this.left.unsafeSubscribe(leftSubscriber);
            OnSubscribeJoin.this.right.unsafeSubscribe(rightSubscriber);
        }
    }

    public OnSubscribeJoin(Observable<TLeft> observable, Observable<TRight> observable2, Func1<TLeft, Observable<TLeftDuration>> func1, Func1<TRight, Observable<TRightDuration>> func12, Func2<TLeft, TRight, R> func2) {
        this.left = observable;
        this.right = observable2;
        this.leftDurationSelector = func1;
        this.rightDurationSelector = func12;
        this.resultSelector = func2;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        new ResultSink(new SerializedSubscriber(subscriber)).run();
    }
}
