package androidx.camera.core.imagecapture;

import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.CaptureNode;

/* renamed from: androidx.camera.core.imagecapture.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0341c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f421a;

    /* renamed from: b */
    public final /* synthetic */ Object f422b;

    public /* synthetic */ RunnableC0341c(Object obj, int i) {
        this.f421a = i;
        this.f422b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f421a) {
            case 0:
                ((SafeCloseImageReaderProxy) this.f422b).safeClose();
                break;
            case 1:
                CaptureNode.lambda$releaseInputResources$4((SafeCloseImageReaderProxy) this.f422b);
                break;
            default:
                ((CaptureNode.C03301) this.f422b).lambda$onCaptureStarted$0();
                break;
        }
    }
}
