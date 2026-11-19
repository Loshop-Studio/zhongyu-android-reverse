package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

/* renamed from: androidx.camera.core.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0409n implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ int f500a;

    /* renamed from: b */
    public final /* synthetic */ ImageProxy f501b;

    /* renamed from: c */
    public final /* synthetic */ ImageProxy f502c;

    public /* synthetic */ C0409n(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.f500a = i;
        this.f501b = imageProxy;
        this.f502c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f500a) {
            case 0:
                ImageProcessingUtil.lambda$convertYUVToRGB$0(this.f501b, this.f502c, imageProxy);
                break;
            default:
                ImageProcessingUtil.lambda$rotateYUV$1(this.f501b, this.f502c, imageProxy);
                break;
        }
    }
}
