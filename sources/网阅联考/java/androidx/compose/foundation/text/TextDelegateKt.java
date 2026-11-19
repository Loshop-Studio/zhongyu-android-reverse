package androidx.compose.foundation.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m5175d2 = {"ceilToIntPx", "", "", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f4) {
        return MathKt__MathJVMKt.roundToInt((float) Math.ceil(f4));
    }
}
