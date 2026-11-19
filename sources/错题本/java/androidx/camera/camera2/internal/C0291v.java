package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C0291v implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f352a;

    public /* synthetic */ C0291v(int i) {
        this.f352a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f352a) {
            case 0:
                return Camera2CapturePipeline.AePreCaptureTask.lambda$preCapture$1((Void) obj);
            case 1:
                return Camera2CapturePipeline.CameraCapturePipelineImpl.lambda$invokePreCapture$0((TotalCaptureResult) obj);
            case 2:
                return Camera2CapturePipeline.Pipeline.C02141.lambda$preCapture$0((List) obj);
            case 3:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$11((TotalCaptureResult) obj);
            default:
                return Camera2CapturePipeline.TorchTask.lambda$preCapture$4((TotalCaptureResult) obj);
        }
    }
}
