package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* renamed from: androidx.camera.camera2.internal.compat.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0248j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f245a;

    /* renamed from: b */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f246b;

    /* renamed from: c */
    public final /* synthetic */ String f247c;

    public /* synthetic */ RunnableC0248j(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str, int i) {
        this.f245a = i;
        this.f246b = availabilityCallbackExecutorWrapper;
        this.f247c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f245a) {
            case 0:
                this.f246b.lambda$onCameraAvailable$1(this.f247c);
                break;
            default:
                this.f246b.lambda$onCameraUnavailable$2(this.f247c);
                break;
        }
    }
}
