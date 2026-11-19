package androidx.compose.p013ui.graphics;

import androidx.annotation.IntRange;

/* loaded from: classes2.dex */
public final class PixelMap {
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i10, int i11, int i12, int i13) {
        this.buffer = iArr;
        this.width = i10;
        this.height = i11;
        this.bufferOffset = i12;
        this.stride = i13;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m24573getWaAFU9c(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i11 * this.stride) + i10]);
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
