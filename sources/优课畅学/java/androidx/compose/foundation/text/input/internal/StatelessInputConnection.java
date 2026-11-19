package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;
    private final InputConnection commitContentDelegateInputConnection;
    private final MutableVector<InterfaceC10570l> editCommands = new MutableVector<>(new InterfaceC10570l[16], 0);
    private final TextInputSession session;
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.inputmethod.InputConnection, androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(TextInputSession textInputSession, EditorInfo editorInfo) {
        this.session = textInputSession;
        ?? r32 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            {
                super(this, false);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                return true;
            }
        };
        this.terminalInputConnection = r32;
        this.commitContentDelegateInputConnection = InputConnectionCompat.createWrapper((InputConnection) r32, editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i10, Bundle bundle) {
                if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                        Object objUnwrap = inputContentInfoCompat.unwrap();
                        AbstractC9133u.m16131e(objUnwrap, "null cannot be cast to non-null type android.os.Parcelable");
                        Parcelable parcelable = (Parcelable) objUnwrap;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (Exception e10) {
                        this.this$0.logDebug("Can't insert content from IME; requestPermission() failed, " + e10);
                        return false;
                    }
                }
                return this.this$0.session.onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(inputContentInfoCompat, bundle));
            }
        });
    }

    private final boolean beginBatchEditInternal() {
        return this.session.beginBatchEdit();
    }

    private final boolean endBatchEditInternal() {
        return this.session.endBatchEdit();
    }

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    private final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        logDebug("clearMetaKeyStates(" + i10 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitCompletion(");
        sb.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        logDebug("commitContent(" + inputContentInfo + ", " + i10 + ", " + bundle + ')');
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25CommitContentImpl.INSTANCE.commitContent(this.commitContentDelegateInputConnection, inputContentInfo, i10, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        logDebug("commitText(\"" + ((Object) charSequence) + "\", " + i10 + ')');
        if (charSequence == null) {
            return true;
        }
        ImeEditCommand_androidKt.commitText(this.session, charSequence.toString(), i10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        logDebug("deleteSurroundingText(" + i10 + ", " + i11 + ')');
        ImeEditCommand_androidKt.deleteSurroundingText(this.session, i10, i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        logDebug("deleteSurroundingTextInCodePoints(" + i10 + ", " + i11 + ')');
        ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints(this.session, i10, i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        ImeEditCommand_androidKt.finishComposingText(this.session);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        logDebug("getCursorCapsMode(" + i10 + ')');
        return TextUtils.getCapsMode(getText(), TextRange.m26362getMinimpl(getText().m21345getSelectiond9O1mEE()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        logDebug("getExtractedText(" + extractedTextRequest + ", " + i10 + ')');
        return StatelessInputConnection_androidKt.toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        String string = TextRange.m26358getCollapsedimpl(getText().m21345getSelectiond9O1mEE()) ? null : TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        logDebug("getSelectedText(" + i10 + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        String string = TextFieldCharSequenceKt.getTextAfterSelection(getText(), i10).toString();
        logDebug("getTextAfterCursor(" + i10 + ", " + i11 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        String string = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), i10).toString();
        logDebug("getTextBeforeCursor(" + i10 + ", " + i11 + "): " + string);
        return string;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        logDebug("performContextMenuAction(" + i10 + ')');
        switch (i10) {
            case R.id.selectAll:
                ImeEditCommand_androidKt.setSelection(this.session, 0, getText().length());
                return false;
            case R.id.cut:
                sendSynthesizedKeyEvent(277);
                return false;
            case R.id.copy:
                sendSynthesizedKeyEvent(278);
                return false;
            case R.id.paste:
                sendSynthesizedKeyEvent(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iM26543getDefaulteUduSuo;
        logDebug("performEditorAction(" + i10 + ')');
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26545getGoeUduSuo();
                    break;
                case 3:
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26549getSearcheUduSuo();
                    break;
                case 4:
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26550getSendeUduSuo();
                    break;
                case 5:
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26546getNexteUduSuo();
                    break;
                case 6:
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26544getDoneeUduSuo();
                    break;
                case 7:
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26548getPreviouseUduSuo();
                    break;
                default:
                    logDebug("IME sent an unrecognized editor action: " + i10);
                    iM26543getDefaulteUduSuo = ImeAction.Companion.m26543getDefaulteUduSuo();
                    break;
            }
        } else {
            iM26543getDefaulteUduSuo = ImeAction.Companion.m26543getDefaulteUduSuo();
        }
        this.session.mo21375onImeActionKlQnJC8(iM26543getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        logDebug("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.session, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        logDebug("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.session, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        logDebug("reportFullscreenMode(" + z10 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        logDebug("requestCursorUpdates(" + i10 + ')');
        this.session.requestCursorUpdates(i10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        logDebug("sendKeyEvent(" + keyEvent + ')');
        this.session.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        logDebug("setComposingRegion(" + i10 + ", " + i11 + ')');
        ImeEditCommand_androidKt.setComposingRegion(this.session, i10, i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        logDebug("setComposingText(\"" + ((Object) charSequence) + "\", " + i10 + ')');
        if (charSequence == null) {
            return true;
        }
        TextInputSession textInputSession = this.session;
        String string = charSequence.toString();
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ImeEditCommand_androidKt.setComposingText(textInputSession, string, i10, spanned != null ? StatelessInputConnection_androidKt.toAnnotationList(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        logDebug("setSelection(" + i10 + ", " + i11 + ')');
        ImeEditCommand_androidKt.setSelection(this.session, i10, i11);
        return true;
    }
}
