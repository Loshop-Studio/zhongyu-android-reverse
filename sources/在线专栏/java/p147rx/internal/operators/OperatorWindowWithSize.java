package p147rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.functions.Action0;
import p147rx.internal.util.atomic.SpscLinkedArrayQueue;
import p147rx.subjects.Subject;
import p147rx.subjects.UnicastSubject;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class OperatorWindowWithSize<T> implements Observable.Operator<Observable<T>, T> {
    final int size;
    final int skip;

    static final class WindowExact<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> actual;
        final Subscription cancel;
        int index;
        final int size;
        Subject<T, T> window;
        final AtomicInteger wip = new AtomicInteger(1);

        public WindowExact(Subscriber<? super Observable<T>> subscriber, int i4) {
            this.actual = subscriber;
            this.size = i4;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.cancel = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
        }

        @Override // p147rx.functions.Action0
        public void call() {
            if (this.wip.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        Producer createProducer() {
            return new Producer() { // from class: rx.internal.operators.OperatorWindowWithSize.WindowExact.1
                @Override // p147rx.Producer
                public void request(long j4) {
                    if (j4 < 0) {
                        throw new IllegalArgumentException("n >= 0 required but it was " + j4);
                    }
                    if (j4 != 0) {
                        WindowExact.this.request(BackpressureUtils.multiplyCap(WindowExact.this.size, j4));
                    }
                }
            };
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onCompleted();
            }
            this.actual.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onError(th);
            }
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            int i4 = this.index;
            UnicastSubject unicastSubjectCreate = this.window;
            if (i4 == 0) {
                this.wip.getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.size, this);
                this.window = unicastSubjectCreate;
                this.actual.onNext(unicastSubjectCreate);
            }
            int i5 = i4 + 1;
            unicastSubjectCreate.onNext(t3);
            if (i5 != this.size) {
                this.index = i5;
                return;
            }
            this.index = 0;
            this.window = null;
            unicastSubjectCreate.onCompleted();
        }
    }

    static final class WindowOverlap<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> actual;
        final Subscription cancel;
        volatile boolean done;
        Throwable error;
        int index;
        int produced;
        final Queue<Subject<T, T>> queue;
        final int size;
        final int skip;
        final AtomicInteger wip = new AtomicInteger(1);
        final ArrayDeque<Subject<T, T>> windows = new ArrayDeque<>();
        final AtomicInteger drainWip = new AtomicInteger();
        final AtomicLong requested = new AtomicLong();

        final class WindowOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            WindowOverlapProducer() {
            }

            @Override // p147rx.Producer
            public void request(long j4) {
                if (j4 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j4);
                }
                if (j4 != 0) {
                    WindowOverlap windowOverlap = WindowOverlap.this;
                    if (get() || !compareAndSet(false, true)) {
                        WindowOverlap.this.request(BackpressureUtils.multiplyCap(windowOverlap.skip, j4));
                    } else {
                        windowOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(windowOverlap.skip, j4 - 1), windowOverlap.size));
                    }
                    BackpressureUtils.getAndAddRequest(windowOverlap.requested, j4);
                    windowOverlap.drain();
                }
            }
        }

        public WindowOverlap(Subscriber<? super Observable<T>> subscriber, int i4, int i5) {
            this.actual = subscriber;
            this.size = i4;
            this.skip = i5;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.cancel = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
            this.queue = new SpscLinkedArrayQueue((i4 + (i5 - 1)) / i5);
        }

        @Override // p147rx.functions.Action0
        public void call() {
            if (this.wip.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<? super Subject<T, T>> subscriber, Queue<Subject<T, T>> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z3) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                queue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z4) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        Producer createProducer() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            AtomicInteger atomicInteger = this.drainWip;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Observable<T>> subscriber = this.actual;
            Queue<Subject<T, T>> queue = this.queue;
            int iAddAndGet = 1;
            do {
                long j4 = this.requested.get();
                long j5 = 0;
                while (j5 != j4) {
                    boolean z3 = this.done;
                    Subject<T, T> subjectPoll = queue.poll();
                    boolean z4 = subjectPoll == null;
                    if (checkTerminated(z3, z4, subscriber, queue)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    subscriber.onNext(subjectPoll);
                    j5++;
                }
                if (j5 == j4 && checkTerminated(this.done, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                if (j5 != 0 && j4 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j5);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            Iterator<Subject<T, T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            Iterator<Subject<T, T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            int i4 = this.index;
            ArrayDeque<Subject<T, T>> arrayDeque = this.windows;
            if (i4 == 0 && !this.actual.isUnsubscribed()) {
                this.wip.getAndIncrement();
                UnicastSubject unicastSubjectCreate = UnicastSubject.create(16, this);
                arrayDeque.offer(unicastSubjectCreate);
                this.queue.offer(unicastSubjectCreate);
                drain();
            }
            Iterator<Subject<T, T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t3);
            }
            int i5 = this.produced + 1;
            if (i5 == this.size) {
                this.produced = i5 - this.skip;
                Subject<T, T> subjectPoll = arrayDeque.poll();
                if (subjectPoll != null) {
                    subjectPoll.onCompleted();
                }
            } else {
                this.produced = i5;
            }
            int i6 = i4 + 1;
            if (i6 == this.skip) {
                this.index = 0;
            } else {
                this.index = i6;
            }
        }
    }

    static final class WindowSkip<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> actual;
        final Subscription cancel;
        int index;
        final int size;
        final int skip;
        Subject<T, T> window;
        final AtomicInteger wip = new AtomicInteger(1);

        final class WindowSkipProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            WindowSkipProducer() {
            }

            @Override // p147rx.Producer
            public void request(long j4) {
                if (j4 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j4);
                }
                if (j4 != 0) {
                    WindowSkip windowSkip = WindowSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        windowSkip.request(BackpressureUtils.multiplyCap(j4, windowSkip.skip));
                    } else {
                        windowSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j4, windowSkip.size), BackpressureUtils.multiplyCap(windowSkip.skip - windowSkip.size, j4 - 1)));
                    }
                }
            }
        }

        public WindowSkip(Subscriber<? super Observable<T>> subscriber, int i4, int i5) {
            this.actual = subscriber;
            this.size = i4;
            this.skip = i5;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.cancel = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
        }

        @Override // p147rx.functions.Action0
        public void call() {
            if (this.wip.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        Producer createProducer() {
            return new WindowSkipProducer();
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onCompleted();
            }
            this.actual.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            Subject<T, T> subject = this.window;
            if (subject != null) {
                this.window = null;
                subject.onError(th);
            }
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            int i4 = this.index;
            UnicastSubject unicastSubjectCreate = this.window;
            if (i4 == 0) {
                this.wip.getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.size, this);
                this.window = unicastSubjectCreate;
                this.actual.onNext(unicastSubjectCreate);
            }
            int i5 = i4 + 1;
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t3);
            }
            if (i5 == this.size) {
                this.index = i5;
                this.window = null;
                unicastSubjectCreate.onCompleted();
            } else if (i5 == this.skip) {
                this.index = 0;
            } else {
                this.index = i5;
            }
        }
    }

    public OperatorWindowWithSize(int i4, int i5) {
        this.size = i4;
        this.skip = i5;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        int i4 = this.skip;
        int i5 = this.size;
        if (i4 == i5) {
            WindowExact windowExact = new WindowExact(subscriber, i5);
            subscriber.add(windowExact.cancel);
            subscriber.setProducer(windowExact.createProducer());
            return windowExact;
        }
        if (i4 > i5) {
            WindowSkip windowSkip = new WindowSkip(subscriber, i5, i4);
            subscriber.add(windowSkip.cancel);
            subscriber.setProducer(windowSkip.createProducer());
            return windowSkip;
        }
        WindowOverlap windowOverlap = new WindowOverlap(subscriber, i5, i4);
        subscriber.add(windowOverlap.cancel);
        subscriber.setProducer(windowOverlap.createProducer());
        return windowOverlap;
    }
}
