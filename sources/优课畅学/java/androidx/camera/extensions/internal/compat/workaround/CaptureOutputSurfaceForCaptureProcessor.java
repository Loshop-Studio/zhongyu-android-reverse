package androidx.camera.extensions.internal.compat.workaround;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

@OptIn(markerClass = {ExperimentalGetImage.class})
/* loaded from: classes.dex */
public class CaptureOutputSurfaceForCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "CaptureOutputSurface";
    private static final long UNSPECIFIED_TIMESTAMP = -1;

    @GuardedBy("mLock")
    private final ImageWriter mImageWriter;

    @GuardedBy("mLock")
    private final ImageReaderProxy mIntermediateImageReader;
    private final boolean mNeedIntermediaSurface;
    private final boolean mNeedOverrideTimestamp;

    @NonNull
    private final Surface mOutputSurface;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mIsClosed = false;
    long mOutputImageTimeStamp = -1;

    @RequiresApi(23)
    public static final class Api23Impl {
        private Api23Impl() {
        }

        public static void setImageTimestamp(@NonNull Image image, long j10) {
            image.setTimestamp(j10);
        }
    }

    @RequiresApi(29)
    public static final class ImageWriterCompat {
        private ImageWriterCompat() {
        }

        public static void close(ImageWriter imageWriter) {
            imageWriter.close();
        }

        @NonNull
        public static ImageWriter newInstance(@NonNull Surface surface, int i10, int i11) {
            return ImageWriter.newInstance(surface, i10, i11);
        }

        public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public CaptureOutputSurfaceForCaptureProcessor(@NonNull Surface surface, @NonNull Size size, boolean z10) {
        this.mNeedOverrideTimestamp = z10;
        boolean z11 = DeviceQuirks.get(CaptureOutputSurfaceOccupiedQuirk.class) != null || z10;
        this.mNeedIntermediaSurface = z11;
        if (Build.VERSION.SDK_INT < 29 || !z11) {
            this.mOutputSurface = surface;
            this.mIntermediateImageReader = null;
            this.mImageWriter = null;
        } else {
            Logger.m479d(TAG, "Enabling intermediate surface");
            ImageReaderProxy imageReaderProxyCreateIsolatedReader = ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
            this.mIntermediateImageReader = imageReaderProxyCreateIsolatedReader;
            this.mOutputSurface = imageReaderProxyCreateIsolatedReader.getSurface();
            this.mImageWriter = ImageWriterCompat.newInstance(surface, 2, 35);
            imageReaderProxyCreateIsolatedReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.compat.workaround.a
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    CaptureOutputSurfaceForCaptureProcessor.m653a(this.f848a, imageReaderProxy);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m653a(CaptureOutputSurfaceForCaptureProcessor captureOutputSurfaceForCaptureProcessor, ImageReaderProxy imageReaderProxy) {
        Image image;
        synchronized (captureOutputSurfaceForCaptureProcessor.mLock) {
            try {
                if (captureOutputSurfaceForCaptureProcessor.mIsClosed) {
                    return;
                }
                ImageProxy imageProxyAcquireNextImage = imageReaderProxy.acquireNextImage();
                if (imageProxyAcquireNextImage != null && (image = imageProxyAcquireNextImage.getImage()) != null) {
                    if (captureOutputSurfaceForCaptureProcessor.mNeedOverrideTimestamp) {
                        long j10 = captureOutputSurfaceForCaptureProcessor.mOutputImageTimeStamp;
                        if (j10 != -1) {
                            Api23Impl.setImageTimestamp(image, j10);
                        }
                    }
                    ImageWriterCompat.queueInputImage(captureOutputSurfaceForCaptureProcessor.mImageWriter, image);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            try {
                this.mIsClosed = true;
                if (Build.VERSION.SDK_INT >= 29 && this.mNeedIntermediaSurface) {
                    this.mIntermediateImageReader.clearOnImageAvailableListener();
                    this.mIntermediateImageReader.close();
                    ImageWriterCompat.close(this.mImageWriter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public Surface getSurface() {
        return this.mOutputSurface;
    }

    public void setOutputImageTimestamp(long j10) {
        if (this.mNeedOverrideTimestamp) {
            this.mOutputImageTimeStamp = j10;
        }
    }
}
