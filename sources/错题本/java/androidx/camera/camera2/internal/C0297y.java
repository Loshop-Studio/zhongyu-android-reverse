package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* renamed from: androidx.camera.camera2.internal.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C0297y implements Camera2CapturePipeline.ResultListener.Checker, RingBuffer.OnRemoveCallback {

    /* renamed from: a */
    public final /* synthetic */ int f366a;

    public /* synthetic */ C0297y(int i) {
        this.f366a = i;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        switch (this.f366a) {
            case 0:
                return Camera2CapturePipeline.Pipeline.lambda$executePreCapture$2(totalCaptureResult);
            case 1:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$9(totalCaptureResult);
            default:
                return Camera2CapturePipeline.TorchTask.lambda$preCapture$2(totalCaptureResult);
        }
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
