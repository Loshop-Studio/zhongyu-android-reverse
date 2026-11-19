package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.text.TextLayoutResult;
import p265nd.AbstractC10410o;

/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        return textLayoutResult.getHorizontalPosition(i10, textLayoutResult.getBidiRunDirection(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == textLayoutResult.getParagraphDirection(i10));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        int lineForOffset = textLayoutResult.getLineForOffset(i10);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        float fM21760m = AbstractC10410o.m21760m(getHorizontalPosition(textLayoutResult, i10, z10, z11), 0.0f, (int) (textLayoutResult.m32937getSizeYbymL2g() >> 32));
        float fM21760m2 = AbstractC10410o.m21760m(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.m32937getSizeYbymL2g() & 4294967295L));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM21760m) << 32) | (Float.floatToRawIntBits(fM21760m2) & 4294967295L));
    }
}
