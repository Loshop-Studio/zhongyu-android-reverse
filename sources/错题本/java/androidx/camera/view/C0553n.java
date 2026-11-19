package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewViewImplementation;
import androidx.camera.view.SurfaceViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* renamed from: androidx.camera.view.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0553n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f705a;

    /* renamed from: b */
    public final /* synthetic */ Object f706b;

    public /* synthetic */ C0553n(Object obj, int i) {
        this.f705a = i;
        this.f706b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f705a) {
            case 0:
                SurfaceViewImplementation.SurfaceRequestCallback.lambda$tryToComplete$0((PreviewViewImplementation.OnSurfaceNotInUseListener) this.f706b, (SurfaceRequest.Result) obj);
                break;
            default:
                ((CallbackToFutureAdapter.Completer) this.f706b).set((SurfaceRequest.Result) obj);
                break;
        }
    }
}
