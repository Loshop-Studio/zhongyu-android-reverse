package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SetComposingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public SetComposingTextCommand(AnnotatedString annotatedString, int i10) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i10;
    }

    @Override // androidx.compose.p014ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            int compositionStart$ui_text_release = editingBuffer.getCompositionStart$ui_text_release();
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                editingBuffer.setComposition$ui_text_release(compositionStart$ui_text_release, getText().length() + compositionStart$ui_text_release);
            }
        } else {
            int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                editingBuffer.setComposition$ui_text_release(selectionStart$ui_text_release, getText().length() + selectionStart$ui_text_release);
            }
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i10 = this.newCursorPosition;
        editingBuffer.setCursor$ui_text_release(AbstractC10410o.m21761n(i10 > 0 ? (cursor$ui_text_release + i10) - 1 : (cursor$ui_text_release + i10) - getText().length(), 0, editingBuffer.getLength$ui_text_release()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        return AbstractC9979u.m20289b(getText(), setComposingTextCommand.getText()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
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
        return "SetComposingTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetComposingTextCommand(String str, int i10) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i10);
    }
}
