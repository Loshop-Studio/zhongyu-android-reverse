package androidx.camera.video.internal.audio;

/* renamed from: androidx.camera.video.internal.audio.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0488c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f602a;

    /* renamed from: b */
    public final /* synthetic */ AudioSource f603b;

    public /* synthetic */ RunnableC0488c(AudioSource audioSource, int i) {
        this.f602a = i;
        this.f603b = audioSource;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        switch (this.f602a) {
            case 0:
                this.f603b.lambda$stop$3();
                break;
            default:
                this.f603b.lambda$start$1();
                break;
        }
    }
}
