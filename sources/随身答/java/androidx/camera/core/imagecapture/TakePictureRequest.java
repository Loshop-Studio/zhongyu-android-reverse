package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

@AutoValue
/* loaded from: classes.dex */
public abstract class TakePictureRequest {
    private int mRemainingRetires = new CaptureFailedRetryEnabler().getRetryCount();

    public interface RetryControl {
        void retryRequest(@NonNull TakePictureRequest takePictureRequest);
    }

    /* renamed from: a */
    public static /* synthetic */ void m559a(TakePictureRequest takePictureRequest, ImageCaptureException imageCaptureException) {
        boolean z9 = takePictureRequest.getInMemoryCallback() != null;
        boolean z10 = takePictureRequest.getOnDiskCallback() != null;
        if (z9 && !z10) {
            ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
            Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (!z10 || z9) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
            Objects.requireNonNull(onDiskCallback);
            onDiskCallback.onError(imageCaptureException);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m560b(TakePictureRequest takePictureRequest, ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback onDiskCallback = takePictureRequest.getOnDiskCallback();
        Objects.requireNonNull(onDiskCallback);
        Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    /* renamed from: c */
    public static /* synthetic */ void m561c(TakePictureRequest takePictureRequest, ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = takePictureRequest.getInMemoryCallback();
        Objects.requireNonNull(inMemoryCallback);
        Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    /* renamed from: d */
    public static /* synthetic */ void m562d(TakePictureRequest takePictureRequest, Bitmap bitmap) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m563e(TakePictureRequest takePictureRequest, int i9) {
        if (takePictureRequest.getOnDiskCallback() != null) {
            takePictureRequest.getOnDiskCallback().onCaptureProcessProgressed(i9);
        } else if (takePictureRequest.getInMemoryCallback() != null) {
            takePictureRequest.getInMemoryCallback().onCaptureProcessProgressed(i9);
        }
    }

    @NonNull
    /* renamed from: of */
    public static TakePictureRequest m564of(@NonNull Executor executor, @Nullable ImageCapture.OnImageCapturedCallback onImageCapturedCallback, @Nullable ImageCapture.OnImageSavedCallback onImageSavedCallback, @Nullable ImageCapture.OutputFileOptions outputFileOptions, @NonNull Rect rect, @NonNull Matrix matrix, int i9, int i10, int i11, @NonNull List<CameraCaptureCallback> list) {
        Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        return new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i9, i10, i11, list);
    }

    @MainThread
    public boolean decrementRetryCounter() {
        Threads.checkMainThread();
        int i9 = this.mRemainingRetires;
        if (i9 <= 0) {
            return false;
        }
        this.mRemainingRetires = i9 - 1;
        return true;
    }

    @NonNull
    public abstract Executor getAppExecutor();

    public abstract int getCaptureMode();

    @NonNull
    public abstract Rect getCropRect();

    @Nullable
    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    @IntRange(from = 1, m266to = 100)
    public abstract int getJpegQuality();

    @Nullable
    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    @Nullable
    public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    @MainThread
    @VisibleForTesting
    public int getRemainingRetries() {
        Threads.checkMainThread();
        return this.mRemainingRetires;
    }

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Matrix getSensorToBufferTransform();

    @NonNull
    public abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    @MainThread
    public void incrementRetryCounter() {
        Threads.checkMainThread();
        this.mRemainingRetires++;
    }

    public void onCaptureProcessProgressed(final int i9) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.a0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m563e(this.f533a, i9);
            }
        });
    }

    public void onError(@NonNull final ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.b0
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m559a(this.f536a, imageCaptureException);
            }
        });
    }

    public void onPostviewBitmapAvailable(@NonNull final Bitmap bitmap) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.y
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m562d(this.f570a, bitmap);
            }
        });
    }

    public void onResult(@Nullable final ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.z
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m560b(this.f572a, outputFileResults);
            }
        });
    }

    public void onResult(@Nullable final ImageProxy imageProxy) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.x
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m561c(this.f568a, imageProxy);
            }
        });
    }
}
