package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.Timeout
    public void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        AbstractC9979u.m20294g(condition, "condition");
        this.delegate.awaitSignal(condition);
    }

    @Override // okio.Timeout
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m34181setDelegate(Timeout timeout) {
        AbstractC9979u.m20294g(timeout, "<set-?>");
        this.delegate = timeout;
    }

    @Override // okio.Timeout
    public void throwIfReached() throws InterruptedIOException {
        this.delegate.throwIfReached();
    }

    @Override // okio.Timeout
    public Timeout timeout(long j10, TimeUnit unit) {
        AbstractC9979u.m20294g(unit, "unit");
        return this.delegate.timeout(j10, unit);
    }

    @Override // okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // okio.Timeout
    public void waitUntilNotified(Object monitor) throws InterruptedException, InterruptedIOException {
        AbstractC9979u.m20294g(monitor, "monitor");
        this.delegate.waitUntilNotified(monitor);
    }

    @Override // okio.Timeout
    public Timeout deadlineNanoTime(long j10) {
        return this.delegate.deadlineNanoTime(j10);
    }

    public final ForwardingTimeout setDelegate(Timeout delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
