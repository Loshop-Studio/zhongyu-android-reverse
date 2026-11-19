package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i10, int i11) {
        this.lengthBeforeCursor = i10;
        this.lengthAfterCursor = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // androidx.compose.p013ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int i10 = this.lengthBeforeCursor;
        int i11 = 0;
        int i12 = 0;
        int selectionStart$ui_text_release = 0;
        while (true) {
            if (i12 < i10) {
                int i13 = selectionStart$ui_text_release + 1;
                if (editingBuffer.getSelectionStart$ui_text_release() <= i13) {
                    selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
                    break;
                } else {
                    selectionStart$ui_text_release = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionStart$ui_text_release() - i13) + (-1)), editingBuffer.get$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i13)) ? selectionStart$ui_text_release + 2 : i13;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i14 = this.lengthAfterCursor;
        int length$ui_text_release = 0;
        while (true) {
            if (i11 >= i14) {
                break;
            }
            int i15 = length$ui_text_release + 1;
            if (editingBuffer.getSelectionEnd$ui_text_release() + i15 >= editingBuffer.getLength$ui_text_release()) {
                length$ui_text_release = editingBuffer.getLength$ui_text_release() - editingBuffer.getSelectionEnd$ui_text_release();
                break;
            } else {
                length$ui_text_release = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionEnd$ui_text_release() + i15) + (-1)), editingBuffer.get$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release() + i15)) ? length$ui_text_release + 2 : i15;
                i11++;
            }
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release() + length$ui_text_release);
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - selectionStart$ui_text_release, editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
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
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
