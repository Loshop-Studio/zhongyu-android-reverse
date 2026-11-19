package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* renamed from: androidx.camera.core.processing.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0429k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f542a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceEdge.SettableSurface f543b;

    public /* synthetic */ RunnableC0429k(SurfaceEdge.SettableSurface settableSurface, int i) {
        this.f542a = i;
        this.f543b = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f542a) {
            case 0:
                this.f543b.close();
                break;
            case 1:
                this.f543b.decrementUseCount();
                break;
            default:
                this.f543b.lambda$close$1();
                break;
        }
    }
}
