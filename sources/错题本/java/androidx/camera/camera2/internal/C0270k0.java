package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0270k0 implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f297a;

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringControl f298b;

    public /* synthetic */ C0270k0(FocusMeteringControl focusMeteringControl, int i) {
        this.f297a = i;
        this.f298b = focusMeteringControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f297a) {
            case 0:
                return this.f298b.lambda$cancelFocusAndMetering$13(completer);
            default:
                return this.f298b.lambda$triggerAePrecapture$3(completer);
        }
    }
}
