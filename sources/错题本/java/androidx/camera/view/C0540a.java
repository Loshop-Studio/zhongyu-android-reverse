package androidx.camera.view;

import androidx.arch.core.util.Function;

/* renamed from: androidx.camera.view.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0540a implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f681a;

    /* renamed from: b */
    public final /* synthetic */ Object f682b;

    public /* synthetic */ C0540a(Object obj, int i) {
        this.f681a = i;
        this.f682b = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f681a) {
            case 0:
                return ((CameraController) this.f682b).lambda$new$0((ProcessCameraProviderWrapper) obj);
            case 1:
                return ((CameraController) this.f682b).enableTorch(((Boolean) obj).booleanValue());
            case 2:
                return ((CameraController) this.f682b).setLinearZoom(((Float) obj).floatValue());
            case 3:
                return ((CameraController) this.f682b).setZoomRatio(((Float) obj).floatValue());
            default:
                return ((PreviewStreamStateObserver) this.f682b).lambda$startPreviewStreamStateFlow$1((Void) obj);
        }
    }
}
