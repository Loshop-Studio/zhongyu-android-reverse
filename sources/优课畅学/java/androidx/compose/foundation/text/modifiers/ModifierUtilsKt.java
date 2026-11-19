package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;

/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m21578maxWidthForTextLayoutR2G3SPE(long j10, boolean z10, int i10) {
        if ((z10 || TextOverflow.m26825equalsimpl0(i10, TextOverflow.Companion.m26835getEllipsisgIe3tQ8())) && Constraints.m26848getHasBoundedWidthimpl(j10)) {
            return Constraints.m26852getMaxWidthimpl(j10);
        }
        return Integer.MAX_VALUE;
    }
}
