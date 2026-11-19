package p170t7;

import androidx.collection.AbstractC0584a;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;

/* renamed from: t7.f */
/* loaded from: classes4.dex */
public final class C6606f extends AbstractC6602b {

    /* renamed from: d */
    public boolean f11031d;

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11020b) {
            return;
        }
        if (!this.f11031d) {
            m6250a();
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
        if (this.f11031d) {
            return -1L;
        }
        long j8 = super.read(sink, j7);
        if (j8 != -1) {
            return j8;
        }
        this.f11031d = true;
        m6250a();
        return -1L;
    }
}
