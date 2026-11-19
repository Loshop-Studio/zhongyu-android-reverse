package p147rx.internal.observers;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.observers.AssertableSubscriber;
import p147rx.observers.TestSubscriber;

/* loaded from: classes.dex */
public class AssertableSubscriberObservable<T> extends Subscriber<T> implements AssertableSubscriber<T> {

    /* renamed from: ts */
    private final TestSubscriber<T> f11768ts;

    public AssertableSubscriberObservable(TestSubscriber<T> testSubscriber) {
        this.f11768ts = testSubscriber;
    }

    public static <T> AssertableSubscriberObservable<T> create(long j4) {
        TestSubscriber testSubscriber = new TestSubscriber(j4);
        AssertableSubscriberObservable<T> assertableSubscriberObservable = new AssertableSubscriberObservable<>(testSubscriber);
        assertableSubscriberObservable.add(testSubscriber);
        return assertableSubscriberObservable;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertCompleted() {
        this.f11768ts.assertCompleted();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertError(Class<? extends Throwable> cls) {
        this.f11768ts.assertError(cls);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertFailure(Class<? extends Throwable> cls, T... tArr) {
        this.f11768ts.assertValues(tArr);
        this.f11768ts.assertError(cls);
        this.f11768ts.assertNotCompleted();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        this.f11768ts.assertValues(tArr);
        this.f11768ts.assertError(cls);
        this.f11768ts.assertNotCompleted();
        String message = this.f11768ts.getOnErrorEvents().get(0).getMessage();
        if (message == str || (str != null && str.equals(message))) {
            return this;
        }
        throw new AssertionError("Error message differs. Expected: '" + str + "', Received: '" + message + "'");
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNoErrors() {
        this.f11768ts.assertNoErrors();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNoTerminalEvent() {
        this.f11768ts.assertNoTerminalEvent();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNoValues() {
        this.f11768ts.assertNoValues();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertNotCompleted() {
        this.f11768ts.assertNotCompleted();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertReceivedOnNext(List<T> list) {
        this.f11768ts.assertReceivedOnNext(list);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertResult(T... tArr) {
        this.f11768ts.assertValues(tArr);
        this.f11768ts.assertNoErrors();
        this.f11768ts.assertCompleted();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertTerminalEvent() {
        this.f11768ts.assertTerminalEvent();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertUnsubscribed() {
        this.f11768ts.assertUnsubscribed();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertValue(T t3) {
        this.f11768ts.assertValue(t3);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertValueCount(int i4) {
        this.f11768ts.assertValueCount(i4);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertValues(T... tArr) {
        this.f11768ts.assertValues(tArr);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> assertValuesAndClear(T t3, T... tArr) {
        this.f11768ts.assertValuesAndClear(t3, tArr);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> awaitTerminalEvent() throws InterruptedException {
        this.f11768ts.awaitTerminalEvent();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> awaitTerminalEventAndUnsubscribeOnTimeout(long j4, TimeUnit timeUnit) {
        this.f11768ts.awaitTerminalEventAndUnsubscribeOnTimeout(j4, timeUnit);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> awaitValueCount(int i4, long j4, TimeUnit timeUnit) {
        if (this.f11768ts.awaitValueCount(i4, j4, timeUnit)) {
            return this;
        }
        throw new AssertionError("Did not receive enough values in time. Expected: " + i4 + ", Actual: " + this.f11768ts.getValueCount());
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final int getCompletions() {
        return this.f11768ts.getCompletions();
    }

    @Override // p147rx.observers.AssertableSubscriber
    public Thread getLastSeenThread() {
        return this.f11768ts.getLastSeenThread();
    }

    @Override // p147rx.observers.AssertableSubscriber
    public List<Throwable> getOnErrorEvents() {
        return this.f11768ts.getOnErrorEvents();
    }

    @Override // p147rx.observers.AssertableSubscriber
    public List<T> getOnNextEvents() {
        return this.f11768ts.getOnNextEvents();
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final int getValueCount() {
        return this.f11768ts.getValueCount();
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.f11768ts.onCompleted();
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.f11768ts.onError(th);
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        this.f11768ts.onNext(t3);
    }

    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
    public void onStart() {
        this.f11768ts.onStart();
    }

    @Override // p147rx.observers.AssertableSubscriber
    public final AssertableSubscriber<T> perform(Action0 action0) {
        action0.call();
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> requestMore(long j4) {
        this.f11768ts.requestMore(j4);
        return this;
    }

    @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
    public void setProducer(Producer producer) {
        this.f11768ts.setProducer(producer);
    }

    public String toString() {
        return this.f11768ts.toString();
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> assertError(Throwable th) {
        this.f11768ts.assertError(th);
        return this;
    }

    @Override // p147rx.observers.AssertableSubscriber
    public AssertableSubscriber<T> awaitTerminalEvent(long j4, TimeUnit timeUnit) throws InterruptedException {
        this.f11768ts.awaitTerminalEvent(j4, timeUnit);
        return this;
    }
}
