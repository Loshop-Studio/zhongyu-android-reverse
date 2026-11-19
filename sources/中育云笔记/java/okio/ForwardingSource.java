package okio;

import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes6.dex */
public abstract class ForwardingSource implements Source {
    private final Source delegate;

    public ForwardingSource(Source delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    @InterfaceC10770a
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m34180deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j10) {
        AbstractC9979u.m20294g(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
