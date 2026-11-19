package androidx.camera.camera2.interop;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2CameraControl {
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    CallbackToFutureAdapter.Completer<Void> mCompleter;
    final Executor mExecutor;
    private boolean mIsActive = false;
    private boolean mPendingUpdate = false;
    final Object mLock = new Object();

    @GuardedBy("mLock")
    private Camera2ImplConfig.Builder mBuilder = new Camera2ImplConfig.Builder();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2CameraControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m541a(final Camera2CameraControl camera2CameraControl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f507c.updateConfig(completer);
            }
        });
        return "addCaptureRequestOptions";
    }

    private void addCaptureRequestOptionsInternal(@NonNull CaptureRequestOptions captureRequestOptions) {
        synchronized (this.mLock) {
            this.mBuilder.insertAllOptions(captureRequestOptions);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Object m542b(final Camera2CameraControl camera2CameraControl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f497c.updateConfig(completer);
            }
        });
        return "clearCaptureRequestOptions";
    }

    private void clearCaptureRequestOptionsInternal() {
        synchronized (this.mLock) {
            this.mBuilder = new Camera2ImplConfig.Builder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeInFlightUpdate() {
        CallbackToFutureAdapter.Completer<Void> completer = this.mCompleter;
        if (completer != null) {
            completer.set(null);
            this.mCompleter = null;
        }
    }

    private void failInFlightUpdate(@Nullable Exception exc) {
        CallbackToFutureAdapter.Completer<Void> completer = this.mCompleter;
        if (completer != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            completer.setException(exc);
            this.mCompleter = null;
        }
    }

    @NonNull
    public static Camera2CameraControl from(@NonNull CameraControl cameraControl) {
        CameraControlInternal implementation = ((CameraControlInternal) cameraControl).getImplementation();
        Preconditions.checkArgument(implementation instanceof Camera2CameraControlImpl, "CameraControl doesn't contain Camera2 implementation.");
        return ((Camera2CameraControlImpl) implementation).getCamera2CameraControl();
    }

    /* renamed from: g */
    public static /* synthetic */ Object m547g(final Camera2CameraControl camera2CameraControl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f501c.updateConfig(completer);
            }
        });
        return "setCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveInternal(boolean z10) {
        if (this.mIsActive == z10) {
            return;
        }
        this.mIsActive = z10;
        if (!z10) {
            failInFlightUpdate(new CameraControl.OperationCanceledException("The camera control has became inactive."));
        } else if (this.mPendingUpdate) {
            updateSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateConfig(@NonNull CallbackToFutureAdapter.Completer<Void> completer) {
        this.mPendingUpdate = true;
        failInFlightUpdate(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.mCompleter = completer;
        if (this.mIsActive) {
            updateSession();
        }
    }

    private void updateSession() {
        this.mCamera2CameraControlImpl.updateSessionConfigAsync().addListener(new Runnable() { // from class: androidx.camera.camera2.interop.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f500c.completeInFlightUpdate();
            }
        }, this.mExecutor);
        this.mPendingUpdate = false;
    }

    @NonNull
    public ListenableFuture<Void> addCaptureRequestOptions(@NonNull CaptureRequestOptions captureRequestOptions) {
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.interop.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m541a(this.f499a, completer);
            }
        }));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void applyOptionsToBuilder(@NonNull Camera2ImplConfig.Builder builder) {
        synchronized (this.mLock) {
            builder.insertAllOptions(this.mBuilder.getMutableConfig(), Config.OptionPriority.ALWAYS_OVERRIDE);
        }
    }

    @NonNull
    public ListenableFuture<Void> clearCaptureRequestOptions() {
        clearCaptureRequestOptionsInternal();
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.interop.g
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m542b(this.f506a, completer);
            }
        }));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2ImplConfig getCamera2ImplConfig() {
        Camera2ImplConfig camera2ImplConfigBuild;
        synchronized (this.mLock) {
            camera2ImplConfigBuild = this.mBuilder.build();
        }
        return camera2ImplConfigBuild;
    }

    @NonNull
    public CaptureRequestOptions getCaptureRequestOptions() {
        CaptureRequestOptions captureRequestOptionsBuild;
        synchronized (this.mLock) {
            captureRequestOptionsBuild = CaptureRequestOptions.Builder.from(this.mBuilder.build()).build();
        }
        return captureRequestOptionsBuild;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActive(final boolean z10) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f503c.setActiveInternal(z10);
            }
        });
    }

    @NonNull
    public ListenableFuture<Void> setCaptureRequestOptions(@NonNull CaptureRequestOptions captureRequestOptions) {
        clearCaptureRequestOptionsInternal();
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.interop.f
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m547g(this.f505a, completer);
            }
        }));
    }
}
