package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PointerHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 0;
    private final String traverseKey;

    public /* synthetic */ PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(pointerIcon, (i10 & 2) != 0 ? false : z10);
    }

    @Override // androidx.compose.p014ui.input.pointer.HoverIconModifierNode
    public void displayIcon(PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    @Override // androidx.compose.p014ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo32031isRelevantPointerTypeuerMTgs(int i10) {
        PointerType.Companion companion = PointerType.Companion;
        return (PointerType.m32175equalsimpl0(i10, companion.m32181getStylusT8wyACA()) || PointerType.m32175equalsimpl0(i10, companion.m32179getEraserT8wyACA())) ? false : true;
    }

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z10) {
        super(pointerIcon, z10, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
