package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;

/* loaded from: classes2.dex */
final class SensitiveContentNode extends Modifier.Node {
    private boolean _isContentSensitive;
    private boolean isContentSensitive;
    private boolean isCountedSensitive;

    public SensitiveContentNode(boolean z10) {
        this._isContentSensitive = z10;
        this.isContentSensitive = z10;
    }

    private final boolean component1() {
        return this._isContentSensitive;
    }

    public static /* synthetic */ SensitiveContentNode copy$default(SensitiveContentNode sensitiveContentNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = sensitiveContentNode._isContentSensitive;
        }
        return sensitiveContentNode.copy(z10);
    }

    public final SensitiveContentNode copy(boolean z10) {
        return new SensitiveContentNode(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveContentNode) && this._isContentSensitive == ((SensitiveContentNode) obj)._isContentSensitive;
    }

    public int hashCode() {
        return Boolean.hashCode(this._isContentSensitive);
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        if (this.isContentSensitive) {
            if (this.isCountedSensitive) {
                InlineClassHelperKt.throwIllegalStateException("invalid sensitive content state");
            }
            DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.isCountedSensitive = true;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (this.isCountedSensitive) {
            DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.isCountedSensitive = false;
        }
        super.onDetach();
    }

    public final void setContentSensitive(boolean z10) {
        this.isContentSensitive = z10;
        if (z10 && !this.isCountedSensitive) {
            DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.isCountedSensitive = true;
        } else {
            if (z10 || !this.isCountedSensitive) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.isCountedSensitive = false;
        }
    }

    public String toString() {
        return "SensitiveContentNode(_isContentSensitive=" + this._isContentSensitive + ')';
    }
}
