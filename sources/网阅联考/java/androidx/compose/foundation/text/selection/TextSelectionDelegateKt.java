package androidx.compose.foundation.text.selection;

import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.text.TextLayoutResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m5175d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offset", "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "getHorizontalPosition", "", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i4, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "<this>");
        return textLayoutResult.getHorizontalPosition(i4, textLayoutResult.getBidiRunDirection(((!z3 || z4) && (z3 || !z4)) ? Math.max(i4 + (-1), 0) : i4) == textLayoutResult.getParagraphDirection(i4));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i4, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        return OffsetKt.Offset(getHorizontalPosition(textLayoutResult, i4, z3, z4), textLayoutResult.getLineBottom(textLayoutResult.getLineForOffset(i4)));
    }
}
