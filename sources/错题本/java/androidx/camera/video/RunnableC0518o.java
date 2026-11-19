package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.video.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0518o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f655a;

    /* renamed from: b */
    public final /* synthetic */ Object f656b;

    /* renamed from: c */
    public final /* synthetic */ Object f657c;

    public /* synthetic */ RunnableC0518o(int i, Object obj, Object obj2) {
        this.f655a = i;
        this.f656b = obj;
        this.f657c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f655a) {
            case 0:
                ((Recorder.RecordingRecord) this.f656b).lambda$updateVideoRecordEvent$6((VideoRecordEvent) this.f657c);
                break;
            case 1:
                ((VideoCapture.C04712) this.f656b).lambda$onCaptureCompleted$0((SessionConfig.Builder) this.f657c);
                break;
            case 2:
                ((VideoEncoderSession) this.f656b).lambda$configureVideoEncoderInternal$4((Surface) this.f657c);
                break;
            case 3:
                ((Executor) this.f656b).execute((Runnable) this.f657c);
                break;
            case 4:
                ((Recorder) this.f656b).lambda$onSourceStateChanged$1((VideoOutput.SourceState) this.f657c);
                break;
            default:
                ((VideoCapture) this.f656b).lambda$createPipeline$2((DeferrableSurface) this.f657c);
                break;
        }
    }
}
