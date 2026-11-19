package androidx.compose.foundation.text.modifiers;

import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;

/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m28180maxWidthForTextLayoutR2G3SPE(long j10, boolean z10, int i10) {
        if ((z10 || TextOverflow.m33427equalsimpl0(i10, TextOverflow.Companion.m33437getEllipsisgIe3tQ8())) && Constraints.m33450getHasBoundedWidthimpl(j10)) {
            return Constraints.m33454getMaxWidthimpl(j10);
        }
        return Integer.MAX_VALUE;
    }
}
