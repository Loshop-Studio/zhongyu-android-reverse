package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSource;

/* renamed from: androidx.camera.video.internal.audio.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0489d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f604a;

    /* renamed from: b */
    public final /* synthetic */ AudioSource.AudioSourceCallback f605b;

    /* renamed from: c */
    public final /* synthetic */ boolean f606c;

    public /* synthetic */ RunnableC0489d(AudioSource.AudioSourceCallback audioSourceCallback, boolean z8, int i) {
        this.f604a = i;
        this.f605b = audioSourceCallback;
        this.f606c = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f604a) {
            case 0:
                this.f605b.onSilenceStateChanged(this.f606c);
                break;
            default:
                this.f605b.onSuspendStateChanged(this.f606c);
                break;
        }
    }
}
