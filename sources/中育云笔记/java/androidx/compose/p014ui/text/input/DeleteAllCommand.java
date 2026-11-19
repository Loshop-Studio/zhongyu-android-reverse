package androidx.compose.p014ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9983y;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class DeleteAllCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.p014ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.replace$ui_text_release(0, editingBuffer.getLength$ui_text_release(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        return AbstractC9983y.m20315b(DeleteAllCommand.class).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }
}
