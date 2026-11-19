package androidx.camera.camera2.internal;

/* renamed from: androidx.camera.camera2.internal.i0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0266i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f286a;

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f287b;

    /* renamed from: c */
    public final /* synthetic */ long f288c;

    public /* synthetic */ RunnableC0266i0(int i, long j7, FocusMeteringControl focusMeteringControl) {
        this.f286a = i;
        this.f287b = focusMeteringControl;
        this.f288c = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f286a) {
            case 0:
                this.f287b.lambda$executeMeteringAction$10(this.f288c);
                break;
            case 1:
                this.f287b.lambda$executeMeteringAction$8(this.f288c);
                break;
            case 2:
                this.f287b.lambda$executeMeteringAction$9(this.f288c);
                break;
            default:
                this.f287b.lambda$executeMeteringAction$11(this.f288c);
                break;
        }
    }
}
