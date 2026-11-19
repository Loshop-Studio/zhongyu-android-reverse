package androidx.camera.camera2.internal.compat.workaround;

import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0253b implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f253a;

    public /* synthetic */ C0253b(int i) {
        this.f253a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f253a) {
            case 0:
                return RequestMonitor.lambda$getRequestsProcessedFuture$0((List) obj);
            case 1:
                return ImageCapture.lambda$submitStillCaptureRequest$4((List) obj);
            case 2:
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            default:
                return VideoEncoderInfoImpl.lambda$static$0((VideoEncoderConfig) obj);
        }
    }
}
