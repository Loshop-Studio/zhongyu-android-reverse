package p178f;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.C0787a;
import p160d.p162f.p164b.C1011d;

/* renamed from: f.a */
/* loaded from: classes.dex */
public final class C1077a implements InterfaceC1083g, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: b */
    public C1080d f5645b;

    /* renamed from: c */
    public long f5646c;

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0167, code lost:
    
        return r2;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m2859a(p178f.C1077a r21, long r22) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178f.C1077a.m2859a(f.a, long):long");
    }

    /* renamed from: b */
    public byte m2860b() throws EOFException {
        if (this.f5646c == 0) {
            throw new EOFException();
        }
        C1080d c1080d = this.f5645b;
        C1011d.m2807c(c1080d);
        int i = c1080d.f5654b;
        int i2 = c1080d.f5655c;
        int i3 = i + 1;
        byte b2 = c1080d.f5653a[i];
        this.f5646c--;
        if (i3 == i2) {
            this.f5645b = c1080d.m2873a();
            C1081e.m2877a(c1080d);
        } else {
            c1080d.f5654b = i3;
        }
        return b2;
    }

    /* renamed from: c */
    public final C1080d m2861c(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C1080d c1080d = this.f5645b;
        if (c1080d == null) {
            C1080d c1080dM2878b = C1081e.m2878b();
            this.f5645b = c1080dM2878b;
            c1080dM2878b.f5659g = c1080dM2878b;
            c1080dM2878b.f5658f = c1080dM2878b;
            return c1080dM2878b;
        }
        C1011d.m2807c(c1080d);
        C1080d c1080d2 = c1080d.f5659g;
        C1011d.m2807c(c1080d2);
        if (c1080d2.f5655c + i <= 8192 && c1080d2.f5657e) {
            return c1080d2;
        }
        C1080d c1080dM2878b2 = C1081e.m2878b();
        c1080d2.m2874b(c1080dM2878b2);
        return c1080dM2878b2;
    }

    public Object clone() {
        C1077a c1077a = new C1077a();
        if (this.f5646c != 0) {
            C1080d c1080d = this.f5645b;
            C1011d.m2807c(c1080d);
            C1080d c1080dM2875c = c1080d.m2875c();
            c1077a.f5645b = c1080dM2875c;
            c1080dM2875c.f5659g = c1080dM2875c;
            c1080dM2875c.f5658f = c1080dM2875c;
            for (C1080d c1080d2 = c1080d.f5658f; c1080d2 != c1080d; c1080d2 = c1080d2.f5658f) {
                C1080d c1080d3 = c1080dM2875c.f5659g;
                C1011d.m2807c(c1080d3);
                C1011d.m2807c(c1080d2);
                c1080d3.m2874b(c1080d2.m2875c());
            }
            c1077a.f5646c = this.f5646c;
        }
        return c1077a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    /* renamed from: d */
    public long m2862d(InterfaceC1083g interfaceC1083g) {
        C1011d.m2809e(interfaceC1083g, "source");
        long j = 0;
        while (true) {
            long jM2859a = ((C1077a) interfaceC1083g).m2859a(this, 8192);
            if (jM2859a == -1) {
                return j;
            }
            j += jM2859a;
        }
    }

    /* renamed from: e */
    public C1077a m2863e(int i) {
        C1080d c1080dM2861c = m2861c(4);
        byte[] bArr = c1080dM2861c.f5653a;
        int i2 = c1080dM2861c.f5655c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        c1080dM2861c.f5655c = i5 + 1;
        this.f5646c += 4;
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1077a)) {
                return false;
            }
            long j = this.f5646c;
            C1077a c1077a = (C1077a) obj;
            if (j != c1077a.f5646c) {
                return false;
            }
            if (j != 0) {
                C1080d c1080d = this.f5645b;
                C1011d.m2807c(c1080d);
                C1080d c1080d2 = c1077a.f5645b;
                C1011d.m2807c(c1080d2);
                int i = c1080d.f5654b;
                int i2 = c1080d2.f5654b;
                long j2 = 0;
                while (j2 < this.f5646c) {
                    long jMin = Math.min(c1080d.f5655c - i, c1080d2.f5655c - i2);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (c1080d.f5653a[i] != c1080d2.f5653a[i2]) {
                            return false;
                        }
                        j3++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == c1080d.f5655c) {
                        c1080d = c1080d.f5658f;
                        C1011d.m2807c(c1080d);
                        i = c1080d.f5654b;
                    }
                    if (i2 == c1080d2.f5655c) {
                        c1080d2 = c1080d2.f5658f;
                        C1011d.m2807c(c1080d2);
                        i2 = c1080d2.f5654b;
                    }
                    j2 += jMin;
                }
            }
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        C1080d c1080d = this.f5645b;
        if (c1080d == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c1080d.f5655c;
            for (int i3 = c1080d.f5654b; i3 < i2; i3++) {
                i = (i * 31) + c1080d.f5653a[i3];
            }
            c1080d = c1080d.f5658f;
            C1011d.m2807c(c1080d);
        } while (c1080d != this.f5645b);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C1011d.m2809e(byteBuffer, "sink");
        C1080d c1080d = this.f5645b;
        if (c1080d == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c1080d.f5655c - c1080d.f5654b);
        byteBuffer.put(c1080d.f5653a, c1080d.f5654b, iMin);
        int i = c1080d.f5654b + iMin;
        c1080d.f5654b = i;
        this.f5646c -= iMin;
        if (i == c1080d.f5655c) {
            this.f5645b = c1080d.m2873a();
            C1081e.m2877a(c1080d);
        }
        return iMin;
    }

    public String toString() {
        C1078b c1082f;
        long j = this.f5646c;
        int i = 0;
        if (!(j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder sbM2079g = C0561a.m2079g("size > Int.MAX_VALUE: ");
            sbM2079g.append(this.f5646c);
            throw new IllegalStateException(sbM2079g.toString().toString());
        }
        int i2 = (int) j;
        if (i2 == 0) {
            c1082f = C1078b.f5647e;
        } else {
            C0787a.m2473g(j, 0L, i2);
            C1080d c1080d = this.f5645b;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                C1011d.m2807c(c1080d);
                int i5 = c1080d.f5655c;
                int i6 = c1080d.f5654b;
                if (i5 == i6) {
                    throw new AssertionError("s.limit == s.pos");
                }
                i3 += i5 - i6;
                i4++;
                c1080d = c1080d.f5658f;
            }
            byte[][] bArr = new byte[i4][];
            int[] iArr = new int[i4 * 2];
            C1080d c1080d2 = this.f5645b;
            int i7 = 0;
            while (i < i2) {
                C1011d.m2807c(c1080d2);
                bArr[i7] = c1080d2.f5653a;
                i += c1080d2.f5655c - c1080d2.f5654b;
                iArr[i7] = Math.min(i, i2);
                iArr[i7 + i4] = c1080d2.f5654b;
                c1080d2.f5656d = true;
                i7++;
                c1080d2 = c1080d2.f5658f;
            }
            c1082f = new C1082f(bArr, iArr);
        }
        return c1082f.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        C1011d.m2809e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C1080d c1080dM2861c = m2861c(1);
            int iMin = Math.min(i, 8192 - c1080dM2861c.f5655c);
            byteBuffer.get(c1080dM2861c.f5653a, c1080dM2861c.f5655c, iMin);
            i -= iMin;
            c1080dM2861c.f5655c += iMin;
        }
        this.f5646c += iRemaining;
        return iRemaining;
    }
}
