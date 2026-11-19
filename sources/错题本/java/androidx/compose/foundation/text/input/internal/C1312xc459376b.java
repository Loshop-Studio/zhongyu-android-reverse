package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\r\u0010\u0005J\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00032\u0006\u0010&\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, m5110d2 = {"androidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "beginBatchEdit", "()Z", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "edit", "(Lr6/c;)V", "endBatchEdit", "Landroidx/compose/ui/text/TextRange;", "range", "mapFromTransformed-GEjPoXI", "(J)J", "mapFromTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed", "Landroid/view/KeyEvent;", "keyEvent", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "onCommitContent", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 */
/* loaded from: classes.dex */
public final class C1312xc459376b implements TextInputSession, ImeEditCommandScope {
    private final /* synthetic */ DefaultImeEditCommandScope $$delegate_0;
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ CursorAnchorInfoController $cursorUpdatesController;
    final /* synthetic */ TextLayoutState $layoutState;
    final /* synthetic */ InterfaceC6471c $onImeAction;
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    final /* synthetic */ TransformedTextFieldState $state;
    final /* synthetic */ InterfaceC6469a $updateSelectionState;
    final /* synthetic */ ViewConfiguration $viewConfiguration;

    public C1312xc459376b(DefaultImeEditCommandScope defaultImeEditCommandScope, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, InterfaceC6471c interfaceC6471c, ReceiveContentConfiguration receiveContentConfiguration, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, InterfaceC6469a interfaceC6469a, ViewConfiguration viewConfiguration) {
        this.$state = transformedTextFieldState;
        this.$composeImm = composeInputMethodManager;
        this.$onImeAction = interfaceC6471c;
        this.$receiveContentConfiguration = receiveContentConfiguration;
        this.$cursorUpdatesController = cursorAnchorInfoController;
        this.$layoutState = textLayoutState;
        this.$updateSelectionState = interfaceC6469a;
        this.$viewConfiguration = viewConfiguration;
        this.$$delegate_0 = defaultImeEditCommandScope;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        return this.$$delegate_0.beginBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(InterfaceC6471c block) {
        this.$$delegate_0.edit(block);
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
    public long mo7779mapFromTransformedGEjPoXI(long range) {
        return this.$$delegate_0.mo7779mapFromTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public long mo7780mapToTransformedGEjPoXI(long range) {
        return this.$$delegate_0.mo7780mapToTransformedGEjPoXI(range);
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
    public void mo7781onImeActionKlQnJC8(int imeAction) {
        InterfaceC6471c interfaceC6471c = this.$onImeAction;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(ImeAction.m12933boximpl(imeAction));
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public int performHandwritingGesture(HandwritingGesture gesture) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(this.$state, gesture, this.$layoutState, this.$updateSelectionState, this.$viewConfiguration);
        }
        return 2;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(this.$state, gesture, this.$layoutState, cancellationSignal);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void requestCursorUpdates(int cursorUpdateMode) {
        this.$cursorUpdatesController.requestUpdates(cursorUpdateMode);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void sendKeyEvent(KeyEvent keyEvent) {
        this.$composeImm.sendKeyEvent(keyEvent);
    }
}
