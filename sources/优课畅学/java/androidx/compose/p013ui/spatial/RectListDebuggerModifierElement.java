package androidx.compose.p013ui.spatial;

import android.annotation.SuppressLint;
import androidx.compose.p013ui.node.ModifierNodeElement;
import com.tencent.smtt.sdk.TbsListener;

@SuppressLint({"ModifierNodeInspectableProperties"})
/* loaded from: classes2.dex */
final class RectListDebuggerModifierElement extends ModifierNodeElement<RectListDebuggerModifierNode> {
    public static final RectListDebuggerModifierElement INSTANCE = new RectListDebuggerModifierElement();

    private RectListDebuggerModifierElement() {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(RectListDebuggerModifierNode rectListDebuggerModifierNode) {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public RectListDebuggerModifierNode create() {
        return new RectListDebuggerModifierNode();
    }
}
