package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.p013ui.text.TextRange;

/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, TextRange.m26364getStartimpl(textUndoOperation.m21559getPostSelectiond9O1mEE()), TextRange.m26359getEndimpl(textUndoOperation.m21559getPostSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m21334toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }

    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, TextRange.m26364getStartimpl(textUndoOperation.m21560getPreSelectiond9O1mEE()), TextRange.m26359getEndimpl(textUndoOperation.m21560getPreSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation_release(), TextFieldBuffer.m21334toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldState.getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }
}
