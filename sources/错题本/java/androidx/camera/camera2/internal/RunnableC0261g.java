package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CaptureSessionRepository;
import androidx.camera.core.impl.CameraCaptureCallback;
import java.util.LinkedHashSet;

/* renamed from: androidx.camera.camera2.internal.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0261g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f269a;

    /* renamed from: b */
    public final /* synthetic */ int f270b;

    /* renamed from: c */
    public final /* synthetic */ Object f271c;

    public /* synthetic */ RunnableC0261g(Object obj, int i, int i8) {
        this.f269a = i8;
        this.f271c = obj;
        this.f270b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f269a) {
            case 0:
                ((CameraCaptureCallback) this.f271c).onCaptureCancelled(this.f270b);
                break;
            default:
                CaptureSessionRepository.C02201.lambda$dispatchOnError$1((LinkedHashSet) this.f271c, this.f270b);
                break;
        }
    }
}
