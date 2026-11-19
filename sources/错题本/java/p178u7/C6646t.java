package p178u7;

import java.io.InterruptedIOException;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import p139p7.AbstractC6396c;

/* renamed from: u7.t */
/* loaded from: classes4.dex */
public final class C6646t implements Sink {

    /* renamed from: a */
    public final boolean f11187a;

    /* renamed from: b */
    public final Buffer f11188b = new Buffer();

    /* renamed from: c */
    public boolean f11189c;

    /* renamed from: d */
    public final /* synthetic */ C6649w f11190d;

    public C6646t(C6649w c6649w, boolean z8) {
        this.f11190d = c6649w;
        this.f11187a = z8;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: a */
    public final void m6292a(boolean z8) {
        long jMin;
        boolean z9;
        C6649w c6649w = this.f11190d;
        synchronized (c6649w) {
            c6649w.f11209l.enter();
            while (c6649w.f11202e >= c6649w.f11203f && !this.f11187a && !this.f11189c) {
                try {
                    synchronized (c6649w) {
                        ErrorCode errorCode = c6649w.f11210m;
                        if (errorCode != null) {
                            break;
                        }
                        try {
                            c6649w.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    c6649w.f11209l.m6293a();
                    throw th;
                }
            }
            c6649w.f11209l.m6293a();
            c6649w.m6295b();
            jMin = Math.min(c6649w.f11203f - c6649w.f11202e, this.f11188b.size());
            c6649w.f11202e += jMin;
            z9 = z8 && jMin == this.f11188b.size();
        }
        this.f11190d.f11209l.enter();
        try {
            C6649w c6649w2 = this.f11190d;
            c6649w2.f11199b.m6283g(c6649w2.f11198a, z9, this.f11188b, jMin);
        } finally {
            this.f11190d.f11209l.m6293a();
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z8;
        C6649w c6649w = this.f11190d;
        byte[] bArr = AbstractC6396c.f10486a;
        synchronized (c6649w) {
            if (this.f11189c) {
                return;
            }
            synchronized (c6649w) {
                z8 = c6649w.f11210m == null;
            }
            if (!this.f11190d.f11207j.f11187a) {
                if (this.f11188b.size() > 0) {
                    while (this.f11188b.size() > 0) {
                        m6292a(true);
                    }
                } else if (z8) {
                    C6649w c6649w2 = this.f11190d;
                    c6649w2.f11199b.m6283g(c6649w2.f11198a, true, null, 0L);
                }
            }
            synchronized (this.f11190d) {
                this.f11189c = true;
            }
            this.f11190d.f11199b.f11166w.flush();
            this.f11190d.m6294a();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        C6649w c6649w = this.f11190d;
        byte[] bArr = AbstractC6396c.f10486a;
        synchronized (c6649w) {
            c6649w.m6295b();
        }
        while (this.f11188b.size() > 0) {
            m6292a(false);
            this.f11190d.f11199b.f11166w.flush();
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f11190d.f11209l;
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j7) {
        AbstractC5830k.m5330g(source, "source");
        byte[] bArr = AbstractC6396c.f10486a;
        Buffer buffer = this.f11188b;
        buffer.write(source, j7);
        while (buffer.size() >= 16384) {
            m6292a(false);
        }
    }
}
