package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.camera2.internal.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C0289u implements CallbackToFutureAdapter.Resolver, ForceCloseCaptureSession.OnConfigured, CameraCharacteristicsProvider {

    /* renamed from: a */
    public final /* synthetic */ int f345a;

    /* renamed from: b */
    public final /* synthetic */ Object f346b;

    public /* synthetic */ C0289u(Object obj, int i) {
        this.f345a = i;
        this.f346b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f345a) {
            case 0:
                return ((Camera2CapturePipeline.AePreCaptureTask) this.f346b).lambda$preCapture$0(completer);
            case 1:
                return ((Camera2CapturePipeline.CameraCapturePipelineImpl) this.f346b).lambda$invokePostCapture$1(completer);
            case 2:
                return ((Camera2CapturePipeline.ResultListener) this.f346b).lambda$new$0(completer);
            case 3:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f346b).lambda$preCapture$5(completer);
            case 4:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$1((AtomicReference) this.f346b, completer);
            case 5:
                return ((Camera2CapturePipeline.TorchTask) this.f346b).lambda$preCapture$0(completer);
            default:
                return ((Camera2CameraControlImpl) this.f346b).lambda$updateSessionConfigAsync$7(completer);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public Object get(CameraCharacteristics.Key key) {
        return ((CameraCharacteristicsCompat) this.f346b).get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
    public void run(SynchronizedCaptureSession synchronizedCaptureSession) {
        ((SynchronizedCaptureSessionImpl) this.f346b).lambda$onConfigured$1(synchronizedCaptureSession);
    }
}
