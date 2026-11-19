package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z10 = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z10, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z10, false, selectionLayout.getEndSlot(), boundaryFunction), z10);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z10, boolean z11, int i10, BoundaryFunction boundaryFunction) {
        int rawStartHandleOffset = z11 ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if (i10 != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        long jMo28212getBoundaryfzxv0v0 = boundaryFunction.mo28212getBoundaryfzxv0v0(selectableInfo, rawStartHandleOffset);
        return selectableInfo.anchorForOffset(z10 ^ z11 ? TextRange.m32966getStartimpl(jMo28212getBoundaryfzxv0v0) : TextRange.m32961getEndimpl(jMo28212getBoundaryfzxv0v0));
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i10) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i10), i10, 0L, 4, null);
    }

    public static final Selection ensureAtLeastOneChar(Selection selection, SelectionLayout selectionLayout) {
        if (SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return (selectionLayout.getSize() > 1 || selectionLayout.getPreviousSelection() == null || selectionLayout.getCurrentInfo().getInputText().length() == 0) ? selection : expandOneChar(selection, selectionLayout);
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int iFindFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindFollowingBreak), null, true, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindFollowingBreak), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iFindPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindPrecedingBreak), null, false, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindPrecedingBreak), true, 1, null);
        }
        Selection previousSelection = selectionLayout.getPreviousSelection();
        boolean z10 = previousSelection != null && previousSelection.getHandlesCrossed();
        int iFindPrecedingBreak2 = selectionLayout.isStartHandle() ^ z10 ? StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset) : StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        return selectionLayout.isStartHandle() ? Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, iFindPrecedingBreak2), null, z10, 2, null) : Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, iFindPrecedingBreak2), z10, 1, null);
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i10, boolean z10) {
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i10 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        return z10 ^ (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED) ? i10 < selectableInfo.getRawPreviousHandleOffset() : i10 > selectableInfo.getRawPreviousHandleOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i10, int i11, int i12, boolean z10, boolean z11) {
        long jM32938getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m32938getWordBoundaryjx7JFs(i11);
        int iM32966getStartimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m32966getStartimpl(jM32938getWordBoundaryjx7JFs)) == i10 ? TextRange.m32966getStartimpl(jM32938getWordBoundaryjx7JFs) : i10 >= selectableInfo.getTextLayoutResult().getLineCount() ? selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1) : selectableInfo.getTextLayoutResult().getLineStart(i10);
        int iM32961getEndimpl = selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m32961getEndimpl(jM32938getWordBoundaryjx7JFs)) == i10 ? TextRange.m32961getEndimpl(jM32938getWordBoundaryjx7JFs) : i10 >= selectableInfo.getTextLayoutResult().getLineCount() ? TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null) : TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i10, false, 2, null);
        if (iM32966getStartimpl == i12) {
            return selectableInfo.anchorForOffset(iM32961getEndimpl);
        }
        if (iM32961getEndimpl == i12) {
            return selectableInfo.anchorForOffset(iM32966getStartimpl);
        }
        if (!(z10 ^ z11) ? i11 >= iM32966getStartimpl : i11 > iM32961getEndimpl) {
            iM32966getStartimpl = iM32961getEndimpl;
        }
        return selectableInfo.anchorForOffset(iM32966getStartimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawStartHandleOffset() : selectableInfo.getRawEndHandleOffset();
        if ((selectionLayout.isStartHandle() ? selectionLayout.getStartSlot() : selectionLayout.getEndSlot()) != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawStartHandleOffset);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23258e;
        final InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                return Integer.valueOf(selectableInfo.getTextLayoutResult().getLineForOffset(rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = selectionLayout.isStartHandle() ? selectableInfo.getRawEndHandleOffset() : selectableInfo.getRawStartHandleOffset();
        InterfaceC10773d interfaceC10773dM20069b2 = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Selection.AnchorInfo invoke() {
                return SelectionAdjustmentKt.snapToWordBoundary(selectableInfo, SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(interfaceC10773dM20069b), rawStartHandleOffset, rawEndHandleOffset, selectionLayout.isStartHandle(), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
            }
        });
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(interfaceC10773dM20069b2);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(interfaceC10773dM20069b) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(interfaceC10773dM20069b2);
        }
        int offset = anchorInfo.getOffset();
        long jM32938getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m32938getWordBoundaryjx7JFs(offset);
        return !isExpanding(selectableInfo, rawStartHandleOffset, selectionLayout.isStartHandle()) ? selectableInfo.anchorForOffset(rawStartHandleOffset) : (offset == TextRange.m32966getStartimpl(jM32938getWordBoundaryjx7JFs) || offset == TextRange.m32961getEndimpl(jM32938getWordBoundaryjx7JFs)) ? updateSelectionBoundary$lambda$1(interfaceC10773dM20069b2) : selectableInfo.anchorForOffset(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateSelectionBoundary$lambda$0(InterfaceC10773d interfaceC10773d) {
        return ((Number) interfaceC10773d.getValue()).intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(InterfaceC10773d interfaceC10773d) {
        return (Selection.AnchorInfo) interfaceC10773d.getValue();
    }
}
