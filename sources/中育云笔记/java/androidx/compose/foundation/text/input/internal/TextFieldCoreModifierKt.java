package androidx.compose.foundation.text.input.internal;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;

/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = C3186Dp.m33501constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, Rect rect, boolean z10, int i10) {
        return Rect.copy$default(rect, z10 ? i10 - rect.getRight() : rect.getLeft(), 0.0f, (z10 ? i10 - rect.getRight() : rect.getLeft()) + density.mo27093roundToPx0680j_4(DefaultCursorThickness), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).m31213getValue0d7_KjU() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }
}
