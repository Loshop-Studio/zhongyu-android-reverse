package androidx.compose.p014ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final WordIterator wordIterator;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i10) {
        do {
            i10 = this.wordIterator.nextBoundary(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i10 - 1)));
        return i10;
    }

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i10) {
        do {
            i10 = this.wordIterator.nextBoundary(i10);
            if (i10 == -1 || i10 == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i10)));
        return i10;
    }

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i10) {
        do {
            i10 = this.wordIterator.prevBoundary(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i10 - 1)));
        return i10;
    }

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i10) {
        do {
            i10 = this.wordIterator.prevBoundary(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i10)));
        return i10;
    }
}
