package androidx.camera.view;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* renamed from: androidx.camera.view.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0545f implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener, PreviewViewImplementation.OnSurfaceNotInUseListener {

    /* renamed from: a */
    public final /* synthetic */ Object f689a;

    /* renamed from: b */
    public final /* synthetic */ Object f690b;

    /* renamed from: c */
    public final /* synthetic */ Object f691c;

    public /* synthetic */ C0545f(PreviewView.C05341 c05341, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
        this.f690b = c05341;
        this.f689a = previewStreamStateObserver;
        this.f691c = cameraInternal;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((PreviewStreamStateObserver) this.f689a).lambda$waitForCaptureResult$2((CameraInfo) this.f690b, (List) this.f691c, completer);
    }

    @Override // androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener
    public void onSurfaceNotInUse() {
        ((PreviewView.C05341) this.f690b).lambda$onSurfaceRequested$2((PreviewStreamStateObserver) this.f689a, (CameraInternal) this.f691c);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((PreviewView.C05341) this.f689a).lambda$onSurfaceRequested$1((CameraInternal) this.f690b, (SurfaceRequest) this.f691c, transformationInfo);
    }

    public /* synthetic */ C0545f(Object obj, Object obj2, Object obj3) {
        this.f689a = obj;
        this.f690b = obj2;
        this.f691c = obj3;
    }
}
