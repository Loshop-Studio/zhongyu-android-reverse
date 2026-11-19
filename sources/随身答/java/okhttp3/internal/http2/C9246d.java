package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.C9243a;
import okio.Buffer;
import okio.BufferedSink;
import p182m8.AbstractC9045d;
import p256t8.C9637b;
import p256t8.C9642g;

/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes5.dex */
public final class C9246d implements Closeable {

    /* renamed from: g */
    public static final a f15968g = new a(null);

    /* renamed from: h */
    public static final Logger f15969h = Logger.getLogger(C9637b.class.getName());

    /* renamed from: a */
    public final BufferedSink f15970a;

    /* renamed from: b */
    public final boolean f15971b;

    /* renamed from: c */
    public final Buffer f15972c;

    /* renamed from: d */
    public int f15973d;

    /* renamed from: e */
    public boolean f15974e;

    /* renamed from: f */
    public final C9243a.b f15975f;

    /* renamed from: okhttp3.internal.http2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C9246d(BufferedSink sink, boolean z9) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f15970a = sink;
        this.f15971b = z9;
        Buffer buffer = new Buffer();
        this.f15972c = buffer;
        this.f15973d = 16384;
        this.f15975f = new C9243a.b(0, false, buffer, 3, null);
    }

    /* renamed from: a */
    public final synchronized void m15032a(C9642g peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f15974e) {
                throw new IOException("closed");
            }
            this.f15973d = peerSettings.m15975e(this.f15973d);
            if (peerSettings.m15972b() != -1) {
                this.f15975f.m14921e(peerSettings.m15972b());
            }
            m15036i(0, 0, 4, 1);
            this.f15970a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m15033c() {
        try {
            if (this.f15974e) {
                throw new IOException("closed");
            }
            if (this.f15971b) {
                Logger logger = f15969h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC9045d.m14504t(">> CONNECTION " + C9637b.f16930b.hex(), new Object[0]));
                }
                this.f15970a.write(C9637b.f16930b);
                this.f15970a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f15974e = true;
        this.f15970a.close();
    }

    public final synchronized void flush() {
        if (this.f15974e) {
            throw new IOException("closed");
        }
        this.f15970a.flush();
    }

    /* renamed from: g */
    public final synchronized void m15034g(boolean z9, int i9, Buffer buffer, int i10) {
        if (this.f15974e) {
            throw new IOException("closed");
        }
        m15035h(i9, z9 ? 1 : 0, buffer, i10);
    }

    /* renamed from: h */
    public final void m15035h(int i9, int i10, Buffer buffer, int i11) throws IOException {
        m15036i(i9, i11, 0, i10);
        if (i11 > 0) {
            BufferedSink bufferedSink = this.f15970a;
            Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, i11);
        }
    }

    /* renamed from: i */
    public final void m15036i(int i9, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        int i16;
        Logger logger = f15969h;
        if (logger.isLoggable(Level.FINE)) {
            i13 = i9;
            i14 = i10;
            i15 = i11;
            i16 = i12;
            logger.fine(C9637b.f16929a.m15914c(false, i13, i14, i15, i16));
        } else {
            i13 = i9;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        if (i14 > this.f15973d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f15973d + ": " + i14).toString());
        }
        if ((Integer.MIN_VALUE & i13) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i13).toString());
        }
        AbstractC9045d.m14484Z(this.f15970a, i14);
        this.f15970a.writeByte(i15 & 255);
        this.f15970a.writeByte(i16 & 255);
        this.f15970a.writeInt(Integer.MAX_VALUE & i13);
    }

    /* renamed from: j */
    public final synchronized void m15037j(int i9, ErrorCode errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f15974e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m15036i(0, debugData.length + 8, 7, 0);
            this.f15970a.writeInt(i9);
            this.f15970a.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.f15970a.write(debugData);
            }
            this.f15970a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public final synchronized void m15038k(boolean z9, int i9, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f15974e) {
            throw new IOException("closed");
        }
        this.f15975f.m14923g(headerBlock);
        long size = this.f15972c.size();
        long jMin = Math.min(this.f15973d, size);
        int i10 = size == jMin ? 4 : 0;
        if (z9) {
            i10 |= 1;
        }
        m15036i(i9, (int) jMin, 1, i10);
        this.f15970a.write(this.f15972c, jMin);
        if (size > jMin) {
            m15045r(i9, size - jMin);
        }
    }

    /* renamed from: l */
    public final int m15039l() {
        return this.f15973d;
    }

    /* renamed from: m */
    public final synchronized void m15040m(boolean z9, int i9, int i10) {
        if (this.f15974e) {
            throw new IOException("closed");
        }
        m15036i(0, 8, 6, z9 ? 1 : 0);
        this.f15970a.writeInt(i9);
        this.f15970a.writeInt(i10);
        this.f15970a.flush();
    }

    /* renamed from: n */
    public final synchronized void m15041n(int i9, int i10, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f15974e) {
            throw new IOException("closed");
        }
        this.f15975f.m14923g(requestHeaders);
        long size = this.f15972c.size();
        int iMin = (int) Math.min(this.f15973d - 4, size);
        long j9 = iMin;
        m15036i(i9, iMin + 4, 5, size == j9 ? 4 : 0);
        this.f15970a.writeInt(i10 & Integer.MAX_VALUE);
        this.f15970a.write(this.f15972c, j9);
        if (size > j9) {
            m15045r(i9, size - j9);
        }
    }

    /* renamed from: o */
    public final synchronized void m15042o(int i9, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f15974e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m15036i(i9, 4, 3, 0);
        this.f15970a.writeInt(errorCode.getHttpCode());
        this.f15970a.flush();
    }

    /* renamed from: p */
    public final synchronized void m15043p(C9642g settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f15974e) {
                throw new IOException("closed");
            }
            int i9 = 0;
            m15036i(0, settings.m15979i() * 6, 4, 0);
            while (i9 < 10) {
                if (settings.m15976f(i9)) {
                    this.f15970a.writeShort(i9 != 4 ? i9 != 7 ? i9 : 4 : 3);
                    this.f15970a.writeInt(settings.m15971a(i9));
                }
                i9++;
            }
            this.f15970a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: q */
    public final synchronized void m15044q(int i9, long j9) {
        if (this.f15974e) {
            throw new IOException("closed");
        }
        if (j9 == 0 || j9 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j9).toString());
        }
        m15036i(i9, 4, 8, 0);
        this.f15970a.writeInt((int) j9);
        this.f15970a.flush();
    }

    /* renamed from: r */
    public final void m15045r(int i9, long j9) throws IOException {
        while (j9 > 0) {
            long jMin = Math.min(this.f15973d, j9);
            j9 -= jMin;
            m15036i(i9, (int) jMin, 9, j9 == 0 ? 4 : 0);
            this.f15970a.write(this.f15972c, jMin);
        }
    }
}
