package androidx.camera.video;

import androidx.camera.video.Recorder;
import androidx.camera.video.internal.encoder.Encoder;

/* renamed from: androidx.camera.video.q */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0520q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f662a;

    /* renamed from: b */
    public final /* synthetic */ Object f663b;

    public /* synthetic */ RunnableC0520q(Object obj, int i) {
        this.f662a = i;
        this.f663b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f662a) {
            case 0:
                ((Recorder.SetupVideoTask.C04681) this.f663b).lambda$onFailure$0();
                break;
            case 1:
                ((VideoEncoderSession) this.f663b).lambda$terminateNow$3();
                break;
            case 2:
                Recorder.lambda$stopInternal$13((Encoder) this.f663b);
                break;
            default:
                ((VideoCapture) this.f663b).notifyReset();
                break;
        }
    }
}
