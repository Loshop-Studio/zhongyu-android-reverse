package androidx.compose.p014ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    public static final LayerSnapshotV21 INSTANCE = new LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.p014ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, InterfaceC11588c<? super Bitmap> interfaceC11588c) {
        long jM31520getSizeYbymL2g = graphicsLayer.m31520getSizeYbymL2g();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (jM31520getSizeYbymL2g >> 32), (int) (jM31520getSizeYbymL2g & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
