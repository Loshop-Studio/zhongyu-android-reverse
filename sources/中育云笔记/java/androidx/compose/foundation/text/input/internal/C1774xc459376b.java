package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.input.ImeAction;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 */
/* loaded from: classes.dex */
public final class C1774xc459376b implements TextInputSession, ImeEditCommandScope {
    private final /* synthetic */ DefaultImeEditCommandScope $$delegate_0;
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ CursorAnchorInfoController $cursorUpdatesController;
    final /* synthetic */ TextLayoutState $layoutState;
    final /* synthetic */ InterfaceC9540l $onImeAction;
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    final /* synthetic */ TransformedTextFieldState $state;
    final /* synthetic */ InterfaceC9529a $updateSelectionState;
    final /* synthetic */ ViewConfiguration $viewConfiguration;

    public C1774xc459376b(DefaultImeEditCommandScope defaultImeEditCommandScope, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, InterfaceC9540l interfaceC9540l, ReceiveContentConfiguration receiveContentConfiguration, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, InterfaceC9529a interfaceC9529a, ViewConfiguration viewConfiguration) {
        this.$state = transformedTextFieldState;
        this.$composeImm = composeInputMethodManager;
        this.$onImeAction = interfaceC9540l;
        this.$receiveContentConfiguration = receiveContentConfiguration;
        this.$cursorUpdatesController = cursorAnchorInfoController;
        this.$layoutState = textLayoutState;
        this.$updateSelectionState = interfaceC9529a;
        this.$viewConfiguration = viewConfiguration;
        this.$$delegate_0 = defaultImeEditCommandScope;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        return this.$$delegate_0.beginBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(InterfaceC9540l interfaceC9540l) {
        this.$$delegate_0.edit(interfaceC9540l);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        return this.$$delegate_0.endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public TextFieldCharSequence getText() {
        return this.$state.getVisualText();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public long mo27975mapFromTransformedGEjPoXI(long j10) {
        return this.$$delegate_0.mo27975mapFromTransformedGEjPoXI(j10);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public long mo27976mapToTransformedGEjPoXI(long j10) {
        return this.$$delegate_0.mo27976mapToTransformedGEjPoXI(j10);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean onCommitContent(TransferableContent transferableContent) {
        ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.onCommitContent(transferableContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    public void mo27977onImeActionKlQnJC8(int i10) {
        InterfaceC9540l interfaceC9540l = this.$onImeAction;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(ImeAction.m33129boximpl(i10));
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public int performHandwritingGesture(HandwritingGesture handwritingGesture) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(this.$state, handwritingGesture, this.$layoutState, this.$updateSelectionState, this.$viewConfiguration);
        }
        return 2;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(this.$state, previewableHandwritingGesture, this.$layoutState, cancellationSignal);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void requestCursorUpdates(int i10) {
        this.$cursorUpdatesController.requestUpdates(i10);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void sendKeyEvent(KeyEvent keyEvent) {
        this.$composeImm.sendKeyEvent(keyEvent);
    }
}
