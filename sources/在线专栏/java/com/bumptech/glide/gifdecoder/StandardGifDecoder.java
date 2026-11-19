package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.umeng.analytics.pro.C1913n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class StandardGifDecoder implements GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;
    private static final int COLOR_TRANSPARENT_BLACK = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    private static final String TAG = "StandardGifDecoder";
    private int[] act;
    private Bitmap.Config bitmapConfig;
    private final GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;
    private Boolean isFirstFrameTransparent;
    private byte[] mainPixels;
    private int[] mainScratch;
    private GifHeaderParser parser;
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    private int averageColorsNear(int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i4; i12 < this.sampleSize + i4; i12++) {
            byte[] bArr = this.mainPixels;
            if (i12 >= bArr.length || i12 >= i5) {
                break;
            }
            int i13 = this.act[bArr[i12] & 255];
            if (i13 != 0) {
                i7 += (i13 >> 24) & MASK_INT_LOWEST_BYTE;
                i8 += (i13 >> 16) & MASK_INT_LOWEST_BYTE;
                i9 += (i13 >> 8) & MASK_INT_LOWEST_BYTE;
                i10 += i13 & MASK_INT_LOWEST_BYTE;
                i11++;
            }
        }
        int i14 = i4 + i6;
        for (int i15 = i14; i15 < this.sampleSize + i14; i15++) {
            byte[] bArr2 = this.mainPixels;
            if (i15 >= bArr2.length || i15 >= i5) {
                break;
            }
            int i16 = this.act[bArr2[i15] & 255];
            if (i16 != 0) {
                i7 += (i16 >> 24) & MASK_INT_LOWEST_BYTE;
                i8 += (i16 >> 16) & MASK_INT_LOWEST_BYTE;
                i9 += (i16 >> 8) & MASK_INT_LOWEST_BYTE;
                i10 += i16 & MASK_INT_LOWEST_BYTE;
                i11++;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        return ((i7 / i11) << 24) | ((i8 / i11) << 16) | ((i9 / i11) << 8) | (i10 / i11);
    }

    private void copyCopyIntoScratchRobust(GifFrame gifFrame) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.mainScratch;
        int i9 = gifFrame.f6958ih;
        int i10 = this.sampleSize;
        int i11 = i9 / i10;
        int i12 = gifFrame.f6961iy / i10;
        int i13 = gifFrame.f6959iw / i10;
        int i14 = gifFrame.f6960ix / i10;
        boolean z3 = this.framePointer == 0;
        int i15 = this.downsampledWidth;
        int i16 = this.downsampledHeight;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        Boolean bool = this.isFirstFrameTransparent;
        int i17 = 8;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1;
        while (i18 < i11) {
            Boolean bool2 = bool;
            if (gifFrame.interlace) {
                if (i19 >= i11) {
                    i4 = i11;
                    int i21 = i20 + 1;
                    if (i21 == 2) {
                        i20 = i21;
                        i19 = 4;
                    } else if (i21 == 3) {
                        i20 = i21;
                        i19 = 2;
                        i17 = 4;
                    } else if (i21 != 4) {
                        i20 = i21;
                    } else {
                        i20 = i21;
                        i19 = 1;
                        i17 = 2;
                    }
                } else {
                    i4 = i11;
                }
                i5 = i19 + i17;
            } else {
                i4 = i11;
                i5 = i19;
                i19 = i18;
            }
            int i22 = i19 + i12;
            boolean z4 = i10 == 1;
            if (i22 < i16) {
                int i23 = i22 * i15;
                int i24 = i23 + i14;
                int i25 = i24 + i13;
                int i26 = i23 + i15;
                if (i26 < i25) {
                    i25 = i26;
                }
                i6 = i5;
                int i27 = i18 * i10 * gifFrame.f6959iw;
                if (z4) {
                    int i28 = i24;
                    while (i28 < i25) {
                        int i29 = i12;
                        int i30 = iArr2[bArr[i27] & 255];
                        if (i30 != 0) {
                            iArr[i28] = i30;
                        } else if (z3 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i27 += i10;
                        i28++;
                        i12 = i29;
                    }
                } else {
                    i8 = i12;
                    int i31 = ((i25 - i24) * i10) + i27;
                    int i32 = i24;
                    while (true) {
                        i7 = i13;
                        if (i32 < i25) {
                            int iAverageColorsNear = averageColorsNear(i27, i31, gifFrame.f6959iw);
                            if (iAverageColorsNear != 0) {
                                iArr[i32] = iAverageColorsNear;
                            } else if (z3 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i27 += i10;
                            i32++;
                            i13 = i7;
                        }
                    }
                    bool = bool2;
                    i18++;
                    i12 = i8;
                    i13 = i7;
                    i11 = i4;
                    i19 = i6;
                }
            } else {
                i6 = i5;
            }
            i8 = i12;
            i7 = i13;
            bool = bool2;
            i18++;
            i12 = i8;
            i13 = i7;
            i11 = i4;
            i19 = i6;
        }
        Boolean bool3 = bool;
        if (this.isFirstFrameTransparent == null) {
            this.isFirstFrameTransparent = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void copyIntoScratchFast(GifFrame gifFrame) {
        GifFrame gifFrame2 = gifFrame;
        int[] iArr = this.mainScratch;
        int i4 = gifFrame2.f6958ih;
        int i5 = gifFrame2.f6961iy;
        int i6 = gifFrame2.f6959iw;
        int i7 = gifFrame2.f6960ix;
        boolean z3 = this.framePointer == 0;
        int i8 = this.downsampledWidth;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        int i9 = 0;
        byte b4 = -1;
        while (i9 < i4) {
            int i10 = (i9 + i5) * i8;
            int i11 = i10 + i7;
            int i12 = i11 + i6;
            int i13 = i10 + i8;
            if (i13 < i12) {
                i12 = i13;
            }
            int i14 = gifFrame2.f6959iw * i9;
            int i15 = i11;
            while (i15 < i12) {
                byte b5 = bArr[i14];
                int i16 = i4;
                int i17 = b5 & 255;
                if (i17 != b4) {
                    int i18 = iArr2[i17];
                    if (i18 != 0) {
                        iArr[i15] = i18;
                    } else {
                        b4 = b5;
                    }
                }
                i14++;
                i15++;
                i4 = i16;
            }
            i9++;
            gifFrame2 = gifFrame;
        }
        Boolean bool = this.isFirstFrameTransparent;
        this.isFirstFrameTransparent = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.isFirstFrameTransparent == null && z3 && b4 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void decodeBitmapData(GifFrame gifFrame) {
        int i4;
        int i5;
        short s3;
        StandardGifDecoder standardGifDecoder = this;
        if (gifFrame != null) {
            standardGifDecoder.rawData.position(gifFrame.bufferFrameStart);
        }
        if (gifFrame == null) {
            GifHeader gifHeader = standardGifDecoder.header;
            i4 = gifHeader.width;
            i5 = gifHeader.height;
        } else {
            i4 = gifFrame.f6959iw;
            i5 = gifFrame.f6958ih;
        }
        int i6 = i4 * i5;
        byte[] bArr = standardGifDecoder.mainPixels;
        if (bArr == null || bArr.length < i6) {
            standardGifDecoder.mainPixels = standardGifDecoder.bitmapProvider.obtainByteArray(i6);
        }
        byte[] bArr2 = standardGifDecoder.mainPixels;
        if (standardGifDecoder.prefix == null) {
            standardGifDecoder.prefix = new short[4096];
        }
        short[] sArr = standardGifDecoder.prefix;
        if (standardGifDecoder.suffix == null) {
            standardGifDecoder.suffix = new byte[4096];
        }
        byte[] bArr3 = standardGifDecoder.suffix;
        if (standardGifDecoder.pixelStack == null) {
            standardGifDecoder.pixelStack = new byte[C1913n.a.f8859a];
        }
        byte[] bArr4 = standardGifDecoder.pixelStack;
        int i7 = readByte();
        int i8 = 1 << i7;
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = i7 + 1;
        int i12 = (1 << i11) - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i8; i14++) {
            sArr[i14] = 0;
            bArr3[i14] = (byte) i14;
        }
        byte[] bArr5 = standardGifDecoder.block;
        int i15 = i11;
        int i16 = i10;
        int i17 = i12;
        int block = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            if (i13 >= i6) {
                break;
            }
            if (block == 0) {
                block = readBlock();
                if (block <= 0) {
                    standardGifDecoder.status = 3;
                    break;
                }
                i18 = 0;
            }
            i20 += (bArr5[i18] & 255) << i19;
            i18++;
            block--;
            int i25 = i19 + 8;
            int i26 = i16;
            int i27 = i15;
            int i28 = i22;
            int i29 = i11;
            int i30 = i23;
            while (true) {
                if (i25 < i27) {
                    i22 = i28;
                    i16 = i26;
                    i19 = i25;
                    standardGifDecoder = this;
                    i23 = i30;
                    i11 = i29;
                    i15 = i27;
                    break;
                }
                int i31 = i10;
                int i32 = i20 & i17;
                i20 >>= i27;
                i25 -= i27;
                if (i32 == i8) {
                    i17 = i12;
                    i27 = i29;
                    i26 = i31;
                    i10 = i26;
                    i28 = -1;
                } else {
                    if (i32 == i9) {
                        i19 = i25;
                        i23 = i30;
                        i16 = i26;
                        i11 = i29;
                        i10 = i31;
                        i22 = i28;
                        i15 = i27;
                        standardGifDecoder = this;
                        break;
                    }
                    if (i28 == -1) {
                        bArr2[i21] = bArr3[i32];
                        i21++;
                        i13++;
                        i28 = i32;
                        i30 = i28;
                        i10 = i31;
                        i25 = i25;
                    } else {
                        if (i32 >= i26) {
                            bArr4[i24] = (byte) i30;
                            i24++;
                            s3 = i28;
                        } else {
                            s3 = i32;
                        }
                        while (s3 >= i8) {
                            bArr4[i24] = bArr3[s3];
                            i24++;
                            s3 = sArr[s3];
                        }
                        i30 = bArr3[s3] & 255;
                        byte b4 = (byte) i30;
                        bArr2[i21] = b4;
                        while (true) {
                            i21++;
                            i13++;
                            if (i24 <= 0) {
                                break;
                            }
                            i24--;
                            bArr2[i21] = bArr4[i24];
                        }
                        byte[] bArr6 = bArr4;
                        if (i26 < 4096) {
                            sArr[i26] = (short) i28;
                            bArr3[i26] = b4;
                            i26++;
                            if ((i26 & i17) == 0 && i26 < 4096) {
                                i27++;
                                i17 += i26;
                            }
                        }
                        i28 = i32;
                        i10 = i31;
                        i25 = i25;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i21, i6, (byte) 0);
    }

    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    private Bitmap getNextBitmap() {
        Boolean bool = this.isFirstFrameTransparent;
        Bitmap bitmapObtain = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.bitmapConfig);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }

    private int readBlock() {
        int i4 = readByte();
        if (i4 <= 0) {
            return i4;
        }
        ByteBuffer byteBuffer = this.rawData;
        byteBuffer.get(this.block, 0, Math.min(i4, byteBuffer.remaining()));
        return i4;
    }

    private int readByte() {
        return this.rawData.get() & 255;
    }

    private Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        int i4;
        int i5;
        Bitmap bitmap;
        int[] iArr = this.mainScratch;
        int i6 = 0;
        if (gifFrame2 == null) {
            Bitmap bitmap2 = this.previousImage;
            if (bitmap2 != null) {
                this.bitmapProvider.release(bitmap2);
            }
            this.previousImage = null;
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose == 3 && this.previousImage == null) {
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && (i5 = gifFrame2.dispose) > 0) {
            if (i5 == 2) {
                if (!gifFrame.transparency) {
                    GifHeader gifHeader = this.header;
                    int i7 = gifHeader.bgColor;
                    if (gifFrame.lct == null || gifHeader.bgIndex != gifFrame.transIndex) {
                        i6 = i7;
                    }
                }
                int i8 = gifFrame2.f6958ih;
                int i9 = this.sampleSize;
                int i10 = i8 / i9;
                int i11 = gifFrame2.f6961iy / i9;
                int i12 = gifFrame2.f6959iw / i9;
                int i13 = gifFrame2.f6960ix / i9;
                int i14 = this.downsampledWidth;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr[i18] = i6;
                    }
                    i15 += this.downsampledWidth;
                }
            } else if (i5 == 3 && (bitmap = this.previousImage) != null) {
                int i19 = this.downsampledWidth;
                bitmap.getPixels(iArr, 0, i19, 0, 0, i19, this.downsampledHeight);
            }
        }
        decodeBitmapData(gifFrame);
        if (gifFrame.interlace || this.sampleSize != 1) {
            copyCopyIntoScratchRobust(gifFrame);
        } else {
            copyIntoScratchFast(gifFrame);
        }
        if (this.savePrevious && ((i4 = gifFrame.dispose) == 0 || i4 == 1)) {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            Bitmap bitmap3 = this.previousImage;
            int i20 = this.downsampledWidth;
            bitmap3.setPixels(iArr, 0, i20, 0, 0, i20, this.downsampledHeight);
        }
        Bitmap nextBitmap = getNextBitmap();
        int i21 = this.downsampledWidth;
        nextBitmap.setPixels(iArr, 0, i21, 0, 0, i21, this.downsampledHeight);
        return nextBitmap;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.framePointer = (this.framePointer + 1) % this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.header = null;
        byte[] bArr = this.mainPixels;
        if (bArr != null) {
            this.bitmapProvider.release(bArr);
        }
        int[] iArr = this.mainScratch;
        if (iArr != null) {
            this.bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.previousImage;
        if (bitmap != null) {
            this.bitmapProvider.release(bitmap);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = null;
        byte[] bArr2 = this.block;
        if (bArr2 != null) {
            this.bitmapProvider.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.rawData.limit() + this.mainPixels.length + (this.mainScratch.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public ByteBuffer getData() {
        return this.rawData;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i4) {
        if (i4 >= 0) {
            GifHeader gifHeader = this.header;
            if (i4 < gifHeader.frameCount) {
                return gifHeader.frames.get(i4).delay;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.header.height;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        int i4 = this.header.loopCount;
        if (i4 == -1) {
            return 1;
        }
        return i4;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i4;
        if (this.header.frameCount <= 0 || (i4 = this.framePointer) < 0) {
            return 0;
        }
        return getDelay(i4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized Bitmap getNextFrame() {
        if (this.header.frameCount <= 0 || this.framePointer < 0) {
            String str = TAG;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.header.frameCount + ", framePointer=" + this.framePointer);
            }
            this.status = 1;
        }
        int i4 = this.status;
        if (i4 != 1 && i4 != 2) {
            this.status = 0;
            if (this.block == null) {
                this.block = this.bitmapProvider.obtainByteArray(MASK_INT_LOWEST_BYTE);
            }
            GifFrame gifFrame = this.header.frames.get(this.framePointer);
            int i5 = this.framePointer - 1;
            GifFrame gifFrame2 = i5 >= 0 ? this.header.frames.get(i5) : null;
            int[] iArr = gifFrame.lct;
            if (iArr == null) {
                iArr = this.header.gct;
            }
            this.act = iArr;
            if (iArr == null) {
                String str2 = TAG;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.framePointer);
                }
                this.status = 1;
                return null;
            }
            if (gifFrame.transparency) {
                System.arraycopy(iArr, 0, this.pct, 0, iArr.length);
                int[] iArr2 = this.pct;
                this.act = iArr2;
                iArr2[gifFrame.transIndex] = 0;
                if (gifFrame.dispose == 2 && this.framePointer == 0) {
                    this.isFirstFrameTransparent = Boolean.TRUE;
                }
            }
            return setPixels(gifFrame, gifFrame2);
        }
        String str3 = TAG;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.status);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        int i4 = this.header.loopCount;
        if (i4 == -1) {
            return 1;
        }
        if (i4 == 0) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.header.width;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(InputStream inputStream, int i4) throws IOException {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4 > 0 ? i4 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i5 = inputStream.read(bArr, 0, 16384);
                    if (i5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e4) {
                Log.w(TAG, "Error reading data from stream", e4);
            }
        } else {
            this.status = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                Log.w(TAG, "Error closing stream", e5);
            }
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.bitmapConfig = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i4) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider) {
        this.pct = new int[256];
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.bitmapProvider = bitmapProvider;
        this.header = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer, int i4) {
        if (i4 > 0) {
            int iHighestOneBit = Integer.highestOneBit(i4);
            this.status = 0;
            this.header = gifHeader;
            this.framePointer = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.rawData = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.rawData.order(ByteOrder.LITTLE_ENDIAN);
            this.savePrevious = false;
            Iterator<GifFrame> it = gifHeader.frames.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().dispose == 3) {
                    this.savePrevious = true;
                    break;
                }
            }
            this.sampleSize = iHighestOneBit;
            int i5 = gifHeader.width;
            this.downsampledWidth = i5 / iHighestOneBit;
            int i6 = gifHeader.height;
            this.downsampledHeight = i6 / iHighestOneBit;
            this.mainPixels = this.bitmapProvider.obtainByteArray(i5 * i6);
            this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(byte[] bArr) {
        GifHeader header = getHeaderParser().setData(bArr).parseHeader();
        this.header = header;
        if (bArr != null) {
            setData(header, bArr);
        }
        return this.status;
    }
}
