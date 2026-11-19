package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    private volatile byte[] buf;
    private final ArrayPool byteArrayPool;
    private int count;
    private int marklimit;
    private int markpos;
    private int pos;

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool) {
        this(inputStream, arrayPool, ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
    }

    private int fillbuf(InputStream inputStream, byte[] bArr) throws IOException {
        int i4 = this.markpos;
        if (i4 != -1) {
            int i5 = this.pos - i4;
            int i6 = this.marklimit;
            if (i5 < i6) {
                if (i4 == 0 && i6 > bArr.length && this.count == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i6) {
                        i6 = length;
                    }
                    byte[] bArr2 = (byte[]) this.byteArrayPool.get(i6, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.buf = bArr2;
                    this.byteArrayPool.put(bArr);
                    bArr = bArr2;
                } else if (i4 > 0) {
                    System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                }
                int i7 = this.pos - this.markpos;
                this.pos = i7;
                this.markpos = 0;
                this.count = 0;
                int i8 = inputStream.read(bArr, i7, bArr.length - i7);
                int i9 = this.pos;
                if (i8 > 0) {
                    i9 += i8;
                }
                this.count = i9;
                return i8;
            }
        }
        int i10 = inputStream.read(bArr);
        if (i10 > 0) {
            this.markpos = -1;
            this.pos = 0;
            this.count = i10;
        }
        return i10;
    }

    private static IOException streamClosed() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.buf == null || inputStream == null) {
            throw streamClosed();
        }
        return (this.count - this.pos) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void fixMarkLimit() {
        this.marklimit = this.buf.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        this.marklimit = Math.max(this.marklimit, i4);
        this.markpos = this.pos;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.buf;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw streamClosed();
        }
        if (this.pos >= this.count && fillbuf(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.buf && (bArr = this.buf) == null) {
            throw streamClosed();
        }
        int i4 = this.count;
        int i5 = this.pos;
        if (i4 - i5 <= 0) {
            return -1;
        }
        this.pos = i5 + 1;
        return bArr[i5] & 255;
    }

    public synchronized void release() {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.buf == null) {
            throw new IOException("Stream is closed");
        }
        int i4 = this.markpos;
        if (-1 == i4) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.pos + " markLimit: " + this.marklimit);
        }
        this.pos = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j4) throws IOException {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.buf;
        if (bArr == null) {
            throw streamClosed();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw streamClosed();
        }
        int i4 = this.count;
        int i5 = this.pos;
        if (i4 - i5 >= j4) {
            this.pos = (int) (i5 + j4);
            return j4;
        }
        long j5 = i4 - i5;
        this.pos = i4;
        if (this.markpos == -1 || j4 > this.marklimit) {
            return j5 + inputStream.skip(j4 - j5);
        }
        if (fillbuf(inputStream, bArr) == -1) {
            return j5;
        }
        int i6 = this.count;
        int i7 = this.pos;
        if (i6 - i7 >= j4 - j5) {
            this.pos = (int) ((i7 + j4) - j5);
            return j4;
        }
        long j6 = (j5 + i6) - i7;
        this.pos = i6;
        return j6;
    }

    RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool, int i4) {
        super(inputStream);
        this.markpos = -1;
        this.byteArrayPool = arrayPool;
        this.buf = (byte[]) arrayPool.get(i4, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7;
        byte[] bArr2 = this.buf;
        if (bArr2 == null) {
            throw streamClosed();
        }
        if (i5 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i8 = this.pos;
            int i9 = this.count;
            if (i8 < i9) {
                int i10 = i9 - i8 >= i5 ? i5 : i9 - i8;
                System.arraycopy(bArr2, i8, bArr, i4, i10);
                this.pos += i10;
                if (i10 == i5 || inputStream.available() == 0) {
                    return i10;
                }
                i4 += i10;
                i6 = i5 - i10;
            } else {
                i6 = i5;
            }
            while (true) {
                if (this.markpos == -1 && i6 >= bArr2.length) {
                    i7 = inputStream.read(bArr, i4, i6);
                    if (i7 == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                } else {
                    if (fillbuf(inputStream, bArr2) == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                    if (bArr2 != this.buf && (bArr2 = this.buf) == null) {
                        throw streamClosed();
                    }
                    int i11 = this.count;
                    int i12 = this.pos;
                    i7 = i11 - i12 >= i6 ? i6 : i11 - i12;
                    System.arraycopy(bArr2, i12, bArr, i4, i7);
                    this.pos += i7;
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
            throw streamClosed();
        }
    }
}
