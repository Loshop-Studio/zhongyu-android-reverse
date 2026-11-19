package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0267j implements CallbackToFutureAdapter.Resolver, MeteringRepeatingSession.SurfaceResetCallback {

    /* renamed from: a */
    public final /* synthetic */ int f289a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f290b;

    public /* synthetic */ C0267j(Camera2CameraImpl camera2CameraImpl, int i) {
        this.f289a = i;
        this.f290b = camera2CameraImpl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f289a) {
            case 0:
                return this.f290b.lambda$release$5(completer);
            case 1:
            default:
                return this.f290b.lambda$isMeteringRepeatingAttached$14(completer);
            case 2:
                return this.f290b.lambda$getOrCreateUserReleaseFuture$6(completer);
            case 3:
                return this.f290b.lambda$openCameraConfigAndClose$1(completer);
        }
    }

    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
    public void onSurfaceReset() {
        this.f290b.lambda$addOrRemoveMeteringRepeatingUseCase$17();
    }
}
