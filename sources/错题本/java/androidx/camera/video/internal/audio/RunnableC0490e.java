package androidx.camera.video.internal.audio;

/* renamed from: androidx.camera.video.internal.audio.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0490e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f607a;

    /* renamed from: b */
    public final /* synthetic */ BufferedAudioStream f608b;

    public /* synthetic */ RunnableC0490e(BufferedAudioStream bufferedAudioStream, int i) {
        this.f607a = i;
        this.f608b = bufferedAudioStream;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        switch (this.f607a) {
            case 0:
                this.f608b.lambda$stop$1();
                break;
            case 1:
                this.f608b.lambda$start$0();
                break;
            case 2:
                this.f608b.collectAudioData();
                break;
            default:
                this.f608b.lambda$release$2();
                break;
        }
    }
}
