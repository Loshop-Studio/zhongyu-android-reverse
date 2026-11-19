package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p164l0.InterfaceC8865b;

/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f3532a;

    /* renamed from: b */
    public int f3533b;

    /* renamed from: c */
    public int f3534c;

    /* renamed from: d */
    public int f3535d;

    /* renamed from: e */
    public int f3536e;

    /* renamed from: f */
    public final InterfaceC8865b f3537f;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC8865b interfaceC8865b) {
        this(inputStream, interfaceC8865b, 65536);
    }

    /* renamed from: h */
    public static IOException m3253h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m3254a(InputStream inputStream, byte[] bArr) throws IOException {
        int i9 = this.f3535d;
        if (i9 != -1) {
            int i10 = this.f3536e - i9;
            int i11 = this.f3534c;
            if (i10 < i11) {
                if (i9 == 0 && i11 > bArr.length && this.f3533b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3537f.mo13725c(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3532a = bArr2;
                    this.f3537f.put(bArr);
                    bArr = bArr2;
                } else if (i9 > 0) {
                    System.arraycopy(bArr, i9, bArr, 0, bArr.length - i9);
                }
                int i12 = this.f3536e - this.f3535d;
                this.f3536e = i12;
                this.f3535d = 0;
                this.f3533b = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f3536e;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f3533b = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f3535d = -1;
            this.f3536e = 0;
            this.f3533b = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3532a == null || inputStream == null) {
            throw m3253h();
        }
        return (this.f3533b - this.f3536e) + inputStream.available();
    }

    /* renamed from: c */
    public synchronized void m3255c() {
        this.f3534c = this.f3532a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f3532a != null) {
            this.f3537f.put(this.f3532a);
            this.f3532a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: g */
    public synchronized void m3256g() {
        if (this.f3532a != null) {
            this.f3537f.put(this.f3532a);
            this.f3532a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i9) {
        this.f3534c = Math.max(this.f3534c, i9);
        this.f3535d = this.f3536e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f3532a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m3253h();
        }
        if (this.f3536e >= this.f3533b && m3254a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f3532a && (bArr = this.f3532a) == null) {
            throw m3253h();
        }
        int i9 = this.f3533b;
        int i10 = this.f3536e;
        if (i9 - i10 <= 0) {
            return -1;
        }
        this.f3536e = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f3532a == null) {
            throw new IOException("Stream is closed");
        }
        int i9 = this.f3535d;
        if (-1 == i9) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f3536e + " markLimit: " + this.f3534c);
        }
        this.f3536e = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j9) {
        if (j9 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3532a;
        if (bArr == null) {
            throw m3253h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m3253h();
        }
        int i9 = this.f3533b;
        int i10 = this.f3536e;
        if (i9 - i10 >= j9) {
            this.f3536e = (int) (i10 + j9);
            return j9;
        }
        long j10 = i9 - i10;
        this.f3536e = i9;
        if (this.f3535d == -1 || j9 > this.f3534c) {
            return j10 + inputStream.skip(j9 - j10);
        }
        if (m3254a(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f3533b;
        int i12 = this.f3536e;
        if (i11 - i12 >= j9 - j10) {
            this.f3536e = (int) ((i12 + j9) - j10);
            return j9;
        }
        long j11 = (j10 + i11) - i12;
        this.f3536e = i11;
        return j11;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC8865b interfaceC8865b, int i9) {
        super(inputStream);
        this.f3535d = -1;
        this.f3537f = interfaceC8865b;
        this.f3532a = (byte[]) interfaceC8865b.mo13725c(i9, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f3532a;
        if (bArr2 == null) {
            throw m3253h();
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f3536e;
            int i14 = this.f3533b;
            if (i13 < i14) {
                int i15 = i14 - i13 >= i10 ? i10 : i14 - i13;
                System.arraycopy(bArr2, i13, bArr, i9, i15);
                this.f3536e += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i9 += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f3535d == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i9, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (m3254a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f3532a && (bArr2 = this.f3532a) == null) {
                        throw m3253h();
                    }
                    int i16 = this.f3533b;
                    int i17 = this.f3536e;
                    i12 = i16 - i17 >= i11 ? i11 : i16 - i17;
                    System.arraycopy(bArr2, i17, bArr, i9, i12);
                    this.f3536e += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i9 += i12;
            }
        } else {
            throw m3253h();
        }
    }
}
