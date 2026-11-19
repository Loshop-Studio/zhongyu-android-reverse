package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* renamed from: androidx.camera.camera2.internal.compat.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0244f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f236a;

    /* renamed from: b */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f237b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f238c;

    public /* synthetic */ RunnableC0244f(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.f236a = i;
        this.f237b = stateCallbackExecutorWrapper;
        this.f238c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f236a) {
            case 0:
                this.f237b.lambda$onActive$3(this.f238c);
                break;
            case 1:
                this.f237b.lambda$onClosed$5(this.f238c);
                break;
            case 2:
                this.f237b.lambda$onCaptureQueueEmpty$4(this.f238c);
                break;
            case 3:
                this.f237b.lambda$onConfigured$0(this.f238c);
                break;
            case 4:
                this.f237b.lambda$onReady$2(this.f238c);
                break;
            default:
                this.f237b.lambda$onConfigureFailed$1(this.f238c);
                break;
        }
    }
}
