package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.C7530b;
import okio.Buffer;
import okio.BufferedSink;
import p065g5.AbstractC6427k;
import p116n5.C7468b;
import p116n5.C7485s;

/* renamed from: okhttp3.internal.http2.e */
/* loaded from: classes4.dex */
public final class C7533e implements Closeable {

    /* renamed from: g */
    public static final a f9975g = new a(null);

    /* renamed from: h */
    public static final Logger f9976h = Logger.getLogger(C7468b.class.getName());

    /* renamed from: a */
    public final BufferedSink f9977a;

    /* renamed from: b */
    public final boolean f9978b;

    /* renamed from: c */
    public final Buffer f9979c;

    /* renamed from: d */
    public int f9980d;

    /* renamed from: e */
    public boolean f9981e;

    /* renamed from: f */
    public final C7530b.b f9982f;

    /* renamed from: okhttp3.internal.http2.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7533e(BufferedSink sink, boolean z6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f9977a = sink;
        this.f9978b = z6;
        Buffer buffer = new Buffer();
        this.f9979c = buffer;
        this.f9980d = 16384;
        this.f9982f = new C7530b.b(0, false, buffer, 3, null);
    }

    /* renamed from: a */
    public final void m8889a(C7485s peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                this.f9980d = peerSettings.m8607e(this.f9980d);
                if (peerSettings.m8604b() != -1) {
                    this.f9982f.m8756e(peerSettings.m8604b());
                }
                m8893i(0, 0, 4, 1);
                this.f9977a.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m8890c() {
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                if (this.f9978b) {
                    Logger logger = f9976h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC6427k.m7022j(">> CONNECTION " + C7468b.f9578b.hex(), new Object[0]));
                    }
                    this.f9977a.write(C7468b.f9578b);
                    this.f9977a.flush();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f9981e = true;
            this.f9977a.close();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f9981e) {
                throw new IOException("closed");
            }
            this.f9977a.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: g */
    public final void m8891g(boolean z6, int i6, Buffer buffer, int i7) {
        synchronized (this) {
            if (this.f9981e) {
                throw new IOException("closed");
            }
            m8892h(i6, z6 ? 1 : 0, buffer, i7);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: h */
    public final void m8892h(int i6, int i7, Buffer buffer, int i8) {
        m8893i(i6, i8, 0, i7);
        if (i8 > 0) {
            BufferedSink bufferedSink = this.f9977a;
            Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8893i(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = okhttp3.internal.http2.C7533e.f9976h
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            n5.b r2 = p116n5.C7468b.f9577a
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.m8545c(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.f9980d
            if (r5 > r9) goto L62
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            okio.BufferedSink r9 = r8.f9977a
            p065g5.AbstractC6424h.m6986E(r9, r5)
            okio.BufferedSink r9 = r8.f9977a
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.f9977a
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.f9977a
            r10 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r4
            r9.writeInt(r10)
            return
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "reserved bit set: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.append(r10)
            int r10 = r8.f9980d
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C7533e.m8893i(int, int, int, int):void");
    }

    /* renamed from: j */
    public final void m8894j(int i6, ErrorCode errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                if (errorCode.getHttpCode() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                m8893i(0, debugData.length + 8, 7, 0);
                this.f9977a.writeInt(i6);
                this.f9977a.writeInt(errorCode.getHttpCode());
                if (!(debugData.length == 0)) {
                    this.f9977a.write(debugData);
                }
                this.f9977a.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void m8895k(boolean z6, int i6, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                this.f9982f.m8758g(headerBlock);
                long size = this.f9979c.size();
                long jMin = Math.min(this.f9980d, size);
                int i7 = size == jMin ? 4 : 0;
                if (z6) {
                    i7 |= 1;
                }
                m8893i(i6, (int) jMin, 1, i7);
                this.f9977a.write(this.f9979c, jMin);
                if (size > jMin) {
                    m8902r(i6, size - jMin);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final int m8896l() {
        return this.f9980d;
    }

    /* renamed from: m */
    public final void m8897m(boolean z6, int i6, int i7) {
        synchronized (this) {
            if (this.f9981e) {
                throw new IOException("closed");
            }
            m8893i(0, 8, 6, z6 ? 1 : 0);
            this.f9977a.writeInt(i6);
            this.f9977a.writeInt(i7);
            this.f9977a.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: n */
    public final void m8898n(int i6, int i7, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                this.f9982f.m8758g(requestHeaders);
                long size = this.f9979c.size();
                int iMin = (int) Math.min(this.f9980d - 4, size);
                long j6 = iMin;
                m8893i(i6, iMin + 4, 5, size == j6 ? 4 : 0);
                this.f9977a.writeInt(i7 & Integer.MAX_VALUE);
                this.f9977a.write(this.f9979c, j6);
                if (size > j6) {
                    m8902r(i6, size - j6);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final void m8899o(int i6, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.f9981e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m8893i(i6, 4, 3, 0);
            this.f9977a.writeInt(errorCode.getHttpCode());
            this.f9977a.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: p */
    public final void m8900p(C7485s settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                m8893i(0, settings.m8611i() * 6, 4, 0);
                for (int i6 = 0; i6 < 10; i6++) {
                    if (settings.m8608f(i6)) {
                        this.f9977a.writeShort(i6);
                        this.f9977a.writeInt(settings.m8603a(i6));
                    }
                }
                this.f9977a.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: q */
    public final void m8901q(int i6, long j6) {
        int i7;
        long j7;
        synchronized (this) {
            try {
                if (this.f9981e) {
                    throw new IOException("closed");
                }
                if (j6 == 0 || j6 > SieveCacheKt.NodeLinkMask) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
                }
                Logger logger = f9976h;
                if (logger.isLoggable(Level.FINE)) {
                    i7 = i6;
                    j7 = j6;
                    logger.fine(C7468b.f9577a.m8546d(false, i7, 4, j7));
                } else {
                    i7 = i6;
                    j7 = j6;
                }
                m8893i(i7, 4, 8, 0);
                this.f9977a.writeInt((int) j7);
                this.f9977a.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: r */
    public final void m8902r(int i6, long j6) {
        while (j6 > 0) {
            long jMin = Math.min(this.f9980d, j6);
            j6 -= jMin;
            m8893i(i6, (int) jMin, 9, j6 == 0 ? 4 : 0);
            this.f9977a.write(this.f9979c, jMin);
        }
    }
}
