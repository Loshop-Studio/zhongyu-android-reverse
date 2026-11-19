package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.LinkedHashSet;

/* renamed from: androidx.camera.camera2.internal.s */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0285s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f341a;

    /* renamed from: b */
    public final /* synthetic */ Object f342b;

    public /* synthetic */ RunnableC0285s(Object obj, int i) {
        this.f341a = i;
        this.f342b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f341a) {
            case 0:
                ((Camera2CameraImpl.StateCallback.ScheduledReopen) this.f342b).lambda$run$0();
                break;
            case 1:
                ((Camera2CapturePipeline.Pipeline) this.f342b).executePostCapture();
                break;
            case 2:
                ((CaptureSession) this.f342b).lambda$issuePendingCaptureRequest$2();
                break;
            case 3:
                CaptureSessionRepository.forceOnClosed((LinkedHashSet) this.f342b);
                break;
            case 4:
                ((ProcessingCaptureSession) this.f342b).lambda$release$4();
                break;
            case 5:
                ProcessingCaptureSession.lambda$open$1((DeferrableSurface) this.f342b);
                break;
            case 6:
                ((SynchronizedCaptureSessionBaseImpl) this.f342b).lambda$close$2();
                break;
            case 7:
                ((SynchronizedCaptureSessionImpl) this.f342b).lambda$close$2();
                break;
            case 8:
                ((Camera2CameraControlImpl) this.f342b).updateSessionConfigSynchronous();
                break;
            case 9:
                ((CameraDevice) this.f342b).close();
                break;
            case 10:
                ((ImageCapture.ScreenFlash) this.f342b).clear();
                break;
            default:
                ((SafeCloseImageReaderProxy) this.f342b).safeClose();
                break;
        }
    }
}
