package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.z0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0300z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f370a;

    /* renamed from: b */
    public final /* synthetic */ VideoUsageControl f371b;

    public /* synthetic */ RunnableC0300z0(VideoUsageControl videoUsageControl, int i) {
        this.f370a = i;
        this.f371b = videoUsageControl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f370a) {
            case 0:
                VideoUsageControl.decrementUsage$lambda$1(this.f371b);
                break;
            case 1:
                VideoUsageControl.reset$lambda$2(this.f371b);
                break;
            default:
                VideoUsageControl.incrementUsage$lambda$0(this.f371b);
                break;
        }
    }
}
