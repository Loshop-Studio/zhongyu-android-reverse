package p170t7;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;

/* renamed from: t7.c */
/* loaded from: classes4.dex */
public final class C6603c implements Sink {

    /* renamed from: a */
    public final ForwardingTimeout f11022a;

    /* renamed from: b */
    public boolean f11023b;

    /* renamed from: c */
    public final /* synthetic */ C6607g f11024c;

    public C6603c(C6607g c6607g) {
        this.f11024c = c6607g;
        this.f11022a = new ForwardingTimeout(c6607g.f11035d.getTimeout());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f11023b) {
            return;
        }
        this.f11023b = true;
        this.f11024c.f11035d.writeUtf8("0\r\n\r\n");
        C6607g.m6251i(this.f11024c, this.f11022a);
        this.f11024c.f11036e = 3;
    }

    @Override // okio.Sink, java.io.Flushable
    public final synchronized void flush() {
        if (this.f11023b) {
            return;
        }
        this.f11024c.f11035d.flush();
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f11022a;
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j7) throws IOException {
        BufferedSink bufferedSink = this.f11024c.f11035d;
        AbstractC5830k.m5330g(source, "source");
        if (this.f11023b) {
            throw new IllegalStateException("closed");
        }
        if (j7 == 0) {
            return;
        }
        bufferedSink.writeHexadecimalUnsignedLong(j7);
        bufferedSink.writeUtf8("\r\n");
        bufferedSink.write(source, j7);
        bufferedSink.writeUtf8("\r\n");
    }
}
