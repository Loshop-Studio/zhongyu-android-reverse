package p147j9;

import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;
import p136i9.AbstractC8905e0;
import p136i9.C8927y;

/* renamed from: j9.b */
/* loaded from: classes5.dex */
public final class C9032b extends AbstractC8905e0 implements Source {

    /* renamed from: a */
    public final C8927y f17256a;

    /* renamed from: b */
    public final long f17257b;

    public C9032b(C8927y c8927y, long j10) {
        this.f17256a = c8927y;
        this.f17257b = j10;
    }

    @Override // p136i9.AbstractC8905e0
    public long contentLength() {
        return this.f17257b;
    }

    @Override // p136i9.AbstractC8905e0
    public C8927y contentType() {
        return this.f17256a;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j10) {
        AbstractC9133u.m16133g(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p136i9.AbstractC8905e0
    public BufferedSource source() {
        return Okio.buffer(this);
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // p136i9.AbstractC8905e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
