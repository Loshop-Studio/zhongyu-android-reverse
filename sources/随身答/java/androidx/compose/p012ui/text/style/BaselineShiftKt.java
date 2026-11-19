package androidx.compose.p012ui.text.style;

import androidx.compose.p012ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, m13413d2 = {"lerp", "Landroidx/compose/ui/text/style/BaselineShift;", "start", "stop", "fraction", "", "lerp-jWV1Mfo", "(FFF)F", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BaselineShiftKt {
    @Stable
    /* renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m23763lerpjWV1Mfo(float f10, float f11, float f12) {
        return BaselineShift.m23751constructorimpl(MathHelpersKt.lerp(f10, f11, f12));
    }
}
