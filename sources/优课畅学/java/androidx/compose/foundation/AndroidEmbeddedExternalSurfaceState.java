package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8822b0;

/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(InterfaceC8822b0 interfaceC8822b0) {
        super(interfaceC8822b0);
        this.surfaceSize = IntSize.Companion.m27075getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m20330getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!IntSize.m27068equalsimpl0(this.surfaceSize, IntSize.Companion.m27075getZeroYbymL2g())) {
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
        AbstractC9133u.m16130d(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!IntSize.m27068equalsimpl0(this.surfaceSize, IntSize.Companion.m27075getZeroYbymL2g())) {
            long j10 = this.surfaceSize;
            int i12 = (int) (j10 >> 32);
            i11 = (int) (j10 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = this.surfaceTextureSurface;
        AbstractC9133u.m16130d(surface);
        dispatchSurfaceChanged(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m20331setSurfaceSizeozmzZPI(long j10) {
        this.surfaceSize = j10;
    }
}
