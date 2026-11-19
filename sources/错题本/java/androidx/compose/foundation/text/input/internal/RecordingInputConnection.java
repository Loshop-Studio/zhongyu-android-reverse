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
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.CommitTextCommand;
import androidx.compose.p011ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p011ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.p011ui.text.input.EditCommand;
import androidx.compose.p011ui.text.input.FinishComposingTextCommand;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.SetComposingRegionCommand;
import androidx.compose.p011ui.text.input.SetComposingTextCommand;
import androidx.compose.p011ui.text.input.SetSelectionCommand;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.TextFieldValueKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010 J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010$J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010$J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010$J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b4\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u001b2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00101\u001a\u00020\u001dH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u00109J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u001dH\u0016¢\u0006\u0004\bB\u00109J+\u0010I\u001a\u00020\u00132\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ!\u0010N\u001a\u00020\u00062\u0006\u0010D\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010U\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bU\u0010VJ\u0011\u0010X\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u001dH\u0016¢\u0006\u0004\b[\u00109J\u0017\u0010]\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020\u001dH\u0016¢\u0006\u0004\b`\u0010aJ#\u0010f\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010b2\b\u0010e\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bf\u0010gJ)\u0010k\u001a\u00020\u00062\u0006\u0010i\u001a\u00020h2\u0006\u00101\u001a\u00020\u001d2\b\u0010j\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bk\u0010lJ\u001e\u0010o\u001a\u00020\u00062\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00130mH\u0082\b¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00132\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020\u0006H\u0002¢\u0006\u0004\bu\u0010\u0017J\u000f\u0010v\u001a\u00020\u0006H\u0002¢\u0006\u0004\bv\u0010\u0017J\u0017\u0010x\u001a\u00020\u00132\u0006\u0010w\u001a\u00020\u001dH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00132\u0006\u0010z\u001a\u00020bH\u0002¢\u0006\u0004\b{\u0010|R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010}\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0005\b\t\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R2\u0010\u008e\u0001\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008c\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0080\u0001R\u001e\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020q0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0080\u0001¨\u0006\u009a\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "eventCallback", "", "autoCorrect", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputEventCallback2;ZLandroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;)V", "state", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "Ld6/s;", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Lkotlin/Function0;", "block", "ensureActive", "(Lr6/a;)Z", "Landroidx/compose/ui/text/input/EditCommand;", "editCommand", "addEditCommandWithBatch", "(Landroidx/compose/ui/text/input/EditCommand;)V", "beginBatchEditInternal", "endBatchEditInternal", "code", "sendSynthesizedKeyEvent", "(I)V", "message", "logDebug", "(Ljava/lang/String;)V", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "Z", "getAutoCorrect", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "batchDepth", "I", "value", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setTextFieldValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "editCommands", "Ljava/util/List;", "isActive", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n1#1,628:1\n110#1,5:629\n110#1,5:634\n110#1,5:639\n110#1,5:644\n110#1,5:649\n110#1,5:654\n110#1,5:659\n110#1,5:664\n110#1,5:669\n110#1,5:674\n110#1,5:679\n110#1,5:684\n110#1,5:689\n110#1,5:694\n110#1,5:699\n110#1,5:704\n110#1,5:709\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n172#1:629,5\n213#1:634,5\n220#1:639,5\n228#1:644,5\n236#1:649,5\n247#1:654,5\n255#1:659,5\n263#1:664,5\n271#1:669,5\n315#1:674,5\n399#1:679,5\n427#1:684,5\n492#1:689,5\n505#1:694,5\n521#1:699,5\n548#1:704,5\n559#1:709,5\n*E\n"})
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;

    @NotNull
    private final List<EditCommand> editCommands;

    @NotNull
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;

    @Nullable
    private final LegacyTextFieldState legacyTextFieldState;

    @Nullable
    private final TextFieldSelectionManager textFieldSelectionManager;

    @NotNull
    private TextFieldValue textFieldValue;

    @Nullable
    private final ViewConfiguration viewConfiguration;

    public RecordingInputConnection(@NotNull TextFieldValue textFieldValue, @NotNull InputEventCallback2 inputEventCallback2, boolean z8, @Nullable LegacyTextFieldState legacyTextFieldState, @Nullable TextFieldSelectionManager textFieldSelectionManager, @Nullable ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z8;
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
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(AbstractC5805t.m5218E0(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(InterfaceC6469a block) {
        boolean z8 = this.isActive;
        if (z8) {
            block.invoke();
        }
        return z8;
    }

    private final void logDebug(String message) {
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z8 = this.isActive;
        return z8 ? beginBatchEditInternal() : z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z8 = this.isActive;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo text) {
        boolean z8 = this.isActive;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int flags, @Nullable Bundle opts) {
        boolean z8 = this.isActive;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z8 = this.isActive;
        return z8 ? this.autoCorrect : z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence text, int newCursorPosition) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z8 = this.isActive;
        if (!z8) {
            return z8;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z8 = this.isActive;
        if (!z8) {
            return z8;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z8 = this.isActive;
        if (!z8) {
            return z8;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m12768getMinimpl(this.textFieldValue.getSelection()), reqModes);
    }

    @NotNull
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest request, int flags) {
        boolean z8 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z8;
        if (z8) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return RecordingInputConnection_androidKt.toExtractedText(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Nullable
    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int flags) {
        if (TextRange.m12764getCollapsedimpl(this.textFieldValue.getSelection())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, maxChars).toString();
    }

    @Nullable
    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @NotNull
    /* renamed from: getTextFieldValue$foundation_release, reason: from getter */
    public final TextFieldValue getTextFieldValue() {
        return this.textFieldValue;
    }

    @Nullable
    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean z8 = this.isActive;
        if (z8) {
            z8 = false;
            switch (id) {
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
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iM12949getDefaulteUduSuo;
        boolean z8 = this.isActive;
        if (!z8) {
            return z8;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12951getGoeUduSuo();
                    break;
                case 3:
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12955getSearcheUduSuo();
                    break;
                case 4:
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12956getSendeUduSuo();
                    break;
                case 5:
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12952getNexteUduSuo();
                    break;
                case 6:
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12950getDoneeUduSuo();
                    break;
                case 7:
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12954getPreviouseUduSuo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + editorAction);
                    iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12949getDefaulteUduSuo();
                    break;
            }
        } else {
            iM12949getDefaulteUduSuo = ImeAction.INSTANCE.m12949getDefaulteUduSuo();
        }
        this.eventCallback.mo7820onImeActionKlQnJC8(iM12949getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@NotNull HandwritingGesture gesture, @Nullable Executor executor, @Nullable IntConsumer consumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, this.viewConfiguration, executor, consumer, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection.performHandwritingGesture.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((EditCommand) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(EditCommand editCommand) {
                    RecordingInputConnection.this.addEditCommandWithBatch(editCommand);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String action, @Nullable Bundle data) {
        boolean z8 = this.isActive;
        if (z8) {
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture gesture, @Nullable CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = this.isActive;
        if (!z12) {
            return z12;
        }
        boolean z13 = false;
        boolean z14 = (cursorUpdateMode & 1) != 0;
        boolean z15 = (cursorUpdateMode & 2) != 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            boolean z16 = (cursorUpdateMode & 16) != 0;
            boolean z17 = (cursorUpdateMode & 8) != 0;
            boolean z18 = (cursorUpdateMode & 4) != 0;
            if (i >= 34 && (cursorUpdateMode & 32) != 0) {
                z13 = true;
            }
            if (z16 || z17 || z18 || z13) {
                z9 = z13;
                z8 = z18;
                z11 = z17;
                z10 = z16;
            } else if (i >= 34) {
                z10 = true;
                z11 = true;
                z8 = true;
                z9 = true;
            } else {
                z9 = z13;
                z10 = true;
                z11 = true;
                z8 = true;
            }
        } else {
            z8 = false;
            z9 = false;
            z10 = true;
            z11 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z14, z15, z10, z11, z8, z9);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent event) {
        boolean z8 = this.isActive;
        if (!z8) {
            return z8;
        }
        this.eventCallback.onKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new SetComposingRegionCommand(start, end));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence text, int newCursorPosition) {
        boolean z8 = this.isActive;
        if (z8) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z8 = this.isActive;
        if (!z8) {
            return z8;
        }
        addEditCommandWithBatch(new SetSelectionCommand(start, end));
        return true;
    }

    public final void setTextFieldValue$foundation_release(@NotNull TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    public final void updateInputState(@NotNull TextFieldValue state, @NotNull InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setTextFieldValue$foundation_release(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, RecordingInputConnection_androidKt.toExtractedText(state));
            }
            TextRange composition = state.getComposition();
            int iM12768getMinimpl = composition != null ? TextRange.m12768getMinimpl(composition.getPackedValue()) : -1;
            TextRange composition2 = state.getComposition();
            inputMethodManager.updateSelection(TextRange.m12768getMinimpl(state.getSelection()), TextRange.m12767getMaximpl(state.getSelection()), iM12768getMinimpl, composition2 != null ? TextRange.m12767getMaximpl(composition2.getPackedValue()) : -1);
        }
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z8, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, int i, AbstractC5824e abstractC5824e) {
        this(textFieldValue, inputEventCallback2, z8, (i & 8) != 0 ? null : legacyTextFieldState, (i & 16) != 0 ? null : textFieldSelectionManager, (i & 32) != 0 ? null : viewConfiguration);
    }
}
