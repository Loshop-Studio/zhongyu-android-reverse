package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.processing.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0414a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f504a;

    /* renamed from: b */
    public final /* synthetic */ Object f505b;

    /* renamed from: c */
    public final /* synthetic */ Object f506c;

    public /* synthetic */ RunnableC0414a(int i, Object obj, Object obj2) {
        this.f504a = i;
        this.f505b = obj;
        this.f506c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f504a) {
            case 0:
                ((DefaultSurfaceProcessor) this.f505b).lambda$snapshot$6((DefaultSurfaceProcessor.PendingSnapshot) this.f506c);
                break;
            case 1:
                ((SurfaceOutputImpl) this.f505b).lambda$requestClose$1((AtomicReference) this.f506c);
                break;
            case 2:
                ((DefaultSurfaceProcessor) this.f505b).lambda$onInputSurface$2((SurfaceRequest) this.f506c);
                break;
            case 3:
                ((DefaultSurfaceProcessor) this.f505b).lambda$onOutputSurface$4((SurfaceOutput) this.f506c);
                break;
            case 4:
                ((SurfaceProcessorWithExecutor) this.f505b).lambda$onInputSurface$0((SurfaceRequest) this.f506c);
                break;
            default:
                ((SurfaceProcessorWithExecutor) this.f505b).lambda$onOutputSurface$1((SurfaceOutput) this.f506c);
                break;
        }
    }
}
