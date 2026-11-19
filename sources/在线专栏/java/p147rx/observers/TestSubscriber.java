package p147rx.observers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p147rx.Notification;
import p147rx.Observer;
import p147rx.Subscriber;
import p147rx.exceptions.CompositeException;

/* loaded from: classes2.dex */
public class TestSubscriber<T> extends Subscriber<T> {
    private static final Observer<Object> INERT = new Observer<Object>() { // from class: rx.observers.TestSubscriber.1
        @Override // p147rx.Observer
        public void onCompleted() {
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
        }

        @Override // p147rx.Observer
        public void onNext(Object obj) {
        }
    };
    private int completions;
    private final Observer<T> delegate;
    private final List<Throwable> errors;
    private volatile Thread lastSeenThread;
    private final CountDownLatch latch;
    private volatile int valueCount;
    private final List<T> values;

    public TestSubscriber(long j4) {
        this(INERT, j4);
    }

    private void assertItem(T t3, int i4) {
        T t4 = this.values.get(i4);
        if (t3 == null) {
            if (t4 != null) {
                assertionError("Value at index: " + i4 + " expected: [null] but was: [" + t4 + "]\n");
                return;
            }
            return;
        }
        if (t3.equals(t4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value at index: ");
        sb.append(i4);
        sb.append(" expected: [");
        sb.append(t3);
        sb.append("] (");
        sb.append(t3.getClass().getSimpleName());
        sb.append(") but was: [");
        sb.append(t4);
        sb.append("] (");
        sb.append(t4 != null ? t4.getClass().getSimpleName() : "null");
        sb.append(")\n");
        assertionError(sb.toString());
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public void assertCompleted() {
        int i4 = this.completions;
        if (i4 == 0) {
            assertionError("Not completed!");
        } else if (i4 > 1) {
            assertionError("Completed multiple times: " + i4);
        }
    }

    public void assertError(Class<? extends Throwable> cls) {
        List<Throwable> list = this.errors;
        if (list.isEmpty()) {
            assertionError("No errors");
            return;
        }
        if (list.size() > 1) {
            AssertionError assertionError = new AssertionError("Multiple errors: " + list.size());
            assertionError.initCause(new CompositeException(list));
            throw assertionError;
        }
        if (cls.isInstance(list.get(0))) {
            return;
        }
        AssertionError assertionError2 = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
        assertionError2.initCause(list.get(0));
        throw assertionError2;
    }

    public void assertNoErrors() {
        if (getOnErrorEvents().isEmpty()) {
            return;
        }
        assertionError("Unexpected onError events");
    }

    public void assertNoTerminalEvent() {
        List<Throwable> list = this.errors;
        int i4 = this.completions;
        if (!list.isEmpty() || i4 > 0) {
            if (list.isEmpty()) {
                assertionError("Found " + list.size() + " errors and " + i4 + " completion events instead of none");
                return;
            }
            if (list.size() == 1) {
                assertionError("Found " + list.size() + " errors and " + i4 + " completion events instead of none");
                return;
            }
            assertionError("Found " + list.size() + " errors and " + i4 + " completion events instead of none");
        }
    }

    public void assertNoValues() {
        int size = this.values.size();
        if (size != 0) {
            assertionError("No onNext events expected yet some received: " + size);
        }
    }

    public void assertNotCompleted() {
        int i4 = this.completions;
        if (i4 == 1) {
            assertionError("Completed!");
        } else if (i4 > 1) {
            assertionError("Completed multiple times: " + i4);
        }
    }

    public void assertReceivedOnNext(List<T> list) {
        if (this.values.size() != list.size()) {
            assertionError("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.values.size() + ".\nProvided values: " + list + "\nActual values: " + this.values + "\n");
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            assertItem(list.get(i4), i4);
        }
    }

    public void assertTerminalEvent() {
        if (this.errors.size() > 1) {
            assertionError("Too many onError events: " + this.errors.size());
        }
        if (this.completions > 1) {
            assertionError("Too many onCompleted events: " + this.completions);
        }
        if (this.completions == 1 && this.errors.size() == 1) {
            assertionError("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.completions == 0 && this.errors.isEmpty()) {
            assertionError("No terminal events received.");
        }
    }

    public void assertUnsubscribed() {
        if (isUnsubscribed()) {
            return;
        }
        assertionError("Not unsubscribed.");
    }

    public void assertValue(T t3) {
        assertReceivedOnNext(Collections.singletonList(t3));
    }

    public void assertValueCount(int i4) {
        int size = this.values.size();
        if (size != i4) {
            assertionError("Number of onNext events differ; expected: " + i4 + ", actual: " + size);
        }
    }

    public void assertValues(T... tArr) {
        assertReceivedOnNext(Arrays.asList(tArr));
    }

    public final void assertValuesAndClear(T t3, T... tArr) {
        assertValueCount(tArr.length + 1);
        assertItem(t3, 0);
        int i4 = 0;
        while (i4 < tArr.length) {
            T t4 = tArr[i4];
            i4++;
            assertItem(t4, i4);
        }
        this.values.clear();
        this.valueCount = 0;
    }

    final void assertionError(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int i4 = this.completions;
        sb.append(i4);
        sb.append(" completion");
        if (i4 != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.errors.isEmpty()) {
            int size = this.errors.size();
            sb.append(" (+");
            sb.append(size);
            sb.append(" error");
            if (size != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (this.errors.isEmpty()) {
            throw assertionError;
        }
        if (this.errors.size() == 1) {
            assertionError.initCause(this.errors.get(0));
            throw assertionError;
        }
        assertionError.initCause(new CompositeException(this.errors));
        throw assertionError;
    }

    public void awaitTerminalEvent() throws InterruptedException {
        try {
            this.latch.await();
        } catch (InterruptedException e4) {
            throw new IllegalStateException("Interrupted", e4);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long j4, TimeUnit timeUnit) {
        try {
            if (this.latch.await(j4, timeUnit)) {
                return;
            }
            unsubscribe();
        } catch (InterruptedException unused) {
            unsubscribe();
        }
    }

    public final boolean awaitValueCount(int i4, long j4, TimeUnit timeUnit) throws InterruptedException {
        while (j4 != 0 && this.valueCount < i4) {
            try {
                timeUnit.sleep(1L);
                j4--;
            } catch (InterruptedException e4) {
                throw new IllegalStateException("Interrupted", e4);
            }
        }
        return this.valueCount >= i4;
    }

    public final int getCompletions() {
        return this.completions;
    }

    public Thread getLastSeenThread() {
        return this.lastSeenThread;
    }

    @Deprecated
    public List<Notification<T>> getOnCompletedEvents() {
        int i4 = this.completions;
        ArrayList arrayList = new ArrayList(i4 != 0 ? i4 : 1);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(Notification.createOnCompleted());
        }
        return arrayList;
    }

    public List<Throwable> getOnErrorEvents() {
        return this.errors;
    }

    public List<T> getOnNextEvents() {
        return this.values;
    }

    public final int getValueCount() {
        return this.valueCount;
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        try {
            this.completions++;
            this.lastSeenThread = Thread.currentThread();
            this.delegate.onCompleted();
        } finally {
            this.latch.countDown();
        }
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        try {
            this.lastSeenThread = Thread.currentThread();
            this.errors.add(th);
            this.delegate.onError(th);
        } finally {
            this.latch.countDown();
        }
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        this.lastSeenThread = Thread.currentThread();
        this.values.add(t3);
        this.valueCount = this.values.size();
        this.delegate.onNext(t3);
    }

    public void requestMore(long j4) {
        request(j4);
    }

    public TestSubscriber(Observer<T> observer, long j4) {
        this.latch = new CountDownLatch(1);
        Objects.requireNonNull(observer);
        this.delegate = observer;
        if (j4 >= 0) {
            request(j4);
        }
        this.values = new ArrayList();
        this.errors = new ArrayList();
    }

    public static <T> TestSubscriber<T> create(long j4) {
        return new TestSubscriber<>(j4);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer, long j4) {
        return new TestSubscriber<>(observer, j4);
    }

    public void awaitTerminalEvent(long j4, TimeUnit timeUnit) throws InterruptedException {
        try {
            this.latch.await(j4, timeUnit);
        } catch (InterruptedException e4) {
            throw new IllegalStateException("Interrupted", e4);
        }
    }

    public static <T> TestSubscriber<T> create(Subscriber<T> subscriber) {
        return new TestSubscriber<>((Subscriber) subscriber);
    }

    public static <T> TestSubscriber<T> create(Observer<T> observer) {
        return new TestSubscriber<>(observer);
    }

    public TestSubscriber(Subscriber<T> subscriber) {
        this(subscriber, -1L);
    }

    public TestSubscriber(Observer<T> observer) {
        this(observer, -1L);
    }

    public TestSubscriber() {
        this(-1L);
    }

    public void assertError(Throwable th) {
        List<Throwable> list = this.errors;
        if (list.isEmpty()) {
            assertionError("No errors");
            return;
        }
        if (list.size() > 1) {
            assertionError("Multiple errors");
            return;
        }
        if (th.equals(list.get(0))) {
            return;
        }
        assertionError("Exceptions differ; expected: " + th + ", actual: " + list.get(0));
    }
}
