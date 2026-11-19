package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a6\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0013\u001a\u00020\u0011*\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\"\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001f\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%\u001a\"\u0010(\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "previousHandlePosition", "", "selectableId", "Ld6/s;", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "appendSelectableInfo", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "currentSelectableId", "", "currentTextLength", "getPreviousAdjustedOffset", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I", RequestParameters.POSITION, "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/foundation/text/selection/Direction;", "getXDirection-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;", "getXDirection", "getYDirection-3MmeM6k", "getYDirection", "anchorSelectableId", "getDirectionById", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JJ)Landroidx/compose/foundation/text/selection/Direction;", "currentDirection", "otherDirection", "", "isSelected", "(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Z", "getOffsetForPosition-3MmeM6k", "(JLandroidx/compose/ui/text/TextLayoutResult;)I", "getOffsetForPosition", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n54#2:367\n59#2:369\n85#3:368\n90#3:370\n60#3:373\n60#3:376\n70#3:379\n70#3:382\n70#3:385\n70#3:388\n278#4:371\n65#5:372\n65#5:375\n69#5:378\n69#5:381\n69#5:384\n69#5:387\n22#6:374\n22#6:377\n22#6:380\n22#6:383\n22#6:386\n22#6:389\n1#7:390\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n*L\n230#1:367\n231#1:369\n230#1:368\n231#1:370\n325#1:373\n326#1:376\n332#1:379\n333#1:382\n361#1:385\n362#1:388\n290#1:371\n325#1:372\n326#1:375\n332#1:378\n333#1:381\n361#1:384\n362#1:387\n325#1:374\n326#1:377\n332#1:380\n333#1:383\n361#1:386\n362#1:389\n*E\n"})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m8019appendSelectableInfoParwq6A(@NotNull SelectionLayoutBuilder selectionLayoutBuilder, @NotNull TextLayoutResult textLayoutResult, long j7, long j8, long j9) {
        Direction direction;
        Direction direction2;
        long j10;
        Direction directionAppendSelectableInfo_Parwq6A$otherDirection;
        Direction direction3;
        Direction directionAppendSelectableInfo_Parwq6A$otherDirection2;
        Direction direction4;
        Direction direction5;
        int iM8020getOffsetForPosition3MmeM6k;
        int previousAdjustedOffset;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L));
        Direction directionM8021getXDirection3MmeM6k = m8021getXDirection3MmeM6k(j7, rect);
        Direction directionM8022getYDirection3MmeM6k = m8022getYDirection3MmeM6k(j7, rect);
        if (selectionLayoutBuilder.getIsStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            direction = directionM8022getYDirection3MmeM6k;
            direction2 = directionM8021getXDirection3MmeM6k;
            j10 = j9;
            direction4 = direction2;
            directionAppendSelectableInfo_Parwq6A$otherDirection2 = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j9, previousSelection != null ? previousSelection.getEnd() : null);
            direction3 = directionAppendSelectableInfo_Parwq6A$otherDirection2;
            direction5 = direction3;
            directionAppendSelectableInfo_Parwq6A$otherDirection = direction;
        } else {
            direction = directionM8022getYDirection3MmeM6k;
            direction2 = directionM8021getXDirection3MmeM6k;
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            j10 = j9;
            directionAppendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(direction2, direction, selectionLayoutBuilder, j10, previousSelection2 != null ? previousSelection2.getStart() : null);
            direction3 = direction2;
            directionAppendSelectableInfo_Parwq6A$otherDirection2 = direction;
            direction4 = directionAppendSelectableInfo_Parwq6A$otherDirection;
            direction5 = direction4;
        }
        if (isSelected(SelectionLayoutKt.resolve2dDirection(direction2, direction), direction5)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (selectionLayoutBuilder.getIsStartHandle()) {
                previousAdjustedOffset = m8020getOffsetForPosition3MmeM6k(j7, textLayoutResult);
                Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
                iM8020getOffsetForPosition3MmeM6k = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? previousAdjustedOffset : getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j10, length);
            } else {
                iM8020getOffsetForPosition3MmeM6k = m8020getOffsetForPosition3MmeM6k(j7, textLayoutResult);
                Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
                previousAdjustedOffset = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? iM8020getOffsetForPosition3MmeM6k : getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j10, length);
            }
            selectionLayoutBuilder.appendInfo(j10, previousAdjustedOffset, direction4, directionAppendSelectableInfo_Parwq6A$otherDirection, iM8020getOffsetForPosition3MmeM6k, direction3, directionAppendSelectableInfo_Parwq6A$otherDirection2, (9223372034707292159L & j8) == InlineClassHelperKt.UnspecifiedPackedFloats ? -1 : m8020getOffsetForPosition3MmeM6k(j8, textLayoutResult), textLayoutResult);
        }
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j7, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        return (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j7)) == null) ? SelectionLayoutKt.resolve2dDirection(direction, direction2) : directionById;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j7, long j8) {
        int iCompare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j7), Long.valueOf(j8));
        return iCompare < 0 ? Direction.BEFORE : iCompare > 0 ? Direction.AFTER : Direction.f784ON;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m8020getOffsetForPosition3MmeM6k(long j7, TextLayoutResult textLayoutResult) {
        int i = (int) (4294967295L & j7);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i) >= textLayoutResult.getMultiParagraph().getHeight() ? textLayoutResult.getLayoutInput().getText().length() : textLayoutResult.m12740getOffsetForPositionk4lQ0M(j7);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j7, int i) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j7));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i : anchorInfo.getOffset();
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m8021getXDirection3MmeM6k(long j7, Rect rect) {
        int i = (int) (j7 >> 32);
        return Float.intBitsToFloat(i) < rect.getLeft() ? Direction.BEFORE : Float.intBitsToFloat(i) > rect.getRight() ? Direction.AFTER : Direction.f784ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m8022getYDirection3MmeM6k(long j7, Rect rect) {
        int i = (int) (j7 & 4294967295L);
        return Float.intBitsToFloat(i) < rect.getTop() ? Direction.BEFORE : Float.intBitsToFloat(i) > rect.getBottom() ? Direction.AFTER : Direction.f784ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.f784ON || direction != direction2;
    }
}
