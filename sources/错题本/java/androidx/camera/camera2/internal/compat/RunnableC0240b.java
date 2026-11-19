package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* renamed from: androidx.camera.camera2.internal.compat.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0240b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f218a;

    /* renamed from: b */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f219b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f220c;

    /* renamed from: d */
    public final /* synthetic */ CaptureRequest f221d;

    /* renamed from: e */
    public final /* synthetic */ Object f222e;

    public /* synthetic */ RunnableC0240b(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Object obj, int i) {
        this.f218a = i;
        this.f219b = captureCallbackExecutorWrapper;
        this.f220c = cameraCaptureSession;
        this.f221d = captureRequest;
        this.f222e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f218a) {
            case 0:
                this.f219b.lambda$onCaptureCompleted$2(this.f220c, this.f221d, (TotalCaptureResult) this.f222e);
                break;
            case 1:
                this.f219b.lambda$onCaptureProgressed$1(this.f220c, this.f221d, (CaptureResult) this.f222e);
                break;
            default:
                this.f219b.lambda$onCaptureFailed$3(this.f220c, this.f221d, (CaptureFailure) this.f222e);
                break;
        }
    }
}
