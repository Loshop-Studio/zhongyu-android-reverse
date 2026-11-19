package androidx.compose.foundation.text;

import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.input.EditProcessor;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.input.TextInputSession;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LegacyTextFieldState {
    public static final int $stable = 8;
    private LayoutCoordinates _layoutCoordinates;
    private final MutableState autofillHighlightOn$delegate;
    private final MutableState deletionPreviewHighlightRange$delegate;
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private final Paint highlightPaint;
    private TextInputSession inputSession;
    private final MutableState isInTouchMode$delegate;
    private boolean isLayoutResultStale;
    private final MutableState justAutofilled$delegate;
    private final KeyboardActionRunner keyboardActionRunner;
    private final SoftwareKeyboardController keyboardController;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final InterfaceC9540l onImeActionPerformed;
    private final InterfaceC9540l onValueChange;
    private InterfaceC9540l onValueChangeOriginal;
    private final EditProcessor processor = new EditProcessor();
    private final RecomposeScope recomposeScope;
    private long selectionBackgroundColor;
    private final MutableState selectionPreviewHighlightRange$delegate;
    private final MutableState showCursorHandle$delegate;
    private final MutableState showFloatingToolbar$delegate;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C3186Dp.m33499boximpl(C3186Dp.m33501constructorimpl(0)), null, 2, null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showFloatingToolbar$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.justAutofilled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.onValueChangeOriginal = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChangeOriginal$1
            public final void invoke(TextFieldValue textFieldValue) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return C10786q.f26013a;
            }
        };
        this.onValueChange = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChange$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldValue textFieldValue) {
                String text = textFieldValue.getText();
                AnnotatedString untransformedText = this.this$0.getUntransformedText();
                if (!AbstractC9979u.m20289b(text, untransformedText != null ? untransformedText.getText() : null)) {
                    this.this$0.setHandleState(HandleState.None);
                    if (this.this$0.getJustAutofilled()) {
                        this.this$0.setJustAutofilled(false);
                    } else {
                        this.this$0.setAutofillHighlightOn(false);
                    }
                }
                LegacyTextFieldState legacyTextFieldState = this.this$0;
                TextRange.Companion companion = TextRange.Companion;
                legacyTextFieldState.m27827setSelectionPreviewHighlightRange5zctL8(companion.m32971getZerod9O1mEE());
                this.this$0.m27824setDeletionPreviewHighlightRange5zctL8(companion.m32971getZerod9O1mEE());
                this.this$0.onValueChangeOriginal.invoke(textFieldValue);
                this.this$0.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27829invokeKlQnJC8(((ImeAction) obj).m33135unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m27829invokeKlQnJC8(int i10) {
                this.this$0.keyboardActionRunner.m27805runActionKlQnJC8(i10);
            }
        };
        this.highlightPaint = AndroidPaint_androidKt.Paint();
        this.selectionBackgroundColor = Color.Companion.m30914getUnspecified0d7_KjU();
        TextRange.Companion companion = TextRange.Companion;
        this.selectionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m32954boximpl(companion.m32971getZerod9O1mEE()), null, 2, null);
        this.deletionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m32954boximpl(companion.m32971getZerod9O1mEE()), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m27820getDeletionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.deletionPreviewHighlightRange$delegate.getValue()).m32970unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getJustAutofilled() {
        return ((Boolean) this.justAutofilled$delegate.getValue()).booleanValue();
    }

    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m27821getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((C3186Dp) this.minHeightForSingleLineField$delegate.getValue()).m33515unboximpl();
    }

    public final InterfaceC9540l getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final InterfaceC9540l getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m27822getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m27823getSelectionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.selectionPreviewHighlightRange$delegate.getValue()).m32970unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean hasHighlight() {
        return (TextRange.m32960getCollapsedimpl(m27823getSelectionPreviewHighlightRanged9O1mEE()) && TextRange.m32960getCollapsedimpl(m27820getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setAutofillHighlightOn(boolean z10) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z10));
    }

    /* renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m27824setDeletionPreviewHighlightRange5zctL8(long j10) {
        this.deletionPreviewHighlightRange$delegate.setValue(TextRange.m32954boximpl(j10));
    }

    public final void setHandleState(HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z10) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setInTouchMode(boolean z10) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setJustAutofilled(boolean z10) {
        this.justAutofilled$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m27825setMinHeightForSingleLineField0680j_4(float f10) {
        this.minHeightForSingleLineField$delegate.setValue(C3186Dp.m33499boximpl(f10));
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m27826setSelectionBackgroundColor8_81llA(long j10) {
        this.selectionBackgroundColor = j10;
    }

    /* renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m27827setSelectionPreviewHighlightRange5zctL8(long j10) {
        this.selectionPreviewHighlightRange$delegate.setValue(TextRange.m32954boximpl(j10));
    }

    public final void setShowCursorHandle(boolean z10) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setShowFloatingToolbar(boolean z10) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setShowSelectionHandleEnd(boolean z10) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setShowSelectionHandleStart(boolean z10) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m27828updatefnh65Uc(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z10, Density density, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, KeyboardActions keyboardActions, FocusManager focusManager, long j10) {
        this.onValueChangeOriginal = interfaceC9540l;
        this.selectionBackgroundColor = j10;
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate textDelegateM27887updateTextDelegaterm0N8CA$default = TextDelegateKt.m27887updateTextDelegaterm0N8CA$default(this.textDelegate, annotatedString2, textStyle, density, resolver, z10, 0, 0, 0, AbstractC10978w.m24136n(), 448, null);
        if (this.textDelegate != textDelegateM27887updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateM27887updateTextDelegaterm0N8CA$default;
    }
}
