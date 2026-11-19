package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* renamed from: androidx.camera.camera2.internal.compat.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0243e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f232a;

    /* renamed from: b */
    public final /* synthetic */ int f233b;

    /* renamed from: c */
    public final /* synthetic */ Object f234c;

    /* renamed from: d */
    public final /* synthetic */ AutoCloseable f235d;

    public /* synthetic */ RunnableC0243e(Object obj, AutoCloseable autoCloseable, int i, int i8) {
        this.f232a = i8;
        this.f234c = obj;
        this.f235d = autoCloseable;
        this.f233b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f232a) {
            case 0:
                ((CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper) this.f234c).lambda$onCaptureSequenceAborted$5((CameraCaptureSession) this.f235d, this.f233b);
                break;
            default:
                ((CameraDeviceCompat.StateCallbackExecutorWrapper) this.f234c).lambda$onError$2((CameraDevice) this.f235d, this.f233b);
                break;
        }
    }
}
