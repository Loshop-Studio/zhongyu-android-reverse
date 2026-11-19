package androidx.camera.video;

import androidx.camera.video.Recorder;

/* renamed from: androidx.camera.video.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0476c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f583a;

    /* renamed from: b */
    public final /* synthetic */ Recorder f584b;

    /* renamed from: c */
    public final /* synthetic */ Recorder.RecordingRecord f585c;

    public /* synthetic */ RunnableC0476c(Recorder recorder, Recorder.RecordingRecord recordingRecord, int i) {
        this.f583a = i;
        this.f584b = recorder;
        this.f585c = recordingRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f583a) {
            case 0:
                this.f584b.lambda$resume$4(this.f585c);
                break;
            default:
                this.f584b.lambda$pause$3(this.f585c);
                break;
        }
    }
}
