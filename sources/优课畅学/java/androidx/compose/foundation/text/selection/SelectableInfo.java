package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectableInfo {
    public static final int $stable = TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;
    private final TextLayoutResult textLayoutResult;

    public SelectableInfo(long j10, int i10, int i11, int i12, int i13, TextLayoutResult textLayoutResult) {
        this.selectableId = j10;
        this.slot = i10;
        this.rawStartHandleOffset = i11;
        this.rawEndHandleOffset = i12;
        this.rawPreviousHandleOffset = i13;
        this.textLayoutResult = textLayoutResult;
    }

    private final ResolvedTextDirection getEndRunDirection() {
        return SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset);
    }

    private final ResolvedTextDirection getStartRunDirection() {
        return SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset);
    }

    public final Selection.AnchorInfo anchorForOffset(int i10) {
        return new Selection.AnchorInfo(SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, i10), i10, this.selectableId);
    }

    public final String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final CrossStatus getRawCrossStatus() {
        int i10 = this.rawStartHandleOffset;
        int i11 = this.rawEndHandleOffset;
        return i10 < i11 ? CrossStatus.NOT_CROSSED : i10 > i11 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    public final Selection makeSingleLayoutSelection(int i10, int i11) {
        return new Selection(anchorForOffset(i10), anchorForOffset(i11), i10 > i11);
    }

    public final boolean shouldRecomputeSelection(SelectableInfo selectableInfo) {
        return (this.selectableId == selectableInfo.selectableId && this.rawStartHandleOffset == selectableInfo.rawStartHandleOffset && this.rawEndHandleOffset == selectableInfo.rawEndHandleOffset) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + getStartRunDirection() + ',' + this.rawEndHandleOffset + '-' + getEndRunDirection() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}
