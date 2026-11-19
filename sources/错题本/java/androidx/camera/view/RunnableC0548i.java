package androidx.camera.view;

import android.graphics.SurfaceTexture;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import androidx.camera.view.TextureViewImplementation;

/* renamed from: androidx.camera.view.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0548i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f694a;

    /* renamed from: b */
    public final /* synthetic */ Object f695b;

    /* renamed from: c */
    public final /* synthetic */ Object f696c;

    public /* synthetic */ RunnableC0548i(int i, Object obj, Object obj2) {
        this.f694a = i;
        this.f696c = obj;
        this.f695b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f694a) {
            case 0:
                ((PreviewView.C05341) this.f696c).lambda$onSurfaceRequested$0((SurfaceRequest) this.f695b);
                break;
            case 1:
                ((TextureViewImplementation) this.f696c).lambda$onSurfaceRequested$0((SurfaceRequest) this.f695b);
                break;
            case 2:
                TextureViewImplementation.TextureViewSurfaceTextureListenerC05391.lambda$onSurfaceTextureUpdated$0((PreviewView.OnFrameUpdateListener) this.f696c, (SurfaceTexture) this.f695b);
                break;
            default:
                ((CameraController) this.f696c).lambda$setCameraSelector$3((CameraSelector) this.f695b);
                break;
        }
    }
}
