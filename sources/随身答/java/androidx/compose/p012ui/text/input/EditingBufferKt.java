package androidx.compose.p012ui.text.input;

import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m13413d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m23622updateRangeAfterDeletepWDy79M(long j9, long j10) {
        int iM23456getLengthimpl;
        int iM23458getMinimpl = TextRange.m23458getMinimpl(j9);
        int iM23457getMaximpl = TextRange.m23457getMaximpl(j9);
        if (TextRange.m23462intersects5zctL8(j10, j9)) {
            if (TextRange.m23450contains5zctL8(j10, j9)) {
                iM23458getMinimpl = TextRange.m23458getMinimpl(j10);
                iM23457getMaximpl = iM23458getMinimpl;
            } else {
                if (TextRange.m23450contains5zctL8(j9, j10)) {
                    iM23456getLengthimpl = TextRange.m23456getLengthimpl(j10);
                } else if (TextRange.m23451containsimpl(j10, iM23458getMinimpl)) {
                    iM23458getMinimpl = TextRange.m23458getMinimpl(j10);
                    iM23456getLengthimpl = TextRange.m23456getLengthimpl(j10);
                } else {
                    iM23457getMaximpl = TextRange.m23458getMinimpl(j10);
                }
                iM23457getMaximpl -= iM23456getLengthimpl;
            }
        } else if (iM23457getMaximpl > TextRange.m23458getMinimpl(j10)) {
            iM23458getMinimpl -= TextRange.m23456getLengthimpl(j10);
            iM23456getLengthimpl = TextRange.m23456getLengthimpl(j10);
            iM23457getMaximpl -= iM23456getLengthimpl;
        }
        return TextRangeKt.TextRange(iM23458getMinimpl, iM23457getMaximpl);
    }
}
