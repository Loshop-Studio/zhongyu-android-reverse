package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class DelegatingImageSavedCallback implements ImageCapture.OnImageSavedCallback {
    private final AtomicReference<ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(ImageCapture.OnImageSavedCallback delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this._delegate = new AtomicReference<>(delegate);
    }

    private final ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureProcessProgressed(int i10) {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i10);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureStarted() {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onError(ImageCaptureException exception) {
        AbstractC9979u.m20294g(exception, "exception");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(exception);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
        AbstractC9979u.m20294g(outputFileResults, "outputFileResults");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(outputFileResults);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
