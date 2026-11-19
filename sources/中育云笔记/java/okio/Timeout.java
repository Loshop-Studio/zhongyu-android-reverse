package okio;

import androidx.compose.animation.core.AnimationKt;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.time.DurationUnit;
import p181hd.InterfaceC9529a;
import p326rd.AbstractC10989d;
import p326rd.C10986a;

/* loaded from: classes6.dex */
public class Timeout {
    public static final Companion Companion = new Companion(null);
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        public Timeout deadlineNanoTime(long j10) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        public Timeout timeout(long j10, TimeUnit unit) {
            AbstractC9979u.m20294g(unit, "unit");
            return this;
        }
    };
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final long minTimeout(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        public final Timeout timeout(Timeout timeout, long j10, DurationUnit unit) {
            AbstractC9979u.m20294g(timeout, "<this>");
            AbstractC9979u.m20294g(unit, "unit");
            return timeout.timeout(j10, AbstractC10989d.m24233d(unit));
        }

        /* renamed from: timeout-HG0u8IE, reason: not valid java name */
        public final Timeout m34187timeoutHG0u8IE(Timeout timeout, long j10) {
            AbstractC9979u.m20294g(timeout, "$this$timeout");
            return timeout.timeout(C10986a.m24193q(j10), TimeUnit.NANOSECONDS);
        }

        private Companion() {
        }
    }

    public void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        AbstractC9979u.m20294g(condition, "condition");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(jTimeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final Timeout deadline(long j10, TimeUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        if (j10 > 0) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(j10));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j10).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(Timeout other, InterfaceC9529a block) {
        AbstractC9979u.m20294g(other, "other");
        AbstractC9979u.m20294g(block, "block");
        long jTimeoutNanos = timeoutNanos();
        long jMinTimeout = Companion.minTimeout(other.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jMinTimeout, timeUnit);
        if (!hasDeadline()) {
            if (other.hasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                T t10 = (T) block.invoke();
                AbstractC9977s.m20286b(1);
                timeout(jTimeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                AbstractC9977s.m20285a(1);
                return t10;
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            T t11 = (T) block.invoke();
            AbstractC9977s.m20286b(1);
            timeout(jTimeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            AbstractC9977s.m20285a(1);
            return t11;
        } catch (Throwable th2) {
            AbstractC9977s.m20286b(1);
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            AbstractC9977s.m20285a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout timeout(long j10, TimeUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        if (j10 >= 0) {
            this.timeoutNanos = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object monitor) throws InterruptedException, InterruptedIOException {
        AbstractC9979u.m20294g(monitor, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            long j10 = jTimeoutNanos / AnimationKt.MillisToNanos;
            monitor.wait(j10, (int) (jTimeoutNanos - (AnimationKt.MillisToNanos * j10)));
            if (System.nanoTime() - jNanoTime >= jTimeoutNanos && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public Timeout deadlineNanoTime(long j10) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j10;
        return this;
    }
}
