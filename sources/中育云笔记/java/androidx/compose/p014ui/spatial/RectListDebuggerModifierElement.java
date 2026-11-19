package androidx.compose.p014ui.spatial;

import android.annotation.SuppressLint;
import androidx.compose.p014ui.node.ModifierNodeElement;
import com.taobao.sophix.PatchStatus;

@SuppressLint({"ModifierNodeInspectableProperties"})
/* loaded from: classes2.dex */
final class RectListDebuggerModifierElement extends ModifierNodeElement<RectListDebuggerModifierNode> {
    public static final RectListDebuggerModifierElement INSTANCE = new RectListDebuggerModifierElement();

    private RectListDebuggerModifierElement() {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return PatchStatus.CODE_LOAD_RES_ADDASSERTPATH;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(RectListDebuggerModifierNode rectListDebuggerModifierNode) {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public RectListDebuggerModifierNode create() {
        return new RectListDebuggerModifierNode();
    }
}
