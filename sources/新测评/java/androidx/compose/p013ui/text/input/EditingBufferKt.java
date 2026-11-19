package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m13558d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m23189updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM23023getLengthimpl;
        int iM23025getMinimpl = TextRange.m23025getMinimpl(j10);
        int iM23024getMaximpl = TextRange.m23024getMaximpl(j10);
        if (TextRange.m23029intersects5zctL8(j11, j10)) {
            if (TextRange.m23017contains5zctL8(j11, j10)) {
                iM23025getMinimpl = TextRange.m23025getMinimpl(j11);
                iM23024getMaximpl = iM23025getMinimpl;
            } else {
                if (TextRange.m23017contains5zctL8(j10, j11)) {
                    iM23023getLengthimpl = TextRange.m23023getLengthimpl(j11);
                } else if (TextRange.m23018containsimpl(j11, iM23025getMinimpl)) {
                    iM23025getMinimpl = TextRange.m23025getMinimpl(j11);
                    iM23023getLengthimpl = TextRange.m23023getLengthimpl(j11);
                } else {
                    iM23024getMaximpl = TextRange.m23025getMinimpl(j11);
                }
                iM23024getMaximpl -= iM23023getLengthimpl;
            }
        } else if (iM23024getMaximpl > TextRange.m23025getMinimpl(j11)) {
            iM23025getMinimpl -= TextRange.m23023getLengthimpl(j11);
            iM23023getLengthimpl = TextRange.m23023getLengthimpl(j11);
            iM23024getMaximpl -= iM23023getLengthimpl;
        }
        return TextRangeKt.TextRange(iM23025getMinimpl, iM23024getMaximpl);
    }
}
