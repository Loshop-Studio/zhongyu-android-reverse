package p147rx.observers;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscription;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public interface AssertableSubscriber<T> extends Observer<T>, Subscription {
    AssertableSubscriber<T> assertCompleted();

    AssertableSubscriber<T> assertError(Class<? extends Throwable> cls);

    AssertableSubscriber<T> assertError(Throwable th);

    AssertableSubscriber<T> assertFailure(Class<? extends Throwable> cls, T... tArr);

    AssertableSubscriber<T> assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr);

    AssertableSubscriber<T> assertNoErrors();

    AssertableSubscriber<T> assertNoTerminalEvent();

    AssertableSubscriber<T> assertNoValues();

    AssertableSubscriber<T> assertNotCompleted();

    AssertableSubscriber<T> assertReceivedOnNext(List<T> list);

    AssertableSubscriber<T> assertResult(T... tArr);

    AssertableSubscriber<T> assertTerminalEvent();

    AssertableSubscriber<T> assertUnsubscribed();

    AssertableSubscriber<T> assertValue(T t3);

    AssertableSubscriber<T> assertValueCount(int i4);

    AssertableSubscriber<T> assertValues(T... tArr);

    AssertableSubscriber<T> assertValuesAndClear(T t3, T... tArr);

    AssertableSubscriber<T> awaitTerminalEvent();

    AssertableSubscriber<T> awaitTerminalEvent(long j4, TimeUnit timeUnit);

    AssertableSubscriber<T> awaitTerminalEventAndUnsubscribeOnTimeout(long j4, TimeUnit timeUnit);

    AssertableSubscriber<T> awaitValueCount(int i4, long j4, TimeUnit timeUnit);

    int getCompletions();

    Thread getLastSeenThread();

    List<Throwable> getOnErrorEvents();

    List<T> getOnNextEvents();

    int getValueCount();

    @Override // p147rx.Subscription
    boolean isUnsubscribed();

    void onStart();

    AssertableSubscriber<T> perform(Action0 action0);

    AssertableSubscriber<T> requestMore(long j4);

    void setProducer(Producer producer);

    @Override // p147rx.Subscription
    void unsubscribe();
}
