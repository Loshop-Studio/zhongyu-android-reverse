package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.video.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C0526x implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener {

    /* renamed from: a */
    public final /* synthetic */ int f674a;

    /* renamed from: b */
    public final /* synthetic */ Object f675b;

    public /* synthetic */ C0526x(Object obj, int i) {
        this.f674a = i;
        this.f675b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f674a) {
            case 0:
                return ((VideoEncoderSession) this.f675b).lambda$configure$0(completer);
            default:
                return ((VideoEncoderSession) this.f675b).lambda$configure$1(completer);
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((Recorder) this.f675b).lambda$configureInternal$7(transformationInfo);
    }
}
