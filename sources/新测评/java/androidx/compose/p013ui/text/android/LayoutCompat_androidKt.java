package androidx.compose.p013ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m13558d2 = {"getLineForOffset", "", "Landroid/text/Layout;", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class LayoutCompat_androidKt {
    public static final int getLineForOffset(Layout layout, @IntRange(from = 0) int i10, boolean z9) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z9) {
                    return lineForOffset - 1;
                }
            } else if (!z9) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
