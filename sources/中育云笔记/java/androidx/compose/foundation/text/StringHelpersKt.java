package androidx.compose.foundation.text;

import androidx.compose.p014ui.text.TextRangeKt;

/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i10) {
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i10), findParagraphEnd(charSequence, i10));
    }
}
