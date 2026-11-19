package androidx.compose.p014ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    private final BreakIterator breakIterator;
    private final CharSequence text;

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence charSequence) {
        this.text = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.breakIterator = characterInstance;
    }

    @Override // androidx.compose.p014ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int i10) {
        return this.breakIterator.following(i10);
    }

    @Override // androidx.compose.p014ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int i10) {
        return this.breakIterator.preceding(i10);
    }
}
