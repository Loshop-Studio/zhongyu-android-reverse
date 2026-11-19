package androidx.compose.foundation.text;

import androidx.compose.p012ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, m13413d2 = {"findParagraphEnd", "", "", "startIndex", "findParagraphStart", "getParagraphBoundary", "Landroidx/compose/ui/text/TextRange;", "index", "(Ljava/lang/CharSequence;I)J", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        while (i9 < length) {
            if (charSequence.charAt(i9) == '\n') {
                return i9;
            }
            i9++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i9) {
        while (i9 > 0) {
            if (charSequence.charAt(i9 - 1) == '\n') {
                return i9;
            }
            i9--;
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i9) {
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i9), findParagraphEnd(charSequence, i9));
    }
}
