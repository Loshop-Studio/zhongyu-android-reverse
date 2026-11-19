package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public CommitTextCommand(AnnotatedString annotatedString, int i10) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i10;
    }

    @Override // androidx.compose.p013ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i10 = this.newCursorPosition;
        editingBuffer.setCursor$ui_text_release(AbstractC8323h.m13518m(i10 > 0 ? (cursor$ui_text_release + i10) - 1 : (cursor$ui_text_release + i10) - getText().length(), 0, editingBuffer.getLength$ui_text_release()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return AbstractC9133u.m16128b(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommitTextCommand(String str, int i10) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i10);
    }
}
