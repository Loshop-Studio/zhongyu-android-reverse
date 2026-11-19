package androidx.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.view.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0544e implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f686a;

    /* renamed from: b */
    public final /* synthetic */ Object f687b;

    /* renamed from: c */
    public final /* synthetic */ Object f688c;

    public /* synthetic */ C0544e(int i, Object obj, Object obj2) {
        this.f686a = i;
        this.f687b = obj;
        this.f688c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f686a) {
            case 0:
                return ((PendingValue) this.f687b).lambda$setValue$0(this.f688c, completer);
            default:
                return ((TextureViewImplementation) this.f687b).lambda$tryToProvidePreviewSurface$1((Surface) this.f688c, completer);
        }
    }
}
