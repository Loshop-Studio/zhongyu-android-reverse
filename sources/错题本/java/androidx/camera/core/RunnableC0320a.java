package androidx.camera.core;

import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0320a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f384a;

    /* renamed from: b */
    public final /* synthetic */ Object f385b;

    /* renamed from: c */
    public final /* synthetic */ Object f386c;

    public /* synthetic */ RunnableC0320a(int i, Object obj, Object obj2) {
        this.f384a = i;
        this.f385b = obj;
        this.f386c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f384a) {
            case 0:
                ((AndroidImageReaderProxy) this.f385b).lambda$setOnImageAvailableListener$0((ImageReaderProxy.OnImageAvailableListener) this.f386c);
                break;
            case 1:
                ((CameraX) this.f385b).lambda$shutdownInternal$3((CallbackToFutureAdapter.Completer) this.f386c);
                break;
            case 2:
                ImageAnalysis.lambda$createPipeline$1((SafeCloseImageReaderProxy) this.f385b, (SafeCloseImageReaderProxy) this.f386c);
                break;
            case 3:
                ((MetadataImageReader) this.f385b).lambda$enqueueImageProxy$1((ImageReaderProxy.OnImageAvailableListener) this.f386c);
                break;
            case 4:
                ((Preview.SurfaceProvider) this.f385b).onSurfaceRequested((SurfaceRequest) this.f386c);
                break;
            default:
                ((Preview) this.f385b).lambda$createPipeline$0((CameraInternal) this.f386c);
                break;
        }
    }
}
