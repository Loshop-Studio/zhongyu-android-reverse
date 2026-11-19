package androidx.camera.core.processing;

/* renamed from: androidx.camera.core.processing.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0428j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f540a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceEdge f541b;

    public /* synthetic */ RunnableC0428j(SurfaceEdge surfaceEdge, int i) {
        this.f540a = i;
        this.f541b = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f540a) {
            case 0:
                this.f541b.lambda$createSurfaceRequest$1();
                break;
            default:
                this.f541b.lambda$createSurfaceRequest$0();
                break;
        }
    }
}
