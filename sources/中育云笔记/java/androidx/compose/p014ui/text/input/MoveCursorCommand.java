package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.JvmCharHelpers_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i10) {
        this.amount = i10;
    }

    @Override // androidx.compose.p014ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.getCursor$ui_text_release() == -1) {
            editingBuffer.setCursor$ui_text_release(editingBuffer.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        String string = editingBuffer.toString();
        int i10 = this.amount;
        int i11 = 0;
        if (i10 <= 0) {
            int i12 = -i10;
            while (i11 < i12) {
                int iFindPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(string, selectionStart$ui_text_release);
                if (iFindPrecedingBreak == -1) {
                    break;
                }
                i11++;
                selectionStart$ui_text_release = iFindPrecedingBreak;
            }
        } else {
            while (i11 < i10) {
                int iFindFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(string, selectionStart$ui_text_release);
                if (iFindFollowingBreak == -1) {
                    break;
                }
                i11++;
                selectionStart$ui_text_release = iFindFollowingBreak;
            }
        }
        editingBuffer.setCursor$ui_text_release(selectionStart$ui_text_release);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
