package androidx.camera.core.processing;

import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;

/* renamed from: androidx.camera.core.processing.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0426h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f534a;

    public /* synthetic */ RunnableC0426h(int i) {
        this.f534a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f534a) {
            case 0:
                DefaultSurfaceProcessor.lambda$executeSafely$11();
                break;
            default:
                DualSurfaceProcessor.lambda$executeSafely$7();
                break;
        }
    }
}
