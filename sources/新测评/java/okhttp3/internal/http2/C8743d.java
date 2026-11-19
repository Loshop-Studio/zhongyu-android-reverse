package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.C8740a;
import okio.Buffer;
import okio.BufferedSink;
import p028b9.AbstractC5070d;
import p125i9.C7717b;
import p125i9.C7722g;

/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes5.dex */
public final class C8743d implements Closeable {

    /* renamed from: g */
    public static final a f14841g = new a(null);

    /* renamed from: h */
    public static final Logger f14842h = Logger.getLogger(C7717b.class.getName());

    /* renamed from: a */
    public final BufferedSink f14843a;

    /* renamed from: b */
    public final boolean f14844b;

    /* renamed from: c */
    public final Buffer f14845c;

    /* renamed from: d */
    public int f14846d;

    /* renamed from: e */
    public boolean f14847e;

    /* renamed from: f */
    public final C8740a.b f14848f;

    /* renamed from: okhttp3.internal.http2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C8743d(BufferedSink sink, boolean z9) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f14843a = sink;
        this.f14844b = z9;
        Buffer buffer = new Buffer();
        this.f14845c = buffer;
        this.f14846d = 16384;
        this.f14848f = new C8740a.b(0, false, buffer, 3, null);
    }

    /* renamed from: a */
    public final synchronized void m14597a(C7722g peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f14847e) {
                throw new IOException("closed");
            }
            this.f14846d = peerSettings.m12956e(this.f14846d);
            if (peerSettings.m12953b() != -1) {
                this.f14848f.m14487e(peerSettings.m12953b());
            }
            m14601i(0, 0, 4, 1);
            this.f14843a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f14847e = true;
        this.f14843a.close();
    }

    /* renamed from: f */
    public final synchronized void m14598f() {
        try {
            if (this.f14847e) {
                throw new IOException("closed");
            }
            if (this.f14844b) {
                Logger logger = f14842h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC5070d.m2655t(">> CONNECTION " + C7717b.f13100b.hex(), new Object[0]));
                }
                this.f14843a.write(C7717b.f13100b);
                this.f14843a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f14847e) {
            throw new IOException("closed");
        }
        this.f14843a.flush();
    }

    /* renamed from: g */
    public final synchronized void m14599g(boolean z9, int i10, Buffer buffer, int i11) {
        if (this.f14847e) {
            throw new IOException("closed");
        }
        m14600h(i10, z9 ? 1 : 0, buffer, i11);
    }

    /* renamed from: h */
    public final void m14600h(int i10, int i11, Buffer buffer, int i12) throws IOException {
        m14601i(i10, i12, 0, i11);
        if (i12 > 0) {
            BufferedSink bufferedSink = this.f14843a;
            Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, i12);
        }
    }

    /* renamed from: i */
    public final void m14601i(int i10, int i11, int i12, int i13) throws IOException {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f14842h;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(C7717b.f13099a.m12895c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f14846d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f14846d + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        AbstractC5070d.m2635Z(this.f14843a, i15);
        this.f14843a.writeByte(i16 & 255);
        this.f14843a.writeByte(i17 & 255);
        this.f14843a.writeInt(Integer.MAX_VALUE & i14);
    }

    /* renamed from: j */
    public final synchronized void m14602j(int i10, ErrorCode errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f14847e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m14601i(0, debugData.length + 8, 7, 0);
            this.f14843a.writeInt(i10);
            this.f14843a.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.f14843a.write(debugData);
            }
            this.f14843a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public final synchronized void m14603k(boolean z9, int i10, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f14847e) {
            throw new IOException("closed");
        }
        this.f14848f.m14489g(headerBlock);
        long size = this.f14845c.size();
        long jMin = Math.min(this.f14846d, size);
        int i11 = size == jMin ? 4 : 0;
        if (z9) {
            i11 |= 1;
        }
        m14601i(i10, (int) jMin, 1, i11);
        this.f14843a.write(this.f14845c, jMin);
        if (size > jMin) {
            m14610r(i10, size - jMin);
        }
    }

    /* renamed from: l */
    public final int m14604l() {
        return this.f14846d;
    }

    /* renamed from: m */
    public final synchronized void m14605m(boolean z9, int i10, int i11) {
        if (this.f14847e) {
            throw new IOException("closed");
        }
        m14601i(0, 8, 6, z9 ? 1 : 0);
        this.f14843a.writeInt(i10);
        this.f14843a.writeInt(i11);
        this.f14843a.flush();
    }

    /* renamed from: n */
    public final synchronized void m14606n(int i10, int i11, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f14847e) {
            throw new IOException("closed");
        }
        this.f14848f.m14489g(requestHeaders);
        long size = this.f14845c.size();
        int iMin = (int) Math.min(this.f14846d - 4, size);
        long j10 = iMin;
        m14601i(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f14843a.writeInt(i11 & Integer.MAX_VALUE);
        this.f14843a.write(this.f14845c, j10);
        if (size > j10) {
            m14610r(i10, size - j10);
        }
    }

    /* renamed from: o */
    public final synchronized void m14607o(int i10, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f14847e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m14601i(i10, 4, 3, 0);
        this.f14843a.writeInt(errorCode.getHttpCode());
        this.f14843a.flush();
    }

    /* renamed from: p */
    public final synchronized void m14608p(C7722g settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f14847e) {
                throw new IOException("closed");
            }
            int i10 = 0;
            m14601i(0, settings.m12960i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.m12957f(i10)) {
                    this.f14843a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f14843a.writeInt(settings.m12952a(i10));
                }
                i10++;
            }
            this.f14843a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: q */
    public final synchronized void m14609q(int i10, long j10) {
        if (this.f14847e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        m14601i(i10, 4, 8, 0);
        this.f14843a.writeInt((int) j10);
        this.f14843a.flush();
    }

    /* renamed from: r */
    public final void m14610r(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.f14846d, j10);
            j10 -= jMin;
            m14601i(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f14843a.write(this.f14845c, jMin);
        }
    }
}
