package androidx.compose.p006ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m5175d2 = {"getLineForOffset", "", "Landroid/text/Layout;", "offset", "upstream", "", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LayoutCompatKt {
    @InternalPlatformTextApi
    public static final int getLineForOffset(Layout layout, @IntRange(from = 0) int i4, boolean z3) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (i4 <= 0) {
            return 0;
        }
        if (i4 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i4);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i4 || layout.getLineEnd(lineForOffset) == i4) ? lineStart == i4 ? z3 ? lineForOffset - 1 : lineForOffset : z3 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }
}
