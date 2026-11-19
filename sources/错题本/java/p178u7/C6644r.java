package p178u7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p139p7.AbstractC6396c;

/* renamed from: u7.r */
/* loaded from: classes4.dex */
public final class C6644r implements Source {

    /* renamed from: a */
    public final BufferedSource f11177a;

    /* renamed from: b */
    public int f11178b;

    /* renamed from: c */
    public int f11179c;

    /* renamed from: d */
    public int f11180d;

    /* renamed from: e */
    public int f11181e;

    /* renamed from: f */
    public int f11182f;

    public C6644r(BufferedSource source) {
        AbstractC5830k.m5330g(source, "source");
        this.f11177a = source;
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j7) throws IOException {
        int i;
        int i8;
        AbstractC5830k.m5330g(sink, "sink");
        do {
            int i9 = this.f11181e;
            BufferedSource bufferedSource = this.f11177a;
            if (i9 == 0) {
                bufferedSource.skip(this.f11182f);
                this.f11182f = 0;
                if ((this.f11179c & 4) == 0) {
                    i = this.f11180d;
                    int iM6058r = AbstractC6396c.m6058r(bufferedSource);
                    this.f11181e = iM6058r;
                    this.f11178b = iM6058r;
                    int i10 = bufferedSource.readByte() & 255;
                    this.f11179c = bufferedSource.readByte() & 255;
                    Logger logger = C6645s.f11183d;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = AbstractC6632f.f11119a;
                        logger.fine(AbstractC6632f.m6276a(true, this.f11180d, this.f11178b, i10, this.f11179c));
                    }
                    i8 = bufferedSource.readInt() & Integer.MAX_VALUE;
                    this.f11180d = i8;
                    if (i10 != 9) {
                        throw new IOException(i10 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long j8 = bufferedSource.read(sink, Math.min(j7, i9));
                if (j8 != -1) {
                    this.f11181e -= (int) j8;
                    return j8;
                }
            }
            return -1L;
        } while (i8 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f11177a.getTimeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
