package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.j0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0268j0 implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f291a;

    /* renamed from: b */
    public final /* synthetic */ boolean f292b;

    /* renamed from: c */
    public final /* synthetic */ Object f293c;

    public /* synthetic */ C0268j0(Object obj, boolean z8, int i) {
        this.f291a = i;
        this.f293c = obj;
        this.f292b = z8;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f291a) {
            case 0:
                return ((FocusMeteringControl) this.f293c).lambda$enableExternalFlashAeMode$5(this.f292b, completer);
            default:
                return ((TorchControl) this.f293c).lambda$enableTorch$2(this.f292b, completer);
        }
    }
}
