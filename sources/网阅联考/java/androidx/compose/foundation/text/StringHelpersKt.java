package androidx.compose.foundation.text;

import androidx.compose.p006ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m5175d2 = {"findParagraphEnd", "", "", "startIndex", "findParagraphStart", "getParagraphBoundary", "Landroidx/compose/ui/text/TextRange;", "index", "(Ljava/lang/CharSequence;I)J", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i5 = i4 + 1; i5 < length; i5++) {
            if (charSequence.charAt(i5) == '\n') {
                return i5;
            }
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i5 = i4 - 1; i5 > 0; i5--) {
            if (charSequence.charAt(i5 - 1) == '\n') {
                return i5;
            }
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i4), findParagraphEnd(charSequence, i4));
    }
}
