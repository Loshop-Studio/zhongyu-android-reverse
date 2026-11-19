package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m13558d2 = {"isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "overflow", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m18351finalConstraintstfFHcEY(long j10, boolean z9, int i10, float f10) {
        return Constraints.INSTANCE.m23523fitPrioritizingWidthZbe2FdA(0, m18353finalMaxWidthtfFHcEY(j10, z9, i10, f10), 0, Constraints.m23513getMaxHeightimpl(j10));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m18352finalMaxLinesxdlQI24(boolean z9, int i10, int i11) {
        if (z9 || !m18354isEllipsisMW5ApA(i10)) {
            return RangesKt.coerceAtLeast(i11, 1);
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m18353finalMaxWidthtfFHcEY(long j10, boolean z9, int i10, float f10) {
        int iM23514getMaxWidthimpl = ((z9 || m18354isEllipsisMW5ApA(i10)) && Constraints.m23510getHasBoundedWidthimpl(j10)) ? Constraints.m23514getMaxWidthimpl(j10) : Integer.MAX_VALUE;
        return Constraints.m23516getMinWidthimpl(j10) == iM23514getMaxWidthimpl ? iM23514getMaxWidthimpl : RangesKt.coerceIn(TextDelegateKt.ceilToIntPx(f10), Constraints.m23516getMinWidthimpl(j10), iM23514getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m18354isEllipsisMW5ApA(int i10) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m23487equalsimpl0(i10, companion.m23497getEllipsisgIe3tQ8()) || TextOverflow.m23487equalsimpl0(i10, companion.m23499getStartEllipsisgIe3tQ8()) || TextOverflow.m23487equalsimpl0(i10, companion.m23498getMiddleEllipsisgIe3tQ8());
    }
}
