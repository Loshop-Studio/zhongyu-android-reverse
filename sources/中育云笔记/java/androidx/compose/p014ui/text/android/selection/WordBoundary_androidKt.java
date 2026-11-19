package androidx.compose.p014ui.text.android.selection;

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
