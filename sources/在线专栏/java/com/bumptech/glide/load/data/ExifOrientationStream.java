package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ExifOrientationStream extends FilterInputStream {
    private static final byte[] EXIF_SEGMENT;
    private static final int ORIENTATION_POSITION;
    private static final int SEGMENT_LENGTH;
    private static final int SEGMENT_START_POSITION = 2;
    private final byte orientation;
    private int position;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        EXIF_SEGMENT = bArr;
        int length = bArr.length;
        SEGMENT_LENGTH = length;
        ORIENTATION_POSITION = length + 2;
    }

    public ExifOrientationStream(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 >= -1 && i4 <= 8) {
            this.orientation = (byte) i4;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i4;
        int i5 = this.position;
        int i6 = (i5 < 2 || i5 > (i4 = ORIENTATION_POSITION)) ? super.read() : i5 == i4 ? this.orientation : EXIF_SEGMENT[i5 - 2] & 255;
        if (i6 != -1) {
            this.position++;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long jSkip = super.skip(j4);
        if (jSkip > 0) {
            this.position = (int) (this.position + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7 = this.position;
        int i8 = ORIENTATION_POSITION;
        if (i7 > i8) {
            i6 = super.read(bArr, i4, i5);
        } else if (i7 == i8) {
            bArr[i4] = this.orientation;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i4, 2 - i7);
        } else {
            int iMin = Math.min(i8 - i7, i5);
            System.arraycopy(EXIF_SEGMENT, this.position - 2, bArr, i4, iMin);
            i6 = iMin;
        }
        if (i6 > 0) {
            this.position += i6;
        }
        return i6;
    }
}
