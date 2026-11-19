package p178u7;

import android.support.v4.media.AbstractC0037f;
import com.zykj.mistake.feature.collection.component.C4568n;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;
import okio.ByteString;
import p139p7.AbstractC6396c;

/* renamed from: u7.s */
/* loaded from: classes4.dex */
public final class C6645s implements Closeable {

    /* renamed from: d */
    public static final Logger f11183d;

    /* renamed from: a */
    public final BufferedSource f11184a;

    /* renamed from: b */
    public final C6644r f11185b;

    /* renamed from: c */
    public final C6629c f11186c;

    static {
        Logger logger = Logger.getLogger(AbstractC6632f.class.getName());
        AbstractC5830k.m5329f(logger, "getLogger(Http2::class.java.name)");
        f11183d = logger;
    }

    public C6645s(BufferedSource source) {
        AbstractC5830k.m5330g(source, "source");
        this.f11184a = source;
        C6644r c6644r = new C6644r(source);
        this.f11185b = c6644r;
        this.f11186c = new C6629c(c6644r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0248, code lost:
    
        throw new java.io.IOException(android.support.v4.media.AbstractC0037f.m81f(r11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6287a(boolean r18, com.zykj.mistake.feature.collection.component.C4568n r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178u7.C6645s.m6287a(boolean, com.zykj.mistake.feature.collection.component.n):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0118, code lost:
    
        if (r8 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011a, code lost:
    
        r3.m6302i(p139p7.AbstractC6396c.f10487b, true);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6288b(com.zykj.mistake.feature.collection.component.C4568n r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178u7.C6645s.m6288b(com.zykj.mistake.feature.collection.component.n, int, int, int):void");
    }

    /* renamed from: c */
    public final List m6289c(int i, int i8, int i9, int i10) throws IOException {
        C6644r c6644r = this.f11185b;
        c6644r.f11181e = i;
        c6644r.f11178b = i;
        c6644r.f11182f = i8;
        c6644r.f11179c = i9;
        c6644r.f11180d = i10;
        C6629c c6629c = this.f11186c;
        BufferedSource bufferedSource = c6629c.f11104c;
        ArrayList arrayList = c6629c.f11103b;
        while (!bufferedSource.exhausted()) {
            byte b6 = bufferedSource.readByte();
            byte[] bArr = AbstractC6396c.f10486a;
            int i11 = b6 & 255;
            if (i11 == 128) {
                throw new IOException("index == 0");
            }
            if ((b6 & 128) == 128) {
                int iM6269e = c6629c.m6269e(i11, 127);
                int i12 = iM6269e - 1;
                if (i12 >= 0) {
                    C6627b[] c6627bArr = AbstractC6631e.f11117a;
                    if (i12 <= c6627bArr.length - 1) {
                        arrayList.add(c6627bArr[i12]);
                    }
                }
                int length = c6629c.f11106e + 1 + (i12 - AbstractC6631e.f11117a.length);
                if (length >= 0) {
                    C6627b[] c6627bArr2 = c6629c.f11105d;
                    if (length < c6627bArr2.length) {
                        C6627b c6627b = c6627bArr2[length];
                        AbstractC5830k.m5327d(c6627b);
                        arrayList.add(c6627b);
                    }
                }
                throw new IOException(AbstractC0037f.m81f(iM6269e, "Header index too large "));
            }
            if (i11 == 64) {
                C6627b[] c6627bArr3 = AbstractC6631e.f11117a;
                ByteString byteStringM6268d = c6629c.m6268d();
                AbstractC6631e.m6275a(byteStringM6268d);
                c6629c.m6267c(new C6627b(byteStringM6268d, c6629c.m6268d()));
            } else if ((b6 & 64) == 64) {
                c6629c.m6267c(new C6627b(c6629c.m6266b(c6629c.m6269e(i11, 63) - 1), c6629c.m6268d()));
            } else if ((b6 & 32) == 32) {
                int iM6269e2 = c6629c.m6269e(i11, 31);
                c6629c.f11102a = iM6269e2;
                if (iM6269e2 < 0 || iM6269e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c6629c.f11102a);
                }
                int i13 = c6629c.f11108g;
                if (iM6269e2 < i13) {
                    if (iM6269e2 == 0) {
                        C6627b[] c6627bArr4 = c6629c.f11105d;
                        AbstractC5802q.m5186M(null, c6627bArr4, 0, c6627bArr4.length);
                        c6629c.f11106e = c6629c.f11105d.length - 1;
                        c6629c.f11107f = 0;
                        c6629c.f11108g = 0;
                    } else {
                        c6629c.m6265a(i13 - iM6269e2);
                    }
                }
            } else if (i11 == 16 || i11 == 0) {
                C6627b[] c6627bArr5 = AbstractC6631e.f11117a;
                ByteString byteStringM6268d2 = c6629c.m6268d();
                AbstractC6631e.m6275a(byteStringM6268d2);
                arrayList.add(new C6627b(byteStringM6268d2, c6629c.m6268d()));
            } else {
                arrayList.add(new C6627b(c6629c.m6266b(c6629c.m6269e(i11, 15) - 1), c6629c.m6268d()));
            }
        }
        List listM5217D0 = AbstractC5805t.m5217D0(arrayList);
        arrayList.clear();
        return listM5217D0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11184a.close();
    }

    /* renamed from: d */
    public final void m6290d(C4568n c4568n, int i, int i8, int i9) throws IOException {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i10 = 0;
        int i11 = 1;
        boolean z8 = (i8 & 1) != 0;
        if ((i8 & 8) != 0) {
            byte b6 = this.f11184a.readByte();
            byte[] bArr = AbstractC6396c.f10486a;
            i10 = b6 & 255;
        }
        if ((i8 & 32) != 0) {
            BufferedSource bufferedSource = this.f11184a;
            bufferedSource.readInt();
            bufferedSource.readByte();
            byte[] bArr2 = AbstractC6396c.f10486a;
            i -= 5;
        }
        List headerBlock = m6289c(AbstractC6643q.m6286a(i, i8, i10), i10, i8, i9);
        AbstractC5830k.m5330g(headerBlock, "headerBlock");
        C6641o c6641o = (C6641o) c4568n.f6427c;
        if (i9 != 0 && (i9 & 1) == 0) {
            c6641o.f11152i.m6129b(new C6638l(c6641o.f11146c + '[' + i9 + "] onHeaders", c6641o, i9, headerBlock, z8), 0L);
            return;
        }
        synchronized (c6641o) {
            C6649w c6649wM6279c = c6641o.m6279c(i9);
            if (c6649wM6279c != null) {
                c6649wM6279c.m6302i(AbstractC6396c.m6060t(headerBlock), z8);
                return;
            }
            if (c6641o.f11149f) {
                return;
            }
            if (i9 <= c6641o.f11147d) {
                return;
            }
            if (i9 % 2 == c6641o.f11148e % 2) {
                return;
            }
            C6649w c6649w = new C6649w(i9, c6641o, false, z8, AbstractC6396c.m6060t(headerBlock));
            c6641o.f11147d = i9;
            c6641o.f11145b.put(Integer.valueOf(i9), c6649w);
            c6641o.f11150g.m6136e().m6129b(new C6635i(i11, c6641o.f11146c + '[' + i9 + "] onStream", c6641o, c6649w), 0L);
        }
    }

    /* renamed from: e */
    public final void m6291e(C4568n c4568n, int i, int i8, int i9) throws IOException {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i8 & 8) != 0) {
            byte b6 = this.f11184a.readByte();
            byte[] bArr = AbstractC6396c.f10486a;
            i10 = b6 & 255;
        } else {
            i10 = 0;
        }
        int i11 = this.f11184a.readInt() & Integer.MAX_VALUE;
        List requestHeaders = m6289c(AbstractC6643q.m6286a(i - 4, i8, i10), i10, i8, i9);
        AbstractC5830k.m5330g(requestHeaders, "requestHeaders");
        C6641o c6641o = (C6641o) c4568n.f6427c;
        synchronized (c6641o) {
            if (c6641o.f11168y.contains(Integer.valueOf(i11))) {
                c6641o.m6284h(i11, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            c6641o.f11168y.add(Integer.valueOf(i11));
            c6641o.f11152i.m6129b(new C6638l(c6641o.f11146c + '[' + i11 + "] onRequest", c6641o, i11, requestHeaders, 1), 0L);
        }
    }
}
