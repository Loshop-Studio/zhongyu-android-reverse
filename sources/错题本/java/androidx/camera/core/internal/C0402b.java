package androidx.camera.core.internal;

import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.internal.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0402b implements Preview.SurfaceProvider {
    @Override // androidx.camera.core.Preview.SurfaceProvider
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        CameraUseCaseAdapter.lambda$createExtraPreview$1(surfaceRequest);
    }
}
