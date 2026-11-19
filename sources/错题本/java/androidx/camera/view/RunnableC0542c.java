package androidx.camera.view;

import androidx.camera.core.ImageCapture;
import androidx.camera.view.CameraController;
import androidx.camera.view.PreviewViewImplementation;

/* renamed from: androidx.camera.view.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0542c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f683a;

    /* renamed from: b */
    public final /* synthetic */ Object f684b;

    public /* synthetic */ RunnableC0542c(Object obj, int i) {
        this.f683a = i;
        this.f684b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f683a) {
            case 0:
                ((CameraController.C05292) this.f684b).lambda$accept$0();
                break;
            case 1:
                ((PreviewViewImplementation.OnSurfaceNotInUseListener) this.f684b).onSurfaceNotInUse();
                break;
            default:
                ((ImageCapture.ScreenFlashListener) this.f684b).onCompleted();
                break;
        }
    }
}
