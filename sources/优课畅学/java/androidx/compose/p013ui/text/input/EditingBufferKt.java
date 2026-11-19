package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;

/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m26526updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM26360getLengthimpl;
        int iM26362getMinimpl = TextRange.m26362getMinimpl(j10);
        int iM26361getMaximpl = TextRange.m26361getMaximpl(j10);
        if (TextRange.m26366intersects5zctL8(j11, j10)) {
            if (TextRange.m26354contains5zctL8(j11, j10)) {
                iM26362getMinimpl = TextRange.m26362getMinimpl(j11);
                iM26361getMaximpl = iM26362getMinimpl;
            } else {
                if (TextRange.m26354contains5zctL8(j10, j11)) {
                    iM26360getLengthimpl = TextRange.m26360getLengthimpl(j11);
                } else if (TextRange.m26355containsimpl(j11, iM26362getMinimpl)) {
                    iM26362getMinimpl = TextRange.m26362getMinimpl(j11);
                    iM26360getLengthimpl = TextRange.m26360getLengthimpl(j11);
                } else {
                    iM26361getMaximpl = TextRange.m26362getMinimpl(j11);
                }
                iM26361getMaximpl -= iM26360getLengthimpl;
            }
        } else if (iM26361getMaximpl > TextRange.m26362getMinimpl(j11)) {
            iM26362getMinimpl -= TextRange.m26360getLengthimpl(j11);
            iM26360getLengthimpl = TextRange.m26360getLengthimpl(j11);
            iM26361getMaximpl -= iM26360getLengthimpl;
        }
        return TextRangeKt.TextRange(iM26362getMinimpl, iM26361getMaximpl);
    }
}
