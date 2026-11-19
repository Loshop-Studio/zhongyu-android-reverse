package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ImageProxy;

/* loaded from: classes.dex */
public class ImageProcessorRequest implements ImageProcessor.Request {

    @NonNull
    private final ImageProxy mImageProxy;
    private final int mOutputFormat;

    public ImageProcessorRequest(@NonNull ImageProxy imageProxy, int i9) {
        this.mImageProxy = imageProxy;
        this.mOutputFormat = i9;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    @NonNull
    public ImageProxy getInputImage() {
        return this.mImageProxy;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.mOutputFormat;
    }
}
