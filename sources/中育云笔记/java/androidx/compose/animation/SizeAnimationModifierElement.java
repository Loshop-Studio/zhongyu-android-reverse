package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final InterfaceC9544p finishedListener;

    public SizeAnimationModifierElement(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p) {
        this.animationSpec = finiteAnimationSpec;
        this.alignment = alignment;
        this.finishedListener = interfaceC9544p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SizeAnimationModifierElement copy$default(SizeAnimationModifierElement sizeAnimationModifierElement, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = sizeAnimationModifierElement.animationSpec;
        }
        if ((i10 & 2) != 0) {
            alignment = sizeAnimationModifierElement.alignment;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = sizeAnimationModifierElement.finishedListener;
        }
        return sizeAnimationModifierElement.copy(finiteAnimationSpec, alignment, interfaceC9544p);
    }

    public final FiniteAnimationSpec<IntSize> component1() {
        return this.animationSpec;
    }

    public final Alignment component2() {
        return this.alignment;
    }

    public final InterfaceC9544p component3() {
        return this.finishedListener;
    }

    public final SizeAnimationModifierElement copy(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p) {
        return new SizeAnimationModifierElement(finiteAnimationSpec, alignment, interfaceC9544p);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return AbstractC9979u.m20289b(this.animationSpec, sizeAnimationModifierElement.animationSpec) && AbstractC9979u.m20289b(this.alignment, sizeAnimationModifierElement.alignment) && AbstractC9979u.m20289b(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final InterfaceC9544p getFinishedListener() {
        return this.finishedListener;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        InterfaceC9544p interfaceC9544p = this.finishedListener;
        return iHashCode + (interfaceC9544p == null ? 0 : interfaceC9544p.hashCode());
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("finishedListener", this.finishedListener);
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SizeAnimationModifierNode create() {
        return new SizeAnimationModifierNode(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.setAnimationSpec(this.animationSpec);
        sizeAnimationModifierNode.setListener(this.finishedListener);
        sizeAnimationModifierNode.setAlignment(this.alignment);
    }
}
