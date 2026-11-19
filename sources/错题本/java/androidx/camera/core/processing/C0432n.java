package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.processing.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0432n implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f549a;

    /* renamed from: b */
    public final /* synthetic */ Object f550b;

    public /* synthetic */ C0432n(Object obj, int i) {
        this.f549a = i;
        this.f550b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f549a) {
            case 0:
                return ((SurfaceEdge.SettableSurface) this.f550b).lambda$new$0(completer);
            default:
                return ((SurfaceOutputImpl) this.f550b).lambda$new$0(completer);
        }
    }
}
