package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;

@Metadata(m5109d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m5110d2 = {"isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "overflow", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m7979finalConstraintstfFHcEY(long j7, boolean z8, int i, float f) {
        return Constraints.INSTANCE.m13267fitPrioritizingWidthZbe2FdA(0, m7981finalMaxWidthtfFHcEY(j7, z8, i, f), 0, Constraints.m13257getMaxHeightimpl(j7));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m7980finalMaxLinesxdlQI24(boolean z8, int i, int i8) {
        if ((z8 || !m7982isEllipsisMW5ApA(i)) && i8 >= 1) {
            return i8;
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m7981finalMaxWidthtfFHcEY(long j7, boolean z8, int i, float f) {
        int iM13258getMaxWidthimpl = ((z8 || m7982isEllipsisMW5ApA(i)) && Constraints.m13254getHasBoundedWidthimpl(j7)) ? Constraints.m13258getMaxWidthimpl(j7) : Integer.MAX_VALUE;
        return Constraints.m13260getMinWidthimpl(j7) == iM13258getMaxWidthimpl ? iM13258getMaxWidthimpl : AbstractC5806u.m5274m(TextDelegateKt.ceilToIntPx(f), Constraints.m13260getMinWidthimpl(j7), iM13258getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m7982isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m13231equalsimpl0(i, companion.m13241getEllipsisgIe3tQ8()) || TextOverflow.m13231equalsimpl0(i, companion.m13243getStartEllipsisgIe3tQ8()) || TextOverflow.m13231equalsimpl0(i, companion.m13242getMiddleEllipsisgIe3tQ8());
    }
}
