package androidx.compose.p014ui.graphics;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class ColorMatrixFilterHelper {
    public static final ColorMatrixFilterHelper INSTANCE = new ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    /* renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m30957getColorMatrix8unuwjk(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.m30934constructorimpl(colorMatrix.getArray());
    }
}
