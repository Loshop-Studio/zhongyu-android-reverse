package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m13558d2 = {"maxWidthForTextLayout", "", "Landroidx/compose/ui/unit/Constraints;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxWidthForTextLayout-R2G3SPE", "(JZI)I", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m18356maxWidthForTextLayoutR2G3SPE(long j10, boolean z9, int i10) {
        if ((z9 || TextOverflow.m23487equalsimpl0(i10, TextOverflow.INSTANCE.m23497getEllipsisgIe3tQ8())) && Constraints.m23510getHasBoundedWidthimpl(j10)) {
            return Constraints.m23514getMaxWidthimpl(j10);
        }
        return Integer.MAX_VALUE;
    }
}
