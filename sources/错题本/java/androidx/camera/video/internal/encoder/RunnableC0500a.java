package androidx.camera.video.internal.encoder;

/* renamed from: androidx.camera.video.internal.encoder.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0500a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f613a;

    /* renamed from: b */
    public final /* synthetic */ EncoderImpl f614b;

    /* renamed from: c */
    public final /* synthetic */ long f615c;

    public /* synthetic */ RunnableC0500a(EncoderImpl encoderImpl, long j7, int i) {
        this.f613a = i;
        this.f614b = encoderImpl;
        this.f615c = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f613a) {
            case 0:
                this.f614b.lambda$start$1(this.f615c);
                break;
            default:
                this.f614b.lambda$pause$5(this.f615c);
                break;
        }
    }
}
