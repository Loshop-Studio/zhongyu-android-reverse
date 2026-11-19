package androidx.compose.p014ui.viewinterop;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusProperties;
import androidx.compose.p014ui.focus.FocusPropertiesModifierNode;

/* loaded from: classes2.dex */
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.p014ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(getNode().isAttached() && FocusGroupNode_androidKt.getEmbeddedView(this).hasFocusable());
    }
}
