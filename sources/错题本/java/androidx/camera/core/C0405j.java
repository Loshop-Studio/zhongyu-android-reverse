package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;

/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0405j implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ int f493a;

    /* renamed from: b */
    public final /* synthetic */ Object f494b;

    public /* synthetic */ C0405j(Object obj, int i) {
        this.f493a = i;
        this.f494b = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f493a) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy) this.f494b).lambda$new$1(imageProxy);
                break;
            default:
                ((SafeCloseImageReaderProxy) this.f494b).lambda$new$0(imageProxy);
                break;
        }
    }
}
