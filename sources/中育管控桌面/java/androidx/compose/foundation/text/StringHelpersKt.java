package androidx.compose.foundation.text;

import androidx.compose.p009ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, m7880d2 = {"findParagraphEnd", "", "", "startIndex", "findParagraphStart", "getParagraphBoundary", "Landroidx/compose/ui/text/TextRange;", "index", "(Ljava/lang/CharSequence;I)J", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i6) {
        int length = charSequence.length();
        while (i6 < length) {
            if (charSequence.charAt(i6) == '\n') {
                return i6;
            }
            i6++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i6) {
        while (i6 > 0) {
            if (charSequence.charAt(i6 - 1) == '\n') {
                return i6;
            }
            i6--;
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i6) {
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i6), findParagraphEnd(charSequence, i6));
    }
}
