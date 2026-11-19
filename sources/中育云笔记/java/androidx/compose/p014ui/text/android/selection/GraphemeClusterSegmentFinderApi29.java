package androidx.compose.p014ui.text.android.selection;

import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final TextPaint textPaint;

    public GraphemeClusterSegmentFinderApi29(CharSequence charSequence, TextPaint textPaint) {
        this.text = charSequence;
        this.textPaint = textPaint;
    }

    @Override // androidx.compose.p014ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int i10) {
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // androidx.compose.p014ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int i10) {
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
