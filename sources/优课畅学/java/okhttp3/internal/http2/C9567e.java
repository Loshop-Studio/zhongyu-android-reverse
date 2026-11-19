package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.http2.C9564b;
import okio.Buffer;
import okio.BufferedSink;
import p123h7.C8736p;
import p147j9.AbstractC9041k;
import p225q9.C9857b;
import p225q9.C9874s;

/* renamed from: okhttp3.internal.http2.e */
/* loaded from: classes5.dex */
public final class C9567e implements Closeable {

    /* renamed from: g */
    public static final a f19197g = new a(null);

    /* renamed from: h */
    public static final Logger f19198h = Logger.getLogger(C9857b.class.getName());

    /* renamed from: a */
    public final BufferedSink f19199a;

    /* renamed from: b */
    public final boolean f19200b;

    /* renamed from: c */
    public final Buffer f19201c;

    /* renamed from: d */
    public int f19202d;

    /* renamed from: e */
    public boolean f19203e;

    /* renamed from: f */
    public final C9564b.b f19204f;

    /* renamed from: okhttp3.internal.http2.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9567e(BufferedSink sink, boolean z10) {
        AbstractC9133u.m16133g(sink, "sink");
        this.f19199a = sink;
        this.f19200b = z10;
        Buffer buffer = new Buffer();
        this.f19201c = buffer;
        this.f19202d = 16384;
        this.f19204f = new C9564b.b(0, false, buffer, 3, null);
    }

    /* renamed from: a */
    public final void m18070a(C9874s peerSettings) {
        AbstractC9133u.m16133g(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                this.f19202d = peerSettings.m18440e(this.f19202d);
                if (peerSettings.m18437b() != -1) {
                    this.f19204f.m17937e(peerSettings.m18437b());
                }
                m18074e(0, 0, 4, 1);
                this.f19199a.flush();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m18071b() {
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                if (this.f19200b) {
                    Logger logger = f19198h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC9041k.m15780j(">> CONNECTION " + C9857b.f19672b.hex(), new Object[0]));
                    }
                    this.f19199a.write(C9857b.f19672b);
                    this.f19199a.flush();
                    C8736p c8736p = C8736p.f16368a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m18072c(boolean z10, int i10, Buffer buffer, int i11) {
        synchronized (this) {
            if (this.f19203e) {
                throw new IOException("closed");
            }
            m18073d(i10, z10 ? 1 : 0, buffer, i11);
            C8736p c8736p = C8736p.f16368a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f19203e = true;
            this.f19199a.close();
            C8736p c8736p = C8736p.f16368a;
        }
    }

    /* renamed from: d */
    public final void m18073d(int i10, int i11, Buffer buffer, int i12) {
        m18074e(i10, i12, 0, i11);
        if (i12 > 0) {
            BufferedSink bufferedSink = this.f19199a;
            AbstractC9133u.m16130d(buffer);
            bufferedSink.write(buffer, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18074e(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = okhttp3.internal.http2.C9567e.f19198h
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            q9.b r2 = p225q9.C9857b.f19671a
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.m18378c(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.f19202d
            if (r5 > r9) goto L62
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            okio.BufferedSink r9 = r8.f19199a
            p147j9.AbstractC9038h.m15744E(r9, r5)
            okio.BufferedSink r9 = r8.f19199a
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.f19199a
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.f19199a
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
            int r10 = r8.f19202d
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
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9567e.m18074e(int, int, int, int):void");
    }

    /* renamed from: f */
    public final void m18075f(int i10, ErrorCode errorCode, byte[] debugData) {
        AbstractC9133u.m16133g(errorCode, "errorCode");
        AbstractC9133u.m16133g(debugData, "debugData");
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                if (errorCode.m17908b() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                m18074e(0, debugData.length + 8, 7, 0);
                this.f19199a.writeInt(i10);
                this.f19199a.writeInt(errorCode.m17908b());
                if (!(debugData.length == 0)) {
                    this.f19199a.write(debugData);
                }
                this.f19199a.flush();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f19203e) {
                throw new IOException("closed");
            }
            this.f19199a.flush();
            C8736p c8736p = C8736p.f16368a;
        }
    }

    /* renamed from: g */
    public final void m18076g(boolean z10, int i10, List headerBlock) {
        AbstractC9133u.m16133g(headerBlock, "headerBlock");
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                this.f19204f.m17939g(headerBlock);
                long size = this.f19201c.size();
                long jMin = Math.min(this.f19202d, size);
                int i11 = size == jMin ? 4 : 0;
                if (z10) {
                    i11 |= 1;
                }
                m18074e(i10, (int) jMin, 1, i11);
                this.f19199a.write(this.f19201c, jMin);
                if (size > jMin) {
                    m18083n(i10, size - jMin);
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final int m18077h() {
        return this.f19202d;
    }

    /* renamed from: i */
    public final void m18078i(boolean z10, int i10, int i11) {
        synchronized (this) {
            if (this.f19203e) {
                throw new IOException("closed");
            }
            m18074e(0, 8, 6, z10 ? 1 : 0);
            this.f19199a.writeInt(i10);
            this.f19199a.writeInt(i11);
            this.f19199a.flush();
            C8736p c8736p = C8736p.f16368a;
        }
    }

    /* renamed from: j */
    public final void m18079j(int i10, int i11, List requestHeaders) {
        AbstractC9133u.m16133g(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                this.f19204f.m17939g(requestHeaders);
                long size = this.f19201c.size();
                int iMin = (int) Math.min(this.f19202d - 4, size);
                long j10 = iMin;
                m18074e(i10, iMin + 4, 5, size == j10 ? 4 : 0);
                this.f19199a.writeInt(i11 & Integer.MAX_VALUE);
                this.f19199a.write(this.f19201c, j10);
                if (size > j10) {
                    m18083n(i10, size - j10);
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void m18080k(int i10, ErrorCode errorCode) {
        AbstractC9133u.m16133g(errorCode, "errorCode");
        synchronized (this) {
            if (this.f19203e) {
                throw new IOException("closed");
            }
            if (errorCode.m17908b() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m18074e(i10, 4, 3, 0);
            this.f19199a.writeInt(errorCode.m17908b());
            this.f19199a.flush();
            C8736p c8736p = C8736p.f16368a;
        }
    }

    /* renamed from: l */
    public final void m18081l(C9874s settings) {
        AbstractC9133u.m16133g(settings, "settings");
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                m18074e(0, settings.m18444i() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.m18441f(i10)) {
                        this.f19199a.writeShort(i10);
                        this.f19199a.writeInt(settings.m18436a(i10));
                    }
                }
                this.f19199a.flush();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public final void m18082m(int i10, long j10) {
        int i11;
        long j11;
        synchronized (this) {
            try {
                if (this.f19203e) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > SieveCacheKt.NodeLinkMask) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
                }
                Logger logger = f19198h;
                if (logger.isLoggable(Level.FINE)) {
                    i11 = i10;
                    j11 = j10;
                    logger.fine(C9857b.f19671a.m18379d(false, i11, 4, j11));
                } else {
                    i11 = i10;
                    j11 = j10;
                }
                m18074e(i11, 4, 8, 0);
                this.f19199a.writeInt((int) j11);
                this.f19199a.flush();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public final void m18083n(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f19202d, j10);
            j10 -= jMin;
            m18074e(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f19199a.write(this.f19201c, jMin);
        }
    }
}
