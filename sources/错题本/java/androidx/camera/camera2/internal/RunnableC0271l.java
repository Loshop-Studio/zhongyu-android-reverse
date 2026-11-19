package androidx.camera.camera2.internal;

import java.util.ArrayList;

/* renamed from: androidx.camera.camera2.internal.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0271l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f299a;

    /* renamed from: b */
    public final /* synthetic */ Camera2CameraImpl f300b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f301c;

    public /* synthetic */ RunnableC0271l(Camera2CameraImpl camera2CameraImpl, ArrayList arrayList, int i) {
        this.f299a = i;
        this.f300b = camera2CameraImpl;
        this.f301c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f299a) {
            case 0:
                this.f300b.lambda$detachUseCases$16(this.f301c);
                break;
            default:
                this.f300b.lambda$attachUseCases$15(this.f301c);
                break;
        }
    }
}
