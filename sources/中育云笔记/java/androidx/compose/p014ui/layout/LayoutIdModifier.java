package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.ParentDataModifierNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    public static final int $stable = 8;
    private Object layoutId;

    public LayoutIdModifier(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.p014ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    @Override // androidx.compose.p014ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }

    public void setLayoutId$ui_release(Object obj) {
        this.layoutId = obj;
    }
}
