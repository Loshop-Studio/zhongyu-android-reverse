package androidx.compose.p011ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010\u001f\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010 J\u0019\u0010&\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u001dJ\u0017\u0010,\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010#J\u0019\u00102\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010-J\u0017\u00105\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u0001072\b\u0010\u000e\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010-J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010@\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\bC\u0010DR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ER(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u00028\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, m5110d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Ld6/s;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lr6/c;)V", "disposeDelegate", "()V", "closeConnection", "", "p0", "p1", "", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "getCursorCapsMode", "(I)I", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "", "deleteSurroundingText", "(II)Z", "deleteSurroundingTextInCodePoints", "setComposingText", "(Ljava/lang/CharSequence;I)Z", "setComposingRegion", "finishComposingText", "()Z", "commitText", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "setSelection", "performEditorAction", "(I)Z", "performContextMenuAction", "beginBatchEdit", "endBatchEdit", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "clearMetaKeyStates", "reportFullscreenMode", "(Z)Z", "", "Landroid/os/Bundle;", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "requestCursorUpdates", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "Landroid/view/inputmethod/InputContentInfo;", "p2", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "closeDelegate", "(Landroid/view/inputmethod/InputConnection;)V", "Lr6/c;", "<set-?>", "Landroid/view/inputmethod/InputConnection;", "getDelegate", "()Landroid/view/inputmethod/InputConnection;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {

    @Nullable
    private InputConnection delegate;

    @NotNull
    private final InterfaceC6471c onConnectionClosed;

    public NullableInputConnectionWrapperApi21(@NotNull InputConnection inputConnection, @NotNull InterfaceC6471c interfaceC6471c) {
        this.onConnectionClosed = interfaceC6471c;
        this.delegate = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.delegate != null) {
            disposeDelegate();
            this.onConnectionClosed.invoke(this);
        }
    }

    public void closeDelegate(@NotNull InputConnection delegate) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo p0, int p1, @Nullable Bundle p22) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitText(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        return false;
    }

    @Override // androidx.compose.p011ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            closeDelegate(inputConnection);
            this.delegate = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(p0);
        }
        return 0;
    }

    @Nullable
    public final InputConnection getDelegate() {
        return this.delegate;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(p0, p1);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(p0);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getTextAfterCursor(int p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(p0, p1);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getTextBeforeCursor(int p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(p0, p1);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String p0, @Nullable Bundle p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@Nullable KeyEvent p0) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(p0);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingText(p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int p0, int p1) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setSelection(p0, p1);
        }
        return false;
    }
}
