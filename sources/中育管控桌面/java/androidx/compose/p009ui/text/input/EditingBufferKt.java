package androidx.compose.p009ui.text.input;

import androidx.compose.p009ui.text.TextRange;
import androidx.compose.p009ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m7880d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m16112updateRangeAfterDeletepWDy79M(long j6, long j7) {
        int iM15946getLengthimpl;
        int iM15948getMinimpl = TextRange.m15948getMinimpl(j6);
        int iM15947getMaximpl = TextRange.m15947getMaximpl(j6);
        if (TextRange.m15952intersects5zctL8(j7, j6)) {
            if (TextRange.m15940contains5zctL8(j7, j6)) {
                iM15948getMinimpl = TextRange.m15948getMinimpl(j7);
                iM15947getMaximpl = iM15948getMinimpl;
            } else {
                if (TextRange.m15940contains5zctL8(j6, j7)) {
                    iM15946getLengthimpl = TextRange.m15946getLengthimpl(j7);
                } else if (TextRange.m15941containsimpl(j7, iM15948getMinimpl)) {
                    iM15948getMinimpl = TextRange.m15948getMinimpl(j7);
                    iM15946getLengthimpl = TextRange.m15946getLengthimpl(j7);
                } else {
                    iM15947getMaximpl = TextRange.m15948getMinimpl(j7);
                }
                iM15947getMaximpl -= iM15946getLengthimpl;
            }
        } else if (iM15947getMaximpl > TextRange.m15948getMinimpl(j7)) {
            iM15948getMinimpl -= TextRange.m15946getLengthimpl(j7);
            iM15946getLengthimpl = TextRange.m15946getLengthimpl(j7);
            iM15947getMaximpl -= iM15946getLengthimpl;
        }
        return TextRangeKt.TextRange(iM15948getMinimpl, iM15947getMaximpl);
    }
}
