package androidx.compose.p011ui.text.input;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m5110d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m12932updateRangeAfterDeletepWDy79M(long j7, long j8) {
        int iM12766getLengthimpl;
        int iM12768getMinimpl = TextRange.m12768getMinimpl(j7);
        int iM12767getMaximpl = TextRange.m12767getMaximpl(j7);
        if (TextRange.m12772intersects5zctL8(j8, j7)) {
            if (TextRange.m12760contains5zctL8(j8, j7)) {
                iM12768getMinimpl = TextRange.m12768getMinimpl(j8);
                iM12767getMaximpl = iM12768getMinimpl;
            } else {
                if (TextRange.m12760contains5zctL8(j7, j8)) {
                    iM12766getLengthimpl = TextRange.m12766getLengthimpl(j8);
                } else if (TextRange.m12761containsimpl(j8, iM12768getMinimpl)) {
                    iM12768getMinimpl = TextRange.m12768getMinimpl(j8);
                    iM12766getLengthimpl = TextRange.m12766getLengthimpl(j8);
                } else {
                    iM12767getMaximpl = TextRange.m12768getMinimpl(j8);
                }
                iM12767getMaximpl -= iM12766getLengthimpl;
            }
        } else if (iM12767getMaximpl > TextRange.m12768getMinimpl(j8)) {
            iM12768getMinimpl -= TextRange.m12766getLengthimpl(j8);
            iM12766getLengthimpl = TextRange.m12766getLengthimpl(j8);
            iM12767getMaximpl -= iM12766getLengthimpl;
        }
        return TextRangeKt.TextRange(iM12768getMinimpl, iM12767getMaximpl);
    }
}
