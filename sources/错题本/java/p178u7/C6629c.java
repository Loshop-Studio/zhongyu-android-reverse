package p178u7;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import p139p7.AbstractC6396c;

/* renamed from: u7.c */
/* loaded from: classes4.dex */
public final class C6629c {

    /* renamed from: c */
    public final BufferedSource f11104c;

    /* renamed from: f */
    public int f11107f;

    /* renamed from: g */
    public int f11108g;

    /* renamed from: a */
    public int f11102a = 4096;

    /* renamed from: b */
    public final ArrayList f11103b = new ArrayList();

    /* renamed from: d */
    public C6627b[] f11105d = new C6627b[8];

    /* renamed from: e */
    public int f11106e = 7;

    public C6629c(C6644r c6644r) {
        this.f11104c = Okio.buffer(c6644r);
    }

    /* renamed from: a */
    public final int m6265a(int i) {
        int i8;
        int i9 = 0;
        if (i > 0) {
            int length = this.f11105d.length;
            while (true) {
                length--;
                i8 = this.f11106e;
                if (length < i8 || i <= 0) {
                    break;
                }
                C6627b c6627b = this.f11105d[length];
                AbstractC5830k.m5327d(c6627b);
                int i10 = c6627b.f11099c;
                i -= i10;
                this.f11108g -= i10;
                this.f11107f--;
                i9++;
            }
            C6627b[] c6627bArr = this.f11105d;
            System.arraycopy(c6627bArr, i8 + 1, c6627bArr, i8 + 1 + i9, this.f11107f);
            this.f11106e += i9;
        }
        return i9;
    }

    /* renamed from: b */
    public final ByteString m6266b(int i) throws IOException {
        if (i >= 0) {
            C6627b[] c6627bArr = AbstractC6631e.f11117a;
            if (i <= c6627bArr.length - 1) {
                return c6627bArr[i].f11097a;
            }
        }
        int length = this.f11106e + 1 + (i - AbstractC6631e.f11117a.length);
        if (length >= 0) {
            C6627b[] c6627bArr2 = this.f11105d;
            if (length < c6627bArr2.length) {
                C6627b c6627b = c6627bArr2[length];
                AbstractC5830k.m5327d(c6627b);
                return c6627b.f11097a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* renamed from: c */
    public final void m6267c(C6627b c6627b) {
        this.f11103b.add(c6627b);
        int i = c6627b.f11099c;
        int i8 = this.f11102a;
        if (i > i8) {
            C6627b[] c6627bArr = this.f11105d;
            AbstractC5802q.m5186M(null, c6627bArr, 0, c6627bArr.length);
            this.f11106e = this.f11105d.length - 1;
            this.f11107f = 0;
            this.f11108g = 0;
            return;
        }
        m6265a((this.f11108g + i) - i8);
        int i9 = this.f11107f + 1;
        C6627b[] c6627bArr2 = this.f11105d;
        if (i9 > c6627bArr2.length) {
            C6627b[] c6627bArr3 = new C6627b[c6627bArr2.length * 2];
            System.arraycopy(c6627bArr2, 0, c6627bArr3, c6627bArr2.length, c6627bArr2.length);
            this.f11106e = this.f11105d.length - 1;
            this.f11105d = c6627bArr3;
        }
        int i10 = this.f11106e;
        this.f11106e = i10 - 1;
        this.f11105d[i10] = c6627b;
        this.f11107f++;
        this.f11108g += i;
    }

    /* renamed from: d */
    public final ByteString m6268d() {
        BufferedSource source = this.f11104c;
        byte b6 = source.readByte();
        byte[] bArr = AbstractC6396c.f10486a;
        int i = b6 & 255;
        int i8 = 0;
        boolean z8 = (b6 & 128) == 128;
        long jM6269e = m6269e(i, 127);
        if (!z8) {
            return source.readByteString(jM6269e);
        }
        Buffer buffer = new Buffer();
        int[] iArr = AbstractC6652z.f11221a;
        AbstractC5830k.m5330g(source, "source");
        C6651y c6651y = AbstractC6652z.f11223c;
        C6651y c6651y2 = c6651y;
        int i9 = 0;
        for (long j7 = 0; j7 < jM6269e; j7++) {
            byte b9 = source.readByte();
            byte[] bArr2 = AbstractC6396c.f10486a;
            i8 = (i8 << 8) | (b9 & 255);
            i9 += 8;
            while (i9 >= 8) {
                C6651y[] c6651yArr = (C6651y[]) c6651y2.f11220c;
                AbstractC5830k.m5327d(c6651yArr);
                c6651y2 = c6651yArr[(i8 >>> (i9 - 8)) & 255];
                AbstractC5830k.m5327d(c6651y2);
                if (((C6651y[]) c6651y2.f11220c) == null) {
                    buffer.writeByte(c6651y2.f11218a);
                    i9 -= c6651y2.f11219b;
                    c6651y2 = c6651y;
                } else {
                    i9 -= 8;
                }
            }
        }
        while (i9 > 0) {
            C6651y[] c6651yArr2 = (C6651y[]) c6651y2.f11220c;
            AbstractC5830k.m5327d(c6651yArr2);
            C6651y c6651y3 = c6651yArr2[(i8 << (8 - i9)) & 255];
            AbstractC5830k.m5327d(c6651y3);
            int i10 = c6651y3.f11219b;
            if (((C6651y[]) c6651y3.f11220c) != null || i10 > i9) {
                break;
            }
            buffer.writeByte(c6651y3.f11218a);
            i9 -= i10;
            c6651y2 = c6651y;
        }
        return buffer.readByteString();
    }

    /* renamed from: e */
    public final int m6269e(int i, int i8) {
        int i9 = i & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte b6 = this.f11104c.readByte();
            byte[] bArr = AbstractC6396c.f10486a;
            int i11 = b6 & 255;
            if ((b6 & 128) == 0) {
                return i8 + (i11 << i10);
            }
            i8 += (b6 & 127) << i10;
            i10 += 7;
        }
    }
}
