package androidx.compose.p011ui.graphics.layer;

import android.media.ImageReader;

/* renamed from: androidx.compose.ui.graphics.layer.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C2123b implements ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        LayerManager.persistLayers$lambda$3$lambda$2(imageReader);
    }
}
