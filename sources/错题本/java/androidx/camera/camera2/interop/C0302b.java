package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.interop.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0302b implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f375a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraControl f376b;

    public /* synthetic */ C0302b(Camera2CameraControl camera2CameraControl, int i) {
        this.f375a = i;
        this.f376b = camera2CameraControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f375a) {
            case 0:
                return this.f376b.lambda$addCaptureRequestOptions$3(completer);
            case 1:
                return this.f376b.lambda$setCaptureRequestOptions$1(completer);
            default:
                return this.f376b.lambda$clearCaptureRequestOptions$5(completer);
        }
    }
}
