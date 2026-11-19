package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p049e1.InterfaceFutureC5453a;

/* renamed from: androidx.camera.camera2.internal.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C0279p implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ int f325a;

    /* renamed from: b */
    public final /* synthetic */ Object f326b;

    /* renamed from: c */
    public final /* synthetic */ Object f327c;

    public /* synthetic */ C0279p(int i, Object obj, Object obj2) {
        this.f325a = i;
        this.f326b = obj;
        this.f327c = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final InterfaceFutureC5453a apply(Object obj) {
        switch (this.f325a) {
            case 0:
                return Camera2CameraImpl.lambda$configAndClose$3((CaptureSession) this.f326b, (ImmediateSurface) this.f327c, (Void) obj);
            case 1:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f326b).lambda$preCapture$7((InterfaceFutureC5453a) this.f327c, obj);
            default:
                return ((SynchronizedCaptureSessionBaseImpl) this.f326b).lambda$startWithDeferrableSurface$1((List) this.f327c, (List) obj);
        }
    }
}
