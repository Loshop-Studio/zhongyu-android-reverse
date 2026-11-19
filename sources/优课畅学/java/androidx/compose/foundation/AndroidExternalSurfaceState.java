package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import p135i8.InterfaceC8822b0;

/* loaded from: classes.dex */
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {
    private int lastHeight;
    private int lastWidth;

    public AndroidExternalSurfaceState(InterfaceC8822b0 interfaceC8822b0) {
        super(interfaceC8822b0);
        this.lastWidth = -1;
        this.lastHeight = -1;
    }

    public final int getLastHeight() {
        return this.lastHeight;
    }

    public final int getLastWidth() {
        return this.lastWidth;
    }

    public final void setLastHeight(int i10) {
        this.lastHeight = i10;
    }

    public final void setLastWidth(int i10) {
        this.lastWidth = i10;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (this.lastWidth == i11 && this.lastHeight == i12) {
            return;
        }
        this.lastWidth = i11;
        this.lastHeight = i12;
        dispatchSurfaceChanged(surfaceHolder.getSurface(), i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.lastWidth = surfaceFrame.width();
        this.lastHeight = surfaceFrame.height();
        dispatchSurfaceCreated(surfaceHolder.getSurface(), this.lastWidth, this.lastHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        dispatchSurfaceDestroyed(surfaceHolder.getSurface());
    }
}
