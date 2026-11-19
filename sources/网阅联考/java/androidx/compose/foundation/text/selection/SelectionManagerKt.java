package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.RectKt;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.TextRange;
import androidx.compose.p006ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0000\u001a!\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0018H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m5175d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getCurrentSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "merge", "lhs", "rhs", "containsInclusive", "", "Landroidx/compose/ui/geometry/Rect;", "offset", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "visibleBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectionManagerKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m7756calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager manager, long j4) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Selection selection = manager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        int i4 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i4 == -1) {
            return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
        }
        if (i4 == 1) {
            return m260xeba096cb(manager, j4, selection.getStart(), true);
        }
        if (i4 == 2) {
            return m260xeba096cb(manager, j4, selection.getEnd(), false);
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter */
    private static final long m260xeba096cb(SelectionManager selectionManager, long j4, Selection.AnchorInfo anchorInfo, boolean z3) {
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (!z3) {
            offset--;
        }
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
        }
        Offset offsetM7745getCurrentDragPosition_m7T9E = selectionManager.m7745getCurrentDragPosition_m7T9E();
        Intrinsics.checkNotNull(offsetM7745getCurrentDragPosition_m7T9E);
        float fM8945getXimpl = Offset.m8945getXimpl(layoutCoordinates.mo10590localPositionOfR5De75A(containerLayoutCoordinates, offsetM7745getCurrentDragPosition_m7T9E.getPackedValue()));
        long jMo7707getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo7707getRangeOfLineContainingjx7JFs(offset);
        Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m11075getMinimpl(jMo7707getRangeOfLineContainingjx7JFs));
        Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(RangesKt___RangesKt.coerceAtLeast(TextRange.m11074getMaximpl(jMo7707getRangeOfLineContainingjx7JFs) - 1, TextRange.m11075getMinimpl(jMo7707getRangeOfLineContainingjx7JFs)));
        float fCoerceIn = RangesKt___RangesKt.coerceIn(fM8945getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        return Math.abs(fM8945getXimpl - fCoerceIn) > ((float) (IntSize.m11685getWidthimpl(j4) / 2)) ? Offset.INSTANCE.m8960getUnspecifiedF1C5BW0() : containerLayoutCoordinates.mo10590localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(fCoerceIn, Offset.m8946getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m8975getCenterF1C5BW0())));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m7757containsInclusiveUv8p0NA(Rect containsInclusive, long j4) {
        Intrinsics.checkNotNullParameter(containsInclusive, "$this$containsInclusive");
        float left = containsInclusive.getLeft();
        float right = containsInclusive.getRight();
        float fM8945getXimpl = Offset.m8945getXimpl(j4);
        if (left <= fM8945getXimpl && fM8945getXimpl <= right) {
            float top = containsInclusive.getTop();
            float bottom = containsInclusive.getBottom();
            float fM8946getYimpl = Offset.m8946getYimpl(j4);
            if (top <= fM8946getYimpl && fM8946getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    public static final AnnotatedString getCurrentSelectedText(Selectable selectable, Selection selection) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selection, "selection");
        AnnotatedString text = selectable.getText();
        return (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId()) ? (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) ? selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset()) : selectable.getSelectableId() == selection.getStart().getSelectableId() ? selection.getHandlesCrossed() ? text.subSequence(0, selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), text.length()) : selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), text.length()) : text.subSequence(0, selection.getEnd().getOffset()) : text;
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m8983Rect0a9Yr6o(layoutCoordinates.mo10594windowToLocalMKHz9U(rectBoundsInWindow.m8980getTopLeftF1C5BW0()), layoutCoordinates.mo10594windowToLocalMKHz9U(rectBoundsInWindow.m8974getBottomRightF1C5BW0()));
    }
}
