package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SetComposingRegionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetComposingRegionCommand(int i10, int i11) {
        this.start = i10;
        this.end = i11;
    }

    @Override // androidx.compose.p013ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.commitComposition$ui_text_release();
        }
        int iM13518m = AbstractC8323h.m13518m(this.start, 0, editingBuffer.getLength$ui_text_release());
        int iM13518m2 = AbstractC8323h.m13518m(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (iM13518m != iM13518m2) {
            if (iM13518m < iM13518m2) {
                editingBuffer.setComposition$ui_text_release(iM13518m, iM13518m2);
            } else {
                editingBuffer.setComposition$ui_text_release(iM13518m2, iM13518m);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
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
        return "SetComposingRegionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
