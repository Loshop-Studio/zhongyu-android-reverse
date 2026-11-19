package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;

/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m33128updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM32962getLengthimpl;
        int iM32964getMinimpl = TextRange.m32964getMinimpl(j10);
        int iM32963getMaximpl = TextRange.m32963getMaximpl(j10);
        if (TextRange.m32968intersects5zctL8(j11, j10)) {
            if (TextRange.m32956contains5zctL8(j11, j10)) {
                iM32964getMinimpl = TextRange.m32964getMinimpl(j11);
                iM32963getMaximpl = iM32964getMinimpl;
            } else {
                if (TextRange.m32956contains5zctL8(j10, j11)) {
                    iM32962getLengthimpl = TextRange.m32962getLengthimpl(j11);
                } else if (TextRange.m32957containsimpl(j11, iM32964getMinimpl)) {
                    iM32964getMinimpl = TextRange.m32964getMinimpl(j11);
                    iM32962getLengthimpl = TextRange.m32962getLengthimpl(j11);
                } else {
                    iM32963getMaximpl = TextRange.m32964getMinimpl(j11);
                }
                iM32963getMaximpl -= iM32962getLengthimpl;
            }
        } else if (iM32963getMaximpl > TextRange.m32964getMinimpl(j11)) {
            iM32964getMinimpl -= TextRange.m32962getLengthimpl(j11);
            iM32962getLengthimpl = TextRange.m32962getLengthimpl(j11);
            iM32963getMaximpl -= iM32962getLengthimpl;
        }
        return TextRangeKt.TextRange(iM32964getMinimpl, iM32963getMaximpl);
    }
}
