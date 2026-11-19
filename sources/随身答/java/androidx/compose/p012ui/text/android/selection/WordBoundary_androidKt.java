package androidx.compose.p012ui.text.android.selection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m13413d2 = {"getWordEnd", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i9) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i9)) ? wordIterator.getPunctuationEnd(i9) : wordIterator.getNextWordEndOnTwoWordBoundary(i9);
        return punctuationEnd == -1 ? i9 : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i9) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i9)) ? wordIterator.getPunctuationBeginning(i9) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i9);
        return punctuationBeginning == -1 ? i9 : punctuationBeginning;
    }
}
