package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* renamed from: androidx.camera.core.processing.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0430l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f544a;

    /* renamed from: b */
    public final /* synthetic */ DeferrableSurface f545b;

    public /* synthetic */ RunnableC0430l(DeferrableSurface deferrableSurface, int i) {
        this.f544a = i;
        this.f545b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f544a) {
            case 0:
                this.f545b.close();
                break;
            default:
                this.f545b.decrementUseCount();
                break;
        }
    }
}
