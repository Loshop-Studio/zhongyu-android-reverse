package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.video.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0519p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f658a;

    /* renamed from: b */
    public final /* synthetic */ Object f659b;

    /* renamed from: c */
    public final /* synthetic */ Object f660c;

    /* renamed from: d */
    public final /* synthetic */ Object f661d;

    public /* synthetic */ RunnableC0519p(Object obj, Object obj2, int i, Object obj3) {
        this.f658a = i;
        this.f661d = obj;
        this.f659b = obj2;
        this.f660c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f658a) {
            case 0:
                ((Recorder.SetupVideoTask) this.f661d).lambda$setupVideo$0((SurfaceRequest) this.f659b, (Timebase) this.f660c);
                break;
            case 1:
                ((Recorder) this.f661d).lambda$onSurfaceRequested$0((SurfaceRequest) this.f659b, (Timebase) this.f660c);
                break;
            default:
                VideoCapture.lambda$setupSurfaceUpdateNotifier$5((AtomicBoolean) this.f661d, (SessionConfig.Builder) this.f659b, (CameraCaptureCallback) this.f660c);
                break;
        }
    }
}
