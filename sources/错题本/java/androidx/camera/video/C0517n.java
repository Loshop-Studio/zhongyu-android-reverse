package androidx.camera.video;

import android.net.Uri;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* renamed from: androidx.camera.video.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0517n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f654a;

    public /* synthetic */ C0517n(int i) {
        this.f654a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f654a) {
            case 0:
                Recorder.RecordingRecord.lambda$new$0((Uri) obj);
                break;
            default:
                Recorder.lambda$composeRecorderMediaSpec$8((VideoSpec.Builder) obj);
                break;
        }
    }
}
