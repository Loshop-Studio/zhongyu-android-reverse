package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.interop.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0301a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f372a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraControl f373b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f374c;

    public /* synthetic */ RunnableC0301a(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f372a = i;
        this.f373b = camera2CameraControl;
        this.f374c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f372a) {
            case 0:
                this.f373b.lambda$clearCaptureRequestOptions$4(this.f374c);
                break;
            case 1:
                this.f373b.lambda$setCaptureRequestOptions$0(this.f374c);
                break;
            default:
                this.f373b.lambda$addCaptureRequestOptions$2(this.f374c);
                break;
        }
    }
}
