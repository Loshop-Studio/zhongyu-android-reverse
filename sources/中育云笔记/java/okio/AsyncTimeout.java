package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public class AsyncTimeout extends Timeout {
    private static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head;
    private static final ReentrantLock lock;
    private AsyncTimeout next;
    private int state;
    private long timeoutAt;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void insertIntoQueue(AsyncTimeout asyncTimeout, long j10, boolean z10) {
            if (AsyncTimeout.head == null) {
                AsyncTimeout.head = new AsyncTimeout();
                new Watchdog().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                asyncTimeout.timeoutAt = Math.min(j10, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                asyncTimeout.timeoutAt = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
            }
            long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
            AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
            AbstractC9979u.m20291d(asyncTimeout2);
            while (asyncTimeout2.next != null) {
                AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                AbstractC9979u.m20291d(asyncTimeout3);
                if (jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                    break;
                }
                asyncTimeout2 = asyncTimeout2.next;
                AbstractC9979u.m20291d(asyncTimeout2);
            }
            asyncTimeout.next = asyncTimeout2.next;
            asyncTimeout2.next = asyncTimeout;
            if (asyncTimeout2 == AsyncTimeout.head) {
                getCondition().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeFromQueue(AsyncTimeout asyncTimeout) {
            for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                if (asyncTimeout2.next == asyncTimeout) {
                    asyncTimeout2.next = asyncTimeout.next;
                    asyncTimeout.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final AsyncTimeout awaitTimeout() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            AbstractC9979u.m20291d(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                AbstractC9979u.m20291d(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            AbstractC9979u.m20291d(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            asyncTimeout2.state = 2;
            return asyncTimeout2;
        }

        public final Condition getCondition() {
            return AsyncTimeout.condition;
        }

        public final ReentrantLock getLock() {
            return AsyncTimeout.lock;
        }

        private Companion() {
        }
    }

    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock lock;
            AsyncTimeout asyncTimeoutAwaitTimeout;
            while (true) {
                try {
                    lock = AsyncTimeout.Companion.getLock();
                    lock.lock();
                    try {
                        asyncTimeoutAwaitTimeout = AsyncTimeout.Companion.awaitTimeout();
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutAwaitTimeout == AsyncTimeout.head) {
                    Companion unused2 = AsyncTimeout.Companion;
                    AsyncTimeout.head = null;
                    return;
                } else {
                    C10786q c10786q = C10786q.f26013a;
                    lock.unlock();
                    if (asyncTimeoutAwaitTimeout != null) {
                        asyncTimeoutAwaitTimeout.timedOut();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC9979u.m20293f(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j10) {
        return this.timeoutAt - j10;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // okio.Timeout
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                Companion.removeFromQueue(this);
                this.state = 3;
            }
            C10786q c10786q = C10786q.f26013a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.insertIntoQueue(this, jTimeoutNanos, zHasDeadline);
                C10786q c10786q = C10786q.f26013a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            Companion.removeFromQueue(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        AbstractC9979u.m20294g(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.close();
                    C10786q c10786q = C10786q.f26013a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!asyncTimeout.exit()) {
                        throw e10;
                    }
                    throw asyncTimeout.access$newTimeoutException(e10);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.flush();
                    C10786q c10786q = C10786q.f26013a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!asyncTimeout.exit()) {
                        throw e10;
                    }
                    throw asyncTimeout.access$newTimeoutException(e10);
                } finally {
                    asyncTimeout.exit();
                }
            }

            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(Buffer source, long j10) throws IOException {
                AbstractC9979u.m20294g(source, "source");
                SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    AbstractC9979u.m20291d(segment);
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += segment.limit - segment.pos;
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            segment = segment.next;
                            AbstractC9979u.m20291d(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    Sink sink2 = sink;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(source, j11);
                            C10786q c10786q = C10786q.f26013a;
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            j10 -= j11;
                        } catch (IOException e10) {
                            if (!asyncTimeout.exit()) {
                                throw e10;
                            }
                            throw asyncTimeout.access$newTimeoutException(e10);
                        }
                    } catch (Throwable th) {
                        asyncTimeout.exit();
                        throw th;
                    }
                }
            }

            @Override // okio.Sink
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }
        };
    }

    public final Source source(final Source source) {
        AbstractC9979u.m20294g(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    source2.close();
                    C10786q c10786q = C10786q.f26013a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!asyncTimeout.exit()) {
                        throw e10;
                    }
                    throw asyncTimeout.access$newTimeoutException(e10);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public long read(Buffer sink, long j10) throws IOException {
                AbstractC9979u.m20294g(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    long j11 = source2.read(sink, j10);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return j11;
                } catch (IOException e10) {
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(e10);
                    }
                    throw e10;
                } finally {
                    asyncTimeout.exit();
                }
            }

            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }

            @Override // okio.Source
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }
        };
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(InterfaceC9529a block) throws IOException {
        AbstractC9979u.m20294g(block, "block");
        enter();
        try {
            try {
                T t10 = (T) block.invoke();
                AbstractC9977s.m20286b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                AbstractC9977s.m20285a(1);
                return t10;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            exit();
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }
}
