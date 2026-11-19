package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.text.TextLayoutResult;
import androidx.compose.p006ui.text.TextRange;
import androidx.compose.p006ui.text.TextRangeKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m5175d2 = {"getAssembledSelectionInfo", "Landroidx/compose/foundation/text/selection/Selection;", "newSelectionRange", "Landroidx/compose/ui/text/TextRange;", "handlesCrossed", "", "selectableId", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getAssembledSelectionInfo-vJH6DeI", "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "getOffsetForPosition", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getTextSelectionInfo", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "isStartHandle", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAssembledSelectionInfo-vJH6DeI, reason: not valid java name */
    public static final Selection m7710getAssembledSelectionInfovJH6DeI(long j4, boolean z3, long j5, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m11077getStartimpl(j4)), TextRange.m11077getStartimpl(j4), j5), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m11072getEndimpl(j4) - 1, 0)), TextRange.m11072getEndimpl(j4), j5), z3);
    }

    /* renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m7711getOffsetForPosition0AR0LA0(TextLayoutResult textLayoutResult, Rect bounds, long j4) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m8971containsk4lQ0M(j4)) {
            return RangesKt___RangesKt.coerceIn(textLayoutResult.m11049getOffsetForPositionk4lQ0M(j4), 0, length);
        }
        if (SelectionMode.Vertical.mo7762compare3MmeM6k$foundation_release(j4, bounds) < 0) {
            return 0;
        }
        return length;
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    public static final Pair<Selection, Boolean> m7712getTextSelectionInfoyM0VcXU(TextLayoutResult textLayoutResult, long j4, long j5, Offset offset, long j6, SelectionAdjustment adjustment, Selection selection, boolean z3) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m11685getWidthimpl(textLayoutResult.getSize()), IntSize.m11684getHeightimpl(textLayoutResult.getSize()));
        if (!SelectionMode.Vertical.m7763isSelected2x9bVx0$foundation_release(rect, j4, j5)) {
            return new Pair<>(null, Boolean.FALSE);
        }
        int iM7711getOffsetForPosition0AR0LA0 = m7711getOffsetForPosition0AR0LA0(textLayoutResult, rect, j4);
        int iM7711getOffsetForPosition0AR0LA02 = m7711getOffsetForPosition0AR0LA0(textLayoutResult, rect, j5);
        int iM7711getOffsetForPosition0AR0LA03 = offset != null ? m7711getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.getPackedValue()) : -1;
        long jMo7715adjustZXO7KMw = adjustment.mo7715adjustZXO7KMw(textLayoutResult, TextRangeKt.TextRange(iM7711getOffsetForPosition0AR0LA0, iM7711getOffsetForPosition0AR0LA02), iM7711getOffsetForPosition0AR0LA03, z3, selection != null ? TextRange.m11065boximpl(selection.m7714toTextRanged9O1mEE()) : null);
        Selection selectionM7710getAssembledSelectionInfovJH6DeI = m7710getAssembledSelectionInfovJH6DeI(jMo7715adjustZXO7KMw, TextRange.m11076getReversedimpl(jMo7715adjustZXO7KMw), j6, textLayoutResult);
        boolean z4 = true;
        boolean z5 = !Intrinsics.areEqual(selectionM7710getAssembledSelectionInfovJH6DeI, selection);
        if (!(!z3 ? iM7711getOffsetForPosition0AR0LA02 == iM7711getOffsetForPosition0AR0LA03 : iM7711getOffsetForPosition0AR0LA0 == iM7711getOffsetForPosition0AR0LA03) && !z5) {
            z4 = false;
        }
        return new Pair<>(selectionM7710getAssembledSelectionInfovJH6DeI, Boolean.valueOf(z4));
    }
}
