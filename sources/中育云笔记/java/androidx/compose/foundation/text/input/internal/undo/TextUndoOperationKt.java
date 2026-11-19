package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.p014ui.text.TextRange;

/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, TextRange.m32966getStartimpl(textUndoOperation.m28161getPostSelectiond9O1mEE()), TextRange.m32961getEndimpl(textUndoOperation.m28161getPostSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }

    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, TextRange.m32966getStartimpl(textUndoOperation.m28162getPreSelectiond9O1mEE()), TextRange.m32961getEndimpl(textUndoOperation.m28162getPreSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }
}
