package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.input.pointer.PointerType;
import androidx.compose.p013ui.node.DpTouchBoundsExpansion;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class StylusHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 0;
    private final String traverseKey;

    public /* synthetic */ StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i10, AbstractC9126n abstractC9126n) {
        this(pointerIcon, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.p013ui.input.pointer.HoverIconModifierNode
    public void displayIcon(PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setStylusHoverIcon(pointerIcon);
        }
    }

    @Override // androidx.compose.p013ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo25429isRelevantPointerTypeuerMTgs(int i10) {
        PointerType.Companion companion = PointerType.Companion;
        return PointerType.m25573equalsimpl0(i10, companion.m25579getStylusT8wyACA()) || PointerType.m25573equalsimpl0(i10, companion.m25577getEraserT8wyACA());
    }

    public StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(pointerIcon, z10, dpTouchBoundsExpansion);
        this.traverseKey = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // androidx.compose.p013ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
