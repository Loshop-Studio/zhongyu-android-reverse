package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p013ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.input.EditCommand;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    private Rect focusedRect;
    private final InputMethodManager inputMethodManager;
    private LegacyTextFieldState legacyTextFieldState;
    private TextFieldSelectionManager textFieldSelectionManager;
    private final View view;
    private ViewConfiguration viewConfiguration;
    private InterfaceC10570l onEditCommand = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onEditCommand$1
        public final void invoke(List<? extends EditCommand> list) {
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends EditCommand>) obj);
            return C8736p.f16368a;
        }
    };
    private InterfaceC10570l onImeActionPerformed = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onImeActionPerformed$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m21415invokeKlQnJC8(((ImeAction) obj).m26533unboximpl());
            return C8736p.f16368a;
        }

        /* renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m21415invokeKlQnJC8(int i10) {
        }
    };
    private TextFieldValue state = new TextFieldValue("", TextRange.Companion.m26369getZerod9O1mEE(), (TextRange) null, 4, (AbstractC9126n) null);
    private ImeOptions imeOptions = ImeOptions.Companion.getDefault();
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();
    private final InterfaceC8724d baseInputConnection$delegate = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.this$0.getView(), false);
        }
    });

    public LegacyTextInputMethodRequest(View view, InterfaceC10570l interfaceC10570l, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(interfaceC10570l, inputMethodManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    public final Rect getFocusedRect$foundation_release() {
        return this.focusedRect;
    }

    public final TextFieldValue getState() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    public final void notifyFocusedRect(androidx.compose.p013ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(AbstractC10729c.m20035d(rect.getLeft()), AbstractC10729c.m20035d(rect.getTop()), AbstractC10729c.m20035d(rect.getRight()), AbstractC10729c.m20035d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void setFocusedRect$foundation_release(Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(TextFieldValue textFieldValue, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, ImeOptions imeOptions, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = interfaceC10570l;
        this.onImeActionPerformed = interfaceC10570l2;
        this.legacyTextFieldState = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
    }

    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z10 = (TextRange.m26357equalsimpl0(this.state.m26612getSelectiond9O1mEE(), textFieldValue2.m26612getSelectiond9O1mEE()) && AbstractC9133u.m16128b(this.state.m26611getCompositionMzsxiRA(), textFieldValue2.m26611getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i10).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (AbstractC9133u.m16128b(textFieldValue, textFieldValue2)) {
            if (z10) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM26362getMinimpl = TextRange.m26362getMinimpl(textFieldValue2.m26612getSelectiond9O1mEE());
                int iM26361getMaximpl = TextRange.m26361getMaximpl(textFieldValue2.m26612getSelectiond9O1mEE());
                TextRange textRangeM26611getCompositionMzsxiRA = this.state.m26611getCompositionMzsxiRA();
                int iM26362getMinimpl2 = textRangeM26611getCompositionMzsxiRA != null ? TextRange.m26362getMinimpl(textRangeM26611getCompositionMzsxiRA.m26368unboximpl()) : -1;
                TextRange textRangeM26611getCompositionMzsxiRA2 = this.state.m26611getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM26362getMinimpl, iM26361getMaximpl, iM26362getMinimpl2, textRangeM26611getCompositionMzsxiRA2 != null ? TextRange.m26361getMaximpl(textRangeM26611getCompositionMzsxiRA2.m26368unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!AbstractC9133u.m16128b(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m26357equalsimpl0(textFieldValue.m26612getSelectiond9O1mEE(), textFieldValue2.m26612getSelectiond9O1mEE()) && !AbstractC9133u.m16128b(textFieldValue.m26611getCompositionMzsxiRA(), textFieldValue2.m26611getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i11).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.p013ui.geometry.Rect rect, androidx.compose.p013ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }

    @Override // androidx.compose.p013ui.platform.PlatformTextInputMethodRequest
    public RecordingInputConnection createInputConnection(EditorInfo editorInfo) {
        EditorInfo_androidKt.m21388updatepLxbY9I$default(editorInfo, this.state.getText(), this.state.m26612getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.createInputConnection.1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = LegacyTextInputMethodRequest.this.ics.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (AbstractC9133u.m16128b(((WeakReference) LegacyTextInputMethodRequest.this.ics.get(i10)).get(), recordingInputConnection2)) {
                        LegacyTextInputMethodRequest.this.ics.remove(i10);
                        return;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                LegacyTextInputMethodRequest.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo21414onImeActionKlQnJC8(int i10) {
                LegacyTextInputMethodRequest.this.onImeActionPerformed.invoke(ImeAction.m26527boximpl(i10));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                LegacyTextInputMethodRequest.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
                LegacyTextInputMethodRequest.this.cursorAnchorInfoController.requestUpdate(z10, z11, z12, z13, z14, z15);
            }
        }, this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }
}
