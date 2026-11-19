package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.text.TextLayoutResult;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m28215appendSelectableInfoParwq6A(SelectionLayoutBuilder selectionLayoutBuilder, TextLayoutResult textLayoutResult, long j10, long j11, long j12) {
        Direction direction;
        Direction direction2;
        long j13;
        Direction directionAppendSelectableInfo_Parwq6A$otherDirection;
        Direction direction3;
        Direction directionAppendSelectableInfo_Parwq6A$otherDirection2;
        Direction direction4;
        Direction direction5;
        int iM28216getOffsetForPosition3MmeM6k;
        int previousAdjustedOffset;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, (int) (textLayoutResult.m32937getSizeYbymL2g() >> 32), (int) (textLayoutResult.m32937getSizeYbymL2g() & 4294967295L));
        Direction directionM28217getXDirection3MmeM6k = m28217getXDirection3MmeM6k(j10, rect);
        Direction directionM28218getYDirection3MmeM6k = m28218getYDirection3MmeM6k(j10, rect);
        if (selectionLayoutBuilder.isStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            direction = directionM28218getYDirection3MmeM6k;
            direction2 = directionM28217getXDirection3MmeM6k;
            j13 = j12;
            direction4 = direction2;
            directionAppendSelectableInfo_Parwq6A$otherDirection2 = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j12, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = directionAppendSelectableInfo_Parwq6A$otherDirection2;
            direction5 = direction3;
            directionAppendSelectableInfo_Parwq6A$otherDirection = direction;
        } else {
            direction = directionM28218getYDirection3MmeM6k;
            direction2 = directionM28217getXDirection3MmeM6k;
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            j13 = j12;
            directionAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j13, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction3 = direction2;
            directionAppendSelectableInfo_Parwq6A$otherDirection2 = direction;
            direction4 = directionAppendSelectableInfo_Parwq6A$otherDirection;
            direction5 = direction4;
        }
        if (isSelected(SelectionLayoutKt.resolve2dDirection(direction2, direction), direction5)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.isStartHandle()) {
                previousAdjustedOffset = m28216getOffsetForPosition3MmeM6k(j10, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                iM28216getOffsetForPosition3MmeM6k = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? previousAdjustedOffset : getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j13, length);
            } else {
                iM28216getOffsetForPosition3MmeM6k = m28216getOffsetForPosition3MmeM6k(j10, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                previousAdjustedOffset = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? iM28216getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j13, length);
            }
            selectionLayoutBuilder.appendInfo(j13, previousAdjustedOffset, direction4, directionAppendSelectableInfo_Parwq6A$otherDirection, iM28216getOffsetForPosition3MmeM6k, direction3, directionAppendSelectableInfo_Parwq6A$otherDirection2, (9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats ? -1 : m28216getOffsetForPosition3MmeM6k(j11, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j10, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j10)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j10, long j11) {
        int iCompare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j10), Long.valueOf(j11));
        return iCompare < 0 ? Direction.BEFORE : iCompare > 0 ? Direction.AFTER : Direction.f1122ON;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m28216getOffsetForPosition3MmeM6k(long j10, TextLayoutResult textLayoutResult) {
        int i10 = (int) (4294967295L & j10);
        if (Float.intBitsToFloat(i10) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i10) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m32936getOffsetForPositionk4lQ0M(j10);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j10, int i10) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j10));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i10 : anchorInfo.getOffset();
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m28217getXDirection3MmeM6k(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        return Float.intBitsToFloat(i10) < rect.getLeft() ? Direction.BEFORE : Float.intBitsToFloat(i10) > rect.getRight() ? Direction.AFTER : Direction.f1122ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m28218getYDirection3MmeM6k(long j10, Rect rect) {
        int i10 = (int) (j10 & 4294967295L);
        return Float.intBitsToFloat(i10) < rect.getTop() ? Direction.BEFORE : Float.intBitsToFloat(i10) > rect.getBottom() ? Direction.AFTER : Direction.f1122ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.f1122ON || direction != direction2;
    }
}
