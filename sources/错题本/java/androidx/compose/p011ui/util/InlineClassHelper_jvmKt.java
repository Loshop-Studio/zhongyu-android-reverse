package androidx.compose.p011ui.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0086\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0086\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0086\b¨\u0006\b"}, m5110d2 = {"doubleFromBits", "", "bits", "", "floatFromBits", "", "", "fastRoundToInt", "ui-util_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class InlineClassHelper_jvmKt {
    public static final double doubleFromBits(long j7) {
        return Double.longBitsToDouble(j7);
    }

    public static final int fastRoundToInt(float f) {
        return Math.round(f);
    }

    public static final float floatFromBits(int i) {
        return Float.intBitsToFloat(i);
    }

    public static final int fastRoundToInt(double d9) {
        return (int) Math.round(d9);
    }
}
