package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* loaded from: classes.dex */
public class ForwardingCameraControl implements CameraControlInternal {
    private final CameraControlInternal mCameraControlInternal;

    public ForwardingCameraControl(@NonNull CameraControlInternal cameraControlInternal) {
        this.mCameraControlInternal = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NonNull Config config) {
        this.mCameraControlInternal.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        this.mCameraControlInternal.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> cancelFocusAndMetering() {
        return this.mCameraControlInternal.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCameraControlInternal.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mCameraControlInternal.decrementVideoUsage();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> enableTorch(boolean z9) {
        return this.mCameraControlInternal.enableTorch(z9);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public ListenableFuture<CameraCapturePipeline> getCameraCapturePipelineAsync(int i10, int i11) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i10, i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mCameraControlInternal.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public CameraControlInternal getImplementation() {
        return this.mCameraControlInternal.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Config getInteropConfig() {
        return this.mCameraControlInternal.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect getSensorRect() {
        return this.mCameraControlInternal.getSensorRect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public SessionConfig getSessionConfig() {
        return this.mCameraControlInternal.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mCameraControlInternal.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @VisibleForTesting
    public boolean isInVideoUsage() {
        return this.mCameraControlInternal.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mCameraControlInternal.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Integer> setExposureCompensationIndex(int i10) {
        return this.mCameraControlInternal.setExposureCompensationIndex(i10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i10) {
        this.mCameraControlInternal.setFlashMode(i10);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setLinearZoom(float f10) {
        return this.mCameraControlInternal.setLinearZoom(f10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(@Nullable ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setZoomRatio(float f10) {
        return this.mCameraControlInternal.setZoomRatio(f10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z9) {
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z9);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i10, int i11) {
        return this.mCameraControlInternal.submitStillCaptureRequests(list, i10, i11);
    }
}
