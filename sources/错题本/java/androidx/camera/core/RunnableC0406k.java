package androidx.camera.core;

/* renamed from: androidx.camera.core.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0406k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f495a;

    /* renamed from: b */
    public final /* synthetic */ Object f496b;

    public /* synthetic */ RunnableC0406k(Object obj, int i) {
        this.f495a = i;
        this.f496b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f495a) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer) this.f496b).analyzeCachedImage();
                break;
            case 1:
                ((Preview) this.f496b).notifyReset();
                break;
            default:
                ((SurfaceRequest) this.f496b).lambda$new$3();
                break;
        }
    }
}
