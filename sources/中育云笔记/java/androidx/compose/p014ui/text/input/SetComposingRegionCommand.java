package androidx.compose.p014ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import p265nd.AbstractC10410o;

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

    @Override // androidx.compose.p014ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.commitComposition$ui_text_release();
        }
        int iM21761n = AbstractC10410o.m21761n(this.start, 0, editingBuffer.getLength$ui_text_release());
        int iM21761n2 = AbstractC10410o.m21761n(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (iM21761n != iM21761n2) {
            if (iM21761n < iM21761n2) {
                editingBuffer.setComposition$ui_text_release(iM21761n, iM21761n2);
            } else {
                editingBuffer.setComposition$ui_text_release(iM21761n2, iM21761n);
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
