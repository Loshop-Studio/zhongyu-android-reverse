package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.node.DpTouchBoundsExpansion;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class StylusHoverIconModifierElement extends ModifierNodeElement<StylusHoverIconModifierNode> {
    public static final int $stable = 0;
    private final PointerIcon icon;
    private final boolean overrideDescendants;
    private final DpTouchBoundsExpansion touchBoundsExpansion;

    public /* synthetic */ StylusHoverIconModifierElement(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i10, AbstractC9126n abstractC9126n) {
        this(pointerIcon, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public static /* synthetic */ StylusHoverIconModifierElement copy$default(StylusHoverIconModifierElement stylusHoverIconModifierElement, PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerIcon = stylusHoverIconModifierElement.icon;
        }
        if ((i10 & 2) != 0) {
            z10 = stylusHoverIconModifierElement.overrideDescendants;
        }
        if ((i10 & 4) != 0) {
            dpTouchBoundsExpansion = stylusHoverIconModifierElement.touchBoundsExpansion;
        }
        return stylusHoverIconModifierElement.copy(pointerIcon, z10, dpTouchBoundsExpansion);
    }

    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    public final DpTouchBoundsExpansion component3() {
        return this.touchBoundsExpansion;
    }

    public final StylusHoverIconModifierElement copy(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return new StylusHoverIconModifierElement(pointerIcon, z10, dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return AbstractC9133u.m16128b(this.icon, stylusHoverIconModifierElement.icon) && this.overrideDescendants == stylusHoverIconModifierElement.overrideDescendants && AbstractC9133u.m16128b(this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion);
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final DpTouchBoundsExpansion getTouchBoundsExpansion() {
        return this.touchBoundsExpansion;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants)) * 31;
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.touchBoundsExpansion;
        return iHashCode + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
        inspectorInfo.getProperties().set("touchBoundsExpansion", this.touchBoundsExpansion);
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }

    public StylusHoverIconModifierElement(PointerIcon pointerIcon, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.icon = pointerIcon;
        this.overrideDescendants = z10;
        this.touchBoundsExpansion = dpTouchBoundsExpansion;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public StylusHoverIconModifierNode create() {
        return new StylusHoverIconModifierNode(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(StylusHoverIconModifierNode stylusHoverIconModifierNode) {
        stylusHoverIconModifierNode.setIcon(this.icon);
        stylusHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
        stylusHoverIconModifierNode.setDpTouchBoundsExpansion(this.touchBoundsExpansion);
    }
}
