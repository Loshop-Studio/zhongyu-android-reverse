package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0232a1 implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ int f195a;

    /* renamed from: b */
    public final /* synthetic */ ZoomControl f196b;

    /* renamed from: c */
    public final /* synthetic */ ZoomState f197c;

    public /* synthetic */ C0232a1(ZoomControl zoomControl, ZoomState zoomState, int i) {
        this.f195a = i;
        this.f196b = zoomControl;
        this.f197c = zoomState;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f195a) {
            case 0:
                return this.f196b.lambda$setZoomRatio$1(this.f197c, completer);
            default:
                return this.f196b.lambda$setLinearZoom$3(this.f197c, completer);
        }
    }
}
