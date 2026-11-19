package androidx.compose.foundation.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UndoState {
    public static final int $stable = 0;
    private final TextFieldState state;

    public UndoState(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }

    public final void clearHistory() {
        this.state.getTextUndoManager$foundation_release().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.state.getTextUndoManager$foundation_release().getCanRedo();
    }

    public final boolean getCanUndo() {
        return this.state.getTextUndoManager$foundation_release().getCanUndo();
    }

    public final void redo() {
        this.state.getTextUndoManager$foundation_release().redo(this.state);
    }

    public final void undo() {
        this.state.getTextUndoManager$foundation_release().undo(this.state);
    }
}
