package androidx.camera.video;

import androidx.camera.video.AudioSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;

/* renamed from: androidx.camera.video.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0482i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f597a;

    /* renamed from: b */
    public final /* synthetic */ int f598b;

    public /* synthetic */ C0482i(int i, int i8) {
        this.f597a = i8;
        this.f598b = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f597a) {
            case 0:
                Recorder.Builder.lambda$setTargetVideoEncodingBitRate$1(this.f598b, (VideoSpec.Builder) obj);
                break;
            case 1:
                ((AudioSpec.Builder) obj).setSource(this.f598b);
                break;
            default:
                ((VideoSpec.Builder) obj).setAspectRatio(this.f598b);
                break;
        }
    }
}
