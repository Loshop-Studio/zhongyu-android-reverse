package androidx.camera.camera2.internal;

import android.util.Log;

/* renamed from: androidx.camera.camera2.internal.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0231a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f194a;

    public /* synthetic */ RunnableC0231a0(int i) {
        this.f194a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f194a) {
            case 0:
                Log.d(Camera2CapturePipeline.TAG, "enableExternalFlashAeMode disabled");
                break;
            case 1:
                Camera2CameraControlImpl.lambda$clearInteropConfig$1();
                break;
            default:
                Camera2CameraControlImpl.lambda$addInteropConfig$0();
                break;
        }
    }
}
