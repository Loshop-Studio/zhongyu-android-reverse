package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p098n.InterfaceC4393b;

/* loaded from: classes2.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f878a;

    /* renamed from: b */
    public int f879b;

    /* renamed from: c */
    public int f880c;

    /* renamed from: d */
    public int f881d;

    /* renamed from: e */
    public int f882e;

    /* renamed from: f */
    public final InterfaceC4393b f883f;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC4393b interfaceC4393b) {
        this(inputStream, interfaceC4393b, 65536);
    }

    /* renamed from: d */
    public static IOException m1929d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m1930a(InputStream inputStream, byte[] bArr) throws IOException {
        int i4 = this.f881d;
        if (i4 != -1) {
            int i5 = this.f882e - i4;
            int i6 = this.f880c;
            if (i5 < i6) {
                if (i4 == 0 && i6 > bArr.length && this.f879b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i6) {
                        i6 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f883f.mo5386d(i6, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f878a = bArr2;
                    this.f883f.put(bArr);
                    bArr = bArr2;
                } else if (i4 > 0) {
                    System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                }
                int i7 = this.f882e - this.f881d;
                this.f882e = i7;
                this.f881d = 0;
                this.f879b = 0;
                int i8 = inputStream.read(bArr, i7, bArr.length - i7);
                int i9 = this.f882e;
                if (i8 > 0) {
                    i9 += i8;
                }
                this.f879b = i9;
                return i8;
            }
        }
        int i10 = inputStream.read(bArr);
        if (i10 > 0) {
            this.f881d = -1;
            this.f882e = 0;
            this.f879b = i10;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f878a == null || inputStream == null) {
            throw m1929d();
        }
        return (this.f879b - this.f882e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m1931b() {
        this.f880c = this.f878a.length;
    }

    /* renamed from: c */
    public synchronized void m1932c() {
        if (this.f878a != null) {
            this.f883f.put(this.f878a);
            this.f878a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f878a != null) {
            this.f883f.put(this.f878a);
            this.f878a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        this.f880c = Math.max(this.f880c, i4);
        this.f881d = this.f882e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f878a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m1929d();
        }
        if (this.f882e >= this.f879b && m1930a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f878a && (bArr = this.f878a) == null) {
            throw m1929d();
        }
        int i4 = this.f879b;
        int i5 = this.f882e;
        if (i4 - i5 <= 0) {
            return -1;
        }
        this.f882e = i5 + 1;
        return bArr[i5] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f878a == null) {
            throw new IOException("Stream is closed");
        }
        int i4 = this.f881d;
        if (-1 == i4) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f882e + " markLimit: " + this.f880c);
        }
        this.f882e = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j4) {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.f878a;
        if (bArr == null) {
            throw m1929d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m1929d();
        }
        int i4 = this.f879b;
        int i5 = this.f882e;
        if (i4 - i5 >= j4) {
            this.f882e = (int) (i5 + j4);
            return j4;
        }
        long j5 = i4 - i5;
        this.f882e = i4;
        if (this.f881d == -1 || j4 > this.f880c) {
            return j5 + inputStream.skip(j4 - j5);
        }
        if (m1930a(inputStream, bArr) == -1) {
            return j5;
        }
        int i6 = this.f879b;
        int i7 = this.f882e;
        if (i6 - i7 >= j4 - j5) {
            this.f882e = (int) ((i7 + j4) - j5);
            return j4;
        }
        long j6 = (j5 + i6) - i7;
        this.f882e = i6;
        return j6;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC4393b interfaceC4393b, int i4) {
        super(inputStream);
        this.f881d = -1;
        this.f883f = interfaceC4393b;
        this.f878a = (byte[]) interfaceC4393b.mo5386d(i4, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        byte[] bArr2 = this.f878a;
        if (bArr2 == null) {
            throw m1929d();
        }
        if (i5 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i8 = this.f882e;
            int i9 = this.f879b;
            if (i8 < i9) {
                int i10 = i9 - i8 >= i5 ? i5 : i9 - i8;
                System.arraycopy(bArr2, i8, bArr, i4, i10);
                this.f882e += i10;
                if (i10 == i5 || inputStream.available() == 0) {
                    return i10;
                }
                i4 += i10;
                i6 = i5 - i10;
            } else {
                i6 = i5;
            }
            while (true) {
                if (this.f881d == -1 && i6 >= bArr2.length) {
                    i7 = inputStream.read(bArr, i4, i6);
                    if (i7 == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                } else {
                    if (m1930a(inputStream, bArr2) == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                    if (bArr2 != this.f878a && (bArr2 = this.f878a) == null) {
                        throw m1929d();
                    }
                    int i11 = this.f879b;
                    int i12 = this.f882e;
                    i7 = i11 - i12 >= i6 ? i6 : i11 - i12;
                    System.arraycopy(bArr2, i12, bArr, i4, i7);
                    this.f882e += i7;
                }
                i6 -= i7;
                if (i6 == 0) {
                    return i5;
                }
                if (inputStream.available() == 0) {
                    return i5 - i6;
                }
                i4 += i7;
            }
        } else {
            throw m1929d();
        }
    }
}
