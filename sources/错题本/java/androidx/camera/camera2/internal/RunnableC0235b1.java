package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.b1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0235b1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f201a;

    /* renamed from: b */
    public final /* synthetic */ ZoomControl f202b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f203c;

    /* renamed from: d */
    public final /* synthetic */ ZoomState f204d;

    public /* synthetic */ RunnableC0235b1(ZoomControl zoomControl, CallbackToFutureAdapter.Completer completer, ZoomState zoomState, int i) {
        this.f201a = i;
        this.f202b = zoomControl;
        this.f203c = completer;
        this.f204d = zoomState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f201a) {
            case 0:
                this.f202b.lambda$setZoomRatio$0(this.f203c, this.f204d);
                break;
            default:
                this.f202b.lambda$setLinearZoom$2(this.f203c, this.f204d);
                break;
        }
    }
}
