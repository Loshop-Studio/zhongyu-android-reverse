package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import p049e1.InterfaceFutureC5453a;

/* renamed from: androidx.camera.core.impl.utils.futures.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0396b implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f470a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceFutureC5453a f471b;

    public /* synthetic */ C0396b(InterfaceFutureC5453a interfaceFutureC5453a, int i) {
        this.f470a = i;
        this.f471b = interfaceFutureC5453a;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f470a) {
            case 0:
                return Futures.lambda$transformAsyncOnCompletion$8(this.f471b, completer);
            default:
                return Futures.lambda$nonCancellationPropagating$0(this.f471b, completer);
        }
    }
}
