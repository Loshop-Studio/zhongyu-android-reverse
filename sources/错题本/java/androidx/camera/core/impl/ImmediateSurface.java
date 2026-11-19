package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.futures.Futures;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public final class ImmediateSurface extends DeferrableSurface {
    private final Surface mSurface;

    public ImmediateSurface(@NonNull Surface surface, @NonNull Size size, int i) {
        super(size, i);
        this.mSurface = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public InterfaceFutureC5453a provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(@NonNull Surface surface) {
        this.mSurface = surface;
    }
}
