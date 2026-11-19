package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.p014ui.focus.FocusRequester;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.hapticfeedback.HapticFeedback;
import androidx.compose.p014ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.platform.Clipboard;
import androidx.compose.p014ui.platform.TextToolbar;
import androidx.compose.p014ui.platform.TextToolbarStatus;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.input.VisualTransformation;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private InterfaceC11122i0 coroutineScope;
    private final MutableState currentDragPosition$delegate;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private final MutableState enabled$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private InterfaceC9540l onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private InterfaceC9529a requestAutofillAction;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InterfaceC10045g copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return textFieldSelectionManager.copy$foundation_release(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m28283createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j10) {
        return new TextFieldValue(annotatedString, j10, (TextRange) null, 4, (AbstractC9972n) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m28284deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m28287deselect_kEHs6E$foundation_release(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        char c10;
        long j10;
        float fIntBitsToFloat;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.isLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m32966getStartimpl(getValue$foundation_release().m33214getSelectiond9O1mEE()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m32961getEndimpl(getValue$foundation_release().m33214getSelectiond9O1mEE()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM30653getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m30653getZeroF1C5BW0() : layoutCoordinates4.mo32240localToRootMKHz9U(m28290getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM30653getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m30653getZeroF1C5BW0() : layoutCoordinates3.mo32240localToRootMKHz9U(m28290getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    c10 = ' ';
                    j10 = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    c10 = ' ';
                    j10 = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates2.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits((layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinates.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << c10) | (Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop()) & j10))) & j10));
                }
                int i10 = (int) (jM30653getZeroF1C5BW0 >> c10);
                int i11 = (int) (jM30653getZeroF1C5BW02 >> c10);
                return new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jM30653getZeroF1C5BW0 & j10)), Float.intBitsToFloat((int) (jM30653getZeroF1C5BW02 & j10))) + (C3186Dp.m33501constructorimpl(25) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m28285setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z10) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(z10);
        }
        if (z10) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m28286updateSelection8UEBfa8(TextFieldValue textFieldValue, long j10, boolean z10, boolean z11, SelectionAdjustment selectionAdjustment, boolean z12) {
        TextLayoutResultProxy layoutResult;
        int i10;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m32966getStartimpl(textFieldValue.m33214getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m32961getEndimpl(textFieldValue.m33214getSelectiond9O1mEE())));
        boolean z13 = false;
        int iM27922getOffsetForPosition3MmeM6k = layoutResult.m27922getOffsetForPosition3MmeM6k(j10, false);
        int iM32966getStartimpl = (z11 || z10) ? iM27922getOffsetForPosition3MmeM6k : TextRange.m32966getStartimpl(jTextRange);
        int iM32961getEndimpl = (!z11 || z10) ? iM27922getOffsetForPosition3MmeM6k : TextRange.m32961getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (z10 || selectionLayout == null || (i10 = this.previousRawDragOffset) == -1) {
            i10 = -1;
        }
        SelectionLayout selectionLayoutM28230getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m28230getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM32966getStartimpl, iM32961getEndimpl, i10, jTextRange, z10, z11);
        if (!selectionLayoutM28230getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return textFieldValue.m33214getSelectiond9O1mEE();
        }
        this.previousSelectionLayout = selectionLayoutM28230getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM27922getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = selectionAdjustment.adjust(selectionLayoutM28230getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m32959equalsimpl0(jTextRange2, textFieldValue.m33214getSelectiond9O1mEE())) {
            return textFieldValue.m33214getSelectiond9O1mEE();
        }
        boolean z14 = TextRange.m32965getReversedimpl(jTextRange2) != TextRange.m32965getReversedimpl(textFieldValue.m33214getSelectiond9O1mEE()) && TextRange.m32959equalsimpl0(TextRangeKt.TextRange(TextRange.m32961getEndimpl(jTextRange2), TextRange.m32966getStartimpl(jTextRange2)), textFieldValue.m33214getSelectiond9O1mEE());
        boolean z15 = TextRange.m32960getCollapsedimpl(jTextRange2) && TextRange.m32960getCollapsedimpl(textFieldValue.m33214getSelectiond9O1mEE());
        if (z12 && textFieldValue.getText().length() > 0 && !z14 && !z15 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo31602performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m31618getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m28283createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), jTextRange2));
        if (!z12) {
            updateFloatingToolbar(!TextRange.m32960getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(z12);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m32960getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m32960getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return jTextRange2;
        }
        if (TextRange.m32960getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
            z13 = true;
        }
        legacyTextFieldState5.setShowCursorHandle(z13);
        return jTextRange2;
    }

    public final void autofill$foundation_release() {
        InterfaceC9529a interfaceC9529a = this.requestAutofillAction;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m27824setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m32971getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m27827setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m32971getZerod9O1mEE());
    }

    public final InterfaceC10045g copy$foundation_release(boolean z10) {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 != null) {
            return AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new TextFieldSelectionManager$copy$1(this, z10, null), 1, null);
        }
        return null;
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo27888onDownk4lQ0M(long j10) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo27889onDragk4lQ0M(long j10) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m30642plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j10);
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m28285setCurrentDragPosition_kEHs6E(Offset.m30626boximpl(Offset.m30642plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                Offset offsetM28288getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m28288getCurrentDragPosition_m7T9E();
                AbstractC9979u.m20291d(offsetM28288getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m27921getOffsetForPosition3MmeM6k$default(layoutResult, offsetM28288getCurrentDragPosition_m7T9E.m30647unboximpl(), false, 2, null));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m32959equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().m33214getSelectiond9O1mEE())) {
                    return;
                }
                LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager2.getState$foundation_release();
                if ((state$foundation_release2 == null || state$foundation_release2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo31602performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m31618getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m28283createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo27890onStartk4lQ0M(long j10) {
                TextLayoutResultProxy layoutResult;
                long jM28227getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m28227getAdjustedCoordinatesk4lQ0M(this.this$0.m28290getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                long jM27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM28227getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m28285setCurrentDragPosition_kEHs6E(Offset.m30626boximpl(jM27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.Companion.m30653getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m28285setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m28285setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final InterfaceC10045g cut$foundation_release() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 != null) {
            return AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new TextFieldSelectionManager$cut$1(this, null), 1, null);
        }
        return null;
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m28287deselect_kEHs6E$foundation_release(Offset offset) {
        if (!TextRange.m32960getCollapsedimpl(getValue$foundation_release().m33214getSelectiond9O1mEE())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            this.onValueChange.invoke(TextFieldValue.m33209copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((offset == null || layoutResult == null) ? TextRange.m32963getMaximpl(getValue$foundation_release().m33214getSelectiond9O1mEE()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m27921getOffsetForPosition3MmeM6k$default(layoutResult, offset.m30647unboximpl(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        setHandleState((offset == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean z10) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m30545requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(z10);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    public final Clipboard getClipboard$foundation_release() {
        return this.clipboard;
    }

    public final InterfaceC11122i0 getCoroutineScope$foundation_release() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m28288getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m28289getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m32966getStartimpl(getValue$foundation_release().m33214getSelectiond9O1mEE()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        AbstractC9979u.m20291d(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(AbstractC10410o.m21761n(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(cursorRect.getLeft() + (density.mo27099toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2)) << 32) | (Float.floatToRawIntBits(cursorRect.getBottom()) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final float getHandleLineHeight$foundation_release(boolean z10) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int iM32966getStartimpl = z10 ? TextRange.m32966getStartimpl(getValue$foundation_release().m33214getSelectiond9O1mEE()) : TextRange.m32961getEndimpl(getValue$foundation_release().m33214getSelectiond9O1mEE());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.getLineHeight(value, iM32966getStartimpl);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m28290getHandlePositiontuRUvjQ$foundation_release(boolean z10) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (!AbstractC9979u.m20289b(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        long jM33214getSelectiond9O1mEE = getValue$foundation_release().m33214getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(z10 ? TextRange.m32966getStartimpl(jM33214getSelectiond9O1mEE) : TextRange.m32961getEndimpl(jM33214getSelectiond9O1mEE)), z10, TextRange.m32965getReversedimpl(getValue$foundation_release().m33214getSelectiond9O1mEE()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final InterfaceC9540l getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final InterfaceC9529a getRequestAutofillAction$foundation_release() {
        return this.requestAutofillAction;
    }

    public final LegacyTextFieldState getState$foundation_release() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean z10) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo27888onDownk4lQ0M(long j10) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(z10 ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM28227getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m28227getAdjustedCoordinatesk4lQ0M(this.this$0.m28290getHandlePositiontuRUvjQ$foundation_release(z10));
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                long jM27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM28227getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m28285setCurrentDragPosition_kEHs6E(Offset.m30626boximpl(jM27925translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.Companion.m30653getZeroF1C5BW0();
                this.this$0.previousRawDragOffset = -1;
                LegacyTextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setInTouchMode(true);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo27889onDragk4lQ0M(long j10) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m30642plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j10);
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m28285setCurrentDragPosition_kEHs6E(Offset.m30626boximpl(Offset.m30642plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, this.this$0.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset offsetM28288getCurrentDragPosition_m7T9E = this.this$0.m28288getCurrentDragPosition_m7T9E();
                AbstractC9979u.m20291d(offsetM28288getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m28286updateSelection8UEBfa8(value$foundation_release, offsetM28288getCurrentDragPosition_m7T9E.m30647unboximpl(), false, z10, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo27890onStartk4lQ0M(long j10) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m28285setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m28285setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !AbstractC9979u.m20289b(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final InterfaceC10045g paste$foundation_release() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 != null) {
            return AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new TextFieldSelectionManager$paste$1(this, null), 1, null);
        }
        return null;
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM28283createTextFieldValueFDrldGo = m28283createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM28283createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m33209copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM28283createTextFieldValueFDrldGo.m33214getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m28291selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long j10) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || TextLayoutHelperKt.m27919isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j10), TextRange.m32954boximpl(getValue$foundation_release().m33214getSelectiond9O1mEE()))) {
            return;
        }
        m28286updateSelection8UEBfa8(getValue$foundation_release(), j10, true, false, SelectionAdjustment.Companion.getWord(), false);
    }

    public final void setClipboard$foundation_release(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final void setCoroutineScope$foundation_release(InterfaceC11122i0 interfaceC11122i0) {
        this.coroutineScope = interfaceC11122i0;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m28292setDeletionPreviewHighlight5zctL8$foundation_release(long j10) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m27824setDeletionPreviewHighlightRange5zctL8(j10);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m27827setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m32971getZerod9O1mEE());
        }
        if (TextRange.m32960getCollapsedimpl(j10)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setEditable(boolean z10) {
        this.editable$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setEnabled(boolean z10) {
        this.enabled$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(InterfaceC9540l interfaceC9540l) {
        this.onValueChange = interfaceC9540l;
    }

    public final void setRequestAutofillAction$foundation_release(InterfaceC9529a interfaceC9529a) {
        this.requestAutofillAction = interfaceC9529a;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m28293setSelectionPreviewHighlight5zctL8$foundation_release(long j10) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m27827setSelectionPreviewHighlightRange5zctL8(j10);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m27824setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m32971getZerod9O1mEE());
        }
        if (TextRange.m32960getCollapsedimpl(j10)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setState$foundation_release(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value$delegate.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    public final InterfaceC10045g showSelectionToolbar$foundation_release() {
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        if (interfaceC11122i0 != null) {
            return AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1, null);
        }
        return null;
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            public final void invoke(TextFieldValue textFieldValue) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return C10786q.f26013a;
            }
        };
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC9972n) null), null, 2, null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m30653getZeroF1C5BW0();
        this.dragTotalDistance = companion.m30653getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC9972n) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m28285setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
                this.this$0.dragBeginOffsetInText = null;
                boolean zM32960getCollapsedimpl = TextRange.m32960getCollapsedimpl(this.this$0.getValue$foundation_release().m33214getSelectiond9O1mEE());
                this.this$0.setHandleState(zM32960getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowSelectionHandleStart(!zM32960getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowSelectionHandleEnd(!zM32960getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state$foundation_release3 = this.this$0.getState$foundation_release();
                if (state$foundation_release3 == null) {
                    return;
                }
                state$foundation_release3.setShowCursorHandle(zM32960getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo27888onDownk4lQ0M(long j10) {
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo27889onDragk4lQ0M(long r10) {
                /*
                    r9 = this;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    boolean r0 = r0.getEnabled()
                    if (r0 == 0) goto L104
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    androidx.compose.ui.text.input.TextFieldValue r0 = r0.getValue$foundation_release()
                    java.lang.String r0 = r0.getText()
                    int r0 = r0.length()
                    if (r0 != 0) goto L19
                    return
                L19:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragTotalDistance$p(r0)
                    long r10 = androidx.compose.p014ui.geometry.Offset.m30642plusMKHz9U(r1, r10)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$setDragTotalDistance$p(r0, r10)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.LegacyTextFieldState r10 = r10.getState$foundation_release()
                    r11 = 0
                    if (r10 == 0) goto Lff
                    androidx.compose.foundation.text.TextLayoutResultProxy r0 = r10.getLayoutResult()
                    if (r0 == 0) goto Lff
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    long r3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragTotalDistance$p(r10)
                    long r1 = androidx.compose.p014ui.geometry.Offset.m30642plusMKHz9U(r1, r3)
                    androidx.compose.ui.geometry.Offset r1 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r1)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m28281access$setCurrentDragPosition_kEHs6E(r10, r1)
                    java.lang.Integer r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r10)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.geometry.Offset r1 = r10.m28288getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
                    long r1 = r1.m30647unboximpl()
                    boolean r1 = r0.m27923isPositionOnTextk4lQ0M(r1)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.text.input.OffsetMapping r6 = r10.getOffsetMapping$foundation_release()
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    r4 = 2
                    r5 = 0
                    r3 = 0
                    int r1 = androidx.compose.foundation.text.TextLayoutResultProxy.m27921getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r6 = r6.transformedToOriginal(r1)
                    androidx.compose.ui.text.input.OffsetMapping r7 = r10.getOffsetMapping$foundation_release()
                    androidx.compose.ui.geometry.Offset r1 = r10.m28288getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
                    long r1 = r1.m30647unboximpl()
                    int r0 = androidx.compose.foundation.text.TextLayoutResultProxy.m27921getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r0 = r7.transformedToOriginal(r0)
                    if (r6 != r0) goto L95
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
                    androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getNone()
                L93:
                    r7 = r0
                    goto L9c
                L95:
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
                    androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getWord()
                    goto L93
                L9c:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r10.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r0 = r10.m28288getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
                    long r3 = r0.m30647unboximpl()
                    r6 = 0
                    r8 = 1
                    r5 = 0
                    r1 = r10
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m28282access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                    goto Lfc
                Lb4:
                    r1 = r10
                    java.lang.Integer r10 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r10 == 0) goto Lc0
                    int r10 = r10.intValue()
                    goto Lc8
                Lc0:
                    long r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r1)
                    int r10 = r0.m27922getOffsetForPosition3MmeM6k(r2, r11)
                Lc8:
                    androidx.compose.ui.geometry.Offset r2 = r1.m28288getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r2)
                    long r2 = r2.m30647unboximpl()
                    int r0 = r0.m27922getOffsetForPosition3MmeM6k(r2, r11)
                    java.lang.Integer r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r2 != 0) goto Le0
                    if (r10 != r0) goto Le0
                    goto L104
                Le0:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r1.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r10 = r1.m28288getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r10)
                    long r3 = r10.m30647unboximpl()
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
                    androidx.compose.foundation.text.selection.SelectionAdjustment r7 = r10.getWord()
                    r8 = 1
                    r5 = 0
                    r6 = 0
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m28282access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                Lfc:
                    androidx.compose.p014ui.text.TextRange.m32954boximpl(r0)
                Lff:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$updateFloatingToolbar(r10, r11)
                L104:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.mo27889onDragk4lQ0M(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo27890onStartk4lQ0M(long j10) {
                long j11;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.this$0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                    if (state$foundation_release == null || (layoutResult2 = state$foundation_release.getLayoutResult()) == null || !layoutResult2.m27923isPositionOnTextk4lQ0M(j10)) {
                        j11 = j10;
                        LegacyTextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
                        if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.m27921getOffsetForPosition3MmeM6k$default(layoutResult, j11, false, 2, null));
                            TextFieldValue textFieldValueM28283createTextFieldValueFDrldGo = textFieldSelectionManager.m28283createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo31602performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m31618getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM28283createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        j11 = j10;
                        this.this$0.dragBeginOffsetInText = Integer.valueOf(TextRange.m32966getStartimpl(textFieldSelectionManager2.m28286updateSelection8UEBfa8(TextFieldValue.m33209copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.Companion.m32971getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j10, true, false, SelectionAdjustment.Companion.getWord(), true)));
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = j11;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m28285setCurrentDragPosition_kEHs6E(Offset.m30626boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.Companion.m30653getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo28137onDrag3MmeM6k(long j10, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation_release;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = this.this$0.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), j10, false, selectionAdjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo28138onExtendk4lQ0M(long j10) {
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release == null || state$foundation_release.getLayoutResult() == null || !this.this$0.getEnabled()) {
                    return false;
                }
                this.this$0.previousRawDragOffset = -1;
                updateMouseSelection(this.this$0.getValue$foundation_release(), j10, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo28139onExtendDragk4lQ0M(long j10) {
                LegacyTextFieldState state$foundation_release;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = this.this$0.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), j10, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo28140onStart3MmeM6k(long j10, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation_release;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = this.this$0.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m30545requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                this.this$0.dragBeginPosition = j10;
                this.this$0.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.this$0, false, 1, null);
                updateMouseSelection(this.this$0.getValue$foundation_release(), this.this$0.dragBeginPosition, true, selectionAdjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue textFieldValue, long j10, boolean z10, SelectionAdjustment selectionAdjustment) {
                this.this$0.setHandleState(TextRange.m32960getCollapsedimpl(this.this$0.m28286updateSelection8UEBfa8(textFieldValue, j10, z10, false, selectionAdjustment, false)) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : undoManager);
    }
}
