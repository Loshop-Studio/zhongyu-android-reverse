package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.graphics.ImageBitmap;

/* renamed from: androidx.compose.ui.graphics.g1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1322g1 {
    static {
        ImageBitmap.Companion companion = ImageBitmap.Companion;
    }

    /* renamed from: a */
    public static /* synthetic */ void m510a(ImageBitmap imageBitmap, int[] iArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        int i11 = (i10 & 2) != 0 ? 0 : i4;
        int i12 = (i10 & 4) != 0 ? 0 : i5;
        int width = (i10 & 8) != 0 ? imageBitmap.getWidth() : i6;
        imageBitmap.readPixels(iArr, i11, i12, width, (i10 & 16) != 0 ? imageBitmap.getHeight() : i7, (i10 & 32) == 0 ? i8 : 0, (i10 & 64) != 0 ? width : i9);
    }
}
