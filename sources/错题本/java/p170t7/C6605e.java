package p170t7;

import androidx.collection.AbstractC0584a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import p139p7.AbstractC6396c;

/* renamed from: t7.e */
/* loaded from: classes4.dex */
public final class C6605e extends AbstractC6602b {

    /* renamed from: d */
    public long f11029d;

    /* renamed from: e */
    public final /* synthetic */ C6607g f11030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6605e(C6607g c6607g, long j7) {
        super(c6607g);
        this.f11030e = c6607g;
        this.f11029d = j7;
        if (j7 == 0) {
            m6250a();
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM6059s;
        if (this.f11020b) {
            return;
        }
        if (this.f11029d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = AbstractC6396c.f10486a;
            AbstractC5830k.m5330g(timeUnit, "timeUnit");
            try {
                zM6059s = AbstractC6396c.m6059s(this, 100);
            } catch (IOException unused) {
                zM6059s = false;
            }
            if (!zM6059s) {
                this.f11030e.f11033b.m5930k();
                m6250a();
            }
        }
        this.f11020b = true;
    }

    @Override // p170t7.AbstractC6602b, okio.Source
    public final long read(Buffer sink, long j7) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount < 0: ").toString());
        }
        if (this.f11020b) {
            throw new IllegalStateException("closed");
        }
        long j8 = this.f11029d;
        if (j8 == 0) {
            return -1L;
        }
        long j9 = super.read(sink, Math.min(j8, j7));
        if (j9 == -1) {
            this.f11030e.f11033b.m5930k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m6250a();
            throw protocolException;
        }
        long j10 = this.f11029d - j9;
        this.f11029d = j10;
        if (j10 == 0) {
            m6250a();
        }
        return j9;
    }
}
