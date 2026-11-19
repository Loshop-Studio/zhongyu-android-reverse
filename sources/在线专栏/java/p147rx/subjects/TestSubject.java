package p147rx.subjects;

import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.functions.Action0;
import p147rx.functions.Action1;
import p147rx.internal.operators.NotificationLite;
import p147rx.schedulers.TestScheduler;
import p147rx.subjects.SubjectSubscriptionManager;

/* loaded from: classes2.dex */
public final class TestSubject<T> extends Subject<T, T> {
    private final Scheduler.Worker innerScheduler;
    private final SubjectSubscriptionManager<T> state;

    protected TestSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager, TestScheduler testScheduler) {
        super(onSubscribe);
        this.state = subjectSubscriptionManager;
        this.innerScheduler = testScheduler.createWorker();
    }

    public static <T> TestSubject<T> create(TestScheduler testScheduler) {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        Action1<SubjectSubscriptionManager.SubjectObserver<T>> action1 = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.TestSubject.1
            @Override // p147rx.functions.Action1
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) throws Throwable {
                subjectObserver.emitFirst(subjectSubscriptionManager.getLatest());
            }
        };
        subjectSubscriptionManager.onAdded = action1;
        subjectSubscriptionManager.onTerminated = action1;
        return new TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    @Override // p147rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.observers().length > 0;
    }

    void internalOnCompleted() {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.state;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.completed())) {
                subjectObserver.onCompleted();
            }
        }
    }

    void internalOnError(Throwable th) {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.state;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.error(th))) {
                subjectObserver.onError(th);
            }
        }
    }

    void internalOnNext(T t3) {
        for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.observers()) {
            subjectObserver.onNext(t3);
        }
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        onCompleted(0L);
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        onError(th, 0L);
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        onNext(t3, 0L);
    }

    public void onCompleted(long j4) {
        this.innerScheduler.schedule(new Action0() { // from class: rx.subjects.TestSubject.2
            @Override // p147rx.functions.Action0
            public void call() {
                TestSubject.this.internalOnCompleted();
            }
        }, j4, TimeUnit.MILLISECONDS);
    }

    public void onError(final Throwable th, long j4) {
        this.innerScheduler.schedule(new Action0() { // from class: rx.subjects.TestSubject.3
            @Override // p147rx.functions.Action0
            public void call() {
                TestSubject.this.internalOnError(th);
            }
        }, j4, TimeUnit.MILLISECONDS);
    }

    public void onNext(final T t3, long j4) {
        this.innerScheduler.schedule(new Action0() { // from class: rx.subjects.TestSubject.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p147rx.functions.Action0
            public void call() {
                TestSubject.this.internalOnNext(t3);
            }
        }, j4, TimeUnit.MILLISECONDS);
    }
}
