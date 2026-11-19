package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.node.DelegatableNodeKt;

/* loaded from: classes2.dex */
public final class FocusPropertiesModifierNodeKt {
    public static final void invalidateFocusProperties(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
    }
}
