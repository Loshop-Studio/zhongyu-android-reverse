package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.processing.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0415b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f507a;

    /* renamed from: b */
    public final /* synthetic */ Object f508b;

    public /* synthetic */ RunnableC0415b(Object obj, int i) {
        this.f507a = i;
        this.f508b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f507a) {
            case 0:
                ((SurfaceRequest) this.f508b).willNotProvideSurface();
                break;
            case 1:
                ((DefaultSurfaceProcessor) this.f508b).lambda$release$5();
                break;
            case 2:
                DefaultSurfaceProcessor.lambda$snapshot$7((CallbackToFutureAdapter.Completer) this.f508b);
                break;
            case 3:
                ((SurfaceOutput) this.f508b).close();
                break;
            default:
                ((SurfaceProcessorNode) this.f508b).lambda$release$2();
                break;
        }
    }
}
