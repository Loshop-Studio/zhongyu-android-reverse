package androidx.camera.view;

import android.view.LifecycleOwner;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
interface ProcessCameraProviderWrapper {
    @NonNull
    @MainThread
    Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup);

    @NonNull
    CameraInfo getCameraInfo(CameraSelector cameraSelector);

    boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException;

    @NonNull
    @VisibleForTesting
    InterfaceFutureC5453a shutdownAsync();

    void unbind(@NonNull UseCase... useCaseArr);

    void unbindAll();
}
