package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p014ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.EditCommand;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;

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
    private InterfaceC9540l onEditCommand = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onEditCommand$1
        public final void invoke(List<? extends EditCommand> list) {
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends EditCommand>) obj);
            return C10786q.f26013a;
        }
    };
    private InterfaceC9540l onImeActionPerformed = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onImeActionPerformed$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28017invokeKlQnJC8(((ImeAction) obj).m33135unboximpl());
            return C10786q.f26013a;
        }

        /* renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m28017invokeKlQnJC8(int i10) {
        }
    };
    private TextFieldValue state = new TextFieldValue("", TextRange.Companion.m32971getZerod9O1mEE(), (TextRange) null, 4, (AbstractC9972n) null);
    private ImeOptions imeOptions = ImeOptions.Companion.getDefault();
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();
    private final InterfaceC10773d baseInputConnection$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.this$0.getView(), false);
        }
    });

    public LegacyTextInputMethodRequest(View view, InterfaceC9540l interfaceC9540l, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(interfaceC9540l, inputMethodManager);
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

    public final void notifyFocusedRect(androidx.compose.p014ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(AbstractC9719c.m19282d(rect.getLeft()), AbstractC9719c.m19282d(rect.getTop()), AbstractC9719c.m19282d(rect.getRight()), AbstractC9719c.m19282d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void setFocusedRect$foundation_release(Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(TextFieldValue textFieldValue, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, ImeOptions imeOptions, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = interfaceC9540l;
        this.onImeActionPerformed = interfaceC9540l2;
        this.legacyTextFieldState = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
    }

    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z10 = (TextRange.m32959equalsimpl0(this.state.m33214getSelectiond9O1mEE(), textFieldValue2.m33214getSelectiond9O1mEE()) && AbstractC9979u.m20289b(this.state.m33213getCompositionMzsxiRA(), textFieldValue2.m33213getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i10).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (AbstractC9979u.m20289b(textFieldValue, textFieldValue2)) {
            if (z10) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM32964getMinimpl = TextRange.m32964getMinimpl(textFieldValue2.m33214getSelectiond9O1mEE());
                int iM32963getMaximpl = TextRange.m32963getMaximpl(textFieldValue2.m33214getSelectiond9O1mEE());
                TextRange textRangeM33213getCompositionMzsxiRA = this.state.m33213getCompositionMzsxiRA();
                int iM32964getMinimpl2 = textRangeM33213getCompositionMzsxiRA != null ? TextRange.m32964getMinimpl(textRangeM33213getCompositionMzsxiRA.m32970unboximpl()) : -1;
                TextRange textRangeM33213getCompositionMzsxiRA2 = this.state.m33213getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM32964getMinimpl, iM32963getMaximpl, iM32964getMinimpl2, textRangeM33213getCompositionMzsxiRA2 != null ? TextRange.m32963getMaximpl(textRangeM33213getCompositionMzsxiRA2.m32970unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!AbstractC9979u.m20289b(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m32959equalsimpl0(textFieldValue.m33214getSelectiond9O1mEE(), textFieldValue2.m33214getSelectiond9O1mEE()) && !AbstractC9979u.m20289b(textFieldValue.m33213getCompositionMzsxiRA(), textFieldValue2.m33213getCompositionMzsxiRA())))) {
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

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.p014ui.geometry.Rect rect, androidx.compose.p014ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }

    @Override // androidx.compose.p014ui.platform.PlatformTextInputMethodRequest
    public RecordingInputConnection createInputConnection(EditorInfo editorInfo) {
        EditorInfo_androidKt.m27990updatepLxbY9I$default(editorInfo, this.state.getText(), this.state.m33214getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.createInputConnection.1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = LegacyTextInputMethodRequest.this.ics.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (AbstractC9979u.m20289b(((WeakReference) LegacyTextInputMethodRequest.this.ics.get(i10)).get(), recordingInputConnection2)) {
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
            public void mo28016onImeActionKlQnJC8(int i10) {
                LegacyTextInputMethodRequest.this.onImeActionPerformed.invoke(ImeAction.m33129boximpl(i10));
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
