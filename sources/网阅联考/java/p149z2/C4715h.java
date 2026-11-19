package p149z2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.BufferedSink;
import p121s2.AbstractC4550b;
import p149z2.C4709b;

/* renamed from: z2.h */
/* loaded from: classes2.dex */
public final class C4715h implements Closeable {

    /* renamed from: a */
    public final Buffer f6262a;

    /* renamed from: b */
    public int f6263b;

    /* renamed from: c */
    public boolean f6264c;

    /* renamed from: d */
    public final C4709b.b f6265d;

    /* renamed from: e */
    public final BufferedSink f6266e;

    /* renamed from: f */
    public final boolean f6267f;

    /* renamed from: h */
    public static final a f6261h = new a(null);

    /* renamed from: g */
    public static final Logger f6260g = Logger.getLogger(C4710c.class.getName());

    /* renamed from: z2.h$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4715h(BufferedSink sink, boolean z3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6266e = sink;
        this.f6267f = z3;
        Buffer buffer = new Buffer();
        this.f6262a = buffer;
        this.f6263b = 16384;
        this.f6265d = new C4709b.b(0, false, buffer, 3, null);
    }

    /* renamed from: a */
    public final synchronized void m6890a(C4718k peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.f6264c) {
            throw new IOException("closed");
        }
        this.f6263b = peerSettings.m6919e(this.f6263b);
        if (peerSettings.m6916b() != -1) {
            this.f6265d.m6736e(peerSettings.m6916b());
        }
        m6894e(0, 0, 4, 1);
        this.f6266e.flush();
    }

    /* renamed from: b */
    public final synchronized void m6891b() {
        if (this.f6264c) {
            throw new IOException("closed");
        }
        if (this.f6267f) {
            Logger logger = f6260g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC4550b.m6235q(">> CONNECTION " + C4710c.f6098a.hex(), new Object[0]));
            }
            this.f6266e.write(C4710c.f6098a);
            this.f6266e.flush();
        }
    }

    /* renamed from: c */
    public final synchronized void m6892c(boolean z3, int i4, Buffer buffer, int i5) {
        if (this.f6264c) {
            throw new IOException("closed");
        }
        m6893d(i4, z3 ? 1 : 0, buffer, i5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f6264c = true;
        this.f6266e.close();
    }

    /* renamed from: d */
    public final void m6893d(int i4, int i5, Buffer buffer, int i6) throws IOException {
        m6894e(i4, i6, 0, i5);
        if (i6 > 0) {
            BufferedSink bufferedSink = this.f6266e;
            Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, i6);
        }
    }

    /* renamed from: e */
    public final void m6894e(int i4, int i5, int i6, int i7) throws IOException {
        Logger logger = f6260g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C4710c.f6102e.m6742c(false, i4, i5, i6, i7));
        }
        if (!(i5 <= this.f6263b)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f6263b + ": " + i5).toString());
        }
        if (!((((int) 2147483648L) & i4) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i4).toString());
        }
        AbstractC4550b.m6218U(this.f6266e, i5);
        this.f6266e.writeByte(i6 & 255);
        this.f6266e.writeByte(i7 & 255);
        this.f6266e.writeInt(i4 & Integer.MAX_VALUE);
    }

    /* renamed from: f */
    public final synchronized void m6895f(int i4, ErrorCode errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f6264c) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        m6894e(0, debugData.length + 8, 7, 0);
        this.f6266e.writeInt(i4);
        this.f6266e.writeInt(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.f6266e.write(debugData);
        }
        this.f6266e.flush();
    }

    public final synchronized void flush() {
        if (this.f6264c) {
            throw new IOException("closed");
        }
        this.f6266e.flush();
    }

    /* renamed from: g */
    public final synchronized void m6896g(boolean z3, int i4, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f6264c) {
            throw new IOException("closed");
        }
        this.f6265d.m6738g(headerBlock);
        long size = this.f6262a.size();
        long jMin = Math.min(this.f6263b, size);
        int i5 = size == jMin ? 4 : 0;
        if (z3) {
            i5 |= 1;
        }
        m6894e(i4, (int) jMin, 1, i5);
        this.f6266e.write(this.f6262a, jMin);
        if (size > jMin) {
            m6903n(i4, size - jMin);
        }
    }

    /* renamed from: h */
    public final int m6897h() {
        return this.f6263b;
    }

    /* renamed from: i */
    public final synchronized void m6898i(boolean z3, int i4, int i5) {
        if (this.f6264c) {
            throw new IOException("closed");
        }
        m6894e(0, 8, 6, z3 ? 1 : 0);
        this.f6266e.writeInt(i4);
        this.f6266e.writeInt(i5);
        this.f6266e.flush();
    }

    /* renamed from: j */
    public final synchronized void m6899j(int i4, int i5, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f6264c) {
            throw new IOException("closed");
        }
        this.f6265d.m6738g(requestHeaders);
        long size = this.f6262a.size();
        int iMin = (int) Math.min(this.f6263b - 4, size);
        long j4 = iMin;
        m6894e(i4, iMin + 4, 5, size == j4 ? 4 : 0);
        this.f6266e.writeInt(i5 & Integer.MAX_VALUE);
        this.f6266e.write(this.f6262a, j4);
        if (size > j4) {
            m6903n(i4, size - j4);
        }
    }

    /* renamed from: k */
    public final synchronized void m6900k(int i4, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f6264c) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        m6894e(i4, 4, 3, 0);
        this.f6266e.writeInt(errorCode.getHttpCode());
        this.f6266e.flush();
    }

    /* renamed from: l */
    public final synchronized void m6901l(C4718k settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (this.f6264c) {
            throw new IOException("closed");
        }
        int i4 = 0;
        m6894e(0, settings.m6923i() * 6, 4, 0);
        while (i4 < 10) {
            if (settings.m6920f(i4)) {
                this.f6266e.writeShort(i4 != 4 ? i4 != 7 ? i4 : 4 : 3);
                this.f6266e.writeInt(settings.m6915a(i4));
            }
            i4++;
        }
        this.f6266e.flush();
    }

    /* renamed from: m */
    public final synchronized void m6902m(int i4, long j4) {
        if (this.f6264c) {
            throw new IOException("closed");
        }
        if (!(j4 != 0 && j4 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        m6894e(i4, 4, 8, 0);
        this.f6266e.writeInt((int) j4);
        this.f6266e.flush();
    }

    /* renamed from: n */
    public final void m6903n(int i4, long j4) throws IOException {
        while (j4 > 0) {
            long jMin = Math.min(this.f6263b, j4);
            j4 -= jMin;
            m6894e(i4, (int) jMin, 9, j4 == 0 ? 4 : 0);
            this.f6266e.write(this.f6262a, jMin);
        }
    }
}
