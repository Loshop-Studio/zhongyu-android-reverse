package androidx.compose.p006ui.text.input;

import androidx.compose.p006ui.text.TextRange;
import androidx.compose.p006ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, m5175d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m11207updateRangeAfterDeletepWDy79M(long j4, long j5) {
        int iM11073getLengthimpl;
        int iM11075getMinimpl = TextRange.m11075getMinimpl(j4);
        int iM11074getMaximpl = TextRange.m11074getMaximpl(j4);
        if (TextRange.m11079intersects5zctL8(j5, j4)) {
            if (TextRange.m11067contains5zctL8(j5, j4)) {
                iM11075getMinimpl = TextRange.m11075getMinimpl(j5);
                iM11074getMaximpl = iM11075getMinimpl;
            } else {
                if (TextRange.m11067contains5zctL8(j4, j5)) {
                    iM11073getLengthimpl = TextRange.m11073getLengthimpl(j5);
                } else if (TextRange.m11068containsimpl(j5, iM11075getMinimpl)) {
                    iM11075getMinimpl = TextRange.m11075getMinimpl(j5);
                    iM11073getLengthimpl = TextRange.m11073getLengthimpl(j5);
                } else {
                    iM11074getMaximpl = TextRange.m11075getMinimpl(j5);
                }
                iM11074getMaximpl -= iM11073getLengthimpl;
            }
        } else if (iM11074getMaximpl > TextRange.m11075getMinimpl(j5)) {
            iM11075getMinimpl -= TextRange.m11073getLengthimpl(j5);
            iM11073getLengthimpl = TextRange.m11073getLengthimpl(j5);
            iM11074getMaximpl -= iM11073getLengthimpl;
        }
        return TextRangeKt.TextRange(iM11075getMinimpl, iM11074getMaximpl);
    }
}
