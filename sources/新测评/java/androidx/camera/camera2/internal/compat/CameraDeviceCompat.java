package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CameraDeviceCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    private final CameraDeviceCompatImpl mImpl;

    public interface CameraDeviceCompatImpl {
        void createCaptureSession(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat;

        @NonNull
        CameraDevice unwrap();
    }

    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {
        private final Executor mExecutor;
        final CameraDevice.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f451a.mWrappedCallback.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f456a.mWrappedCallback.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull final CameraDevice cameraDevice, final int i10) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f453a.mWrappedCallback.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f458a.mWrappedCallback.onOpened(cameraDevice);
                }
            });
        }
    }

    private CameraDeviceCompat(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new CameraDeviceCompatApi28Impl(cameraDevice);
        } else {
            this.mImpl = CameraDeviceCompatApi24Impl.create(cameraDevice, handler);
        }
    }

    @NonNull
    public static CameraDeviceCompat toCameraDeviceCompat(@NonNull CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, MainThreadAsyncHandler.getInstance());
    }

    public void createCaptureSession(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        this.mImpl.createCaptureSession(sessionConfigurationCompat);
    }

    @NonNull
    public CameraDevice toCameraDevice() {
        return this.mImpl.unwrap();
    }

    @NonNull
    public static CameraDeviceCompat toCameraDeviceCompat(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        return new CameraDeviceCompat(cameraDevice, handler);
    }
}
