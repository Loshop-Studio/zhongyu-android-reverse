package androidx.camera.video.internal.audio;

/* renamed from: androidx.camera.video.internal.audio.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0486a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f599a;

    /* renamed from: b */
    public final /* synthetic */ AudioSource f600b;

    /* renamed from: c */
    public final /* synthetic */ boolean f601c;

    public /* synthetic */ RunnableC0486a(AudioSource audioSource, boolean z8, int i) {
        this.f599a = i;
        this.f600b = audioSource;
        this.f601c = z8;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        switch (this.f599a) {
            case 0:
                this.f600b.lambda$mute$7(this.f601c);
                break;
            default:
                this.f600b.lambda$start$2(this.f601c);
                break;
        }
    }
}
