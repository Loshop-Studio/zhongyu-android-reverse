package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.camera2.internal.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0269k implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f294a;

    /* renamed from: b */
    public final /* synthetic */ Object f295b;

    /* renamed from: c */
    public final /* synthetic */ Object f296c;

    public /* synthetic */ C0269k(int i, Object obj, Object obj2) {
        this.f294a = i;
        this.f295b = obj;
        this.f296c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f294a) {
            case 0:
                return ((Camera2CameraImpl) this.f295b).lambda$isUseCaseAttached$12((String) this.f296c, completer);
            case 1:
                return ((Camera2CapturePipeline.Pipeline) this.f295b).lambda$submitConfigsInternal$4((CaptureConfig.Builder) this.f296c, completer);
            default:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f295b).lambda$preCapture$3((AtomicReference) this.f296c, completer);
        }
    }
}
