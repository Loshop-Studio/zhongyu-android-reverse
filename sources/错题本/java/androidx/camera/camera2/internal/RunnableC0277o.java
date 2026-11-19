package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.camera2.internal.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0277o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f317a;

    /* renamed from: b */
    public final /* synthetic */ Object f318b;

    /* renamed from: c */
    public final /* synthetic */ Object f319c;

    /* renamed from: d */
    public final /* synthetic */ Object f320d;

    public /* synthetic */ RunnableC0277o(Camera2CapturePipeline.ScreenFlashTask screenFlashTask, AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        this.f317a = 1;
        this.f319c = screenFlashTask;
        this.f320d = atomicReference;
        this.f318b = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f317a) {
            case 0:
                ((Camera2CameraImpl) this.f319c).lambda$isUseCaseAttached$11((CallbackToFutureAdapter.Completer) this.f318b, (String) this.f320d);
                break;
            case 1:
                ((Camera2CapturePipeline.ScreenFlashTask) this.f319c).lambda$preCapture$2((AtomicReference) this.f320d, (CallbackToFutureAdapter.Completer) this.f318b);
                break;
            default:
                ((Camera2CameraControlImpl) this.f319c).lambda$addSessionCameraCaptureCallback$8((Executor) this.f318b, (CameraCaptureCallback) this.f320d);
                break;
        }
    }

    public /* synthetic */ RunnableC0277o(Object obj, Object obj2, int i, Object obj3) {
        this.f317a = i;
        this.f319c = obj;
        this.f318b = obj2;
        this.f320d = obj3;
    }
}
