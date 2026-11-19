package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p074i0.InterfaceC6497b;

/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f2527a;

    /* renamed from: b */
    public int f2528b;

    /* renamed from: c */
    public int f2529c;

    /* renamed from: d */
    public int f2530d;

    /* renamed from: e */
    public int f2531e;

    /* renamed from: f */
    public final InterfaceC6497b f2532f;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC6497b interfaceC6497b) {
        this(inputStream, interfaceC6497b, 65536);
    }

    /* renamed from: h */
    public static IOException m2783h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m2784a(InputStream inputStream, byte[] bArr) throws IOException {
        int i6 = this.f2530d;
        if (i6 != -1) {
            int i7 = this.f2531e - i6;
            int i8 = this.f2529c;
            if (i7 < i8) {
                if (i6 == 0 && i8 > bArr.length && this.f2528b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i8) {
                        i8 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f2532f.mo7190c(i8, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f2527a = bArr2;
                    this.f2532f.put(bArr);
                    bArr = bArr2;
                } else if (i6 > 0) {
                    System.arraycopy(bArr, i6, bArr, 0, bArr.length - i6);
                }
                int i9 = this.f2531e - this.f2530d;
                this.f2531e = i9;
                this.f2530d = 0;
                this.f2528b = 0;
                int i10 = inputStream.read(bArr, i9, bArr.length - i9);
                int i11 = this.f2531e;
                if (i10 > 0) {
                    i11 += i10;
                }
                this.f2528b = i11;
                return i10;
            }
        }
        int i12 = inputStream.read(bArr);
        if (i12 > 0) {
            this.f2530d = -1;
            this.f2531e = 0;
            this.f2528b = i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f2527a == null || inputStream == null) {
            throw m2783h();
        }
        return (this.f2528b - this.f2531e) + inputStream.available();
    }

    /* renamed from: c */
    public synchronized void m2785c() {
        this.f2529c = this.f2527a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2527a != null) {
            this.f2532f.put(this.f2527a);
            this.f2527a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: g */
    public synchronized void m2786g() {
        if (this.f2527a != null) {
            this.f2532f.put(this.f2527a);
            this.f2527a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i6) {
        this.f2529c = Math.max(this.f2529c, i6);
        this.f2530d = this.f2531e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f2527a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m2783h();
        }
        if (this.f2531e >= this.f2528b && m2784a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f2527a && (bArr = this.f2527a) == null) {
            throw m2783h();
        }
        int i6 = this.f2528b;
        int i7 = this.f2531e;
        if (i6 - i7 <= 0) {
            return -1;
        }
        this.f2531e = i7 + 1;
        return bArr[i7] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f2527a == null) {
            throw new IOException("Stream is closed");
        }
        int i6 = this.f2530d;
        if (-1 == i6) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f2531e + " markLimit: " + this.f2529c);
        }
        this.f2531e = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f2527a;
        if (bArr == null) {
            throw m2783h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m2783h();
        }
        int i6 = this.f2528b;
        int i7 = this.f2531e;
        if (i6 - i7 >= j6) {
            this.f2531e = (int) (i7 + j6);
            return j6;
        }
        long j7 = i6 - i7;
        this.f2531e = i6;
        if (this.f2530d == -1 || j6 > this.f2529c) {
            long jSkip = inputStream.skip(j6 - j7);
            if (jSkip > 0) {
                this.f2530d = -1;
            }
            return j7 + jSkip;
        }
        if (m2784a(inputStream, bArr) == -1) {
            return j7;
        }
        int i8 = this.f2528b;
        int i9 = this.f2531e;
        if (i8 - i9 >= j6 - j7) {
            this.f2531e = (int) ((i9 + j6) - j7);
            return j6;
        }
        long j8 = (j7 + i8) - i9;
        this.f2531e = i8;
        return j8;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC6497b interfaceC6497b, int i6) {
        super(inputStream);
        this.f2530d = -1;
        this.f2532f = interfaceC6497b;
        this.f2527a = (byte[]) interfaceC6497b.mo7190c(i6, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        byte[] bArr2 = this.f2527a;
        if (bArr2 == null) {
            throw m2783h();
        }
        if (i7 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i10 = this.f2531e;
            int i11 = this.f2528b;
            if (i10 < i11) {
                int i12 = i11 - i10 >= i7 ? i7 : i11 - i10;
                System.arraycopy(bArr2, i10, bArr, i6, i12);
                this.f2531e += i12;
                if (i12 == i7 || inputStream.available() == 0) {
                    return i12;
                }
                i6 += i12;
                i8 = i7 - i12;
            } else {
                i8 = i7;
            }
            while (true) {
                if (this.f2530d == -1 && i8 >= bArr2.length) {
                    i9 = inputStream.read(bArr, i6, i8);
                    if (i9 == -1) {
                        return i8 != i7 ? i7 - i8 : -1;
                    }
                } else {
                    if (m2784a(inputStream, bArr2) == -1) {
                        return i8 != i7 ? i7 - i8 : -1;
                    }
                    if (bArr2 != this.f2527a && (bArr2 = this.f2527a) == null) {
                        throw m2783h();
                    }
                    int i13 = this.f2528b;
                    int i14 = this.f2531e;
                    i9 = i13 - i14 >= i8 ? i8 : i13 - i14;
                    System.arraycopy(bArr2, i14, bArr, i6, i9);
                    this.f2531e += i9;
                }
                i8 -= i9;
                if (i8 == 0) {
                    return i7;
                }
                if (inputStream.available() == 0) {
                    return i7 - i8;
                }
                i6 += i9;
            }
        } else {
            throw m2783h();
        }
    }
}
