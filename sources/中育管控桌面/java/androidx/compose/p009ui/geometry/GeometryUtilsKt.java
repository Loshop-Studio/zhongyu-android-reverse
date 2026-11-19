package androidx.compose.p009ui.geometry;

import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m7880d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float f6, int i6) {
        if (Float.isNaN(f6)) {
            return "NaN";
        }
        if (Float.isInfinite(f6)) {
            return f6 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i6, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f7 = f6 * fPow;
        int i7 = (int) f7;
        if (f7 - i7 >= 0.5f) {
            i7++;
        }
        float f8 = i7 / fPow;
        return iMax > 0 ? String.valueOf(f8) : String.valueOf((int) f8);
    }
}
