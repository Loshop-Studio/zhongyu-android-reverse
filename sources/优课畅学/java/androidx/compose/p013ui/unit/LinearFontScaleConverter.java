package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;

/* loaded from: classes2.dex */
final class LinearFontScaleConverter implements FontScaleConverter {
    private final float fontScale;

    public LinearFontScaleConverter(float f10) {
        this.fontScale = f10;
    }

    private final float component1() {
        return this.fontScale;
    }

    public static /* synthetic */ LinearFontScaleConverter copy$default(LinearFontScaleConverter linearFontScaleConverter, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = linearFontScaleConverter.fontScale;
        }
        return linearFontScaleConverter.copy(f10);
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f10) {
        return f10 / this.fontScale;
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f10) {
        return f10 * this.fontScale;
    }

    public final LinearFontScaleConverter copy(float f10) {
        return new LinearFontScaleConverter(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) obj).fontScale) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.fontScale + ')';
    }
}
