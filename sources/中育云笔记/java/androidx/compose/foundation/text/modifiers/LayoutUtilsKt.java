package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import p265nd.AbstractC10410o;

/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m28175finalConstraintstfFHcEY(long j10, boolean z10, int i10, float f10) {
        return Constraints.Companion.m33463fitPrioritizingWidthZbe2FdA(0, m28177finalMaxWidthtfFHcEY(j10, z10, i10, f10), 0, Constraints.m33453getMaxHeightimpl(j10));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m28176finalMaxLinesxdlQI24(boolean z10, int i10, int i11) {
        if (z10 || !m28178isEllipsisMW5ApA(i10)) {
            return AbstractC10410o.m21752e(i11, 1);
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m28177finalMaxWidthtfFHcEY(long j10, boolean z10, int i10, float f10) {
        int iM33454getMaxWidthimpl = ((z10 || m28178isEllipsisMW5ApA(i10)) && Constraints.m33450getHasBoundedWidthimpl(j10)) ? Constraints.m33454getMaxWidthimpl(j10) : Integer.MAX_VALUE;
        return Constraints.m33456getMinWidthimpl(j10) == iM33454getMaxWidthimpl ? iM33454getMaxWidthimpl : AbstractC10410o.m21761n(TextDelegateKt.ceilToIntPx(f10), Constraints.m33456getMinWidthimpl(j10), iM33454getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m28178isEllipsisMW5ApA(int i10) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m33427equalsimpl0(i10, companion.m33437getEllipsisgIe3tQ8()) || TextOverflow.m33427equalsimpl0(i10, companion.m33439getStartEllipsisgIe3tQ8()) || TextOverflow.m33427equalsimpl0(i10, companion.m33438getMiddleEllipsisgIe3tQ8());
    }
}
