package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.text.TextLayoutResult;
import p077d8.AbstractC8323h;

/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        return textLayoutResult.getHorizontalPosition(i10, textLayoutResult.getBidiRunDirection(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == textLayoutResult.getParagraphDirection(i10));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        int lineForOffset = textLayoutResult.getLineForOffset(i10);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        float fM13517l = AbstractC8323h.m13517l(getHorizontalPosition(textLayoutResult, i10, z10, z11), 0.0f, (int) (textLayoutResult.m26335getSizeYbymL2g() >> 32));
        float fM13517l2 = AbstractC8323h.m13517l(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.m26335getSizeYbymL2g() & 4294967295L));
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(fM13517l) << 32) | (Float.floatToRawIntBits(fM13517l2) & 4294967295L));
    }
}
