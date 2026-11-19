package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.EncoderImpl;

/* renamed from: androidx.camera.video.internal.encoder.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0510k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f643a;

    /* renamed from: b */
    public final /* synthetic */ Object f644b;

    public /* synthetic */ RunnableC0510k(Object obj, int i) {
        this.f643a = i;
        this.f644b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f643a) {
            case 0:
                ((EncoderCallback) this.f644b).onEncodeStop();
                break;
            case 1:
                ((EncoderCallback) this.f644b).onEncodeStart();
                break;
            case 2:
                ((EncoderCallback) this.f644b).onEncodePaused();
                break;
            default:
                ((EncoderImpl.MediaCodecCallback) this.f644b).reachEndData();
                break;
        }
    }
}
