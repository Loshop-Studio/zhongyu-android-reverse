package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0259f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f262a;

    /* renamed from: b */
    public final /* synthetic */ Object f263b;

    /* renamed from: c */
    public final /* synthetic */ int f264c;

    /* renamed from: d */
    public final /* synthetic */ Object f265d;

    public /* synthetic */ RunnableC0259f(int i, ExposureControl exposureControl, CallbackToFutureAdapter.Completer completer) {
        this.f262a = 2;
        this.f263b = exposureControl;
        this.f265d = completer;
        this.f264c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f262a) {
            case 0:
                ((CameraCaptureCallback) this.f263b).onCaptureFailed(this.f264c, (CameraCaptureFailure) this.f265d);
                break;
            case 1:
                ((CameraCaptureCallback) this.f263b).onCaptureCompleted(this.f264c, (CameraCaptureResult) this.f265d);
                break;
            default:
                ((ExposureControl) this.f263b).lambda$setExposureCompensationIndex$1((CallbackToFutureAdapter.Completer) this.f265d, this.f264c);
                break;
        }
    }

    public /* synthetic */ RunnableC0259f(CameraCaptureCallback cameraCaptureCallback, int i, Object obj, int i8) {
        this.f262a = i8;
        this.f263b = cameraCaptureCallback;
        this.f264c = i;
        this.f265d = obj;
    }
}
