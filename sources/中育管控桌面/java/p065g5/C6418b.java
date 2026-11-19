package p065g5;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;
import p058f5.AbstractC6364e0;
import p058f5.C6386y;

/* renamed from: g5.b */
/* loaded from: classes4.dex */
public final class C6418b extends AbstractC6364e0 implements Source {

    /* renamed from: a */
    public final C6386y f8091a;

    /* renamed from: b */
    public final long f8092b;

    public C6418b(C6386y c6386y, long j6) {
        this.f8091a = c6386y;
        this.f8092b = j6;
    }

    @Override // p058f5.AbstractC6364e0
    public long contentLength() {
        return this.f8092b;
    }

    @Override // p058f5.AbstractC6364e0
    public C6386y contentType() {
        return this.f8091a;
    }

    @Override // okio.Source
    public long read(Buffer sink, long j6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p058f5.AbstractC6364e0
    public BufferedSource source() {
        return Okio.buffer(this);
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return Timeout.NONE;
    }

    @Override // p058f5.AbstractC6364e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
