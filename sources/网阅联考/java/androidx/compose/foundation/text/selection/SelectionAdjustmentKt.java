package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.p006ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m5175d2 = {"ensureAtLeastOneChar", "Landroidx/compose/ui/text/TextRange;", "text", "", "offset", "", "lastOffset", "isStartHandle", "", "previousHandlesCrossed", "(Ljava/lang/String;IIZZ)J", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(String text, int i4, int i5, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(text, "text");
        return i5 == 0 ? TextRangeKt.TextRange(i4, i4) : i4 == 0 ? z3 ? TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(text, 0), 0) : TextRangeKt.TextRange(0, StringHelpers_androidKt.findFollowingBreak(text, 0)) : i4 == i5 ? z3 ? TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(text, i5), i5) : TextRangeKt.TextRange(i5, StringHelpers_androidKt.findPrecedingBreak(text, i5)) : z3 ? !z4 ? TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(text, i4), i4) : TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(text, i4), i4) : !z4 ? TextRangeKt.TextRange(i4, StringHelpers_androidKt.findFollowingBreak(text, i4)) : TextRangeKt.TextRange(i4, StringHelpers_androidKt.findPrecedingBreak(text, i4));
    }
}
