package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00010\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Landroidx/camera/core/DelegatingImageSavedCallback;", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "delegate", "<init>", "(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", "Ld6/s;", "dispose", "()V", "onCaptureStarted", "", "progress", "onCaptureProcessProgressed", "(I)V", "Landroid/graphics/Bitmap;", "bitmap", "onPostviewBitmapAvailable", "(Landroid/graphics/Bitmap;)V", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "outputFileResults", "onImageSaved", "(Landroidx/camera/core/ImageCapture$OutputFileResults;)V", "Landroidx/camera/core/ImageCaptureException;", "exception", "onError", "(Landroidx/camera/core/ImageCaptureException;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "_delegate", "Ljava/util/concurrent/atomic/AtomicReference;", "getDelegate", "()Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "camera-core_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DelegatingImageSavedCallback implements ImageCapture.OnImageSavedCallback {

    @NotNull
    private final AtomicReference<ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(@NotNull ImageCapture.OnImageSavedCallback delegate) {
        AbstractC5830k.m5330g(delegate, "delegate");
        this._delegate = new AtomicReference<>(delegate);
    }

    private final ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureProcessProgressed(int progress) {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(progress);
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
    public void onError(@NotNull ImageCaptureException exception) {
        AbstractC5830k.m5330g(exception, "exception");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(exception);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(@NotNull ImageCapture.OutputFileResults outputFileResults) {
        AbstractC5830k.m5330g(outputFileResults, "outputFileResults");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(outputFileResults);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onPostviewBitmapAvailable(@NotNull Bitmap bitmap) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
