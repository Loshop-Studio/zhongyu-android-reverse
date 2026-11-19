package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.l0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0272l0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f302a = 0;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f303b;

    /* renamed from: c */
    public final /* synthetic */ boolean f304c;

    /* renamed from: d */
    public final /* synthetic */ Object f305d;

    public /* synthetic */ RunnableC0272l0(FocusMeteringControl focusMeteringControl, boolean z8, CallbackToFutureAdapter.Completer completer) {
        this.f305d = focusMeteringControl;
        this.f304c = z8;
        this.f303b = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f302a) {
            case 0:
                ((FocusMeteringControl) this.f305d).lambda$enableExternalFlashAeMode$4(this.f304c, this.f303b);
                break;
            default:
                ((TorchControl) this.f305d).lambda$enableTorch$1(this.f303b, this.f304c);
                break;
        }
    }

    public /* synthetic */ RunnableC0272l0(TorchControl torchControl, CallbackToFutureAdapter.Completer completer, boolean z8) {
        this.f305d = torchControl;
        this.f303b = completer;
        this.f304c = z8;
    }
}
