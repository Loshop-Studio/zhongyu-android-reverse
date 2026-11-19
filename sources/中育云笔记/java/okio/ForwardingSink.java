package okio;

import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes6.dex */
public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    public ForwardingSink(Sink delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    @InterfaceC10770a
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final Sink m34179deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final Sink delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.Sink
    public void write(Buffer source, long j10) {
        AbstractC9979u.m20294g(source, "source");
        this.delegate.write(source, j10);
    }
}
