package androidx.compose.p013ui.text.android.selection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m13558d2 = {"getWordEnd", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i10) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i10)) ? wordIterator.getPunctuationEnd(i10) : wordIterator.getNextWordEndOnTwoWordBoundary(i10);
        return punctuationEnd == -1 ? i10 : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i10) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i10)) ? wordIterator.getPunctuationBeginning(i10) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i10);
        return punctuationBeginning == -1 ? i10 : punctuationBeginning;
    }
}
