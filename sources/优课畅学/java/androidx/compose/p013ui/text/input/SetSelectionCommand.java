package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SetSelectionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetSelectionCommand(int i10, int i11) {
        this.start = i10;
        this.end = i11;
    }

    @Override // androidx.compose.p013ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int iM13518m = AbstractC8323h.m13518m(this.start, 0, editingBuffer.getLength$ui_text_release());
        int iM13518m2 = AbstractC8323h.m13518m(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (iM13518m < iM13518m2) {
            editingBuffer.setSelection$ui_text_release(iM13518m, iM13518m2);
        } else {
            editingBuffer.setSelection$ui_text_release(iM13518m2, iM13518m);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.start == setSelectionCommand.start && this.end == setSelectionCommand.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
