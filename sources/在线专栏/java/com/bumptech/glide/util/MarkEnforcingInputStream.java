package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class MarkEnforcingInputStream extends FilterInputStream {
    private static final int END_OF_STREAM = -1;
    private static final int UNSET = Integer.MIN_VALUE;
    private int availableBytes;

    public MarkEnforcingInputStream(InputStream inputStream) {
        super(inputStream);
        this.availableBytes = Integer.MIN_VALUE;
    }

    private long getBytesToRead(long j4) {
        int i4 = this.availableBytes;
        if (i4 == 0) {
            return -1L;
        }
        return (i4 == Integer.MIN_VALUE || j4 <= ((long) i4)) ? j4 : i4;
    }

    private void updateAvailableBytesAfterRead(long j4) {
        int i4 = this.availableBytes;
        if (i4 == Integer.MIN_VALUE || j4 == -1) {
            return;
        }
        this.availableBytes = (int) (i4 - j4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i4 = this.availableBytes;
        return i4 == Integer.MIN_VALUE ? super.available() : Math.min(i4, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        super.mark(i4);
        this.availableBytes = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (getBytesToRead(1L) == -1) {
            return -1;
        }
        int i4 = super.read();
        updateAvailableBytesAfterRead(1L);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.availableBytes = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long bytesToRead = getBytesToRead(j4);
        if (bytesToRead == -1) {
            return 0L;
        }
        long jSkip = super.skip(bytesToRead);
        updateAvailableBytesAfterRead(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int bytesToRead = (int) getBytesToRead(i5);
        if (bytesToRead == -1) {
            return -1;
        }
        int i6 = super.read(bArr, i4, bytesToRead);
        updateAvailableBytesAfterRead(i6);
        return i6;
    }
}
