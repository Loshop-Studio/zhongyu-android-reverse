package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;
    private TextLayoutResult _previousTextLayoutResult;
    private final InterfaceC9529a coordinatesCallback;
    private final InterfaceC9529a layoutResultCallback;
    private final long selectableId;
    private final Object lock = this;
    private int _previousLastVisibleOffset = -1;

    public MultiWidgetSelectionDelegate(long j10, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        this.selectableId = j10;
        this.coordinatesCallback = interfaceC9529a;
        this.layoutResultCallback = interfaceC9529a2;
    }

    private final int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i10;
        int lineCount;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (!textLayoutResult.getDidOverflowHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                        lineCount = textLayoutResult.getLineCount() - 1;
                    } else {
                        int iM21756i = AbstractC10410o.m21756i(textLayoutResult.getLineForVerticalPosition((int) (textLayoutResult.m32937getSizeYbymL2g() & 4294967295L)), textLayoutResult.getLineCount() - 1);
                        while (iM21756i >= 0 && textLayoutResult.getLineTop(iM21756i) >= ((int) (textLayoutResult.m32937getSizeYbymL2g() & 4294967295L))) {
                            iM21756i--;
                        }
                        lineCount = AbstractC10410o.m21752e(iM21756i, 0);
                    }
                    this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i10 = this._previousLastVisibleOffset;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult textLayoutResult;
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke()) == null) {
            return;
        }
        LayoutCoordinates containerCoordinates = selectionLayoutBuilder.getContainerCoordinates();
        Offset.Companion companion = Offset.Companion;
        long jMo32238localPositionOfR5De75A = containerCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, companion.m30653getZeroF1C5BW0());
        MultiWidgetSelectionDelegateKt.m28215appendSelectableInfoParwq6A(selectionLayoutBuilder, textLayoutResult, Offset.m30641minusMKHz9U(selectionLayoutBuilder.m28228getCurrentPositionF1C5BW0(), jMo32238localPositionOfR5De75A), (selectionLayoutBuilder.m28229getPreviousHandlePositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? companion.m30652getUnspecifiedF1C5BW0() : Offset.m30641minusMKHz9U(selectionLayoutBuilder.m28229getPreviousHandlePositionF1C5BW0(), jMo32238localPositionOfR5De75A), getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int i10) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Rect.Companion.getZero();
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return length < 1 ? Rect.Companion.getZero() : textLayoutResult.getBoundingBox(AbstractC10410o.m21761n(i10, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int i10) {
        int lineForOffset;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null || (lineForOffset = textLayoutResult.getLineForOffset(i10)) >= textLayoutResult.getLineCount()) {
            return -1.0f;
        }
        float lineTop = textLayoutResult.getLineTop(lineForOffset);
        return ((textLayoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo28213getHandlePositiondBAh8RU(Selection selection, boolean z10) {
        if ((z10 && selection.getStart().getSelectableId() != getSelectableId()) || (!z10 && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, AbstractC10410o.m21761n((z10 ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(textLayoutResult)), z10, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.coordinatesCallback.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineHeight(int i10) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null) {
            return TextLayoutHelperKt.getLineHeight(textLayoutResult, i10);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int i10) {
        int lineForOffset;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null && (lineForOffset = textLayoutResult.getLineForOffset(i10)) < textLayoutResult.getLineCount()) {
            return textLayoutResult.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int i10) {
        int lineForOffset;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult != null && (lineForOffset = textLayoutResult.getLineForOffset(i10)) < textLayoutResult.getLineCount()) {
            return textLayoutResult.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo28214getRangeOfLineContainingjx7JFs(int i10) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResult);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(AbstractC10410o.m21761n(i10, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResult.getLineStart(lineForOffset), textLayoutResult.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        return textLayoutResult == null ? new AnnotatedString("", null, 2, null) : textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public TextLayoutResult textLayoutResult() {
        return (TextLayoutResult) this.layoutResultCallback.invoke();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResult);
    }
}
