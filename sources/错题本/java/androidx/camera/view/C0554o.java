package androidx.camera.view;

import androidx.camera.view.RotationProvider;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.view.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C0554o implements CallbackToFutureAdapter.Resolver, RotationProvider.Listener, ZoomGestureDetector.OnZoomGestureListener {

    /* renamed from: a */
    public final /* synthetic */ Object f707a;

    public /* synthetic */ C0554o(Object obj) {
        this.f707a = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((TextureViewImplementation) this.f707a).lambda$waitForNextFrame$3(completer);
    }

    @Override // androidx.camera.view.RotationProvider.Listener
    public void onRotationChanged(int i) {
        ((CameraController) this.f707a).lambda$new$1(i);
    }

    @Override // androidx.camera.view.impl.ZoomGestureDetector.OnZoomGestureListener
    public boolean onZoomEvent(ZoomGestureDetector.ZoomEvent zoomEvent) {
        return ((PreviewView) this.f707a).lambda$new$1(zoomEvent);
    }
}
