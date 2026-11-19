package androidx.camera.video;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;
import java.io.IOException;

/* renamed from: androidx.camera.video.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0514k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f649a;

    /* renamed from: b */
    public final /* synthetic */ Object f650b;

    public /* synthetic */ C0514k(Object obj, int i) {
        this.f649a = i;
        this.f650b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) throws IOException {
        switch (this.f649a) {
            case 0:
                Recorder.RecordingRecord.lambda$initializeRecording$2((MediaStoreOutputOptions) this.f650b, (Uri) obj);
                break;
            case 1:
                Recorder.RecordingRecord.lambda$initializeRecording$5((ParcelFileDescriptor) this.f650b, (Uri) obj);
                break;
            case 2:
                ((VideoEncoderSession) this.f650b).onSurfaceRequestComplete((SurfaceRequest.Result) obj);
                break;
            case 3:
                ((Recorder) this.f650b).lambda$setupAndStartMediaMuxer$9((Uri) obj);
                break;
            default:
                ((VideoSpec.Builder) obj).setQualitySelector((QualitySelector) this.f650b);
                break;
        }
    }
}
