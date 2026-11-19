package p178u7;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.BufferedSink;
import p139p7.AbstractC6396c;

/* renamed from: u7.x */
/* loaded from: classes4.dex */
public final class C6650x implements Closeable {

    /* renamed from: f */
    public static final Logger f11212f = Logger.getLogger(AbstractC6632f.class.getName());

    /* renamed from: a */
    public final BufferedSink f11213a;

    /* renamed from: b */
    public final Buffer f11214b;

    /* renamed from: c */
    public int f11215c;

    /* renamed from: d */
    public boolean f11216d;

    /* renamed from: e */
    public final C6630d f11217e;

    public C6650x(BufferedSink sink) {
        AbstractC5830k.m5330g(sink, "sink");
        this.f11213a = sink;
        Buffer buffer = new Buffer();
        this.f11214b = buffer;
        this.f11215c = 16384;
        this.f11217e = new C6630d(buffer);
    }

    /* renamed from: a */
    public final synchronized void m6304a(C6628b0 peerSettings) {
        try {
            AbstractC5830k.m5330g(peerSettings, "peerSettings");
            if (this.f11216d) {
                throw new IOException("closed");
            }
            int i = this.f11215c;
            int i8 = peerSettings.f11100a;
            if ((i8 & 32) != 0) {
                i = peerSettings.f11101b[5];
            }
            this.f11215c = i;
            if (((i8 & 2) != 0 ? peerSettings.f11101b[1] : -1) != -1) {
                C6630d c6630d = this.f11217e;
                int i9 = (i8 & 2) != 0 ? peerSettings.f11101b[1] : -1;
                c6630d.getClass();
                int iMin = Math.min(i9, 16384);
                int i10 = c6630d.f11112d;
                if (i10 != iMin) {
                    if (iMin < i10) {
                        c6630d.f11110b = Math.min(c6630d.f11110b, iMin);
                    }
                    c6630d.f11111c = true;
                    c6630d.f11112d = iMin;
                    int i11 = c6630d.f11116h;
                    if (iMin < i11) {
                        if (iMin == 0) {
                            C6627b[] c6627bArr = c6630d.f11113e;
                            AbstractC5802q.m5186M(null, c6627bArr, 0, c6627bArr.length);
                            c6630d.f11114f = c6630d.f11113e.length - 1;
                            c6630d.f11115g = 0;
                            c6630d.f11116h = 0;
                        } else {
                            c6630d.m6270a(i11 - iMin);
                        }
                    }
                }
            }
            m6306c(0, 0, 4, 1);
            this.f11213a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void m6305b(boolean z8, int i, Buffer buffer, int i8) {
        if (this.f11216d) {
            throw new IOException("closed");
        }
        m6306c(i, i8, 0, z8 ? 1 : 0);
        if (i8 > 0) {
            BufferedSink bufferedSink = this.f11213a;
            AbstractC5830k.m5327d(buffer);
            bufferedSink.write(buffer, i8);
        }
    }

    /* renamed from: c */
    public final void m6306c(int i, int i8, int i9, int i10) throws IOException {
        Level level = Level.FINE;
        Logger logger = f11212f;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC6632f.m6276a(false, i, i8, i9, i10));
        }
        if (i8 > this.f11215c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f11215c + ": " + i8).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC6396c.f10486a;
        BufferedSink bufferedSink = this.f11213a;
        AbstractC5830k.m5330g(bufferedSink, "<this>");
        bufferedSink.writeByte((i8 >>> 16) & 255);
        bufferedSink.writeByte((i8 >>> 8) & 255);
        bufferedSink.writeByte(i8 & 255);
        bufferedSink.writeByte(i9 & 255);
        bufferedSink.writeByte(i10 & 255);
        bufferedSink.writeInt(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f11216d = true;
        this.f11213a.close();
    }

    /* renamed from: d */
    public final synchronized void m6307d(int i, ErrorCode errorCode, byte[] bArr) {
        AbstractC5830k.m5330g(errorCode, "errorCode");
        if (this.f11216d) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m6306c(0, bArr.length + 8, 7, 0);
        this.f11213a.writeInt(i);
        this.f11213a.writeInt(errorCode.getHttpCode());
        if (bArr.length != 0) {
            this.f11213a.write(bArr);
        }
        this.f11213a.flush();
    }

    /* renamed from: e */
    public final synchronized void m6308e(ArrayList arrayList, int i, boolean z8) {
        if (this.f11216d) {
            throw new IOException("closed");
        }
        this.f11217e.m6273d(arrayList);
        long size = this.f11214b.size();
        long jMin = Math.min(this.f11215c, size);
        int i8 = size == jMin ? 4 : 0;
        if (z8) {
            i8 |= 1;
        }
        m6306c(i, (int) jMin, 1, i8);
        this.f11213a.write(this.f11214b, jMin);
        if (size > jMin) {
            long j7 = size - jMin;
            while (j7 > 0) {
                long jMin2 = Math.min(this.f11215c, j7);
                j7 -= jMin2;
                m6306c(i, (int) jMin2, 9, j7 == 0 ? 4 : 0);
                this.f11213a.write(this.f11214b, jMin2);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void m6309f(boolean z8, int i, int i8) {
        if (this.f11216d) {
            throw new IOException("closed");
        }
        m6306c(0, 8, 6, z8 ? 1 : 0);
        this.f11213a.writeInt(i);
        this.f11213a.writeInt(i8);
        this.f11213a.flush();
    }

    public final synchronized void flush() {
        if (this.f11216d) {
            throw new IOException("closed");
        }
        this.f11213a.flush();
    }

    /* renamed from: g */
    public final synchronized void m6310g(int i, ErrorCode errorCode) {
        AbstractC5830k.m5330g(errorCode, "errorCode");
        if (this.f11216d) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m6306c(i, 4, 3, 0);
        this.f11213a.writeInt(errorCode.getHttpCode());
        this.f11213a.flush();
    }

    /* renamed from: h */
    public final synchronized void m6311h(int i, long j7) {
        if (this.f11216d) {
            throw new IOException("closed");
        }
        if (j7 == 0 || j7 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
        }
        m6306c(i, 4, 8, 0);
        this.f11213a.writeInt((int) j7);
        this.f11213a.flush();
    }
}
