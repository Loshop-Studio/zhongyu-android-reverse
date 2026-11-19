package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;

/* loaded from: classes2.dex */
final class TestTagNode extends Modifier.Node implements SemanticsModifierNode {
    private String tag;

    public TestTagNode(String str) {
        this.tag = str;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, this.tag);
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setTag(String str) {
        this.tag = str;
    }
}
