package androidx.compose.p014ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import vc.InterfaceC11588c;

@RequiresApi(28)
/* loaded from: classes2.dex */
public final class LayerSnapshotV28 implements LayerSnapshotImpl {
    public static final LayerSnapshotV28 INSTANCE = new LayerSnapshotV28();

    public static final class GraphicsLayerPicture extends Picture {
        private final GraphicsLayer graphicsLayer;

        public GraphicsLayerPicture(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // android.graphics.Picture
        public Canvas beginRecording(int i10, int i11) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public void draw(Canvas canvas) {
            this.graphicsLayer.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(canvas), null);
        }

        @Override // android.graphics.Picture
        public void endRecording() {
        }

        public final GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // android.graphics.Picture
        public int getHeight() {
            return (int) (this.graphicsLayer.m31520getSizeYbymL2g() & 4294967295L);
        }

        @Override // android.graphics.Picture
        public int getWidth() {
            return (int) (this.graphicsLayer.m31520getSizeYbymL2g() >> 32);
        }

        @Override // android.graphics.Picture
        public boolean requiresHardwareAcceleration() {
            return true;
        }
    }

    private LayerSnapshotV28() {
    }

    @Override // androidx.compose.p014ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, InterfaceC11588c<? super Bitmap> interfaceC11588c) {
        return Bitmap.createBitmap(new GraphicsLayerPicture(graphicsLayer));
    }
}
