package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.w0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0294w0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f357a;

    /* renamed from: b */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f358b;

    /* renamed from: c */
    public final /* synthetic */ SynchronizedCaptureSession f359c;

    public /* synthetic */ RunnableC0294w0(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession, int i) {
        this.f357a = i;
        this.f358b = synchronizedCaptureSessionBaseImpl;
        this.f359c = synchronizedCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f357a) {
            case 0:
                this.f358b.lambda$onSessionFinished$4(this.f359c);
                break;
            default:
                this.f358b.lambda$onClosed$3(this.f359c);
                break;
        }
    }
}
