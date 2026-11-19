package androidx.compose.p006ui.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0007"}, m5175d2 = {"lerp", "", "start", "stop", "fraction", "", "", "ui-util_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float lerp(float f4, float f5, float f6) {
        return ((1 - f6) * f4) + (f6 * f5);
    }

    public static final int lerp(int i4, int i5, float f4) {
        return i4 + MathKt__MathJVMKt.roundToInt((i5 - i4) * f4);
    }

    public static final long lerp(long j4, long j5, float f4) {
        return j4 + MathKt__MathJVMKt.roundToLong((j5 - j4) * f4);
    }
}
