package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(InterfaceC11122i0 interfaceC11122i0) {
        super(interfaceC11122i0);
        this.surfaceSize = IntSize.Companion.m33677getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m26932getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!IntSize.m33670equalsimpl0(this.surfaceSize, IntSize.Companion.m33677getZeroYbymL2g())) {
            long j10 = this.surfaceSize;
            int i12 = (int) (j10 >> 32);
            i11 = (int) (j10 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        AbstractC9979u.m20291d(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!IntSize.m33670equalsimpl0(this.surfaceSize, IntSize.Companion.m33677getZeroYbymL2g())) {
            long j10 = this.surfaceSize;
            int i12 = (int) (j10 >> 32);
            i11 = (int) (j10 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = this.surfaceTextureSurface;
        AbstractC9979u.m20291d(surface);
        dispatchSurfaceChanged(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m26933setSurfaceSizeozmzZPI(long j10) {
        this.surfaceSize = j10;
    }
}
