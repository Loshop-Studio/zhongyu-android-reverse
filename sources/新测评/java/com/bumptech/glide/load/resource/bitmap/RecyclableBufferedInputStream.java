package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import p195p0.InterfaceC8802b;

/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f3736a;

    /* renamed from: b */
    public int f3737b;

    /* renamed from: c */
    public int f3738c;

    /* renamed from: d */
    public int f3739d;

    /* renamed from: e */
    public int f3740e;

    /* renamed from: f */
    public final InterfaceC8802b f3741f;

    public static class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC8802b interfaceC8802b) {
        this(inputStream, interfaceC8802b, 65536);
    }

    /* renamed from: h */
    public static IOException m3603h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m3604a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f3739d;
        if (i10 != -1) {
            int i11 = this.f3740e - i10;
            int i12 = this.f3738c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f3737b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3741f.mo14705c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3736a = bArr2;
                    this.f3741f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f3740e - this.f3739d;
                this.f3740e = i13;
                this.f3739d = 0;
                this.f3737b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f3740e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f3737b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f3739d = -1;
            this.f3740e = 0;
            this.f3737b = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3736a == null || inputStream == null) {
            throw m3603h();
        }
        return (this.f3737b - this.f3740e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f3736a != null) {
            this.f3741f.put(this.f3736a);
            this.f3736a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: f */
    public synchronized void m3605f() {
        this.f3738c = this.f3736a.length;
    }

    /* renamed from: g */
    public synchronized void m3606g() {
        if (this.f3736a != null) {
            this.f3741f.put(this.f3736a);
            this.f3736a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f3738c = Math.max(this.f3738c, i10);
        this.f3739d = this.f3740e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f3736a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m3603h();
        }
        if (this.f3740e >= this.f3737b && m3604a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f3736a && (bArr = this.f3736a) == null) {
            throw m3603h();
        }
        int i10 = this.f3737b;
        int i11 = this.f3740e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f3740e = i11 + 1;
        return bArr[i11] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f3736a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f3739d;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f3740e + " markLimit: " + this.f3738c);
        }
        this.f3740e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3736a;
        if (bArr == null) {
            throw m3603h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m3603h();
        }
        int i10 = this.f3737b;
        int i11 = this.f3740e;
        if (i10 - i11 >= j10) {
            this.f3740e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f3740e = i10;
        if (this.f3739d == -1 || j10 > this.f3738c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f3739d = -1;
            }
            return j11 + jSkip;
        }
        if (m3604a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f3737b;
        int i13 = this.f3740e;
        if (i12 - i13 >= j10 - j11) {
            this.f3740e = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f3740e = i12;
        return j12;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, InterfaceC8802b interfaceC8802b, int i10) {
        super(inputStream);
        this.f3739d = -1;
        this.f3741f = interfaceC8802b;
        this.f3736a = (byte[]) interfaceC8802b.mo14705c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f3736a;
        if (bArr2 == null) {
            throw m3603h();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f3740e;
            int i15 = this.f3737b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f3740e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f3739d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (m3604a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f3736a && (bArr2 = this.f3736a) == null) {
                        throw m3603h();
                    }
                    int i17 = this.f3737b;
                    int i18 = this.f3740e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f3740e += i13;
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
            throw m3603h();
        }
    }
}
