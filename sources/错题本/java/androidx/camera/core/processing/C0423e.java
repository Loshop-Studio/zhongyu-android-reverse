package androidx.camera.core.processing;

import androidx.camera.core.ImageProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.processing.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0423e implements SurfaceRequest.TransformationInfoListener, CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ Object f524a;

    /* renamed from: b */
    public final /* synthetic */ Object f525b;

    public /* synthetic */ C0423e(Object obj, Object obj2) {
        this.f524a = obj;
        this.f525b = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((InternalImageProcessor) this.f524a).lambda$safeProcess$1((ImageProcessor.Request) this.f525b, completer);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((DefaultSurfaceProcessor) this.f524a).lambda$onInputSurface$0((SurfaceRequest) this.f525b, transformationInfo);
    }
}
