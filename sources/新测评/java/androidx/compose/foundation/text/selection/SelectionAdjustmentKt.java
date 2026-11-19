package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a,\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a4\u0010\u0015\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0007X\u008a\u0084\u0002"}, m13558d2 = {"adjustToBoundaries", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "anchorOnBoundary", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "crossed", "", "isStart", "slot", "", "changeOffset", "info", "newOffset", "ensureAtLeastOneChar", "expandOneChar", "isExpanding", "currentRawOffset", "snapToWordBoundary", "currentLine", "currentOffset", "otherOffset", "updateSelectionBoundary", "previousSelectionAnchor", "foundation_release", "currentRawLine", "anchorSnappedToWordBoundary"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSelectionAdjustment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionAdjustment.kt\nandroidx/compose/foundation/text/selection/SelectionAdjustmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z9 = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z9, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z9, false, selectionLayout.getEndSlot(), boundaryFunction), z9);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z9, boolean z10, int i10, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z10 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i10 != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long jMo18388getBoundaryfzxv0v0 = boundaryFunction.mo18388getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z9 ^ z10 ? TextRange.m23027getStartimpl(jMo18388getBoundaryfzxv0v0) : TextRange.m23022getEndimpl(jMo18388getBoundaryfzxv0v0));
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i10) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i10), i10, 0L, 4, null);
    }

    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || selectionLayout.getInfo().getInputText().length() == 0) ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        SelectableInfo currentInfo = selectionLayout.getInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int iFindFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            return selectionLayout.getIsStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindFollowingBreak), null, true, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindFollowingBreak), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iFindPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            return selectionLayout.getIsStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindPrecedingBreak), null, false, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindPrecedingBreak), true, 1, null);
        }
        Selection previousSelection = selectionLayout.getPreviousSelection();
        boolean z9 = previousSelection != null && previousSelection.getHandlesCrossed();
        int iFindPrecedingBreak2 = selectionLayout.getIsStartHandle() ^ z9 ? StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset) : StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        return selectionLayout.getIsStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindPrecedingBreak2), null, z9, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindPrecedingBreak2), z9, 1, null);
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i10, boolean z9) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i10 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        return z9 ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED) ? i10 < selectableInfo.getRawPreviousHandleOffset() : i10 > selectableInfo.getRawPreviousHandleOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i10, int i11, int i12, boolean z9, boolean z10) {
        long jM22999getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m22999getWordBoundaryjx7JFs(i11);
        int iM23027getStartimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m23027getStartimpl(jM22999getWordBoundaryjx7JFs)) == i10 ? TextRange.m23027getStartimpl(jM22999getWordBoundaryjx7JFs) : i10 >= selectableInfo.getTextLayoutResult().getLineCount() ? selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1) : selectableInfo.getTextLayoutResult().getLineStart(i10);
        int iM23022getEndimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m23022getEndimpl(jM22999getWordBoundaryjx7JFs)) == i10 ? TextRange.m23022getEndimpl(jM22999getWordBoundaryjx7JFs) : i10 >= selectableInfo.getTextLayoutResult().getLineCount() ? TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null) : TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i10, false, 2, null);
        if (iM23027getStartimpl == i12) {
            return selectableInfo.anchorForOffset(iM23022getEndimpl);
        }
        if (iM23022getEndimpl == i12) {
            return selectableInfo.anchorForOffset(iM23027getStartimpl);
        }
        if (!(z9 ^ z10) ? i11 >= iM23027getStartimpl : i11 > iM23022getEndimpl) {
            iM23027getStartimpl = iM23022getEndimpl;
        }
        return selectableInfo.anchorForOffset(iM23027getStartimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.getIsStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.getIsStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(selectableInfo.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.getIsStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Selection.AnchorInfo invoke() {
                return SelectionAdjustmentKt.snapToWordBoundary(selectableInfo, SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(lazy), rawStartHandleOffset, rawEndHandleOffset, selectionLayout.getIsStartHandle(), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(lazy) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(lazy2);
        }
        int offset = anchorInfo.getOffset();
        long jM22999getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m22999getWordBoundaryjx7JFs(offset);
        return !isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.getIsStartHandle()) ? selectableInfo.anchorForOffset(rawStartHandleOffset) : (offset == TextRange.m23027getStartimpl(jM22999getWordBoundaryjx7JFs) || offset == TextRange.m23022getEndimpl(jM22999getWordBoundaryjx7JFs)) ? updateSelectionBoundary$lambda$1(lazy2) : selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(Lazy<Selection.AnchorInfo> lazy) {
        return lazy.getValue();
    }
}
