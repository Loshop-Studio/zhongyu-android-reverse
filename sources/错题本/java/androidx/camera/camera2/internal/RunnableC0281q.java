package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.q */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0281q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f331a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f332b;

    public /* synthetic */ RunnableC0281q(Camera2CameraImpl camera2CameraImpl, int i) {
        this.f331a = i;
        this.f332b = camera2CameraImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f331a) {
            case 0:
                this.f332b.openInternal();
                break;
            case 1:
                this.f332b.lambda$configAndCloseIfNeeded$0();
                break;
            default:
                this.f332b.closeInternal();
                break;
        }
    }
}
