package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import p049e1.InterfaceFutureC5453a;

/* renamed from: androidx.camera.camera2.internal.c0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0237c0 implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ int f210a;

    /* renamed from: b */
    public final /* synthetic */ Object f211b;

    public /* synthetic */ C0237c0(Object obj, int i) {
        this.f210a = i;
        this.f211b = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final InterfaceFutureC5453a apply(Object obj) {
        switch (this.f210a) {
            case 0:
                return ((Camera2CapturePipeline.TorchTask) this.f211b).lambda$preCapture$1((Void) obj);
            case 1:
                return ((Camera2CapturePipeline.TorchTask) this.f211b).lambda$preCapture$3((Void) obj);
            default:
                return ((Camera2CapturePipeline.Pipeline) this.f211b).lambda$executePreCapture$3((Boolean) obj);
        }
    }
}
