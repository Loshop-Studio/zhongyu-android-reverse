package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.video.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C0524v implements VideoOutput {
    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.willNotProvideSurface();
    }
}
