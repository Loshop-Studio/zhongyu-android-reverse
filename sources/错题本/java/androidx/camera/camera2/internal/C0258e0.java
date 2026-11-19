package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0258e0 implements CameraBurstCaptureCallback.CaptureSequenceCallback, CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ CaptureSession f261a;

    public /* synthetic */ C0258e0(CaptureSession captureSession) {
        this.f261a = captureSession;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f261a.lambda$release$1(completer);
    }

    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
    public void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z8) {
        this.f261a.lambda$issueBurstCaptureRequest$3(cameraCaptureSession, i, z8);
    }
}
