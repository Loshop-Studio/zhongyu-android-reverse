package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0324e implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f397a;

    /* renamed from: b */
    public final /* synthetic */ Object f398b;

    /* renamed from: c */
    public final /* synthetic */ Object f399c;

    public /* synthetic */ C0324e(int i, Object obj, Object obj2) {
        this.f397a = i;
        this.f398b = obj;
        this.f399c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f397a) {
            case 0:
                return ((CameraX) this.f398b).lambda$initInternal$0((Context) this.f399c, completer);
            default:
                return ((SurfaceRequest) this.f398b).lambda$initialSurfaceRecreationCompleter$6((AtomicReference) this.f399c, completer);
        }
    }
}
