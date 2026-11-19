package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p193o.InterfaceC9498b;

/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f3169a;

    /* renamed from: b */
    public int f3170b;

    /* renamed from: c */
    public int f3171c;

    /* renamed from: d */
    public int f3172d;

    /* renamed from: e */
    public int f3173e;

    /* renamed from: f */
    public final InterfaceC9498b f3174f;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC9498b interfaceC9498b) {
        this(inputStream, interfaceC9498b, 65536);
    }

    /* renamed from: d */
    public static IOException m3048d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m3049a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f3172d;
        if (i10 != -1) {
            int i11 = this.f3173e - i10;
            int i12 = this.f3171c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f3170b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3174f.mo17614b(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3169a = bArr2;
                    this.f3174f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f3173e - this.f3172d;
                this.f3173e = i13;
                this.f3172d = 0;
                this.f3170b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f3173e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f3170b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f3172d = -1;
            this.f3173e = 0;
            this.f3170b = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3169a == null || inputStream == null) {
            throw m3048d();
        }
        return (this.f3170b - this.f3173e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m3050b() {
        this.f3171c = this.f3169a.length;
    }

    /* renamed from: c */
    public synchronized void m3051c() {
        if (this.f3169a != null) {
            this.f3174f.put(this.f3169a);
            this.f3169a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f3169a != null) {
            this.f3174f.put(this.f3169a);
            this.f3169a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f3171c = Math.max(this.f3171c, i10);
        this.f3172d = this.f3173e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f3169a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m3048d();
        }
        if (this.f3173e >= this.f3170b && m3049a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f3169a && (bArr = this.f3169a) == null) {
            throw m3048d();
        }
        int i10 = this.f3170b;
        int i11 = this.f3173e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f3173e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f3169a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f3172d;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f3173e + " markLimit: " + this.f3171c);
        }
        this.f3173e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3169a;
        if (bArr == null) {
            throw m3048d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m3048d();
        }
        int i10 = this.f3170b;
        int i11 = this.f3173e;
        if (i10 - i11 >= j10) {
            this.f3173e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f3173e = i10;
        if (this.f3172d == -1 || j10 > this.f3171c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f3172d = -1;
            }
            return j11 + jSkip;
        }
        if (m3049a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f3170b;
        int i13 = this.f3173e;
        if (i12 - i13 >= j10 - j11) {
            this.f3173e = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f3173e = i12;
        return j12;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC9498b interfaceC9498b, int i10) {
        super(inputStream);
        this.f3172d = -1;
        this.f3174f = interfaceC9498b;
        this.f3169a = (byte[]) interfaceC9498b.mo17614b(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f3169a;
        if (bArr2 == null) {
            throw m3048d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f3173e;
            int i15 = this.f3170b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f3173e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f3172d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (m3049a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f3169a && (bArr2 = this.f3169a) == null) {
                        throw m3048d();
                    }
                    int i17 = this.f3170b;
                    int i18 = this.f3173e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f3173e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw m3048d();
        }
    }
}
