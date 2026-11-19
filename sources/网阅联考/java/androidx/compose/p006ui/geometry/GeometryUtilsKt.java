package androidx.compose.p006ui.geometry;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m5175d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float f4, int i4) {
        int iMax = Math.max(i4, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f5 = f4 * fPow;
        int i5 = (int) f5;
        if (f5 - i5 >= 0.5f) {
            i5++;
        }
        float f6 = i5 / fPow;
        return iMax > 0 ? String.valueOf(f6) : String.valueOf((int) f6);
    }
}
