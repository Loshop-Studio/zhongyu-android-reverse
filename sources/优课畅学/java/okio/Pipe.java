package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j10) {
        this.maxBufferSize = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC9133u.m16132f(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j10 >= 1) {
            this.sink = new Sink() { // from class: okio.Pipe.sink.1
                private final Timeout timeout = new Timeout();

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return;
                        }
                        Sink foldedSink$okio = pipe.getFoldedSink$okio();
                        if (foldedSink$okio == null) {
                            if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            pipe.setSinkClosed$okio(true);
                            pipe.getCondition().signalAll();
                            foldedSink$okio = null;
                        }
                        C8736p c8736p = C8736p.f16368a;
                        lock.unlock();
                        if (foldedSink$okio != null) {
                            Pipe pipe2 = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe2.sink().timeout();
                            long jTimeoutNanos = timeout.timeoutNanos();
                            long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeout.timeout(jMinTimeout, timeUnit);
                            if (!timeout.hasDeadline()) {
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink$okio.close();
                                    timeout.timeout(jTimeoutNanos, timeUnit);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                    throw th;
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.close();
                                timeout.timeout(jTimeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            } catch (Throwable th2) {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (pipe.getSinkClosed$okio()) {
                            throw new IllegalStateException("closed");
                        }
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        Sink foldedSink$okio = pipe.getFoldedSink$okio();
                        if (foldedSink$okio == null) {
                            if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            foldedSink$okio = null;
                        }
                        C8736p c8736p = C8736p.f16368a;
                        lock.unlock();
                        if (foldedSink$okio != null) {
                            Pipe pipe2 = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe2.sink().timeout();
                            long jTimeoutNanos = timeout.timeoutNanos();
                            long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeout.timeout(jMinTimeout, timeUnit);
                            if (!timeout.hasDeadline()) {
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                }
                                try {
                                    foldedSink$okio.flush();
                                    timeout.timeout(jTimeoutNanos, timeUnit);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.clearDeadline();
                                    }
                                    throw th;
                                }
                            }
                            long jDeadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.flush();
                                timeout.timeout(jTimeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                            } catch (Throwable th2) {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                }

                @Override // okio.Sink
                public Timeout timeout() {
                    return this.timeout;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
                
                    r1 = p123h7.C8736p.f16368a;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
                
                    r0.unlock();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
                
                    if (r2 == null) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
                
                    r0 = r12.this$0;
                    r1 = r2.timeout();
                    r0 = r0.sink().timeout();
                    r3 = r1.timeoutNanos();
                    r5 = okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
                    r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                    r1.timeout(r5, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
                
                    if (r1.hasDeadline() == false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
                
                    r5 = r1.deadlineNanoTime();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
                
                    if (r0.hasDeadline() == false) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
                
                    r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
                
                    r2.write(r13, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
                
                    r1.timeout(r3, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
                
                    if (r0.hasDeadline() == false) goto L80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
                
                    r1.deadlineNanoTime(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
                
                    r13 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
                
                    r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
                
                    if (r0.hasDeadline() != false) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
                
                    r1.deadlineNanoTime(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
                
                    throw r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
                
                    if (r0.hasDeadline() == false) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
                
                    r1.deadlineNanoTime(r0.deadlineNanoTime());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
                
                    r2.write(r13, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
                
                    r1.timeout(r3, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
                
                    if (r0.hasDeadline() == false) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
                
                    r1.clearDeadline();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
                
                    r13 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
                
                    r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
                
                    if (r0.hasDeadline() != false) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
                
                    r1.clearDeadline();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
                
                    throw r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
                
                    return;
                 */
                @Override // okio.Sink
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void write(okio.Buffer r13, long r14) {
                    /*
                        Method dump skipped, instructions count: 291
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.C95761.write(okio.Buffer, long):void");
                }
            };
            this.source = new Source() { // from class: okio.Pipe.source.1
                private final Timeout timeout = new Timeout();

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        pipe.setSourceClosed$okio(true);
                        pipe.getCondition().signalAll();
                        C8736p c8736p = C8736p.f16368a;
                    } finally {
                        lock.unlock();
                    }
                }

                @Override // okio.Source
                public long read(Buffer sink, long j11) {
                    AbstractC9133u.m16133g(sink, "sink");
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (pipe.getSourceClosed$okio()) {
                            throw new IllegalStateException("closed");
                        }
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                        while (pipe.getBuffer$okio().size() == 0) {
                            if (pipe.getSinkClosed$okio()) {
                                lock.unlock();
                                return -1L;
                            }
                            this.timeout.awaitSignal(pipe.getCondition());
                            if (pipe.getCanceled$okio()) {
                                throw new IOException("canceled");
                            }
                        }
                        long j12 = pipe.getBuffer$okio().read(sink, j11);
                        pipe.getCondition().signalAll();
                        lock.unlock();
                        return j12;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }

                @Override // okio.Source
                public Timeout timeout() {
                    return this.timeout;
                }
            };
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    private final void forward(Sink sink, InterfaceC10570l interfaceC10570l) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long jTimeoutNanos = timeout.timeoutNanos();
        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(jMinTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                interfaceC10570l.invoke(sink);
                C8736p c8736p = C8736p.f16368a;
                AbstractC9131s.m16125b(1);
                timeout.timeout(jTimeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                AbstractC9131s.m16124a(1);
                return;
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            interfaceC10570l.invoke(sink);
            C8736p c8736p2 = C8736p.f16368a;
            AbstractC9131s.m16125b(1);
            timeout.timeout(jTimeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            AbstractC9131s.m16124a(1);
        } catch (Throwable th2) {
            AbstractC9131s.m16125b(1);
            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            AbstractC9131s.m16124a(1);
            throw th2;
        }
    }

    @InterfaceC8721a
    /* renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m27640deprecated_sink() {
        return this.sink;
    }

    @InterfaceC8721a
    /* renamed from: -deprecated_source, reason: not valid java name */
    public final Source m27641deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            C8736p c8736p = C8736p.f16368a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(Sink sink) {
        Buffer buffer;
        boolean z10;
        AbstractC9133u.m16133g(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                boolean z11 = this.sinkClosed;
                Buffer buffer2 = null;
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    buffer = null;
                    z10 = true;
                } else {
                    buffer = new Buffer();
                    Buffer buffer3 = this.buffer;
                    buffer.write(buffer3, buffer3.size());
                    this.condition.signalAll();
                    z10 = false;
                }
                C8736p c8736p = C8736p.f16368a;
                if (z10) {
                    if (z11) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (buffer == null) {
                    try {
                        AbstractC9133u.m16151y("sinkBuffer");
                    } catch (Throwable th) {
                        ReentrantLock reentrantLock = this.lock;
                        reentrantLock.lock();
                        try {
                            this.sourceClosed = true;
                            this.condition.signalAll();
                            C8736p c8736p2 = C8736p.f16368a;
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } else {
                    buffer2 = buffer;
                }
                sink.write(buffer2, buffer.size());
                sink.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z10) {
        this.canceled = z10;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z10) {
        this.sinkClosed = z10;
    }

    public final void setSourceClosed$okio(boolean z10) {
        this.sourceClosed = z10;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
