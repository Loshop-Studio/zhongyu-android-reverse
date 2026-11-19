package androidx.camera.core;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
final class ImageProxyDownsampler {

    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        public ForwardingImageProxyImpl(ImageProxy imageProxy, ImageProxy.PlaneProxy[] planeProxyArr, int i9, int i10) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i9;
            this.mDownsampledHeight = i10;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        @NonNull
        public ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(int i9, int i10, byte[] bArr) {
        return new ImageProxy.PlaneProxy(bArr, i9, i10) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = bArr;
                this.val$rowStride = i9;
                this.val$pixelStride = i10;
                this.mBuffer = ByteBuffer.wrap(bArr);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            @NonNull
            public ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    public static ForwardingImageProxy downsample(ImageProxy imageProxy, int i9, int i10, DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        int i11;
        byte[] bArr2;
        if (imageProxy.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (imageProxy.getWidth() < i9 || imageProxy.getHeight() < i10) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i9, i10) + " is not <= original dimension " + new Size(imageProxy.getWidth(), imageProxy.getHeight()) + ".");
        }
        if (imageProxy.getWidth() == i9 && imageProxy.getHeight() == i10) {
            return new ForwardingImageProxyImpl(imageProxy, imageProxy.getPlanes(), i9, i10);
        }
        int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
        int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
        int i12 = i9 / 2;
        int[] iArr3 = {i9, i12, i12};
        int i13 = i10 / 2;
        int[] iArr4 = {i10, i13, i13};
        ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
        for (int i14 = 0; i14 < 3; i14++) {
            ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i14];
            ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr3 = new byte[iArr3[i14] * iArr4[i14]];
            int iOrdinal = downsamplingMethod.ordinal();
            if (iOrdinal == 0) {
                bArr = bArr3;
                int i15 = iArr[i14];
                int pixelStride = planeProxy.getPixelStride();
                int rowStride = planeProxy.getRowStride();
                i11 = 1;
                resizeNearestNeighbor(buffer, i15, pixelStride, rowStride, iArr2[i14], bArr, iArr3[i14], iArr4[i14]);
            } else if (iOrdinal != 1) {
                bArr2 = bArr3;
                i11 = 1;
                planeProxyArr[i14] = createPlaneProxy(iArr3[i14], i11, bArr2);
            } else {
                bArr = bArr3;
                int i16 = iArr[i14];
                int pixelStride2 = planeProxy.getPixelStride();
                int rowStride2 = planeProxy.getRowStride();
                i11 = 1;
                resizeAveraging(buffer, i16, pixelStride2, rowStride2, iArr2[i14], bArr, iArr3[i14], iArr4[i14]);
            }
            bArr2 = bArr;
            planeProxyArr[i14] = createPlaneProxy(iArr3[i14], i11, bArr2);
        }
        return new ForwardingImageProxyImpl(imageProxy, planeProxyArr, i9, i10);
    }

    private static void resizeAveraging(ByteBuffer byteBuffer, int i9, int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        float f10 = i9 / i13;
        float f11 = i12 / i14;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[i11];
        int[] iArr = new int[i13];
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            iArr[i16] = ((int) (i16 * f10)) * i10;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                int i17 = 0;
                while (i17 < i14) {
                    int i18 = (int) (i17 * f11);
                    int i19 = i12 - 1;
                    int iMin = Math.min(i18, i19) * i11;
                    int iMin2 = Math.min(i18 + 1, i19) * i11;
                    int i20 = i17 * i13;
                    byteBuffer.position(iMin);
                    byteBuffer.get(bArr2, i15, Math.min(i11, byteBuffer.remaining()));
                    byteBuffer.position(iMin2);
                    byteBuffer.get(bArr3, i15, Math.min(i11, byteBuffer.remaining()));
                    for (int i21 = i15; i21 < i13; i21++) {
                        int i22 = iArr[i21];
                        bArr[i20 + i21] = (byte) ((((((bArr2[i22] & UByte.MAX_VALUE) + (bArr2[i22 + i10] & UByte.MAX_VALUE)) + (bArr3[i22] & UByte.MAX_VALUE)) + (bArr3[i22 + i10] & UByte.MAX_VALUE)) / 4) & 255);
                    }
                    i17++;
                    i15 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void resizeNearestNeighbor(ByteBuffer byteBuffer, int i9, int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        float f10 = i9 / i13;
        float f11 = i12 / i14;
        byte[] bArr2 = new byte[i11];
        int[] iArr = new int[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            iArr[i15] = ((int) (i15 * f10)) * i10;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                for (int i16 = 0; i16 < i14; i16++) {
                    int i17 = i16 * i13;
                    byteBuffer.position(Math.min((int) (i16 * f11), i12 - 1) * i11);
                    byteBuffer.get(bArr2, 0, Math.min(i11, byteBuffer.remaining()));
                    for (int i18 = 0; i18 < i13; i18++) {
                        bArr[i17 + i18] = bArr2[iArr[i18]];
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
