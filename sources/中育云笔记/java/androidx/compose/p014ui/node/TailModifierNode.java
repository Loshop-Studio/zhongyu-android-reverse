package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TailModifierNode extends Modifier.Node {
    public static final int $stable = 8;
    private boolean attachHasBeenRun;

    public TailModifierNode() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.attachHasBeenRun = false;
    }

    public final void setAttachHasBeenRun(boolean z10) {
        this.attachHasBeenRun = z10;
    }

    public String toString() {
        return "<tail>";
    }
}
