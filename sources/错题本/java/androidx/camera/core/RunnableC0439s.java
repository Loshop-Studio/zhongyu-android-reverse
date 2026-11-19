package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.s */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0439s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f554a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f555b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f556c;

    public /* synthetic */ RunnableC0439s(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.f554a = i;
        this.f555b = transformationInfoListener;
        this.f556c = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f554a) {
            case 0:
                this.f555b.onTransformationInfoUpdate(this.f556c);
                break;
            default:
                this.f555b.onTransformationInfoUpdate(this.f556c);
                break;
        }
    }
}
