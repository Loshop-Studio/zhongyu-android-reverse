package androidx.compose.p013ui.geometry;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m13558d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float f10, int i10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i10, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i11 = (int) f11;
        if (f11 - i11 >= 0.5f) {
            i11++;
        }
        float f12 = i11 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }
}
