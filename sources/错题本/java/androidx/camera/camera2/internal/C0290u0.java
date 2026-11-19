package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p049e1.InterfaceFutureC5453a;

/* renamed from: androidx.camera.camera2.internal.u0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0290u0 implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ int f347a = 0;

    /* renamed from: b */
    public final /* synthetic */ CameraDevice f348b;

    /* renamed from: c */
    public final /* synthetic */ Object f349c;

    /* renamed from: d */
    public final /* synthetic */ Object f350d;

    /* renamed from: e */
    public final /* synthetic */ Object f351e;

    public /* synthetic */ C0290u0(ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        this.f349c = processingCaptureSession;
        this.f350d = sessionConfig;
        this.f348b = cameraDevice;
        this.f351e = opener;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final InterfaceFutureC5453a apply(Object obj) {
        switch (this.f347a) {
            case 0:
                return ((ProcessingCaptureSession) this.f349c).lambda$open$2((SessionConfig) this.f350d, this.f348b, (SynchronizedCaptureSession.Opener) this.f351e, (List) obj);
            default:
                return ((SynchronizedCaptureSessionImpl) this.f349c).lambda$openCaptureSession$0(this.f348b, (SessionConfigurationCompat) this.f350d, (List) this.f351e, (List) obj);
        }
    }

    public /* synthetic */ C0290u0(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.f349c = synchronizedCaptureSessionImpl;
        this.f348b = cameraDevice;
        this.f350d = sessionConfigurationCompat;
        this.f351e = list;
    }
}
