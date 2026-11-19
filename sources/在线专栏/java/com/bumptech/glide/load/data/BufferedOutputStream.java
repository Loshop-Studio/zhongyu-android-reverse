package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class BufferedOutputStream extends OutputStream {
    private ArrayPool arrayPool;
    private byte[] buffer;
    private int index;
    private final OutputStream out;

    public BufferedOutputStream(OutputStream outputStream, ArrayPool arrayPool) {
        this(outputStream, arrayPool, ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
    }

    private void flushBuffer() throws IOException {
        int i4 = this.index;
        if (i4 > 0) {
            this.out.write(this.buffer, 0, i4);
            this.index = 0;
        }
    }

    private void maybeFlushBuffer() throws IOException {
        if (this.index == this.buffer.length) {
            flushBuffer();
        }
    }

    private void release() {
        byte[] bArr = this.buffer;
        if (bArr != null) {
            this.arrayPool.put(bArr);
            this.buffer = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.out.close();
            release();
        } catch (Throwable th) {
            this.out.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushBuffer();
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        byte[] bArr = this.buffer;
        int i5 = this.index;
        this.index = i5 + 1;
        bArr[i5] = (byte) i4;
        maybeFlushBuffer();
    }

    BufferedOutputStream(OutputStream outputStream, ArrayPool arrayPool, int i4) {
        this.out = outputStream;
        this.arrayPool = arrayPool;
        this.buffer = (byte[]) arrayPool.get(i4, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        do {
            int i7 = i5 - i6;
            int i8 = i4 + i6;
            int i9 = this.index;
            if (i9 == 0 && i7 >= this.buffer.length) {
                this.out.write(bArr, i8, i7);
                return;
            }
            int iMin = Math.min(i7, this.buffer.length - i9);
            System.arraycopy(bArr, i8, this.buffer, this.index, iMin);
            this.index += iMin;
            i6 += iMin;
            maybeFlushBuffer();
        } while (i6 < i5);
    }
}
