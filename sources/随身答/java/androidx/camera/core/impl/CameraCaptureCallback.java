package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class CameraCaptureCallback {
    public void onCaptureCancelled(int i9) {
    }

    public void onCaptureCompleted(int i9, @NonNull CameraCaptureResult cameraCaptureResult) {
    }

    public void onCaptureFailed(int i9, @NonNull CameraCaptureFailure cameraCaptureFailure) {
    }

    public void onCaptureProcessProgressed(int i9, int i10) {
    }

    public void onCaptureStarted(int i9) {
    }
}
