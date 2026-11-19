package p147rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.observers.SerializedObserver;
import p147rx.observers.SerializedSubscriber;
import p147rx.subjects.UnicastSubject;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class OperatorWindowWithTime<T> implements Observable.Operator<Observable<T>, T> {
    static final Object NEXT_SUBJECT = new Object();
    final Scheduler scheduler;
    final int size;
    final long timeshift;
    final long timespan;
    final TimeUnit unit;

    static final class CountedSerializedSubject<T> {
        final Observer<T> consumer;
        int count;
        final Observable<T> producer;

        public CountedSerializedSubject(Observer<T> observer, Observable<T> observable) {
            this.consumer = new SerializedObserver(observer);
            this.producer = observable;
        }
    }

    final class ExactSubscriber extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        boolean emitting;
        List<Object> queue;
        final Scheduler.Worker worker;
        final Object guard = new Object();
        volatile State<T> state = State.empty();

        public ExactSubscriber(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            this.child = new SerializedSubscriber(subscriber);
            this.worker = worker;
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.1
                @Override // p147rx.functions.Action0
                public void call() {
                    if (ExactSubscriber.this.state.consumer == null) {
                        ExactSubscriber.this.unsubscribe();
                    }
                }
            }));
        }

        void complete() {
            Observer<T> observer = this.state.consumer;
            this.state = this.state.clear();
            if (observer != null) {
                observer.onCompleted();
            }
            this.child.onCompleted();
            unsubscribe();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        
            return true;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean drain(java.util.List<java.lang.Object> r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != 0) goto L4
                return r0
            L4:
                java.util.Iterator r5 = r5.iterator()
            L8:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L3d
                java.lang.Object r1 = r5.next()
                java.lang.Object r2 = p147rx.internal.operators.OperatorWindowWithTime.NEXT_SUBJECT
                r3 = 0
                if (r1 != r2) goto L1e
                boolean r1 = r4.replaceSubject()
                if (r1 != 0) goto L8
                return r3
            L1e:
                boolean r2 = p147rx.internal.operators.NotificationLite.isError(r1)
                if (r2 == 0) goto L2c
                java.lang.Throwable r5 = p147rx.internal.operators.NotificationLite.getError(r1)
                r4.error(r5)
                goto L3d
            L2c:
                boolean r2 = p147rx.internal.operators.NotificationLite.isCompleted(r1)
                if (r2 == 0) goto L36
                r4.complete()
                goto L3d
            L36:
                boolean r1 = r4.emitValue(r1)
                if (r1 != 0) goto L8
                return r3
            L3d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.drain(java.util.List):boolean");
        }

        boolean emitValue(T t3) {
            State<T> next;
            State<T> state = this.state;
            if (state.consumer == null) {
                if (!replaceSubject()) {
                    return false;
                }
                state = this.state;
            }
            state.consumer.onNext(t3);
            if (state.count == OperatorWindowWithTime.this.size - 1) {
                state.consumer.onCompleted();
                next = state.clear();
            } else {
                next = state.next();
            }
            this.state = next;
            return true;
        }

        void error(Throwable th) {
            Observer<T> observer = this.state.consumer;
            this.state = this.state.clear();
            if (observer != null) {
                observer.onError(th);
            }
            this.child.onError(th);
            unsubscribe();
        }

        void nextWindow() throws Throwable {
            boolean z3;
            List<Object> list;
            synchronized (this.guard) {
                if (this.emitting) {
                    if (this.queue == null) {
                        this.queue = new ArrayList();
                    }
                    this.queue.add(OperatorWindowWithTime.NEXT_SUBJECT);
                    return;
                }
                boolean z4 = true;
                this.emitting = true;
                try {
                    if (!replaceSubject()) {
                        synchronized (this.guard) {
                            this.emitting = false;
                        }
                        return;
                    }
                    do {
                        try {
                            synchronized (this.guard) {
                                try {
                                    list = this.queue;
                                    if (list == null) {
                                        this.emitting = false;
                                        return;
                                    }
                                    this.queue = null;
                                } catch (Throwable th) {
                                    th = th;
                                    z4 = false;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        z3 = z4;
                                        th = th2;
                                        if (!z3) {
                                            synchronized (this.guard) {
                                                this.emitting = false;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } while (drain(list));
                    synchronized (this.guard) {
                        this.emitting = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z3 = false;
                }
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            synchronized (this.guard) {
                if (this.emitting) {
                    if (this.queue == null) {
                        this.queue = new ArrayList();
                    }
                    this.queue.add(NotificationLite.completed());
                    return;
                }
                List<Object> list = this.queue;
                this.queue = null;
                this.emitting = true;
                try {
                    drain(list);
                    complete();
                } catch (Throwable th) {
                    error(th);
                }
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            synchronized (this.guard) {
                if (this.emitting) {
                    this.queue = Collections.singletonList(NotificationLite.error(th));
                    return;
                }
                this.queue = null;
                this.emitting = true;
                error(th);
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) throws Throwable {
            List<Object> list;
            synchronized (this.guard) {
                if (this.emitting) {
                    if (this.queue == null) {
                        this.queue = new ArrayList();
                    }
                    this.queue.add(t3);
                    return;
                }
                boolean z3 = true;
                this.emitting = true;
                try {
                    if (!emitValue(t3)) {
                        synchronized (this.guard) {
                            this.emitting = false;
                        }
                        return;
                    }
                    do {
                        try {
                            synchronized (this.guard) {
                                try {
                                    list = this.queue;
                                    if (list == null) {
                                        this.emitting = false;
                                        return;
                                    }
                                    this.queue = null;
                                } catch (Throwable th) {
                                    th = th;
                                    z3 = false;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (!z3) {
                                            synchronized (this.guard) {
                                                this.emitting = false;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } while (drain(list));
                    synchronized (this.guard) {
                        this.emitting = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z3 = false;
                }
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        boolean replaceSubject() {
            Observer<T> observer = this.state.consumer;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.child.isUnsubscribed()) {
                this.state = this.state.clear();
                unsubscribe();
                return false;
            }
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            this.state = this.state.create(unicastSubjectCreate, unicastSubjectCreate);
            this.child.onNext(unicastSubjectCreate);
            return true;
        }

        void scheduleExact() {
            Scheduler.Worker worker = this.worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.2
                @Override // p147rx.functions.Action0
                public void call() throws Throwable {
                    ExactSubscriber.this.nextWindow();
                }
            };
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            worker.schedulePeriodically(action0, 0L, operatorWindowWithTime.timespan, operatorWindowWithTime.unit);
        }
    }

    final class InexactSubscriber extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        final List<CountedSerializedSubject<T>> chunks;
        boolean done;
        final Object guard;
        final Scheduler.Worker worker;

        public InexactSubscriber(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            super(subscriber);
            this.child = subscriber;
            this.worker = worker;
            this.guard = new Object();
            this.chunks = new LinkedList();
        }

        CountedSerializedSubject<T> createCountedSerializedSubject() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            return new CountedSerializedSubject<>(unicastSubjectCreate, unicastSubjectCreate);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                this.done = true;
                ArrayList arrayList = new ArrayList(this.chunks);
                this.chunks.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CountedSerializedSubject) it.next()).consumer.onCompleted();
                }
                this.child.onCompleted();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                this.done = true;
                ArrayList arrayList = new ArrayList(this.chunks);
                this.chunks.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CountedSerializedSubject) it.next()).consumer.onError(th);
                }
                this.child.onError(th);
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                ArrayList<CountedSerializedSubject> arrayList = new ArrayList(this.chunks);
                Iterator<CountedSerializedSubject<T>> it = this.chunks.iterator();
                while (it.hasNext()) {
                    CountedSerializedSubject<T> next = it.next();
                    int i4 = next.count + 1;
                    next.count = i4;
                    if (i4 == OperatorWindowWithTime.this.size) {
                        it.remove();
                    }
                }
                for (CountedSerializedSubject countedSerializedSubject : arrayList) {
                    countedSerializedSubject.consumer.onNext(t3);
                    if (countedSerializedSubject.count == OperatorWindowWithTime.this.size) {
                        countedSerializedSubject.consumer.onCompleted();
                    }
                }
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        void scheduleChunk() {
            Scheduler.Worker worker = this.worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.1
                @Override // p147rx.functions.Action0
                public void call() {
                    InexactSubscriber.this.startNewChunk();
                }
            };
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            long j4 = operatorWindowWithTime.timeshift;
            worker.schedulePeriodically(action0, j4, j4, operatorWindowWithTime.unit);
        }

        void startNewChunk() {
            final CountedSerializedSubject<T> countedSerializedSubjectCreateCountedSerializedSubject = createCountedSerializedSubject();
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                this.chunks.add(countedSerializedSubjectCreateCountedSerializedSubject);
                try {
                    this.child.onNext(countedSerializedSubjectCreateCountedSerializedSubject.producer);
                    Scheduler.Worker worker = this.worker;
                    Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.2
                        @Override // p147rx.functions.Action0
                        public void call() {
                            InexactSubscriber.this.terminateChunk(countedSerializedSubjectCreateCountedSerializedSubject);
                        }
                    };
                    OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
                    worker.schedule(action0, operatorWindowWithTime.timespan, operatorWindowWithTime.unit);
                } catch (Throwable th) {
                    onError(th);
                }
            }
        }

        void terminateChunk(CountedSerializedSubject<T> countedSerializedSubject) {
            boolean z3;
            synchronized (this.guard) {
                if (this.done) {
                    return;
                }
                Iterator<CountedSerializedSubject<T>> it = this.chunks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    } else if (it.next() == countedSerializedSubject) {
                        z3 = true;
                        it.remove();
                        break;
                    }
                }
                if (z3) {
                    countedSerializedSubject.consumer.onCompleted();
                }
            }
        }
    }

    static final class State<T> {
        static final State<Object> EMPTY = new State<>(null, null, 0);
        final Observer<T> consumer;
        final int count;
        final Observable<T> producer;

        public State(Observer<T> observer, Observable<T> observable, int i4) {
            this.consumer = observer;
            this.producer = observable;
            this.count = i4;
        }

        public static <T> State<T> empty() {
            return (State<T>) EMPTY;
        }

        public State<T> clear() {
            return empty();
        }

        public State<T> create(Observer<T> observer, Observable<T> observable) {
            return new State<>(observer, observable, 0);
        }

        public State<T> next() {
            return new State<>(this.consumer, this.producer, this.count + 1);
        }
    }

    public OperatorWindowWithTime(long j4, long j5, TimeUnit timeUnit, int i4, Scheduler scheduler) {
        this.timespan = j4;
        this.timeshift = j5;
        this.unit = timeUnit;
        this.size = i4;
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeshift) {
            ExactSubscriber exactSubscriber = new ExactSubscriber(subscriber, workerCreateWorker);
            exactSubscriber.add(workerCreateWorker);
            exactSubscriber.scheduleExact();
            return exactSubscriber;
        }
        InexactSubscriber inexactSubscriber = new InexactSubscriber(subscriber, workerCreateWorker);
        inexactSubscriber.add(workerCreateWorker);
        inexactSubscriber.startNewChunk();
        inexactSubscriber.scheduleChunk();
        return inexactSubscriber;
    }
}
