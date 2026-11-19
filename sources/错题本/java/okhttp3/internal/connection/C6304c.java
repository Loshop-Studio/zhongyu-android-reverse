package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* renamed from: okhttp3.internal.connection.c */
/* loaded from: classes4.dex */
public final class C6304c extends ForwardingSource {

    /* renamed from: a */
    public final long f10123a;

    /* renamed from: b */
    public long f10124b;

    /* renamed from: c */
    public boolean f10125c;

    /* renamed from: d */
    public boolean f10126d;

    /* renamed from: e */
    public boolean f10127e;

    /* renamed from: f */
    public final /* synthetic */ C6305d f10128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6304c(C6305d c6305d, Source delegate, long j7) {
        super(delegate);
        AbstractC5830k.m5330g(delegate, "delegate");
        this.f10128f = c6305d;
        this.f10123a = j7;
        this.f10125c = true;
        if (j7 == 0) {
            m5902a(null);
        }
    }

    /* renamed from: a */
    public final IOException m5902a(IOException iOException) {
        if (this.f10126d) {
            return iOException;
        }
        this.f10126d = true;
        if (iOException == null && this.f10125c) {
            this.f10125c = false;
        }
        return this.f10128f.m5903a(true, false, iOException);
    }

    @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10127e) {
            return;
        }
        this.f10127e = true;
        try {
            super.close();
            m5902a(null);
        } catch (IOException e) {
            throw m5902a(e);
        }
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j7) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        if (this.f10127e) {
            throw new IllegalStateException("closed");
        }
        try {
            long j8 = delegate().read(sink, j7);
            if (this.f10125c) {
                this.f10125c = false;
            }
            if (j8 == -1) {
                m5902a(null);
                return -1L;
            }
            long j9 = this.f10124b + j8;
            long j10 = this.f10123a;
            if (j10 == -1 || j9 <= j10) {
                this.f10124b = j9;
                if (j9 == j10) {
                    m5902a(null);
                }
                return j8;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j9);
        } catch (IOException e) {
            throw m5902a(e);
        }
    }
}
