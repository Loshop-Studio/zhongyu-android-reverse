package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p009ui.text.style.TextOverflow;
import androidx.compose.p009ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m7880d2 = {"isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "overflow", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m11274finalConstraintstfFHcEY(long j6, boolean z6, int i6, float f6) {
        return Constraints.INSTANCE.m16446fitPrioritizingWidthZbe2FdA(0, m11276finalMaxWidthtfFHcEY(j6, z6, i6, f6), 0, Constraints.m16436getMaxHeightimpl(j6));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m11275finalMaxLinesxdlQI24(boolean z6, int i6, int i7) {
        if (z6 || !m11277isEllipsisMW5ApA(i6)) {
            return RangesKt.coerceAtLeast(i7, 1);
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m11276finalMaxWidthtfFHcEY(long j6, boolean z6, int i6, float f6) {
        int iM16437getMaxWidthimpl = ((z6 || m11277isEllipsisMW5ApA(i6)) && Constraints.m16433getHasBoundedWidthimpl(j6)) ? Constraints.m16437getMaxWidthimpl(j6) : Integer.MAX_VALUE;
        return Constraints.m16439getMinWidthimpl(j6) == iM16437getMaxWidthimpl ? iM16437getMaxWidthimpl : RangesKt.coerceIn(TextDelegateKt.ceilToIntPx(f6), Constraints.m16439getMinWidthimpl(j6), iM16437getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m11277isEllipsisMW5ApA(int i6) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m16410equalsimpl0(i6, companion.m16420getEllipsisgIe3tQ8()) || TextOverflow.m16410equalsimpl0(i6, companion.m16422getStartEllipsisgIe3tQ8()) || TextOverflow.m16410equalsimpl0(i6, companion.m16421getMiddleEllipsisgIe3tQ8());
    }
}
