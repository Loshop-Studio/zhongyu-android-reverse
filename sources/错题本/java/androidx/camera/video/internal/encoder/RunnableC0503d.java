package androidx.camera.video.internal.encoder;

/* renamed from: androidx.camera.video.internal.encoder.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0503d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f622a;

    /* renamed from: b */
    public final /* synthetic */ EncoderImpl f623b;

    public /* synthetic */ RunnableC0503d(EncoderImpl encoderImpl, int i) {
        this.f622a = i;
        this.f623b = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f622a) {
            case 0:
                this.f623b.lambda$stop$2();
                break;
            case 1:
                this.f623b.lambda$release$6();
                break;
            case 2:
                this.f623b.lambda$requestKeyFrame$8();
                break;
            case 3:
                this.f623b.lambda$signalSourceStopped$7();
                break;
            case 4:
                this.f623b.signalEndOfInputStream();
                break;
            default:
                this.f623b.lambda$stop$3();
                break;
        }
    }
}
