package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* renamed from: androidx.camera.camera2.internal.compat.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0247i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f242a;

    /* renamed from: b */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f243b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f244c;

    public /* synthetic */ RunnableC0247i(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.f242a = i;
        this.f243b = stateCallbackExecutorWrapper;
        this.f244c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f242a) {
            case 0:
                this.f243b.lambda$onClosed$3(this.f244c);
                break;
            case 1:
                this.f243b.lambda$onDisconnected$1(this.f244c);
                break;
            default:
                this.f243b.lambda$onOpened$0(this.f244c);
                break;
        }
    }
}
