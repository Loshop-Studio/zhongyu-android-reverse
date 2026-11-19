package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.http2.C10500a;
import okio.Buffer;
import okio.BufferedSink;
import re.C10995b;
import re.C11000g;

/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes6.dex */
public final class C10503d implements Closeable {

    /* renamed from: i */
    public static final a f25265i = new a(null);

    /* renamed from: j */
    public static final Logger f25266j = Logger.getLogger(C10995b.class.getName());

    /* renamed from: c */
    public final BufferedSink f25267c;

    /* renamed from: d */
    public final boolean f25268d;

    /* renamed from: e */
    public final Buffer f25269e;

    /* renamed from: f */
    public int f25270f;

    /* renamed from: g */
    public boolean f25271g;

    /* renamed from: h */
    public final C10500a.b f25272h;

    /* renamed from: okhttp3.internal.http2.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10503d(BufferedSink sink, boolean z10) {
        AbstractC9979u.m20294g(sink, "sink");
        this.f25267c = sink;
        this.f25268d = z10;
        Buffer buffer = new Buffer();
        this.f25269e = buffer;
        this.f25270f = 16384;
        this.f25272h = new C10500a.b(0, false, buffer, 3, null);
    }

    /* renamed from: a */
    public final synchronized void m22157a(C11000g peerSettings) {
        try {
            AbstractC9979u.m20294g(peerSettings, "peerSettings");
            if (this.f25271g) {
                throw new IOException("closed");
            }
            this.f25270f = peerSettings.m24310e(this.f25270f);
            if (peerSettings.m24307b() != -1) {
                this.f25272h.m22047e(peerSettings.m24307b());
            }
            m22161i(0, 0, 4, 1);
            this.f25267c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f25271g = true;
        this.f25267c.close();
    }

    /* renamed from: e */
    public final synchronized void m22158e() {
        try {
            if (this.f25271g) {
                throw new IOException("closed");
            }
            if (this.f25268d) {
                Logger logger = f25266j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC9920d.m20038t(">> CONNECTION " + C10995b.f26512b.hex(), new Object[0]));
                }
                this.f25267c.write(C10995b.f26512b);
                this.f25267c.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final synchronized void m22159f(boolean z10, int i10, Buffer buffer, int i11) {
        if (this.f25271g) {
            throw new IOException("closed");
        }
        m22160g(i10, z10 ? 1 : 0, buffer, i11);
    }

    public final synchronized void flush() {
        if (this.f25271g) {
            throw new IOException("closed");
        }
        this.f25267c.flush();
    }

    /* renamed from: g */
    public final void m22160g(int i10, int i11, Buffer buffer, int i12) {
        m22161i(i10, i12, 0, i11);
        if (i12 > 0) {
            BufferedSink bufferedSink = this.f25267c;
            AbstractC9979u.m20291d(buffer);
            bufferedSink.write(buffer, i12);
        }
    }

    /* renamed from: i */
    public final void m22161i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f25266j;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(C10995b.f26511a.m24249c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f25270f) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f25270f + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        AbstractC9920d.m20018Z(this.f25267c, i15);
        this.f25267c.writeByte(i16 & 255);
        this.f25267c.writeByte(i17 & 255);
        this.f25267c.writeInt(Integer.MAX_VALUE & i14);
    }

    /* renamed from: j */
    public final synchronized void m22162j(int i10, ErrorCode errorCode, byte[] debugData) {
        try {
            AbstractC9979u.m20294g(errorCode, "errorCode");
            AbstractC9979u.m20294g(debugData, "debugData");
            if (this.f25271g) {
                throw new IOException("closed");
            }
            if (errorCode.m22020c() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m22161i(0, debugData.length + 8, 7, 0);
            this.f25267c.writeInt(i10);
            this.f25267c.writeInt(errorCode.m22020c());
            if (!(debugData.length == 0)) {
                this.f25267c.write(debugData);
            }
            this.f25267c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public final synchronized void m22163k(boolean z10, int i10, List headerBlock) {
        AbstractC9979u.m20294g(headerBlock, "headerBlock");
        if (this.f25271g) {
            throw new IOException("closed");
        }
        this.f25272h.m22049g(headerBlock);
        long size = this.f25269e.size();
        long jMin = Math.min(this.f25270f, size);
        int i11 = size == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        m22161i(i10, (int) jMin, 1, i11);
        this.f25267c.write(this.f25269e, jMin);
        if (size > jMin) {
            m22170t(i10, size - jMin);
        }
    }

    /* renamed from: l */
    public final int m22164l() {
        return this.f25270f;
    }

    /* renamed from: m */
    public final synchronized void m22165m(boolean z10, int i10, int i11) {
        if (this.f25271g) {
            throw new IOException("closed");
        }
        m22161i(0, 8, 6, z10 ? 1 : 0);
        this.f25267c.writeInt(i10);
        this.f25267c.writeInt(i11);
        this.f25267c.flush();
    }

    /* renamed from: n */
    public final synchronized void m22166n(int i10, int i11, List requestHeaders) {
        AbstractC9979u.m20294g(requestHeaders, "requestHeaders");
        if (this.f25271g) {
            throw new IOException("closed");
        }
        this.f25272h.m22049g(requestHeaders);
        long size = this.f25269e.size();
        int iMin = (int) Math.min(this.f25270f - 4, size);
        long j10 = iMin;
        m22161i(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f25267c.writeInt(i11 & Integer.MAX_VALUE);
        this.f25267c.write(this.f25269e, j10);
        if (size > j10) {
            m22170t(i10, size - j10);
        }
    }

    /* renamed from: p */
    public final synchronized void m22167p(int i10, ErrorCode errorCode) {
        AbstractC9979u.m20294g(errorCode, "errorCode");
        if (this.f25271g) {
            throw new IOException("closed");
        }
        if (errorCode.m22020c() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m22161i(i10, 4, 3, 0);
        this.f25267c.writeInt(errorCode.m22020c());
        this.f25267c.flush();
    }

    /* renamed from: r */
    public final synchronized void m22168r(C11000g settings) {
        try {
            AbstractC9979u.m20294g(settings, "settings");
            if (this.f25271g) {
                throw new IOException("closed");
            }
            int i10 = 0;
            m22161i(0, settings.m24314i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.m24311f(i10)) {
                    this.f25267c.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f25267c.writeInt(settings.m24306a(i10));
                }
                i10++;
            }
            this.f25267c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public final synchronized void m22169s(int i10, long j10) {
        if (this.f25271g) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        m22161i(i10, 4, 8, 0);
        this.f25267c.writeInt((int) j10);
        this.f25267c.flush();
    }

    /* renamed from: t */
    public final void m22170t(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f25270f, j10);
            j10 -= jMin;
            m22161i(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f25267c.write(this.f25269e, jMin);
        }
    }
}
