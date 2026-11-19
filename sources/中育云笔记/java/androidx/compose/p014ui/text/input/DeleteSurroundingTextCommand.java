package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int i10, int i11) {
        this.lengthBeforeCursor = i10;
        this.lengthAfterCursor = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // androidx.compose.p014ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int selectionEnd$ui_text_release = editingBuffer.getSelectionEnd$ui_text_release();
        int i10 = this.lengthAfterCursor;
        int length$ui_text_release = selectionEnd$ui_text_release + i10;
        if (((selectionEnd$ui_text_release ^ length$ui_text_release) & (i10 ^ length$ui_text_release)) < 0) {
            length$ui_text_release = editingBuffer.getLength$ui_text_release();
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), Math.min(length$ui_text_release, editingBuffer.getLength$ui_text_release()));
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        int i11 = this.lengthBeforeCursor;
        int i12 = selectionStart$ui_text_release - i11;
        if (((selectionStart$ui_text_release ^ i12) & (i11 ^ selectionStart$ui_text_release)) < 0) {
            i12 = 0;
        }
        editingBuffer.delete$ui_text_release(Math.max(0, i12), editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
