package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;
import p147rx.observers.SerializedSubscriber;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class OperatorDebounceWithTime<T> implements Observable.Operator<T, T> {
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    /* renamed from: rx.internal.operators.OperatorDebounceWithTime$1 */
    class C31831 extends Subscriber<T> {
        final Subscriber<?> self;
        final DebounceState<T> state;
        final /* synthetic */ SerializedSubscriber val$s;
        final /* synthetic */ SerialSubscription val$serial;
        final /* synthetic */ Scheduler.Worker val$worker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31831(Subscriber subscriber, SerialSubscription serialSubscription, Scheduler.Worker worker, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.val$serial = serialSubscription;
            this.val$worker = worker;
            this.val$s = serializedSubscriber;
            this.state = new DebounceState<>();
            this.self = this;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.state.emitAndComplete(this.val$s, this);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.val$s.onError(th);
            unsubscribe();
            this.state.clear();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            final int next = this.state.next(t3);
            SerialSubscription serialSubscription = this.val$serial;
            Scheduler.Worker worker = this.val$worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorDebounceWithTime.1.1
                @Override // p147rx.functions.Action0
                public void call() {
                    C31831 c31831 = C31831.this;
                    c31831.state.emit(next, c31831.val$s, c31831.self);
                }
            };
            OperatorDebounceWithTime operatorDebounceWithTime = OperatorDebounceWithTime.this;
            serialSubscription.set(worker.schedule(action0, operatorDebounceWithTime.timeout, operatorDebounceWithTime.unit));
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    static final class DebounceState<T> {
        boolean emitting;
        boolean hasValue;
        int index;
        boolean terminate;
        T value;

        DebounceState() {
        }

        public synchronized void clear() {
            this.index++;
            this.value = null;
            this.hasValue = false;
        }

        public void emit(int i4, Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                if (!this.emitting && this.hasValue && i4 == this.index) {
                    T t3 = this.value;
                    this.value = null;
                    this.hasValue = false;
                    this.emitting = true;
                    try {
                        subscriber.onNext(t3);
                        synchronized (this) {
                            if (this.terminate) {
                                subscriber.onCompleted();
                            } else {
                                this.emitting = false;
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber2, t3);
                    }
                }
            }
        }

        public void emitAndComplete(Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                if (this.emitting) {
                    this.terminate = true;
                    return;
                }
                T t3 = this.value;
                boolean z3 = this.hasValue;
                this.value = null;
                this.hasValue = false;
                this.emitting = true;
                if (z3) {
                    try {
                        subscriber.onNext(t3);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber2, t3);
                        return;
                    }
                }
                subscriber.onCompleted();
            }
        }

        public synchronized int next(T t3) {
            int i4;
            this.value = t3;
            this.hasValue = true;
            i4 = this.index + 1;
            this.index = i4;
            return i4;
        }
    }

    public OperatorDebounceWithTime(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.timeout = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(workerCreateWorker);
        serializedSubscriber.add(serialSubscription);
        return new C31831(subscriber, serialSubscription, workerCreateWorker, serializedSubscriber);
    }
}
