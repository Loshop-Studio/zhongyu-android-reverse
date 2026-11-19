package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0263h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f274a;

    /* renamed from: b */
    public final /* synthetic */ Object f275b;

    /* renamed from: c */
    public final /* synthetic */ Object f276c;

    public /* synthetic */ RunnableC0263h(int i, Object obj, Object obj2) {
        this.f274a = i;
        this.f275b = obj;
        this.f276c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f274a) {
            case 0:
                ((Camera2CameraControlImpl.CameraControlSessionCallback) this.f275b).lambda$onCaptureCompleted$0((TotalCaptureResult) this.f276c);
                break;
            case 1:
                Camera2CameraImpl.lambda$postSurfaceClosedError$19((SessionConfig.ErrorListener) this.f275b, (SessionConfig) this.f276c);
                break;
            case 2:
                Camera2CameraImpl.lambda$configAndClose$2((Surface) this.f275b, (SurfaceTexture) this.f276c);
                break;
            case 3:
                ((Camera2CameraImpl) this.f275b).lambda$onUseCaseInactive$8((String) this.f276c);
                break;
            case 4:
                ((Camera2CameraControlImpl) this.f275b).removeCaptureResultListener((Camera2CapturePipeline.ResultListener) this.f276c);
                break;
            case 5:
                ((ProcessingCaptureSession) this.f275b).lambda$open$0((DeferrableSurface) this.f276c);
                break;
            case 6:
                ((Camera2CameraControlImpl) this.f275b).lambda$updateSessionConfigAsync$6((CallbackToFutureAdapter.Completer) this.f276c);
                break;
            default:
                ((Camera2CameraControlImpl) this.f275b).lambda$removeSessionCameraCaptureCallback$9((CameraCaptureCallback) this.f276c);
                break;
        }
    }
}
