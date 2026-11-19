package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import java.util.Collection;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        State(boolean z8) {
            this.mHoldsCameraSlot = z8;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(@NonNull Collection<UseCase> collection);

    void close();

    void detachUseCases(@NonNull Collection<UseCase> collection);

    @Override // androidx.camera.core.Camera
    @NonNull
    default CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    @NonNull
    CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    @NonNull
    default CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    @NonNull
    CameraInfoInternal getCameraInfoInternal();

    @NonNull
    Observable<State> getCameraState();

    @Override // androidx.camera.core.Camera
    @NonNull
    default CameraConfig getExtendedConfig() {
        return CameraConfigs.defaultConfig();
    }

    default boolean getHasTransform() {
        return true;
    }

    default boolean isFrontFacing() {
        return getCameraInfo().getLensFacing() == 0;
    }

    void open();

    @NonNull
    InterfaceFutureC5453a release();

    default void setActiveResumingMode(boolean z8) {
    }

    default void setExtendedConfig(@Nullable CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z8) {
    }
}
