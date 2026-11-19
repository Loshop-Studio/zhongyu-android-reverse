package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.CommitTextCommand;
import androidx.compose.p014ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p014ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.p014ui.text.input.EditCommand;
import androidx.compose.p014ui.text.input.FinishComposingTextCommand;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.SetComposingRegionCommand;
import androidx.compose.p014ui.text.input.SetComposingTextCommand;
import androidx.compose.p014ui.text.input.SetSelectionCommand;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.input.TextFieldValueKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<EditCommand> editCommands;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private final LegacyTextFieldState legacyTextFieldState;
    private final TextFieldSelectionManager textFieldSelectionManager;
    private TextFieldValue textFieldValue;
    private final ViewConfiguration viewConfiguration;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z10;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i10 = this.batchDepth - 1;
        this.batchDepth = i10;
        if (i10 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(AbstractC10947g0.m23925a1(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(InterfaceC9529a interfaceC9529a) {
        boolean z10 = this.isActive;
        if (z10) {
            interfaceC9529a.invoke();
        }
        return z10;
    }

    private final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.isActive;
        return z10 ? beginBatchEditInternal() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.isActive;
        return z10 ? this.autoCorrect : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.isActive;
        if (z10) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m32964getMinimpl(this.textFieldValue.m33214getSelectiond9O1mEE()), i10);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.extractedTextMonitorMode = z10;
        if (z10) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return RecordingInputConnection_androidKt.toExtractedText(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (TextRange.m32960getCollapsedimpl(this.textFieldValue.m33214getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, i10).toString();
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final TextFieldValue getTextFieldValue$foundation_release() {
        return this.textFieldValue;
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.isActive;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iM33145getDefaulteUduSuo;
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33147getGoeUduSuo();
                    break;
                case 3:
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33151getSearcheUduSuo();
                    break;
                case 4:
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33152getSendeUduSuo();
                    break;
                case 5:
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33148getNexteUduSuo();
                    break;
                case 6:
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33146getDoneeUduSuo();
                    break;
                case 7:
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33150getPreviouseUduSuo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iM33145getDefaulteUduSuo = ImeAction.Companion.m33145getDefaulteUduSuo();
                    break;
            }
        } else {
            iM33145getDefaulteUduSuo = ImeAction.Companion.m33145getDefaulteUduSuo();
        }
        this.eventCallback.mo28016onImeActionKlQnJC8(iM33145getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, handwritingGesture, this.viewConfiguration, executor, intConsumer, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection.performHandwritingGesture.1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((EditCommand) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(EditCommand editCommand) {
                    RecordingInputConnection.this.addEditCommandWithBatch(editCommand);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.isActive;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.isActive;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.isActive;
        if (z10) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.isActive;
        if (z10) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i10, i11));
        return true;
    }

    public final void setTextFieldValue$foundation_release(TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setTextFieldValue$foundation_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, RecordingInputConnection_androidKt.toExtractedText(textFieldValue));
            }
            TextRange textRangeM33213getCompositionMzsxiRA = textFieldValue.m33213getCompositionMzsxiRA();
            int iM32964getMinimpl = textRangeM33213getCompositionMzsxiRA != null ? TextRange.m32964getMinimpl(textRangeM33213getCompositionMzsxiRA.m32970unboximpl()) : -1;
            TextRange textRangeM33213getCompositionMzsxiRA2 = textFieldValue.m33213getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m32964getMinimpl(textFieldValue.m33214getSelectiond9O1mEE()), TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE()), iM32964getMinimpl, textRangeM33213getCompositionMzsxiRA2 != null ? TextRange.m32963getMaximpl(textRangeM33213getCompositionMzsxiRA2.m32970unboximpl()) : -1);
        }
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, int i10, AbstractC9972n abstractC9972n) {
        this(textFieldValue, inputEventCallback2, z10, (i10 & 8) != 0 ? null : legacyTextFieldState, (i10 & 16) != 0 ? null : textFieldSelectionManager, (i10 & 32) != 0 ? null : viewConfiguration);
    }
}
