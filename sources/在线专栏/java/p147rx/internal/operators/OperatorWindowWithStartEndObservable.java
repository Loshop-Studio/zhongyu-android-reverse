package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Subscriber;
import p147rx.functions.Func1;
import p147rx.observers.SerializedObserver;
import p147rx.observers.SerializedSubscriber;
import p147rx.subjects.UnicastSubject;
import p147rx.subscriptions.CompositeSubscription;

/* loaded from: classes2.dex */
public final class OperatorWindowWithStartEndObservable<T, U, V> implements Observable.Operator<Observable<T>, T> {
    final Func1<? super U, ? extends Observable<? extends V>> windowClosingSelector;
    final Observable<? extends U> windowOpenings;

    static final class SerializedSubject<T> {
        final Observer<T> consumer;
        final Observable<T> producer;

        public SerializedSubject(Observer<T> observer, Observable<T> observable) {
            this.consumer = new SerializedObserver(observer);
            this.producer = observable;
        }
    }

    final class SourceSubscriber extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        final CompositeSubscription composite;
        boolean done;
        final Object guard = new Object();
        final List<SerializedSubject<T>> chunks = new LinkedList();

        public SourceSubscriber(Subscriber<? super Observable<T>> subscriber, CompositeSubscription compositeSubscription) {
            this.child = new SerializedSubscriber(subscriber);
            this.composite = compositeSubscription;
        }

        void beginWindow(U u3) {
            final SerializedSubject<T> serializedSubjectCreateSerializedSubject = createSerializedSubject();
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                this.chunks.add(serializedSubjectCreateSerializedSubject);
                this.child.onNext(serializedSubjectCreateSerializedSubject.producer);
                try {
                    Observable<? extends V> observableCall = OperatorWindowWithStartEndObservable.this.windowClosingSelector.call(u3);
                    Subscriber<V> subscriber = new Subscriber<V>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.1
                        boolean once = true;

                        @Override // p147rx.Observer
                        public void onCompleted() {
                            if (this.once) {
                                this.once = false;
                                SourceSubscriber.this.endWindow(serializedSubjectCreateSerializedSubject);
                                SourceSubscriber.this.composite.remove(this);
                            }
                        }

                        @Override // p147rx.Observer
                        public void onError(Throwable th) {
                            SourceSubscriber.this.onError(th);
                        }

                        @Override // p147rx.Observer
                        public void onNext(V v3) {
                            onCompleted();
                        }
                    };
                    this.composite.add(subscriber);
                    observableCall.unsafeSubscribe(subscriber);
                } catch (Throwable th) {
                    onError(th);
                }
            }
        }

        SerializedSubject<T> createSerializedSubject() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            return new SerializedSubject<>(unicastSubjectCreate, unicastSubjectCreate);
        }

        void endWindow(SerializedSubject<T> serializedSubject) {
            boolean z3;
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                Iterator<SerializedSubject<T>> it = this.chunks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    } else if (it.next() == serializedSubject) {
                        z3 = true;
                        it.remove();
                        break;
                    }
                }
                if (z3) {
                    serializedSubject.consumer.onCompleted();
                }
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            try {
                synchronized (this.guard) {
                    if (this.done) {
                        return;
                    }
                    this.done = true;
                    ArrayList arrayList = new ArrayList(this.chunks);
                    this.chunks.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SerializedSubject) it.next()).consumer.onCompleted();
                    }
                    this.child.onCompleted();
                }
            } finally {
                this.composite.unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            try {
                synchronized (this.guard) {
                    if (this.done) {
                        return;
                    }
                    this.done = true;
                    ArrayList arrayList = new ArrayList(this.chunks);
                    this.chunks.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SerializedSubject) it.next()).consumer.onError(th);
                    }
                    this.child.onError(th);
                }
            } finally {
                this.composite.unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                Iterator it = new ArrayList(this.chunks).iterator();
                while (it.hasNext()) {
                    ((SerializedSubject) it.next()).consumer.onNext(t3);
                }
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorWindowWithStartEndObservable(Observable<? extends U> observable, Func1<? super U, ? extends Observable<? extends V>> func1) {
        this.windowOpenings = observable;
        this.windowClosingSelector = func1;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        subscriber.add(compositeSubscription);
        final SourceSubscriber sourceSubscriber = new SourceSubscriber(subscriber, compositeSubscription);
        Subscriber<U> subscriber2 = new Subscriber<U>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.1
            @Override // p147rx.Observer
            public void onCompleted() {
                sourceSubscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                sourceSubscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(U u3) {
                sourceSubscriber.beginWindow(u3);
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }
        };
        compositeSubscription.add(sourceSubscriber);
        compositeSubscription.add(subscriber2);
        this.windowOpenings.unsafeSubscribe(subscriber2);
        return sourceSubscriber;
    }
}
