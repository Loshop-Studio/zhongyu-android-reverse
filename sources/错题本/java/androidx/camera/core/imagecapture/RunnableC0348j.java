package androidx.camera.core.imagecapture;

/* renamed from: androidx.camera.core.imagecapture.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0348j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f438a;

    /* renamed from: b */
    public final /* synthetic */ TakePictureManager f439b;

    public /* synthetic */ RunnableC0348j(TakePictureManager takePictureManager, int i) {
        this.f438a = i;
        this.f439b = takePictureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f438a) {
            case 0:
                this.f439b.lambda$trackCurrentRequests$0();
                break;
            default:
                this.f439b.issueNextRequest();
                break;
        }
    }
}
