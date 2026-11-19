package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p024c0.C3210g;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes2.dex */
public final class C3419a extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f2303a;

    /* renamed from: b */
    public int f2304b;

    /* renamed from: c */
    public int f2305c;

    /* renamed from: d */
    public int f2306d;

    /* renamed from: e */
    public int f2307e;

    /* renamed from: f */
    public final C3210g f2308f;

    public C3419a(InputStream inputStream, C3210g c3210g) {
        super(inputStream);
        this.f2306d = -1;
        this.f2308f = c3210g;
        this.f2303a = (byte[]) c3210g.m2155e(byte[].class, 65536);
    }

    /* renamed from: c */
    public static void m2413c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m2414a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f2306d;
        if (i != -1) {
            int i8 = this.f2307e - i;
            int i9 = this.f2305c;
            if (i8 < i9) {
                if (i == 0 && i9 > bArr.length && this.f2304b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i9) {
                        i9 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f2308f.m2155e(byte[].class, i9);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f2303a = bArr2;
                    this.f2308f.m2160j(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i10 = this.f2307e - this.f2306d;
                this.f2307e = i10;
                this.f2306d = 0;
                this.f2304b = 0;
                int i11 = inputStream.read(bArr, i10, bArr.length - i10);
                int i12 = this.f2307e;
                if (i11 > 0) {
                    i12 += i11;
                }
                this.f2304b = i12;
                return i11;
            }
        }
        int i13 = inputStream.read(bArr);
        if (i13 > 0) {
            this.f2306d = -1;
            this.f2307e = 0;
            this.f2304b = i13;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f2303a == null || inputStream == null) {
            m2413c();
            throw null;
        }
        return (this.f2304b - this.f2307e) + inputStream.available();
    }

    /* renamed from: b */
    public final synchronized void m2415b() {
        if (this.f2303a != null) {
            this.f2308f.m2160j(this.f2303a);
            this.f2303a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2303a != null) {
            this.f2308f.m2160j(this.f2303a);
            this.f2303a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f2305c = Math.max(this.f2305c, i);
        this.f2306d = this.f2307e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f2303a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m2413c();
            throw null;
        }
        if (this.f2307e >= this.f2304b && m2414a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f2303a && (bArr = this.f2303a) == null) {
            m2413c();
            throw null;
        }
        int i = this.f2304b;
        int i8 = this.f2307e;
        if (i - i8 <= 0) {
            return -1;
        }
        this.f2307e = i8 + 1;
        return bArr[i8] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f2303a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f2306d;
        if (-1 == i) {
            final String str = "Mark has been invalidated, pos: " + this.f2307e + " markLimit: " + this.f2305c;
            throw new IOException(str) { // from class: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream$InvalidMarkException
                private static final long serialVersionUID = -4338378848813561757L;
            };
        }
        this.f2307e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j7) {
        if (j7 < 1) {
            return 0L;
        }
        byte[] bArr = this.f2303a;
        if (bArr == null) {
            m2413c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2413c();
            throw null;
        }
        int i = this.f2304b;
        int i8 = this.f2307e;
        if (i - i8 >= j7) {
            this.f2307e = (int) (i8 + j7);
            return j7;
        }
        long j8 = i - i8;
        this.f2307e = i;
        if (this.f2306d == -1 || j7 > this.f2305c) {
            return j8 + inputStream.skip(j7 - j8);
        }
        if (m2414a(inputStream, bArr) == -1) {
            return j8;
        }
        int i9 = this.f2304b;
        int i10 = this.f2307e;
        if (i9 - i10 >= j7 - j8) {
            this.f2307e = (int) ((i10 + j7) - j8);
            return j7;
        }
        long j9 = (j8 + i9) - i10;
        this.f2307e = i9;
        return j9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i8) {
        int i9;
        int i10;
        byte[] bArr2 = this.f2303a;
        if (bArr2 == null) {
            m2413c();
            throw null;
        }
        if (i8 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i11 = this.f2307e;
            int i12 = this.f2304b;
            if (i11 < i12) {
                int i13 = i12 - i11;
                if (i13 >= i8) {
                    i13 = i8;
                }
                System.arraycopy(bArr2, i11, bArr, i, i13);
                this.f2307e += i13;
                if (i13 == i8 || inputStream.available() == 0) {
                    return i13;
                }
                i += i13;
                i9 = i8 - i13;
            } else {
                i9 = i8;
            }
            while (true) {
                if (this.f2306d == -1 && i9 >= bArr2.length) {
                    i10 = inputStream.read(bArr, i, i9);
                    if (i10 == -1) {
                        return i9 != i8 ? i8 - i9 : -1;
                    }
                } else {
                    if (m2414a(inputStream, bArr2) == -1) {
                        return i9 != i8 ? i8 - i9 : -1;
                    }
                    if (bArr2 != this.f2303a && (bArr2 = this.f2303a) == null) {
                        m2413c();
                        throw null;
                    }
                    int i14 = this.f2304b;
                    int i15 = this.f2307e;
                    i10 = i14 - i15;
                    if (i10 >= i9) {
                        i10 = i9;
                    }
                    System.arraycopy(bArr2, i15, bArr, i, i10);
                    this.f2307e += i10;
                }
                i9 -= i10;
                if (i9 == 0) {
                    return i8;
                }
                if (inputStream.available() == 0) {
                    return i8 - i9;
                }
                i += i10;
            }
        } else {
            m2413c();
            throw null;
        }
    }
}
