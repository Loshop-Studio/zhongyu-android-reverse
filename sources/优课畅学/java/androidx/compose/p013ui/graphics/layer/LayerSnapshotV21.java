package androidx.compose.p013ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    public static final LayerSnapshotV21 INSTANCE = new LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.p013ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, InterfaceC9324c<? super Bitmap> interfaceC9324c) {
        long jM24918getSizeYbymL2g = graphicsLayer.m24918getSizeYbymL2g();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (jM24918getSizeYbymL2g >> 32), (int) (jM24918getSizeYbymL2g & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
