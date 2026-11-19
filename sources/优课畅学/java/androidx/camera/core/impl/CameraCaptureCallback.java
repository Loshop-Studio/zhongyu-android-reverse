package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class CameraCaptureCallback {
    public void onCaptureCancelled(int i10) {
    }

    public void onCaptureCompleted(int i10, @NonNull CameraCaptureResult cameraCaptureResult) {
    }

    public void onCaptureFailed(int i10, @NonNull CameraCaptureFailure cameraCaptureFailure) {
    }

    public void onCaptureProcessProgressed(int i10, int i11) {
    }

    public void onCaptureStarted(int i10) {
    }
}
