package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;

/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = C3156Dp.m26899constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, Rect rect, boolean z10, int i10) {
        return Rect.copy$default(rect, z10 ? i10 - rect.getRight() : rect.getLeft(), 0.0f, (z10 ? i10 - rect.getRight() : rect.getLeft()) + density.mo20491roundToPx0680j_4(DefaultCursorThickness), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).m24611getValue0d7_KjU() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }
}
