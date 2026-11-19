package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* renamed from: okhttp3.internal.connection.b */
/* loaded from: classes4.dex */
public final class C6303b extends ForwardingSink {

    /* renamed from: a */
    public final long f10118a;

    /* renamed from: b */
    public boolean f10119b;

    /* renamed from: c */
    public long f10120c;

    /* renamed from: d */
    public boolean f10121d;

    /* renamed from: e */
    public final /* synthetic */ C6305d f10122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6303b(C6305d c6305d, Sink delegate, long j7) {
        super(delegate);
        AbstractC5830k.m5330g(delegate, "delegate");
        this.f10122e = c6305d;
        this.f10118a = j7;
    }

    /* renamed from: a */
    public final IOException m5901a(IOException iOException) {
        if (this.f10119b) {
            return iOException;
        }
        this.f10119b = true;
        return this.f10122e.m5903a(false, true, iOException);
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10121d) {
            return;
        }
        this.f10121d = true;
        long j7 = this.f10118a;
        if (j7 != -1 && this.f10120c != j7) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m5901a(null);
        } catch (IOException e) {
            throw m5901a(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw m5901a(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer source, long j7) throws IOException {
        AbstractC5830k.m5330g(source, "source");
        if (this.f10121d) {
            throw new IllegalStateException("closed");
        }
        long j8 = this.f10118a;
        if (j8 == -1 || this.f10120c + j7 <= j8) {
            try {
                super.write(source, j7);
                this.f10120c += j7;
                return;
            } catch (IOException e) {
                throw m5901a(e);
            }
        }
        throw new ProtocolException("expected " + j8 + " bytes but received " + (this.f10120c + j7));
    }
}
