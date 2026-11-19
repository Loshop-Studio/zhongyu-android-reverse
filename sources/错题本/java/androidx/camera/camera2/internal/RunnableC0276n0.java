package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0276n0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f314a;

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f315b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f316c;

    public /* synthetic */ RunnableC0276n0(FocusMeteringControl focusMeteringControl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f314a = i;
        this.f315b = focusMeteringControl;
        this.f316c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f314a) {
            case 0:
                this.f315b.lambda$cancelFocusAndMetering$12(this.f316c);
                break;
            default:
                this.f315b.lambda$triggerAePrecapture$2(this.f316c);
                break;
        }
    }
}
