package androidx.compose.p009ui.text.android.selection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m7880d2 = {"getWordEnd", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i6) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i6)) ? wordIterator.getPunctuationEnd(i6) : wordIterator.getNextWordEndOnTwoWordBoundary(i6);
        return punctuationEnd == -1 ? i6 : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i6) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i6)) ? wordIterator.getPunctuationBeginning(i6) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i6);
        return punctuationBeginning == -1 ? i6 : punctuationBeginning;
    }
}
