package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import p049e1.InterfaceFutureC5453a;

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
    public InterfaceFutureC5453a cancelFocusAndMetering() {
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
    public InterfaceFutureC5453a enableTorch(boolean z8) {
        return this.mCameraControlInternal.enableTorch(z8);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public InterfaceFutureC5453a getCameraCapturePipelineAsync(int i, int i8) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i, i8);
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
    public InterfaceFutureC5453a setExposureCompensationIndex(int i) {
        return this.mCameraControlInternal.setExposureCompensationIndex(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i) {
        this.mCameraControlInternal.setFlashMode(i);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public InterfaceFutureC5453a setLinearZoom(float f) {
        return this.mCameraControlInternal.setLinearZoom(f);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(@Nullable ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public InterfaceFutureC5453a setZoomRatio(float f) {
        return this.mCameraControlInternal.setZoomRatio(f);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z8) {
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z8);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public InterfaceFutureC5453a startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public InterfaceFutureC5453a submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i, int i8) {
        return this.mCameraControlInternal.submitStillCaptureRequests(list, i, i8);
    }
}
