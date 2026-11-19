package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.CaptureNode;

/* renamed from: androidx.camera.core.imagecapture.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0342d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f423a;

    /* renamed from: b */
    public final /* synthetic */ int f424b;

    /* renamed from: c */
    public final /* synthetic */ Object f425c;

    public /* synthetic */ RunnableC0342d(Object obj, int i, int i8) {
        this.f423a = i8;
        this.f425c = obj;
        this.f424b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f423a) {
            case 0:
                ((CaptureNode.C03301) this.f425c).lambda$onCaptureProcessProgressed$1(this.f424b);
                break;
            default:
                ((TakePictureRequest) this.f425c).lambda$onCaptureProcessProgressed$3(this.f424b);
                break;
        }
    }
}
