package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;

/* renamed from: androidx.camera.camera2.internal.r */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0283r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f336a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode f337b;

    public /* synthetic */ RunnableC0283r(Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode, int i) {
        this.f336a = i;
        this.f337b = scheduleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f336a) {
            case 0:
                this.f337b.execute();
                break;
            default:
                this.f337b.executeInternal();
                break;
        }
    }
}
