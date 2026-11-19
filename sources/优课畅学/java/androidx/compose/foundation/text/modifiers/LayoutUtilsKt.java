package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import p077d8.AbstractC8323h;

/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m21573finalConstraintstfFHcEY(long j10, boolean z10, int i10, float f10) {
        return Constraints.Companion.m26861fitPrioritizingWidthZbe2FdA(0, m21575finalMaxWidthtfFHcEY(j10, z10, i10, f10), 0, Constraints.m26851getMaxHeightimpl(j10));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m21574finalMaxLinesxdlQI24(boolean z10, int i10, int i11) {
        if (z10 || !m21576isEllipsisMW5ApA(i10)) {
            return AbstractC8323h.m13510e(i11, 1);
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m21575finalMaxWidthtfFHcEY(long j10, boolean z10, int i10, float f10) {
        int iM26852getMaxWidthimpl = ((z10 || m21576isEllipsisMW5ApA(i10)) && Constraints.m26848getHasBoundedWidthimpl(j10)) ? Constraints.m26852getMaxWidthimpl(j10) : Integer.MAX_VALUE;
        return Constraints.m26854getMinWidthimpl(j10) == iM26852getMaxWidthimpl ? iM26852getMaxWidthimpl : AbstractC8323h.m13518m(TextDelegateKt.ceilToIntPx(f10), Constraints.m26854getMinWidthimpl(j10), iM26852getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m21576isEllipsisMW5ApA(int i10) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m26825equalsimpl0(i10, companion.m26835getEllipsisgIe3tQ8()) || TextOverflow.m26825equalsimpl0(i10, companion.m26837getStartEllipsisgIe3tQ8()) || TextOverflow.m26825equalsimpl0(i10, companion.m26836getMiddleEllipsisgIe3tQ8());
    }
}
